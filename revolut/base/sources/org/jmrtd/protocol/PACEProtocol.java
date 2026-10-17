package org.jmrtd.protocol;

import a0.d;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;
import net.sf.scuba.tlv.TLVUtil;
import net.sf.scuba.util.Hex;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.jmrtd.APDULevelPACECapable;
import org.jmrtd.AccessKeySpec;
import org.jmrtd.BACKeySpec;
import org.jmrtd.CardServiceProtocolException;
import org.jmrtd.PACEKeySpec;
import org.jmrtd.PACESecretKeySpec;
import org.jmrtd.Util;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.CVCAFile;
import org.jmrtd.lds.PACEInfo;
import p.a;
import zsc.p;

/* JADX INFO: loaded from: classes14.dex */
public class PACEProtocol {
    private int maxTranceiveLengthForProtocol;
    private int maxTranceiveLengthForSecureMessaging;
    private Random random;
    private APDULevelPACECapable service;
    private boolean shouldCheckMAC;
    private SecureMessagingWrapper wrapper;
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final Provider BC_PROVIDER = Util.getBouncyCastleProvider();
    private static final byte[] IV_FOR_PACE_CAM_DECRYPTION = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private static final byte[] C0_LENGTH_128 = {-90, 104, -119, ISO7816.INS_PSO, 124, 65, -29, ISO7816.INS_GET_DATA, 115, -97, SignedBytes.MAX_POWER_OF_TWO, ISO7816.INS_READ_BINARY, 87, ISO7816.INS_LOAD_KEY_FILE, 89, 4};
    private static final byte[] C1_LENGTH_128 = {-92, -31, 54, -84, 114, 95, 115, ISOFileInfo.SECURITY_ATTR_EXP, 1, -63, -10, 2, Ascii.ETB, -63, -120, -83};
    private static final byte[] C0_LENGTH_256 = {-44, 99, ISO7816.INS_UPDATE_BINARY, 82, ISO7816.INS_DECREASE_STAMPED, 18, 78, -9, -119, ISO7816.INS_MANAGE_CHANNEL, 84, -104, 109, ISO7816.INS_GET_DATA, 10, Ascii.ETB, 78, 40, -33, 117, ISOFileInfo.SECURITY_ATTR_COMPACT, -70, ISOFileInfo.A0, 63, ISO7816.INS_CHANGE_CHV, 6, Ascii.SYN, 65, 77, 90, Ascii.SYN, 118};
    private static final byte[] C1_LENGTH_256 = {84, -67, 114, 85, -16, -86, -8, Constants.INQUIRY, -66, -61, CVCAFile.CAR_TAG, 63, -49, 57, ISO7816.INS_UPDATE_BINARY, -101, 108, -65, 6, 102, 119, ISO7816.INS_WRITE_BINARY, -6, -82, 90, -83, -39, -99, -8, -27, 53, Ascii.ETB};

