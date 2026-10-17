package org.jmrtd.protocol;

import com.google.common.primitives.UnsignedBytes;
import j6.a;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Random;
import javax.crypto.SecretKey;
import net.sf.scuba.smartcards.CardServiceException;
import org.jmrtd.APDULevelBACCapable;
import org.jmrtd.AccessKeySpec;
import org.jmrtd.BACKeySpec;
import org.jmrtd.CardServiceProtocolException;
import org.jmrtd.Util;
import zsc.p;

/* JADX INFO: loaded from: classes14.dex */
public class BACProtocol {
    private int maxTranceiveLength;
    private Random random = new SecureRandom();
    private APDULevelBACCapable service;
    private boolean shouldCheckMAC;

    public BACProtocol(APDULevelBACCapable aPDULevelBACCapable, int i, boolean z) {
        this.service = aPDULevelBACCapable;
        this.maxTranceiveLength = i;
        this.shouldCheckMAC = z;
    }

    public static byte[] computeKeySeedForBAC(BACKeySpec bACKeySpec) throws GeneralSecurityException {
        String documentNumber = bACKeySpec.getDocumentNumber();
        String dateOfBirth = bACKeySpec.getDateOfBirth();
        String dateOfExpiry = bACKeySpec.getDateOfExpiry();
        if (dateOfBirth == null || dateOfBirth.length() != 6) {
            throw new IllegalArgumentException(a.q("Wrong date format used for date of birth. Expected yyMMdd, found ", dateOfBirth));
        }
        if (dateOfExpiry == null || dateOfExpiry.length() != 6) {
            throw new IllegalArgumentException(a.q("Wrong date format used for date of expiry. Expected yyMMdd, found ", dateOfExpiry));
        }
        if (documentNumber != null) {
            return computeKeySeedForBAC(fixDocumentNumber(documentNumber), dateOfBirth, dateOfExpiry);
        }
        throw new IllegalArgumentException(a.q("Wrong document number. Found ", documentNumber));
    }

    public static long computeSendSequenceCounter(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 8 || bArr2 == null || bArr2.length != 8) {
            throw new IllegalStateException("Wrong length input");
        }
        long j2 = 0;
        for (int i = 4; i < 8; i++) {
            j2 = (j2 << 8) + ((long) (bArr[i] & UnsignedBytes.MAX_VALUE));
        }
        for (int i2 = 4; i2 < 8; i2++) {
            j2 = (j2 << 8) + ((long) (bArr2[i2] & UnsignedBytes.MAX_VALUE));
        }
        return j2;
    }

    private SecureMessagingWrapper doBACStep(SecretKey secretKey, SecretKey secretKey2) throws GeneralSecurityException, CardServiceException {
        try {
            byte[] bArrSendGetChallenge = this.service.sendGetChallenge();
            byte[] bArr = new byte[8];
            this.random.nextBytes(bArr);
            byte[] bArr2 = new byte[16];
            this.random.nextBytes(bArr2);
            try {
                byte[] bArr3 = new byte[16];
                System.arraycopy(this.service.sendMutualAuth(bArr, bArrSendGetChallenge, bArr2, secretKey, secretKey2), 16, bArr3, 0, 16);
                byte[] bArr4 = new byte[16];
                for (int i = 0; i < 16; i++) {
                    bArr4[i] = (byte) ((bArr2[i] & UnsignedBytes.MAX_VALUE) ^ (bArr3[i] & UnsignedBytes.MAX_VALUE));
                }
                return new DESedeSecureMessagingWrapper(Util.deriveKey(bArr4, 1), Util.deriveKey(bArr4, 2), this.maxTranceiveLength, this.shouldCheckMAC, computeSendSequenceCounter(bArrSendGetChallenge, bArr));
            } catch (Exception e) {
                throw new CardServiceProtocolException("BAC failed in MUTUAL AUTH", 2, e);
            }
        } catch (Exception e2) {
            throw new CardServiceProtocolException("BAC failed in GET CHALLENGE", 1, e2);
        }
    }

    private static String fixDocumentNumber(String str) {
        StringBuilder sb6 = new StringBuilder(str == null ? "" : str.replace('<', p.SPACE_CHAR).trim().replace(p.SPACE_CHAR, '<'));
        while (sb6.length() < 9) {
            sb6.append('<');
        }
        return sb6.toString();
    }

    public BACResult doBAC(AccessKeySpec accessKeySpec) throws CardServiceException {
        try {
            byte[] key = accessKeySpec.getKey();
            return new BACResult(accessKeySpec, doBACStep(Util.deriveKey(key, 1), Util.deriveKey(key, 2)));
        } catch (GeneralSecurityException e) {
            throw new CardServiceException("Error during BAC", e);
        }
    }

    public BACResult doBAC(SecretKey secretKey, SecretKey secretKey2) throws GeneralSecurityException, CardServiceException {
        return new BACResult(doBACStep(secretKey, secretKey2));
    }

    private static byte[] computeKeySeedForBAC(String str, String str2, String str3) throws GeneralSecurityException {
        return Util.computeKeySeed(str, str2, str3, "SHA-1", true);
    }
}
