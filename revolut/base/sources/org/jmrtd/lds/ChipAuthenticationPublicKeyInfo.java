package org.jmrtd.lds;

import java.math.BigInteger;
import java.security.PublicKey;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.jmrtd.Util;
import p.a;

/* JADX INFO: loaded from: classes14.dex */
public class ChipAuthenticationPublicKeyInfo extends SecurityInfo {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 5687291829854501771L;
    private BigInteger keyId;

    /* JADX INFO: renamed from: oid, reason: collision with root package name */
    private String f228969oid;
    private PublicKey publicKey;

    public ChipAuthenticationPublicKeyInfo(PublicKey publicKey) {
        this(publicKey, (BigInteger) null);
    }

    public static boolean checkRequiredIdentifier(String str) {
        return SecurityInfo.ID_PK_DH.equals(str) || SecurityInfo.ID_PK_ECDH.equals(str);
    }

    public static String toKeyAgreementAlgorithm(String str) {
        if (str == null) {
            throw new NumberFormatException("Unknown OID: null");
        }
        if (SecurityInfo.ID_PK_DH.equals(str)) {
            return "DH";
        }
        if (SecurityInfo.ID_PK_ECDH.equals(str)) {
            return "ECDH";
        }
        throw new NumberFormatException(a.p("Unknown OID: \"", str, "\""));
    }

    private static String toProtocolOIDString(String str) {
        return SecurityInfo.ID_PK_DH.equals(str) ? "id-PK-DH" : SecurityInfo.ID_PK_ECDH.equals(str) ? "id-PK-ECDH" : str;
    }

    public void checkFields() {
        try {
            if (checkRequiredIdentifier(this.f228969oid)) {
                return;
            }
            throw new IllegalArgumentException("Wrong identifier: " + this.f228969oid);
        } catch (Exception e) {
            throw new IllegalArgumentException("Malformed ChipAuthenticationInfo", e);
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
        if (!ChipAuthenticationPublicKeyInfo.class.equals(obj2.getClass())) {
            return false;
        }
        ChipAuthenticationPublicKeyInfo chipAuthenticationPublicKeyInfo = (ChipAuthenticationPublicKeyInfo) obj2;
        return this.f228969oid.equals(chipAuthenticationPublicKeyInfo.f228969oid) && (((bigInteger = this.keyId) == null && chipAuthenticationPublicKeyInfo.keyId == null) || (bigInteger != null && bigInteger.equals(chipAuthenticationPublicKeyInfo.keyId))) && this.publicKey.equals(chipAuthenticationPublicKeyInfo.publicKey);
    }

    @Override // org.jmrtd.lds.SecurityInfo
    @Deprecated
    public ASN1Primitive getDERObject() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        SubjectPublicKeyInfo subjectPublicKeyInfo = Util.toSubjectPublicKeyInfo(this.publicKey);
        if (subjectPublicKeyInfo == null) {
            LOGGER.log(Level.WARNING, "Could not convert public key to subject-public-key-info structure");
        } else {
            aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.f228969oid));
            aSN1EncodableVector.add(subjectPublicKeyInfo.toASN1Primitive());
            if (this.keyId != null) {
                aSN1EncodableVector.add(new ASN1Integer(this.keyId));
            }
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public BigInteger getKeyId() {
        return this.keyId;
    }

    @Override // org.jmrtd.lds.SecurityInfo
    public String getObjectIdentifier() {
        return this.f228969oid;
    }

    @Override // org.jmrtd.lds.SecurityInfo
    public String getProtocolOIDString() {
        return toProtocolOIDString(this.f228969oid);
    }

    public PublicKey getSubjectPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        int iHashCode = this.f228969oid.hashCode();
        BigInteger bigInteger = this.keyId;
        int iHashCode2 = LDSFile.EF_DG15_TAG;
        int iHashCode3 = iHashCode + (bigInteger == null ? 111 : bigInteger.hashCode());
        PublicKey publicKey = this.publicKey;
        if (publicKey != null) {
            iHashCode2 = publicKey.hashCode();
        }
        return ((iHashCode3 + iHashCode2) * 1337) + 123;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("ChipAuthenticationPublicKeyInfo [protocol: ");
        sb6.append(toProtocolOIDString(this.f228969oid));
        sb6.append(", chipAuthenticationPublicKey: ");
        sb6.append(Util.getDetailedPublicKeyAlgorithm(getSubjectPublicKey()));
        sb6.append(", keyId: ");
        BigInteger bigInteger = this.keyId;
        return v0.a.i(sb6, bigInteger == null ? "-" : bigInteger.toString(), "]");
    }

    public ChipAuthenticationPublicKeyInfo(PublicKey publicKey, BigInteger bigInteger) {
        this(Util.inferProtocolIdentifier(publicKey), publicKey, bigInteger);
    }

    public ChipAuthenticationPublicKeyInfo(String str, PublicKey publicKey) {
        this(str, publicKey, null);
    }

    public ChipAuthenticationPublicKeyInfo(String str, PublicKey publicKey, BigInteger bigInteger) {
        this.f228969oid = str;
        this.publicKey = Util.reconstructPublicKey(publicKey);
        this.keyId = bigInteger;
        checkFields();
    }
}