    /* JADX INFO: renamed from: org.jmrtd.protocol.PACEProtocol$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jmrtd$lds$PACEInfo$MappingType;

        static {
            int[] iArr = new int[PACEInfo.MappingType.values().length];
            $SwitchMap$org$jmrtd$lds$PACEInfo$MappingType = iArr;
            try {
                iArr[PACEInfo.MappingType.CAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$PACEInfo$MappingType[PACEInfo.MappingType.GM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jmrtd$lds$PACEInfo$MappingType[PACEInfo.MappingType.IM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Deprecated
    public PACEProtocol(APDULevelPACECapable aPDULevelPACECapable, SecureMessagingWrapper secureMessagingWrapper, int i, boolean z) {
        this(aPDULevelPACECapable, secureMessagingWrapper, 256, i, z);
    }

    private void checkConsistency(String str, String str2, String str3, int i, AlgorithmParameterSpec algorithmParameterSpec) {
        if (str == null) {
            throw new IllegalArgumentException("Unknown agreement algorithm");
        }
        if (!"ECDH".equalsIgnoreCase(str) && !"DH".equalsIgnoreCase(str)) {
            throw new IllegalArgumentException(a.p("Unsupported agreement algorithm, expected \"ECDH\" or \"DH\", found \"", str, "\""));
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Unknown cipher algorithm");
        }
        if (!"DESede".equalsIgnoreCase(str2) && !"AES".equalsIgnoreCase(str2)) {
            throw new IllegalArgumentException(a.p("Unsupported cipher algorithm, expected \"DESede\" or \"AES\", found \"", str2, "\""));
        }
        if (!"SHA-1".equalsIgnoreCase(str3) && !"SHA1".equalsIgnoreCase(str3) && !"SHA-256".equalsIgnoreCase(str3) && !"SHA256".equalsIgnoreCase(str3)) {
            throw new IllegalArgumentException(a.p("Unsupported cipher algorithm, expected \"SHA-1\" or \"SHA-256\", found \"", str3, "\""));
        }
        if (i != 128 && i != 192 && i != 256) {
            throw new IllegalArgumentException(d.n("Unsupported key length, expected 128, 192, or 256, found ", i));
        }
        if ("ECDH".equalsIgnoreCase(str) && !(algorithmParameterSpec instanceof ECParameterSpec)) {
            StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Expected ECParameterSpec for agreement algorithm \"", str, "\", found ");
            sbX.append(algorithmParameterSpec.getClass().getCanonicalName());
            throw new IllegalArgumentException(sbX.toString());
        }
        if (!"DH".equalsIgnoreCase(str) || (algorithmParameterSpec instanceof DHParameterSpec)) {
            return;
        }
        StringBuilder sbX2 = com.google.android.gms.internal.mlkit_vision_face.a.x("Expected DHParameterSpec for agreement algorithm \"", str, "\", found ");
        sbX2.append(algorithmParameterSpec.getClass().getCanonicalName());
        throw new IllegalArgumentException(sbX2.toString());
    }

    public static byte[] computeKeySeedForPACE(AccessKeySpec accessKeySpec) throws GeneralSecurityException {
        if (accessKeySpec == null) {
            throw new IllegalArgumentException("Access key cannot be null");
        }
        if (!(accessKeySpec instanceof BACKeySpec)) {
            if (accessKeySpec instanceof PACEKeySpec) {
                return ((PACEKeySpec) accessKeySpec).getKey();
            }
            LOGGER.warning("JMRTD doesn't recognize this type of access key, best effort key derivation!");
            return accessKeySpec.getKey();
        }
        BACKeySpec bACKeySpec = (BACKeySpec) accessKeySpec;
        String documentNumber = bACKeySpec.getDocumentNumber();
        String dateOfBirth = bACKeySpec.getDateOfBirth();
        String dateOfExpiry = bACKeySpec.getDateOfExpiry();
        if (dateOfBirth == null || dateOfBirth.length() != 6) {
            throw new IllegalArgumentException(j6.a.q("Wrong date format used for date of birth. Expected yyMMdd, found ", dateOfBirth));
        }
        if (dateOfExpiry == null || dateOfExpiry.length() != 6) {
            throw new IllegalArgumentException(j6.a.q("Wrong date format used for date of expiry. Expected yyMMdd, found ", dateOfExpiry));
        }
        if (documentNumber != null) {
            return computeKeySeedForPACE(fixDocumentNumber(documentNumber), dateOfBirth, dateOfExpiry);
        }
        throw new IllegalArgumentException(j6.a.q("Wrong document number. Found ", documentNumber));
    }

    public static PublicKey decodePublicKeyFromSmartCard(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec == null) {
            throw new IllegalArgumentException("Params cannot be null");
        }
        try {
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                return Util.getPublicKey("EC", new ECPublicKeySpec(Util.os2ECPoint(bArr), (ECParameterSpec) algorithmParameterSpec));
            }
            if (algorithmParameterSpec instanceof DHParameterSpec) {
                DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                return Util.getPublicKey("DH", new DHPublicKeySpec(Util.os2i(bArr), dHParameterSpec.getP(), dHParameterSpec.getG()));
            }
            throw new IllegalArgumentException("Expected ECParameterSpec or DHParameterSpec, found " + algorithmParameterSpec.getClass().getCanonicalName());
        } catch (GeneralSecurityException e) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e);
            throw new IllegalArgumentException(e);
        }
    }

    public static SecretKey deriveStaticPACEKey(AccessKeySpec accessKeySpec, String str) throws GeneralSecurityException {
        return Util.deriveKey(computeKeySeedForPACE(accessKeySpec), PACEInfo.toCipherAlgorithm(str), PACEInfo.toKeyLength(str), null, 3, accessKeySpec instanceof PACEKeySpec ? ((PACEKeySpec) accessKeySpec).getKeyReference() : (byte) 0);
    }

    public static byte[] encodeECPointForSmartCard(ECPoint eCPoint, int i) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(Util.ecPoint2OS(eCPoint, i));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e) {
            throw new IllegalStateException("Internal error writing to memory", e);
        }
    }

    public static byte[] encodePublicKeyDataObject(String str, PublicKey publicKey) throws InvalidKeyException {
        return encodePublicKeyDataObject(str, publicKey, true);
    }

    public static byte[] encodePublicKeyForSmartCard(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey == null) {
            throw new IllegalArgumentException("Cannot encode null public key");
        }
        if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            return encodeECPointForSmartCard(eCPublicKey.getW(), eCPublicKey.getParams().getCurve().getField().getFieldSize());
        }
        if (publicKey instanceof DHPublicKey) {
            return Util.i2os(((DHPublicKey) publicKey).getY());
        }
        throw new InvalidKeyException("Unsupported public key: " + publicKey.getClass().getCanonicalName());
    }

    private static String fixDocumentNumber(String str) {
        StringBuilder sb6 = new StringBuilder(str.replace('<', p.SPACE_CHAR).trim().replace(p.SPACE_CHAR, '<'));
        while (sb6.length() < 9) {
            sb6.append('<');
        }
        return sb6.toString();
    }

    public static byte[] generateAuthenticationToken(String str, SecretKey secretKey, PublicKey publicKey) throws GeneralSecurityException {
        return generateAuthenticationToken(str, Util.getMac(inferMACAlgorithmFromCipherAlgorithm(PACEInfo.toCipherAlgorithm(str)), secretKey), publicKey);
    }

    public static ECPoint icartPointEncode(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        BigInteger prime = Util.getPrime(eCParameterSpec);
        if (!BigInteger.valueOf(3L).equals(prime.mod(BigInteger.valueOf(4L)))) {
            throw new InvalidParameterException("Cannot encode point because p != 3 (mod 4)");
        }
        int cofactor = eCParameterSpec.getCofactor();
        BigInteger a7 = eCParameterSpec.getCurve().getA();
        BigInteger b4 = eCParameterSpec.getCurve().getB();
        BigInteger bigIntegerMod = bigInteger.modPow(BigInteger.valueOf(2L), prime).negate().mod(prime);
        BigInteger bigIntegerMod2 = bigIntegerMod.add(bigIntegerMod.modPow(BigInteger.valueOf(2L), prime)).mod(prime);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerMod3 = b4.negate().multiply(bigInteger2.add(bigIntegerMod2)).multiply(a7.multiply(bigIntegerMod2).modPow(prime.subtract(bigInteger2).subtract(bigInteger2), prime)).mod(prime);
        BigInteger bigIntegerMod4 = bigIntegerMod.multiply(bigIntegerMod3).mod(prime);
        BigInteger bigIntegerMod5 = bigIntegerMod3.modPow(BigInteger.valueOf(3L), prime).add(a7.multiply(bigIntegerMod3)).add(b4).mod(prime);
        BigInteger bigIntegerMod6 = bigInteger.modPow(BigInteger.valueOf(3L), prime).multiply(bigIntegerMod5).mod(prime);
        BigInteger bigIntegerModPow = bigIntegerMod5.modPow(prime.subtract(bigInteger2).subtract(prime.add(bigInteger2).multiply(BigInteger.valueOf(4L).modInverse(prime)).mod(prime)), prime);
        ECPoint eCPoint = bigIntegerModPow.modPow(BigInteger.valueOf(2L), prime).multiply(bigIntegerMod5).mod(prime).equals(bigInteger2) ? new ECPoint(bigIntegerMod3, bigIntegerModPow.multiply(bigIntegerMod5).mod(prime)) : new ECPoint(bigIntegerMod4, bigIntegerModPow.multiply(bigIntegerMod6).mod(prime));
        if (cofactor == 1) {
            return Util.normalize(eCPoint, eCParameterSpec);
        }
        org.bouncycastle.math.ec.ECPoint bouncyCastleECPoint = Util.toBouncyCastleECPoint(eCPoint, eCParameterSpec);
        bouncyCastleECPoint.multiply(BigInteger.valueOf(cofactor));
        return Util.fromBouncyCastleECPoint(bouncyCastleECPoint);
    }

    private static String inferMACAlgorithmFromCipherAlgorithm(String str) throws InvalidAlgorithmParameterException {
        if (str == null) {
            throw new IllegalArgumentException("Cannot infer MAC algorithm from cipher algorithm null");
        }
        if (str.startsWith("DESede")) {
            return "ISO9797ALG3WITHISO7816-4PADDING";
        }
        if (str.startsWith("AES")) {
            return "AESCMAC";
        }
        throw new InvalidAlgorithmParameterException(a.p("Cannot infer MAC algorithm from cipher algorithm \"", str, "\""));
    }

    private static boolean keysAreEqual(PublicKey publicKey, PublicKey publicKey2) {
        try {
            return publicKey.equals(publicKey2);
        } catch (RuntimeException e) {
            LOGGER.log(Level.WARNING, "Exception during public key equals", (Throwable) e);
            return false;
        }
    }

    public static DHParameterSpec mapNonceGMWithDH(byte[] bArr, BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        BigInteger p2 = dHParameterSpec.getP();
        return new DHParameterSpec(p2, dHParameterSpec.getG().modPow(Util.os2i(bArr), p2).multiply(bigInteger).mod(p2), dHParameterSpec.getL());
    }

    public static ECParameterSpec mapNonceGMWithECDH(byte[] bArr, ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        ECPoint generator = eCParameterSpec.getGenerator();
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a7 = curve.getA();
        BigInteger b4 = curve.getB();
        BigInteger p2 = ((ECFieldFp) curve.getField()).getP();
        BigInteger order = eCParameterSpec.getOrder();
        int cofactor = eCParameterSpec.getCofactor();
        ECPoint eCPointAdd = Util.add(Util.multiply(Util.os2i(bArr), generator, eCParameterSpec), eCPoint, eCParameterSpec);
        if (!Util.toBouncyCastleECPoint(eCPointAdd, eCParameterSpec).isValid()) {
            LOGGER.info("ephemeralGenerator is not a valid point");
        }
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(p2), a7, b4), eCPointAdd, order, cofactor);
    }

    public static AlgorithmParameterSpec mapNonceIMWithDH(byte[] bArr, byte[] bArr2, String str, DHParameterSpec dHParameterSpec) throws GeneralSecurityException {
        BigInteger g3 = dHParameterSpec.getG();
        if (g3 != null) {
            BigInteger bigInteger = BigInteger.ONE;
            if (!g3.equals(bigInteger)) {
                BigInteger p2 = dHParameterSpec.getP();
                return new DHParameterSpec(p2, Util.os2i(pseudoRandomFunction(bArr, bArr2, p2, str)).modPow(p2.subtract(bigInteger).divide(dHParameterSpec instanceof PACEInfo.DHCParameterSpec ? ((PACEInfo.DHCParameterSpec) dHParameterSpec).getQ() : bigInteger), p2), dHParameterSpec.getL());
            }
        }
        throw new IllegalArgumentException("Invalid generator: " + g3);
    }

    public static AlgorithmParameterSpec mapNonceIMWithECDH(byte[] bArr, byte[] bArr2, String str, ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        BigInteger prime = Util.getPrime(eCParameterSpec);
        BigInteger order = eCParameterSpec.getOrder();
        int cofactor = eCParameterSpec.getCofactor();
        BigInteger a7 = eCParameterSpec.getCurve().getA();
        BigInteger b4 = eCParameterSpec.getCurve().getB();
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(prime), a7, b4), icartPointEncode(Util.os2i(pseudoRandomFunction(bArr, bArr2, prime, str)), eCParameterSpec), order, cofactor);
    }

    public static byte[] pseudoRandomFunction(byte[] bArr, byte[] bArr2, BigInteger bigInteger, String str) throws GeneralSecurityException {
        byte[] bArr3;
        byte[] bArr4;
        if (bArr == null || bArr2 == null) {
            throw new IllegalArgumentException("Null nonce");
        }
        int length = bArr.length * 8;
        int length2 = bArr2.length * 8;
        if (length == 128) {
            bArr3 = C0_LENGTH_128;
            bArr4 = C1_LENGTH_128;
        } else {
            if (length != 192 && length != 256) {
                throw new IllegalArgumentException(j6.a.l(length, "Unknown length ", ", was expecting 128, 192, or 256"));
            }
            bArr3 = C0_LENGTH_256;
            bArr4 = C1_LENGTH_256;
        }
        StringBuilder sbS = a.s(str);
        sbS.append(str.endsWith("/CBC/NoPadding") ? "" : "/CBC/NoPadding");
        Cipher cipher = Cipher.getInstance(sbS.toString());
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[cipher.getBlockSize()]);
        cipher.init(1, new SecretKeySpec(bArr2, str), ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i * length < bigInteger.bitLength() + 64; i++) {
            try {
                try {
                    cipher.init(1, new SecretKeySpec(bArrDoFinal, 0, length2 / 8, str), ivParameterSpec);
                    bArrDoFinal = cipher.doFinal(bArr3);
                    byteArrayOutputStream.write(cipher.doFinal(bArr4));
                } catch (Exception e) {
                    LOGGER.log(Level.WARNING, "Could not write to stream", (Throwable) e);
                    byte[] bArrI2os = Util.i2os(Util.os2i(byteArrayOutputStream.toByteArray()).mod(bigInteger));
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        LOGGER.log(Level.FINE, "Could not close stream", (Throwable) e2);
                    }
                    return bArrI2os;
                }
            } catch (Throwable th10) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e4) {
                    LOGGER.log(Level.FINE, "Could not close stream", (Throwable) e4);
                }
                throw th10;
            }
        }
        byte[] bArrI2os2 = Util.i2os(Util.os2i(byteArrayOutputStream.toByteArray()).mod(bigInteger));
        try {
            byteArrayOutputStream.close();
            return bArrI2os2;
        } catch (IOException e5) {
            LOGGER.log(Level.FINE, "Could not close stream", (Throwable) e5);
            return bArrI2os2;
        }
    }

    public static PublicKey updateParameterSpec(PublicKey publicKey, PrivateKey privateKey) throws GeneralSecurityException {
        String algorithm = publicKey.getAlgorithm();
        String algorithm2 = privateKey.getAlgorithm();
        if ("EC".equals(algorithm) || "ECDH".equals(algorithm)) {
            if ("EC".equals(algorithm2) || "ECDH".equals(algorithm2)) {
                return KeyFactory.getInstance("EC", BC_PROVIDER).generatePublic(new ECPublicKeySpec(((ECPublicKey) publicKey).getW(), ((ECPrivateKey) privateKey).getParams()));
            }
            throw new NoSuchAlgorithmException(d.s("Unsupported key type public: ", algorithm, ", private: ", algorithm2));
        }
        if (!"DH".equals(algorithm)) {
            throw new NoSuchAlgorithmException(d.s("Unsupported key type public: ", algorithm, ", private: ", algorithm2));
        }
        if (!"DH".equals(algorithm2)) {
            throw new NoSuchAlgorithmException(d.s("Unsupported key type public: ", algorithm, ", private: ", algorithm2));
        }
        KeyFactory keyFactory = KeyFactory.getInstance("DH");
        DHParameterSpec params = ((DHPrivateKey) privateKey).getParams();
        return keyFactory.generatePublic(new DHPublicKeySpec(((DHPublicKey) publicKey).getY(), params.getP(), params.getG()));
    }

    public PACEResult doPACE(AccessKeySpec accessKeySpec, String str, AlgorithmParameterSpec algorithmParameterSpec, BigInteger bigInteger) throws CardServiceException {
        try {
            return doPACE(accessKeySpec, deriveStaticPACEKey(accessKeySpec, str), str, algorithmParameterSpec, bigInteger);
        } catch (GeneralSecurityException e) {
            throw new CardServiceProtocolException("PCD side error in key derivation step", 0, e);
        }
    }

    public byte[] doPACEStep1(SecretKey secretKey, Cipher cipher) throws CardServiceProtocolException {
        try {
            byte[] bArrUnwrapDO = TLVUtil.unwrapDO(128, this.service.sendGeneralAuthenticate(this.wrapper, new byte[0], 256, false));
            cipher.init(2, secretKey, new IvParameterSpec(new byte[cipher.getBlockSize()]));
            return cipher.doFinal(bArrUnwrapDO);
        } catch (GeneralSecurityException e) {
            throw new CardServiceProtocolException("PCD side exception in tranceiving nonce step", 1, e);
        } catch (CardServiceException e2) {
            throw new CardServiceProtocolException("PICC side exception in tranceiving nonce step", 1, e2);
        }
    }

    public PACEMappingResult doPACEStep2(PACEInfo.MappingType mappingType, String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, Cipher cipher) throws CardServiceProtocolException {
        int i = AnonymousClass1.$SwitchMap$org$jmrtd$lds$PACEInfo$MappingType[mappingType.ordinal()];
        if (i == 1 || i == 2) {
            return doPACEStep2GM(str, algorithmParameterSpec, bArr);
        }
        if (i == 3) {
            return doPACEStep2IM(str, algorithmParameterSpec, bArr, cipher);
        }
        throw new CardServiceProtocolException("Unsupported mapping type " + mappingType, 2);
    }

    public PACEGMMappingResult doPACEStep2GM(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr) throws CardServiceProtocolException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, BC_PROVIDER);
            keyPairGenerator.initialize(algorithmParameterSpec);
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            PublicKey publicKey = keyPairGenerateKeyPair.getPublic();
            PrivateKey privateKey = keyPairGenerateKeyPair.getPrivate();
            byte[] bArrWrapDO = TLVUtil.wrapDO(129, encodePublicKeyForSmartCard(publicKey));
            PublicKey publicKeyDecodePublicKeyFromSmartCard = decodePublicKeyFromSmartCard(TLVUtil.unwrapDO(130, this.service.sendGeneralAuthenticate(this.wrapper, bArrWrapDO, bArrWrapDO.length > 233 ? 65536 : this.maxTranceiveLengthForProtocol, false)), algorithmParameterSpec);
            if ("ECDH".equals(str)) {
                PACEGMWithECDHAgreement pACEGMWithECDHAgreement = new PACEGMWithECDHAgreement();
                pACEGMWithECDHAgreement.init(privateKey);
                ECPoint eCPointDoPhase = pACEGMWithECDHAgreement.doPhase(publicKeyDecodePublicKeyFromSmartCard);
                return new PACEGMWithECDHMappingResult(algorithmParameterSpec, bArr, publicKeyDecodePublicKeyFromSmartCard, keyPairGenerateKeyPair, eCPointDoPhase, mapNonceGMWithECDH(bArr, eCPointDoPhase, (ECParameterSpec) algorithmParameterSpec));
            }
            if ("DH".equals(str)) {
                KeyAgreement keyAgreement = KeyAgreement.getInstance(str);
                keyAgreement.init(privateKey);
                keyAgreement.doPhase(publicKeyDecodePublicKeyFromSmartCard, true);
                byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                return new PACEGMWithDHMappingResult(algorithmParameterSpec, bArr, publicKeyDecodePublicKeyFromSmartCard, keyPairGenerateKeyPair, bArrGenerateSecret, mapNonceGMWithDH(bArr, Util.os2i(bArrGenerateSecret), (DHParameterSpec) algorithmParameterSpec));
            }
            throw new IllegalArgumentException("Unsupported parameters for mapping nonce, expected \"ECDH\" / ECParameterSpec or \"DH\" / DHParameterSpec, found \"" + str + "\" /" + algorithmParameterSpec.getClass().getCanonicalName());
        } catch (CardServiceException e) {
            throw new CardServiceProtocolException("PICC side exception in mapping nonce step", 2, e);
        } catch (Exception e2) {
            throw new CardServiceProtocolException("PCD side error in mapping nonce step", 2, e2);
        }
    }

    public PACEIMMappingResult doPACEStep2IM(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, Cipher cipher) throws CardServiceProtocolException {
        try {
            byte[] bArr2 = new byte[bArr.length];
            this.random.nextBytes(bArr2);
            byte[] bArrWrapDO = TLVUtil.wrapDO(129, bArr2);
            this.service.sendGeneralAuthenticate(this.wrapper, bArrWrapDO, bArrWrapDO.length > 233 ? 65536 : this.maxTranceiveLengthForProtocol, false);
            if ("ECDH".equals(str)) {
                return new PACEIMMappingResult(algorithmParameterSpec, bArr, bArr2, mapNonceIMWithECDH(bArr, bArr2, cipher.getAlgorithm(), (ECParameterSpec) algorithmParameterSpec));
            }
            if ("DH".equals(str)) {
                return new PACEIMMappingResult(algorithmParameterSpec, bArr, bArr2, mapNonceIMWithDH(bArr, bArr2, cipher.getAlgorithm(), (DHParameterSpec) algorithmParameterSpec));
            }
            throw new IllegalArgumentException("Unsupported parameters for mapping nonce, expected \"ECDH\" / ECParameterSpec or \"DH\" / DHParameterSpec, found \"" + str + "\" /" + algorithmParameterSpec.getClass().getCanonicalName());
        } catch (GeneralSecurityException e) {
            throw new CardServiceProtocolException("PCD side error in mapping nonce step", 2, e);
        } catch (CardServiceException e2) {
            throw new CardServiceProtocolException("PICC side exception in mapping nonce step", 2, e2);
        }
    }

    public PublicKey doPACEStep3ExchangePublicKeys(PublicKey publicKey, AlgorithmParameterSpec algorithmParameterSpec) throws CardServiceProtocolException {
        try {
            byte[] bArrWrapDO = TLVUtil.wrapDO(ISO781611.CREATION_DATE_AND_TIME_TAG, encodePublicKeyForSmartCard(publicKey));
            PublicKey publicKeyDecodePublicKeyFromSmartCard = decodePublicKeyFromSmartCard(TLVUtil.unwrapDO(132, this.service.sendGeneralAuthenticate(this.wrapper, bArrWrapDO, bArrWrapDO.length > 233 ? 65536 : this.maxTranceiveLengthForProtocol, false)), algorithmParameterSpec);
            if (keysAreEqual(publicKey, publicKeyDecodePublicKeyFromSmartCard)) {
                throw new CardServiceProtocolException("PCD's public key and PICC's public key are the same in key agreement step!", 3);
            }
            return publicKeyDecodePublicKeyFromSmartCard;
        } catch (CardServiceException e) {
            throw new CardServiceProtocolException("PICC side exception in key agreement step", 3, e);
        } catch (Exception e2) {
            throw new CardServiceProtocolException("PCD side exception in key agreement step", 3, e2);
        }
    }

    public KeyPair doPACEStep3GenerateKeyPair(String str, AlgorithmParameterSpec algorithmParameterSpec) throws CardServiceProtocolException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str, BC_PROVIDER);
            keyPairGenerator.initialize(algorithmParameterSpec);
            return keyPairGenerator.generateKeyPair();
        } catch (GeneralSecurityException e) {
            throw new CardServiceProtocolException("PCD side error during generation of PCD key pair", 3, e);
        }
    }

    public byte[] doPACEStep3KeyAgreement(String str, PrivateKey privateKey, PublicKey publicKey) throws CardServiceProtocolException {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance(str, BC_PROVIDER);
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(updateParameterSpec(publicKey, privateKey), true);
            return keyAgreement.generateSecret();
        } catch (Exception e) {
            throw new CardServiceProtocolException("PCD side error during key agreement", 3, e);
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00d9: INVOKE (r4 I:net.sf.scuba.tlv.TLVInputStream) VIRTUAL call: net.sf.scuba.tlv.TLVInputStream.close():void A[Catch: Exception -> 0x008c, IOException -> 0x00dd, MD:():void throws java.io.IOException (m), TRY_ENTER, TRY_LEAVE], block:B:42:0x00d9 */
    public byte[] doPACEStep4(String str, PACEInfo.MappingType mappingType, KeyPair keyPair, PublicKey publicKey, SecretKey secretKey) throws CardServiceException {
        TLVInputStream tLVInputStream;
        Logger logger;
        byte[] value;
        byte[] bArrGenerateAuthenticationToken;
        try {
            try {
                tLVInputStream = new TLVInputStream(new ByteArrayInputStream(this.service.sendGeneralAuthenticate(this.wrapper, TLVUtil.wrapDO(133, generateAuthenticationToken(str, secretKey, publicKey)), 256, true)));
                try {
                    int tag2 = tLVInputStream.readTag();
                    if (tag2 != 134) {
                        LOGGER.warning("Was expecting tag 0x86, found: " + Integer.toHexString(tag2));
                    }
                    tLVInputStream.readLength();
                    value = tLVInputStream.readValue();
                    bArrGenerateAuthenticationToken = generateAuthenticationToken(str, secretKey, keyPair.getPublic());
                } catch (IOException e) {
                    LOGGER.log(Level.WARNING, "Could not parse step 4 response", (Throwable) e);
                    try {
                        tLVInputStream.close();
                        return null;
                    } catch (IOException e2) {
                        e = e2;
                        logger = LOGGER;
                        logger.log(Level.FINE, "Exception closing stream", (Throwable) e);
                        return null;
                    }
                }
            } finally {
            }
        } catch (Exception e4) {
            throw new CardServiceProtocolException("PCD side exception in authentication token generation step", 4, e4);
        }
        if (!Arrays.equals(bArrGenerateAuthenticationToken, value)) {
            throw new GeneralSecurityException("PICC authentication token mismatch, expectedPICCToken = " + Hex.bytesToHexString(bArrGenerateAuthenticationToken) + ", piccToken = " + Hex.bytesToHexString(value));
        }
        if (mappingType != PACEInfo.MappingType.CAM) {
            try {
                tLVInputStream.close();
                return null;
            } catch (IOException e5) {
                e = e5;
                logger = LOGGER;
                logger.log(Level.FINE, "Exception closing stream", (Throwable) e);
                return null;
            }
        }
        int tag3 = tLVInputStream.readTag();
        if (tag3 != 138) {
            LOGGER.warning("Was expecting tag 0x8A, found: " + Integer.toHexString(tag3));
        }
        tLVInputStream.readLength();
        byte[] value2 = tLVInputStream.readValue();
        try {
            tLVInputStream.close();
            return value2;
        } catch (IOException e6) {
            LOGGER.log(Level.FINE, "Exception closing stream", (Throwable) e6);
            return value2;
        }
        throw new CardServiceProtocolException("PCD side exception in authentication token generation step", 4, e4);
    }

