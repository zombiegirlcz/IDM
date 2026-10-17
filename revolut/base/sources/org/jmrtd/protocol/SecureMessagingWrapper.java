package org.jmrtd.protocol;

import a0.d;
import com.google.common.primitives.UnsignedBytes;
import j6.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import net.sf.scuba.smartcards.APDUWrapper;
import net.sf.scuba.smartcards.CommandAPDU;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ResponseAPDU;
import net.sf.scuba.tlv.TLVUtil;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.Util;

/* JADX INFO: loaded from: classes14.dex */
public abstract class SecureMessagingWrapper implements Serializable, APDUWrapper {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd.protocol");
    private static final long serialVersionUID = 4709645514566992414L;
    private transient Cipher cipher;
    private SecretKey ksEnc;
    private SecretKey ksMac;
    private transient Mac mac;
    private int maxTranceiveLength;
    private boolean shouldCheckMAC;

    /* JADX INFO: renamed from: ssc, reason: collision with root package name */
    private long f228986ssc;

    public SecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, String str, String str2, int i, boolean z, long j2) throws GeneralSecurityException {
        this.maxTranceiveLength = i;
        this.shouldCheckMAC = z;
        this.ksEnc = secretKey;
        this.ksMac = secretKey2;
        this.f228986ssc = j2;
        this.cipher = Util.getCipher(str);
        this.mac = Util.getMac(str2);
    }

    private byte[] encodeLe(int i) {
        return (i < 0 || i > 256) ? new byte[]{(byte) ((65280 & i) >> 8), (byte) (i & 255)} : new byte[]{(byte) i};
    }

    public static SecureMessagingWrapper getInstance(SecureMessagingWrapper secureMessagingWrapper) {
        try {
        } catch (GeneralSecurityException e) {
            LOGGER.log(Level.WARNING, "Could not copy wrapper", (Throwable) e);
        }
        if (secureMessagingWrapper instanceof DESedeSecureMessagingWrapper) {
            return new DESedeSecureMessagingWrapper((DESedeSecureMessagingWrapper) secureMessagingWrapper);
        }
        if (secureMessagingWrapper instanceof AESSecureMessagingWrapper) {
            return new AESSecureMessagingWrapper((AESSecureMessagingWrapper) secureMessagingWrapper);
        }
        LOGGER.warning("Not copying wrapper");
        return secureMessagingWrapper;
    }

    private byte[] readDO87(DataInputStream dataInputStream, boolean z) throws GeneralSecurityException, IOException {
        int unsignedByte;
        int unsignedByte2 = dataInputStream.readUnsignedByte();
        if ((unsignedByte2 & 128) == 128) {
            int i = unsignedByte2 & CertificateBody.profileType;
            int unsignedByte3 = 0;
            for (int i2 = 0; i2 < i; i2++) {
                unsignedByte3 = (unsignedByte3 << 8) | dataInputStream.readUnsignedByte();
            }
            if (!z && dataInputStream.readUnsignedByte() != 1) {
                throw new IllegalStateException("DO'87 expected 0x01 marker");
            }
            unsignedByte2 = unsignedByte3;
        } else if (!z && (unsignedByte = dataInputStream.readUnsignedByte()) != 1) {
            throw new IllegalStateException(a.n(unsignedByte & 255, new StringBuilder("DO'87 expected 0x01 marker, found ")));
        }
        if (!z) {
            unsignedByte2--;
        }
        byte[] bArr = new byte[unsignedByte2];
        dataInputStream.readFully(bArr);
        return Util.unpad(this.cipher.doFinal(bArr));
    }

    private byte[] readDO8E(DataInputStream dataInputStream) throws IOException {
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte != 8 && unsignedByte != 16) {
            throw new IllegalStateException(d.n("DO'8E wrong length for MAC: ", unsignedByte));
        }
        byte[] bArr = new byte[unsignedByte];
        dataInputStream.readFully(bArr);
        return bArr;
    }

    private short readDO99(DataInputStream dataInputStream) throws IOException {
        if (dataInputStream.readUnsignedByte() != 2) {
            throw new IllegalStateException("DO'99 wrong length");
        }
        byte b4 = dataInputStream.readByte();
        byte b5 = dataInputStream.readByte();
        return (short) ((b5 & UnsignedBytes.MAX_VALUE) | ((b4 & UnsignedBytes.MAX_VALUE) << 8));
    }

    private ResponseAPDU unwrapResponseAPDU(ResponseAPDU responseAPDU) throws GeneralSecurityException, IOException {
        byte[] bytes = responseAPDU.getBytes();
        if (bytes == null || bytes.length < 2) {
            throw new IllegalArgumentException("Invalid response APDU");
        }
        this.cipher.init(2, this.ksEnc, getIV());
        byte[] do87 = new byte[0];
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bytes));
        byte[] do8e = null;
        boolean z = false;
        short do99 = 0;
        while (!z) {
            try {
                byte b4 = dataInputStream.readByte();
                if (b4 == -123) {
                    do87 = readDO87(dataInputStream, true);
                } else if (b4 == -121) {
                    do87 = readDO87(dataInputStream, false);
                } else if (b4 == -114) {
                    do8e = readDO8E(dataInputStream);
                    z = true;
                } else if (b4 != -103) {
                    LOGGER.warning("Unexpected tag " + Integer.toHexString(b4));
                } else {
                    do99 = readDO99(dataInputStream);
                }
            } catch (Throwable th10) {
                dataInputStream.close();
                throw th10;
            }
        }
        dataInputStream.close();
        if (shouldCheckMAC() && !checkMac(bytes, do8e)) {
            throw new IllegalStateException("Invalid MAC");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(do87, 0, do87.length);
        byteArrayOutputStream.write((65280 & do99) >> 8);
        byteArrayOutputStream.write(do99 & 255);
        return new ResponseAPDU(byteArrayOutputStream.toByteArray());
    }

    private CommandAPDU wrapCommandAPDU(CommandAPDU commandAPDU) throws GeneralSecurityException, IOException {
        int cla2 = commandAPDU.getCLA();
        int ins = commandAPDU.getINS();
        int p17 = commandAPDU.getP1();
        int p2 = commandAPDU.getP2();
        int nc3 = commandAPDU.getNc();
        int ne = commandAPDU.getNe();
        byte[] bArr = {(byte) (cla2 | 12), (byte) ins, (byte) p17, (byte) p2};
        byte[] bArrPad = Util.pad(bArr, getPadLength());
        int i = ((byte) commandAPDU.getINS()) == -79 ? 1 : 0;
        byte[] byteArray = new byte[0];
        byte[] bArrWrapDO = new byte[0];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (ne > 0) {
            try {
                bArrWrapDO = TLVUtil.wrapDO(ISO7816.TAG_SM_EXPECTED_LENGTH, encodeLe(ne));
            } finally {
            }
        }
        if (nc3 > 0) {
            byte[] bArrPad2 = Util.pad(commandAPDU.getData(), getPadLength());
            this.cipher.init(1, this.ksEnc, getIV());
            byte[] bArrDoFinal = this.cipher.doFinal(bArrPad2);
            byteArrayOutputStream.reset();
            byteArrayOutputStream.write(i != 0 ? -123 : -121);
            byteArrayOutputStream.write(TLVUtil.getLengthAsBytes(bArrDoFinal.length + (i ^ 1)));
            if (i == 0) {
                byteArrayOutputStream.write(1);
            }
            byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
            byteArray = byteArrayOutputStream.toByteArray();
        }
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(getEncodedSendSequenceCounter());
        byteArrayOutputStream.write(bArrPad);
        byteArrayOutputStream.write(byteArray);
        byteArrayOutputStream.write(bArrWrapDO);
        byte[] bArrPad3 = Util.pad(byteArrayOutputStream.toByteArray(), getPadLength());
        this.mac.init(this.ksMac);
        byte[] bArrDoFinal2 = this.mac.doFinal(bArrPad3);
        int length = bArrDoFinal2.length;
        if (length != 8) {
            length = 8;
        }
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(-114);
        byteArrayOutputStream.write(length);
        byteArrayOutputStream.write(bArrDoFinal2, 0, length);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        byteArrayOutputStream.write(byteArray);
        byteArrayOutputStream.write(bArrWrapDO);
        byteArrayOutputStream.write(byteArray2);
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e);
        }
        byte[] byteArray3 = byteArrayOutputStream.toByteArray();
        return (ne > 256 || byteArray3.length > 255) ? (ne > 256 || byteArray3.length > 255) ? new CommandAPDU(bArr[0], bArr[1], bArr[2], bArr[3], byteArray3, 65536) : new CommandAPDU(bArr[0], bArr[1], bArr[2], bArr[3], byteArray3, getMaxTranceiveLength()) : new CommandAPDU(bArr[0], bArr[1], bArr[2], bArr[3], byteArray3, 256);
    }

    public boolean checkMac(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.write(getEncodedSendSequenceCounter());
            byte[] bArrPad = Util.pad(bArr, 0, bArr.length - 12, getPadLength());
            dataOutputStream.write(bArrPad, 0, bArrPad.length);
            dataOutputStream.flush();
            dataOutputStream.close();
            this.mac.init(this.ksMac);
            byte[] bArrDoFinal = this.mac.doFinal(byteArrayOutputStream.toByteArray());
            if (bArrDoFinal.length > 8 && bArr2.length == 8) {
                byte[] bArr3 = new byte[8];
                System.arraycopy(bArrDoFinal, 0, bArr3, 0, 8);
                bArrDoFinal = bArr3;
            }
            return Arrays.equals(bArr2, bArrDoFinal);
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Exception checking MAC", (Throwable) e);
            return false;
        }
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        SecureMessagingWrapper secureMessagingWrapper = (SecureMessagingWrapper) obj2;
        SecretKey secretKey = this.ksEnc;
        if (secretKey == null) {
            if (secureMessagingWrapper.ksEnc != null) {
                return false;
            }
        } else if (!secretKey.equals(secureMessagingWrapper.ksEnc)) {
            return false;
        }
        SecretKey secretKey2 = this.ksMac;
        if (secretKey2 == null) {
            if (secureMessagingWrapper.ksMac != null) {
                return false;
            }
        } else if (!secretKey2.equals(secureMessagingWrapper.ksMac)) {
            return false;
        }
        return this.maxTranceiveLength == secureMessagingWrapper.maxTranceiveLength && this.shouldCheckMAC == secureMessagingWrapper.shouldCheckMAC && this.f228986ssc == secureMessagingWrapper.f228986ssc;
    }

    public abstract byte[] getEncodedSendSequenceCounter();

    public SecretKey getEncryptionKey() {
        return this.ksEnc;
    }

    public abstract IvParameterSpec getIV() throws GeneralSecurityException;

    public SecretKey getMACKey() {
        return this.ksMac;
    }

    public int getMaxTranceiveLength() {
        return this.maxTranceiveLength;
    }

    public abstract int getPadLength();

    public long getSendSequenceCounter() {
        return this.f228986ssc;
    }

    public int hashCode() {
        SecretKey secretKey = this.ksEnc;
        int iHashCode = ((secretKey == null ? 0 : secretKey.hashCode()) + 31) * 31;
        SecretKey secretKey2 = this.ksMac;
        int iHashCode2 = (((((iHashCode + (secretKey2 != null ? secretKey2.hashCode() : 0)) * 31) + this.maxTranceiveLength) * 31) + (this.shouldCheckMAC ? 1231 : 1237)) * 31;
        long j2 = this.f228986ssc;
        return iHashCode2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public boolean shouldCheckMAC() {
        return this.shouldCheckMAC;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("SecureMessagingWrapper [ssc: ");
        sb6.append(this.f228986ssc);
        sb6.append(", ksEnc: ");
        sb6.append(this.ksEnc);
        sb6.append(", ksMac: ");
        sb6.append(this.ksMac);
        sb6.append(", maxTranceiveLength: ");
        sb6.append(this.maxTranceiveLength);
        sb6.append(", shouldCheckMAC: ");
        return com.google.android.gms.internal.mlkit_vision_face.a.t(sb6, this.shouldCheckMAC, "]");
    }

    @Override // net.sf.scuba.smartcards.APDUWrapper
    public ResponseAPDU unwrap(ResponseAPDU responseAPDU) {
        this.f228986ssc++;
        try {
            byte[] data = responseAPDU.getData();
            if (data != null && data.length > 0) {
                return unwrapResponseAPDU(responseAPDU);
            }
            throw new IllegalStateException("Card indicates SM error, SW = " + Integer.toHexString(responseAPDU.getSW() & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        } catch (IOException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    @Override // net.sf.scuba.smartcards.APDUWrapper
    public CommandAPDU wrap(CommandAPDU commandAPDU) {
        this.f228986ssc++;
        try {
            return wrapCommandAPDU(commandAPDU);
        } catch (IOException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }
}
