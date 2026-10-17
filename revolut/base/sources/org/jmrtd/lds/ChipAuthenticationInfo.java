package org.jmrtd.lds;

import com.revolut.data.database.models.openbanking.d;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DLSequence;
import p.a;

/* JADX INFO: loaded from: classes14.dex */
public class ChipAuthenticationInfo extends SecurityInfo {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int VERSION_1 = 1;
    public static final int VERSION_2 = 2;
    private static final long serialVersionUID = 5591988305059068535L;
    private BigInteger keyId;

    /* JADX INFO: renamed from: oid, reason: collision with root package name */
    private String f228968oid;
    private int version;

    public ChipAuthenticationInfo(String str, int i) {
        this(str, i, null);
    }

    public static boolean checkRequiredIdentifier(String str) {
        return SecurityInfo.ID_CA_DH_3DES_CBC_CBC.equals(str) || SecurityInfo.ID_CA_ECDH_3DES_CBC_CBC.equals(str) || "0.4.0.127.0.7.2.2.3.1.2".equals(str) || "0.4.0.127.0.7.2.2.3.1.3".equals(str) || "0.4.0.127.0.7.2.2.3.1.4".equals(str) || "0.4.0.127.0.7.2.2.3.2.2".equals(str) || "0.4.0.127.0.7.2.2.3.2.3".equals(str) || "0.4.0.127.0.7.2.2.3.2.4".equals(str);
    }

    public static String toCipherAlgorithm(String str) {
        if (SecurityInfo.ID_CA_DH_3DES_CBC_CBC.equals(str) || SecurityInfo.ID_CA_ECDH_3DES_CBC_CBC.equals(str)) {
            return "DESede";
        }
        if ("0.4.0.127.0.7.2.2.3.1.2".equals(str) || "0.4.0.127.0.7.2.2.3.1.3".equals(str) || "0.4.0.127.0.7.2.2.3.1.4".equals(str) || "0.4.0.127.0.7.2.2.3.2.2".equals(str) || "0.4.0.127.0.7.2.2.3.2.3".equals(str) || "0.4.0.127.0.7.2.2.3.2.4".equals(str)) {
            return "AES";
        }
        throw new NumberFormatException(a.p("Unknown OID: \"", str, "\""));
    }

    public static String toDigestAlgorithm(String str) {
        if (SecurityInfo.ID_CA_DH_3DES_CBC_CBC.equals(str) || SecurityInfo.ID_CA_ECDH_3DES_CBC_CBC.equals(str) || "0.4.0.127.0.7.2.2.3.1.2".equals(str) || "0.4.0.127.0.7.2.2.3.2.2".equals(str)) {
            return "SHA-1";
        }
        if ("0.4.0.127.0.7.2.2.3.1.3".equals(str) || "0.4.0.127.0.7.2.2.3.2.3".equals(str) || "0.4.0.127.0.7.2.2.3.1.4".equals(str) || "0.4.0.127.0.7.2.2.3.2.4".equals(str)) {
            return "SHA-256";
        }
        throw new NumberFormatException(a.p("Unknown OID: \"", str, "\""));
    }

    public static String toKeyAgreementAlgorithm(String str) {
        if (str == null) {
            throw new NumberFormatException("Unknown OID: null");
        }
        if (SecurityInfo.ID_CA_DH_3DES_CBC_CBC.equals(str) || "0.4.0.127.0.7.2.2.3.1.2".equals(str) || "0.4.0.127.0.7.2.2.3.1.3".equals(str) || "0.4.0.127.0.7.2.2.3.1.4".equals(str)) {
            return "DH";
        }
        if (SecurityInfo.ID_CA_ECDH_3DES_CBC_CBC.equals(str) || "0.4.0.127.0.7.2.2.3.2.2".equals(str) || "0.4.0.127.0.7.2.2.3.2.3".equals(str) || "0.4.0.127.0.7.2.2.3.2.4".equals(str)) {
            return "ECDH";
        }
        throw new NumberFormatException(a.p("Unknown OID: \"", str, "\""));
    }