    public PACEProtocol(APDULevelPACECapable aPDULevelPACECapable, SecureMessagingWrapper secureMessagingWrapper, int i, int i2, boolean z) {
        this.service = aPDULevelPACECapable;
        this.wrapper = secureMessagingWrapper;
        this.maxTranceiveLengthForProtocol = i;
        this.maxTranceiveLengthForSecureMessaging = i2;
        this.shouldCheckMAC = z;
        this.random = new SecureRandom();
    }

    public static byte[] encodePublicKeyDataObject(String str, PublicKey publicKey, boolean z) throws InvalidKeyException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TLVOutputStream tLVOutputStream = new TLVOutputStream(byteArrayOutputStream);
        try {
            try {
                tLVOutputStream.writeTag(32585);
                if (publicKey instanceof DHPublicKey) {
                    DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
                    DHParameterSpec params = dHPublicKey.getParams();
                    BigInteger p2 = params.getP();
                    int l2 = params.getL();
                    BigInteger g3 = params.getG();
                    BigInteger y2 = dHPublicKey.getY();
                    tLVOutputStream.write(new ASN1ObjectIdentifier(str).getEncoded());
                    if (!z) {
                        tLVOutputStream.writeTag(129);
                        tLVOutputStream.writeValue(Util.i2os(p2));
                        tLVOutputStream.writeTag(130);
                        tLVOutputStream.writeValue(Util.i2os(BigInteger.valueOf(l2)));
                        tLVOutputStream.writeTag(ISO781611.CREATION_DATE_AND_TIME_TAG);
                        tLVOutputStream.writeValue(Util.i2os(g3));
                    }
                    tLVOutputStream.writeTag(132);
                    tLVOutputStream.writeValue(Util.i2os(y2));
                } else {
                    if (!(publicKey instanceof ECPublicKey)) {
                        throw new InvalidKeyException("Unsupported public key: " + publicKey.getClass().getCanonicalName());
                    }
                    ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
                    ECParameterSpec params2 = eCPublicKey.getParams();
                    BigInteger prime = Util.getPrime(params2);
                    EllipticCurve curve = params2.getCurve();
                    BigInteger a7 = curve.getA();
                    BigInteger b4 = curve.getB();
                    ECPoint generator = params2.getGenerator();
                    BigInteger order = params2.getOrder();
                    int cofactor = params2.getCofactor();
                    ECPoint w3 = eCPublicKey.getW();
                    tLVOutputStream.write(new ASN1ObjectIdentifier(str).getEncoded());
                    if (!z) {
                        tLVOutputStream.writeTag(129);
                        tLVOutputStream.writeValue(Util.i2os(prime));
                        tLVOutputStream.writeTag(130);
                        tLVOutputStream.writeValue(Util.i2os(a7));
                        tLVOutputStream.writeTag(ISO781611.CREATION_DATE_AND_TIME_TAG);
                        tLVOutputStream.writeValue(Util.i2os(b4));
                        BigInteger affineX = generator.getAffineX();
                        BigInteger affineY = generator.getAffineY();
                        tLVOutputStream.writeTag(132);
                        tLVOutputStream.write(Util.i2os(affineX));
                        tLVOutputStream.write(Util.i2os(affineY));
                        tLVOutputStream.writeValueEnd();
                        tLVOutputStream.writeTag(133);
                        tLVOutputStream.writeValue(Util.i2os(order));
                    }
                    tLVOutputStream.writeTag(ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA);
                    tLVOutputStream.writeValue(Util.ecPoint2OS(w3, params2.getCurve().getField().getFieldSize()));
                    if (!z) {
                        tLVOutputStream.writeTag(135);
                        tLVOutputStream.writeValue(Util.i2os(BigInteger.valueOf(cofactor)));
                    }
                }
                tLVOutputStream.writeValueEnd();
                tLVOutputStream.flush();
                try {
                    tLVOutputStream.close();
                } catch (IOException e) {
                    LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                LOGGER.log(Level.WARNING, "Exception", (Throwable) e2);
                throw new IllegalStateException("Error in encoding public key");
            }
        } finally {
        }
    }

