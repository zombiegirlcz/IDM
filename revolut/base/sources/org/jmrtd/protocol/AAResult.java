package org.jmrtd.protocol;

import ehe.n;
import java.io.Serializable;
import java.security.PublicKey;
import java.util.Arrays;
import net.sf.scuba.util.Hex;
import org.jmrtd.Util;

/* JADX INFO: loaded from: classes14.dex */
public class AAResult implements Serializable {
    private static final long serialVersionUID = 8800803919646625713L;
    private byte[] challenge;
    private String digestAlgorithm;
    private PublicKey publicKey;
    private byte[] response;
    private String signatureAlgorithm;

    public AAResult(PublicKey publicKey, String str, String str2, byte[] bArr, byte[] bArr2) {
        this.publicKey = publicKey;
        this.digestAlgorithm = str;
        this.signatureAlgorithm = str2;
        this.challenge = bArr;
        this.response = bArr2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        AAResult aAResult = (AAResult) obj2;
        if (!Arrays.equals(this.challenge, aAResult.challenge)) {
            return false;
        }
        String str = this.digestAlgorithm;
        if (str == null) {
            if (aAResult.digestAlgorithm != null) {
                return false;
            }
        } else if (!str.equals(aAResult.digestAlgorithm)) {
            return false;
        }
        PublicKey publicKey = this.publicKey;
        if (publicKey == null) {
            if (aAResult.publicKey != null) {
                return false;
            }
        } else if (!publicKey.equals(aAResult.publicKey)) {
            return false;
        }
        if (!Arrays.equals(this.response, aAResult.response)) {
            return false;
        }
        String str2 = this.signatureAlgorithm;
        if (str2 == null) {
            if (aAResult.signatureAlgorithm != null) {
                return false;
            }
        } else if (!str2.equals(aAResult.signatureAlgorithm)) {
            return false;
        }
        return true;
    }

    public byte[] getChallenge() {
        return this.challenge;
    }

    public String getDigestAlgorithm() {
        return this.digestAlgorithm;
    }

    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    public byte[] getResponse() {
        return this.response;
    }

    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public int hashCode() {
        int iB = n.b(1303377669, 1991, this.challenge);
        String str = this.digestAlgorithm;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 1991;
        PublicKey publicKey = this.publicKey;
        int iB2 = n.b((iHashCode + (publicKey == null ? 0 : publicKey.hashCode())) * 1991, 1991, this.response);
        String str2 = this.signatureAlgorithm;
        return iB2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AAResult [publicKey: " + Util.getDetailedPublicKeyAlgorithm(this.publicKey) + ", digestAlgorithm: " + this.digestAlgorithm + ", signatureAlgorithm: " + this.signatureAlgorithm + ", challenge: " + Hex.bytesToHexString(this.challenge) + ", response: " + Hex.bytesToHexString(this.response);
    }
}
