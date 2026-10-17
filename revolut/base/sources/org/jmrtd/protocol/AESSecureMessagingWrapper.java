package org.jmrtd.protocol;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.jmrtd.Util;

/* JADX INFO: loaded from: classes14.dex */
public class AESSecureMessagingWrapper extends SecureMessagingWrapper implements Serializable {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 2086301081448345496L;
    private transient Cipher sscIVCipher;

    public AESSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, long j2) throws GeneralSecurityException {
        this(secretKey, secretKey2, 256, true, j2);
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && getClass() == obj2.getClass()) {
            return super.equals(obj2);
        }
        return false;
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public byte[] getEncodedSendSequenceCounter() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
        try {
            try {
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(0);
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeLong(getSendSequenceCounter());
                dataOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    return byteArray;
                } catch (IOException e) {
                    return byteArray;
                }
            } catch (IOException e2) {
                LOGGER.log(Level.FINE, "Error writing to stream", (Throwable) e2);
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (IOException e4) {
                    LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e4);
                    return null;
                }
            }
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e5) {
                LOGGER.log(Level.FINE, "Error closing stream", (Throwable) e5);
            }
        }
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public IvParameterSpec getIV() throws GeneralSecurityException {
        return new IvParameterSpec(this.sscIVCipher.doFinal(getEncodedSendSequenceCounter()));
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public int getPadLength() {
        return 16;
    }

    @Override // net.sf.scuba.smartcards.APDUWrapper
    public String getType() {
        return "AES";
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public int hashCode() {
        return (super.hashCode() * 71) + 17;
    }

    @Override // org.jmrtd.protocol.SecureMessagingWrapper
    public String toString() {
        return "AESSecureMessagingWrapper [ssc: " + getSendSequenceCounter() + ", kEnc: " + getEncryptionKey() + ", kMac: " + getMACKey() + ", shouldCheckMAC: " + shouldCheckMAC() + ", maxTranceiveLength: " + getMaxTranceiveLength() + "]";
    }

    public AESSecureMessagingWrapper(AESSecureMessagingWrapper aESSecureMessagingWrapper) throws GeneralSecurityException {
        this(aESSecureMessagingWrapper.getEncryptionKey(), aESSecureMessagingWrapper.getMACKey(), aESSecureMessagingWrapper.getMaxTranceiveLength(), aESSecureMessagingWrapper.shouldCheckMAC(), aESSecureMessagingWrapper.getSendSequenceCounter());
    }

    public AESSecureMessagingWrapper(SecretKey secretKey, SecretKey secretKey2, int i, boolean z, long j2) throws GeneralSecurityException {
        super(secretKey, secretKey2, "AES/CBC/NoPadding", "AESCMAC", i, z, j2);
        this.sscIVCipher = Util.getCipher("AES/ECB/NoPadding", 1, secretKey);
    }
}