    public static int toKeyLength(String str) {
        if (SecurityInfo.ID_CA_DH_3DES_CBC_CBC.equals(str) || SecurityInfo.ID_CA_ECDH_3DES_CBC_CBC.equals(str) || "0.4.0.127.0.7.2.2.3.1.2".equals(str) || "0.4.0.127.0.7.2.2.3.2.2".equals(str)) {
            return 128;
        }
        if ("0.4.0.127.0.7.2.2.3.1.3".equals(str) || "0.4.0.127.0.7.2.2.3.2.3".equals(str)) {
            return 192;
        }
        if ("0.4.0.127.0.7.2.2.3.1.4".equals(str) || "0.4.0.127.0.7.2.2.3.2.4".equals(str)) {
            return 256;
        }
        throw new NumberFormatException(a.p("Unknown OID: \"", str, "\""));
    }

    private static String toProtocolOIDString(String str) {
        return SecurityInfo.ID_CA_DH_3DES_CBC_CBC.equals(str) ? "id-CA-DH-3DES-CBC-CBC" : "0.4.0.127.0.7.2.2.3.1.2".equals(str) ? "id-CA-DH-AES-CBC-CMAC-128" : "0.4.0.127.0.7.2.2.3.1.3".equals(str) ? "id-CA-DH-AES-CBC-CMAC-192" : "0.4.0.127.0.7.2.2.3.1.4".equals(str) ? "id-CA-DH-AES-CBC-CMAC-256" : SecurityInfo.ID_CA_ECDH_3DES_CBC_CBC.equals(str) ? "id-CA-ECDH-3DES-CBC-CBC" : "0.4.0.127.0.7.2.2.3.2.2".equals(str) ? "id-CA-ECDH-AES-CBC-CMAC-128" : "0.4.0.127.0.7.2.2.3.2.3".equals(str) ? "id-CA-ECDH-AES-CBC-CMAC-192" : "0.4.0.127.0.7.2.2.3.2.4".equals(str) ? "id-CA-ECDH-AES-CBC-CMAC-256" : str;
    }

    public void checkFields() {
        try {
            if (!checkRequiredIdentifier(this.f228968oid)) {
                throw new IllegalArgumentException("Wrong identifier: " + this.f228968oid);
            }
            int i = this.version;
            if (i == 1 || i == 2) {
                return;
            }
            LOGGER.warning("Wrong version. Was expecting 1 or 2, found " + this.version);
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Unexpected exception", (Throwable) e);
            throw new IllegalArgumentException("Malformed ChipAuthenticationInfo.");
        }
    }

    public boolean equals(Object obj2) {
        BigInteger bigInteger;
        if (obj2 == null) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        if (!ChipAuthenticationInfo.class.equals(obj2.getClass())) {
            return false;
        }
        ChipAuthenticationInfo chipAuthenticationInfo = (ChipAuthenticationInfo) obj2;
        return this.f228968oid.equals(chipAuthenticationInfo.f228968oid) && this.version == chipAuthenticationInfo.version && (((bigInteger = this.keyId) == null && chipAuthenticationInfo.keyId == null) || (bigInteger != null && bigInteger.equals(chipAuthenticationInfo.keyId)));
    }

    @Override // org.jmrtd.lds.SecurityInfo
    @Deprecated
    public ASN1Primitive getDERObject() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.f228968oid));
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        if (this.keyId != null) {
            aSN1EncodableVector.add(new ASN1Integer(this.keyId));
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public BigInteger getKeyId() {
        return this.keyId;
    }

    @Override // org.jmrtd.lds.SecurityInfo
    public String getObjectIdentifier() {
        return this.f228968oid;
    }

    @Override // org.jmrtd.lds.SecurityInfo
    public String getProtocolOIDString() {
        return toProtocolOIDString(this.f228968oid);
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.f228968oid;
        int iHashCode = (this.version * 61) + ((str == null ? 0 : str.hashCode()) * 11) + 3;
        BigInteger bigInteger = this.keyId;
        return ((bigInteger == null ? LDSFile.EF_DG15_TAG : bigInteger.hashCode()) * 1991) + iHashCode;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("ChipAuthenticationInfo [protocol: ");
        sb6.append(toProtocolOIDString(this.f228968oid));
        sb6.append(", version: ");
        sb6.append(this.version);
        sb6.append(", keyId: ");
        Object obj2 = this.keyId;
        if (obj2 == null) {
            obj2 = "-";
        }
        return d.t(sb6, obj2, "]");
    }

    public ChipAuthenticationInfo(String str, int i, BigInteger bigInteger) {
        this.f228968oid = str;
        this.version = i;
        this.keyId = bigInteger;
        checkFields();
    }
}
