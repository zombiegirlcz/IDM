package org.jmrtd.lds;

import j6.a;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DLSequence;

/* JADX INFO: loaded from: classes14.dex */
public class ActiveAuthenticationInfo extends SecurityInfo {
    public static final int VERSION_1 = 1;
    private static final long serialVersionUID = 6830847342039845308L;

    /* JADX INFO: renamed from: oid, reason: collision with root package name */
    private String f228966oid;
    private String signatureAlgorithmOID;
    private int version;
    public static final String ECDSA_PLAIN_SHA512_OID = "0.4.0.127.0.7.1.1.4.1.5";
    public static final String ECDSA_PLAIN_SHA384_OID = "0.4.0.127.0.7.1.1.4.1.4";
    public static final String ECDSA_PLAIN_SHA1_OID = "0.4.0.127.0.7.1.1.4.1.1";
    public static final String ECDSA_PLAIN_SHA224_OID = "0.4.0.127.0.7.1.1.4.1.2";
    public static final String ECDSA_PLAIN_RIPEMD160_OID = "0.4.0.127.0.7.1.1.4.1.6";
    public static final String ECDSA_PLAIN_SHA256_OID = "0.4.0.127.0.7.1.1.4.1.3";
    public static final String ECDSA_PLAIN_SIGNATURES = "0.4.0.127.0.7.1.1.4.1";
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd.lds");

    public ActiveAuthenticationInfo(String str, int i, String str2) {
        this.f228966oid = str;
        this.version = i;
        this.signatureAlgorithmOID = str2;
        checkFields();
    }

    private void checkFields() {
        try {
            if (!checkRequiredIdentifier(this.f228966oid)) {
                throw new IllegalArgumentException("Wrong identifier: " + this.f228966oid);
            }
            if (this.version != 1) {
                LOGGER.warning("Wrong version: " + this.version);
            }
            if (!"0.4.0.127.0.7.1.1.4.1.1".equals(this.signatureAlgorithmOID) && !"0.4.0.127.0.7.1.1.4.1.2".equals(this.signatureAlgorithmOID) && !"0.4.0.127.0.7.1.1.4.1.3".equals(this.signatureAlgorithmOID) && !"0.4.0.127.0.7.1.1.4.1.4".equals(this.signatureAlgorithmOID) && !"0.4.0.127.0.7.1.1.4.1.5".equals(this.signatureAlgorithmOID) && !"0.4.0.127.0.7.1.1.4.1.6".equals(this.signatureAlgorithmOID)) {
                throw new IllegalArgumentException("Wrong signature algorithm OID: " + this.signatureAlgorithmOID);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Malformed ActiveAuthenticationInfo", e);
        }
    }

    public static boolean checkRequiredIdentifier(String str) {
        return "2.23.136.1.1.5".equals(str);
    }

    public static String lookupMnemonicByOID(String str) throws NoSuchAlgorithmException {
        if ("0.4.0.127.0.7.1.1.4.1.1".equals(str)) {
            return "SHA1withECDSA";
        }
        if ("0.4.0.127.0.7.1.1.4.1.2".equals(str)) {
            return "SHA224withECDSA";
        }
        if ("0.4.0.127.0.7.1.1.4.1.3".equals(str)) {
            return "SHA256withECDSA";
        }
        if ("0.4.0.127.0.7.1.1.4.1.4".equals(str)) {
            return "SHA384withECDSA";
        }
        if ("0.4.0.127.0.7.1.1.4.1.5".equals(str)) {
            return "SHA512withECDSA";
        }
        if ("0.4.0.127.0.7.1.1.4.1.6".equals(str)) {
            return "RIPEMD160withECDSA";
        }
        throw new NoSuchAlgorithmException(a.q("Unknown OID ", str));
    }

    private String toProtocolOIDString(String str) {
        return "2.23.136.1.1.5".equals(str) ? "id-AA" : str;
    }

    public static String toSignatureAlgorithmOIDString(String str) {
        return "0.4.0.127.0.7.1.1.4.1.1".equals(str) ? "ecdsa-plain-SHA1" : "0.4.0.127.0.7.1.1.4.1.2".equals(str) ? "ecdsa-plain-SHA224" : "0.4.0.127.0.7.1.1.4.1.3".equals(str) ? "ecdsa-plain-SHA256" : "0.4.0.127.0.7.1.1.4.1.4".equals(str) ? "ecdsa-plain-SHA384" : "0.4.0.127.0.7.1.1.4.1.5".equals(str) ? "ecdsa-plain-SHA512" : "0.4.0.127.0.7.1.1.4.1.6".equals(str) ? "ecdsa-plain-RIPEMD160" : str;
    }

    public boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        if (ActiveAuthenticationInfo.class.equals(obj2.getClass())) {
            return getDERObject().equals(((ActiveAuthenticationInfo) obj2).getDERObject());
        }
        return false;
    }

    @Override // org.jmrtd.lds.SecurityInfo
    @Deprecated
    public ASN1Primitive getDERObject() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.f228966oid));
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        if (this.signatureAlgorithmOID != null) {
            aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.signatureAlgorithmOID));
        }
        return new DLSequence(aSN1EncodableVector);
    }

    @Override // org.jmrtd.lds.SecurityInfo
    public String getObjectIdentifier() {
        return this.f228966oid;
    }

    @Override // org.jmrtd.lds.SecurityInfo
    public String getProtocolOIDString() {
        return toProtocolOIDString(this.f228966oid);
    }

    public String getSignatureAlgorithmOID() {
        return this.signatureAlgorithmOID;
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.f228966oid;
        int iHashCode = (this.version * 5) + ((str == null ? 0 : str.hashCode()) * 3) + 12345;
        String str2 = this.signatureAlgorithmOID;
        return ((str2 == null ? 1 : str2.hashCode()) * 11) + iHashCode;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("ActiveAuthenticationInfo [");
        sb6.append("protocol: " + toProtocolOIDString(this.f228966oid));
        sb6.append(", ");
        sb6.append("version: " + this.version);
        sb6.append(", ");
        sb6.append("signatureAlgorithmOID: " + toSignatureAlgorithmOIDString(getSignatureAlgorithmOID()));
        sb6.append("]");
        return sb6.toString();
    }

    public ActiveAuthenticationInfo(String str) {
        this("2.23.136.1.1.5", 1, str);
    }
}
