package org.jmrtd.protocol;

import ehe.n;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import net.sf.scuba.util.Hex;
import org.jmrtd.Util;

/* JADX INFO: loaded from: classes14.dex */
public class EACCAResult implements Serializable {
    private static final long serialVersionUID = 4431711176589761513L;
    private byte[] keyHash;
    private BigInteger keyId;
    private PrivateKey pcdPrivateKey;
    private PublicKey pcdPublicKey;
    private PublicKey piccPublicKey;
    private SecureMessagingWrapper wrapper;

    public EACCAResult(BigInteger bigInteger, PublicKey publicKey, byte[] bArr, PublicKey publicKey2, PrivateKey privateKey, SecureMessagingWrapper secureMessagingWrapper) {
        this.keyId = bigInteger;
        this.piccPublicKey = publicKey;
        this.keyHash = bArr;
        this.pcdPublicKey = publicKey2;
        this.pcdPrivateKey = privateKey;
        this.wrapper = secureMessagingWrapper;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        EACCAResult eACCAResult = (EACCAResult) obj2;
        if (!Arrays.equals(this.keyHash, eACCAResult.keyHash)) {
            return false;
        }
        BigInteger bigInteger = this.keyId;
        if (bigInteger == null) {
            if (eACCAResult.keyId != null) {
                return false;
            }
        } else if (!bigInteger.equals(eACCAResult.keyId)) {
            return false;
        }
        PrivateKey privateKey = this.pcdPrivateKey;
        if (privateKey == null) {
            if (eACCAResult.pcdPrivateKey != null) {
                return false;
            }
        } else if (!privateKey.equals(eACCAResult.pcdPrivateKey)) {
            return false;
        }
        PublicKey publicKey = this.pcdPublicKey;
        if (publicKey == null) {
            if (eACCAResult.pcdPublicKey != null) {
                return false;
            }
        } else if (!publicKey.equals(eACCAResult.pcdPublicKey)) {
            return false;
        }
        PublicKey publicKey2 = this.piccPublicKey;
        if (publicKey2 == null) {
            if (eACCAResult.piccPublicKey != null) {
                return false;
            }
        } else if (!publicKey2.equals(eACCAResult.piccPublicKey)) {
            return false;
        }
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        if (secureMessagingWrapper == null) {
            if (eACCAResult.wrapper != null) {
                return false;
            }
        } else if (!secureMessagingWrapper.equals(eACCAResult.wrapper)) {
            return false;
        }
        return true;
    }

    public byte[] getKeyHash() {
        return this.keyHash;
    }

    public BigInteger getKeyId() {
        return this.keyId;
    }

    public PrivateKey getPCDPrivateKey() {
        return this.pcdPrivateKey;
    }

    public PublicKey getPCDPublicKey() {
        return this.pcdPublicKey;
    }

    public PublicKey getPublicKey() {
        return this.piccPublicKey;
    }

    public SecureMessagingWrapper getWrapper() {
        return this.wrapper;
    }

    public int hashCode() {
        int iB = n.b(31, 31, this.keyHash);
        BigInteger bigInteger = this.keyId;
        int iHashCode = (iB + (bigInteger == null ? 0 : bigInteger.hashCode())) * 31;
        PublicKey publicKey = this.piccPublicKey;
        int iHashCode2 = (iHashCode + (publicKey == null ? 0 : publicKey.hashCode())) * 31;
        PublicKey publicKey2 = this.pcdPublicKey;
        int iHashCode3 = (iHashCode2 + (publicKey2 == null ? 0 : publicKey2.hashCode())) * 31;
        PrivateKey privateKey = this.pcdPrivateKey;
        int iHashCode4 = (iHashCode3 + (privateKey == null ? 0 : privateKey.hashCode())) * 31;
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        return iHashCode4 + (secureMessagingWrapper != null ? secureMessagingWrapper.hashCode() : 0);
    }

    public String toString() {
        return "EACCAResult [keyId: " + this.keyId + ", PICC public key: " + this.piccPublicKey + ", wrapper: " + this.wrapper + ", key hash: " + Hex.bytesToHexString(this.keyHash) + ", PCD public key: " + Util.getDetailedPublicKeyAlgorithm(this.pcdPublicKey) + ", PCD private key: " + Util.getDetailedPrivateKeyAlgorithm(this.pcdPrivateKey) + "]";
    }
}