    private PACEResult doPACE(AccessKeySpec accessKeySpec, SecretKey secretKey, String str, AlgorithmParameterSpec algorithmParameterSpec, BigInteger bigInteger) throws BadPaddingException, CardServiceException {
        SecretKey secretKey2;
        byte[] bArrUnpad;
        PACEInfo.MappingType mappingType = PACEInfo.toMappingType(str);
        String keyAgreementAlgorithm = PACEInfo.toKeyAgreementAlgorithm(str);
        String cipherAlgorithm = PACEInfo.toCipherAlgorithm(str);
        String digestAlgorithm = PACEInfo.toDigestAlgorithm(str);
        int keyLength = PACEInfo.toKeyLength(str);
        checkConsistency(keyAgreementAlgorithm, cipherAlgorithm, digestAlgorithm, keyLength, algorithmParameterSpec);
        try {
            Cipher cipher = Cipher.getInstance(cipherAlgorithm + "/CBC/NoPadding");
            try {
                this.service.sendMSESetATMutualAuth(this.wrapper, str, secretKey instanceof PACESecretKeySpec ? ((PACESecretKeySpec) secretKey).getKeyReference() : (byte) 1, bigInteger == null ? null : Util.i2os(bigInteger));
                PACEMappingResult pACEMappingResultDoPACEStep2 = doPACEStep2(mappingType, keyAgreementAlgorithm, algorithmParameterSpec, doPACEStep1(secretKey, cipher), cipher);
                AlgorithmParameterSpec ephemeralParameters = pACEMappingResultDoPACEStep2.getEphemeralParameters();
                KeyPair keyPairDoPACEStep3GenerateKeyPair = doPACEStep3GenerateKeyPair(keyAgreementAlgorithm, ephemeralParameters);
                PublicKey publicKeyDoPACEStep3ExchangePublicKeys = doPACEStep3ExchangePublicKeys(keyPairDoPACEStep3GenerateKeyPair.getPublic(), ephemeralParameters);
                byte[] bArrDoPACEStep3KeyAgreement = doPACEStep3KeyAgreement(keyAgreementAlgorithm, keyPairDoPACEStep3GenerateKeyPair.getPrivate(), publicKeyDoPACEStep3ExchangePublicKeys);
                try {
                    SecretKey secretKeyDeriveKey = Util.deriveKey(bArrDoPACEStep3KeyAgreement, cipherAlgorithm, keyLength, 1);
                    SecretKey secretKeyDeriveKey2 = Util.deriveKey(bArrDoPACEStep3KeyAgreement, cipherAlgorithm, keyLength, 2);
                    byte[] bArrDoPACEStep4 = doPACEStep4(str, mappingType, keyPairDoPACEStep3GenerateKeyPair, publicKeyDoPACEStep3ExchangePublicKeys, secretKeyDeriveKey2);
                    try {
                        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
                        long sendSequenceCounter = secureMessagingWrapper == null ? 0L : secureMessagingWrapper.getSendSequenceCounter();
                        if (cipherAlgorithm.startsWith("DESede")) {
                            this.wrapper = new DESedeSecureMessagingWrapper(secretKeyDeriveKey, secretKeyDeriveKey2, this.maxTranceiveLengthForSecureMessaging, this.shouldCheckMAC, 0L);
                            secretKey2 = secretKeyDeriveKey;
                        } else if (!cipherAlgorithm.startsWith("AES")) {
                            secretKey2 = secretKeyDeriveKey;
                            LOGGER.warning("Unsupported cipher algorithm ".concat(cipherAlgorithm));
                        } else {
                            secretKey2 = secretKeyDeriveKey;
                            this.wrapper = new AESSecureMessagingWrapper(secretKeyDeriveKey, secretKeyDeriveKey2, this.maxTranceiveLengthForSecureMessaging, this.shouldCheckMAC, sendSequenceCounter);
                        }
                        if (PACEInfo.MappingType.CAM.equals(mappingType)) {
                            if (bArrDoPACEStep4 == null) {
                                LOGGER.warning("Encrypted Chip Authentication data is null");
                            }
                            try {
                                Cipher cipher2 = Cipher.getInstance("AES/CBC/NoPadding");
                                cipher2.init(2, secretKey2, new IvParameterSpec(IV_FOR_PACE_CAM_DECRYPTION));
                                bArrUnpad = Util.unpad(cipher2.doFinal(bArrDoPACEStep4));
                            } catch (GeneralSecurityException e) {
                                LOGGER.log(Level.WARNING, "Could not decrypt Chip Authentication data", (Throwable) e);
                                bArrUnpad = null;
                            }
                            return new PACECAMResult(accessKeySpec, keyAgreementAlgorithm, cipherAlgorithm, digestAlgorithm, keyLength, pACEMappingResultDoPACEStep2, keyPairDoPACEStep3GenerateKeyPair, publicKeyDoPACEStep3ExchangePublicKeys, bArrDoPACEStep4, bArrUnpad, this.wrapper);
                        }
                        return new PACEResult(accessKeySpec, mappingType, keyAgreementAlgorithm, cipherAlgorithm, digestAlgorithm, keyLength, pACEMappingResultDoPACEStep2, keyPairDoPACEStep3GenerateKeyPair, publicKeyDoPACEStep3ExchangePublicKeys, this.wrapper);
                    } catch (GeneralSecurityException e2) {
                        throw new CardServiceProtocolException("Security exception in secure messaging establishment", 4, e2);
                    }
                } catch (GeneralSecurityException e4) {
                    throw new CardServiceProtocolException("Security exception during secure messaging key derivation", 3, e4);
                }
            } catch (CardServiceException e5) {
                throw new CardServiceProtocolException("PICC side error in static PACE key derivation step", 0, e5);
            } catch (Exception e6) {
                throw new CardServiceProtocolException("PCD side error in static PACE key derivation step", 0, e6);
            }
        } catch (GeneralSecurityException e22) {
            throw new CardServiceProtocolException("PCD side error in static cipher construction during key derivation step", 0, e22);
        }
    }

    private static byte[] generateAuthenticationToken(String str, Mac mac, PublicKey publicKey) throws GeneralSecurityException {
        byte[] bArrDoFinal = mac.doFinal(encodePublicKeyDataObject(str, publicKey));
        byte[] bArr = new byte[8];
        System.arraycopy(bArrDoFinal, 0, bArr, 0, 8);
        return bArr;
    }

    public static byte[] computeKeySeedForPACE(String str) throws GeneralSecurityException {
        return Util.computeKeySeed(str, "SHA-1", false);
    }

    private static byte[] computeKeySeedForPACE(String str, String str2, String str3) throws GeneralSecurityException {
        return Util.computeKeySeed(str, str2, str3, "SHA-1", false);
    }
}
