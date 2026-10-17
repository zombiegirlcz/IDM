package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class EciesP256EncryptedKey extends ASN1Object {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ASN1OctetString f228758c;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ASN1OctetString f228759t;
    private final EccP256CurvePoint v;

    public static class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ASN1OctetString f228760c;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ASN1OctetString f228761t;
        private EccP256CurvePoint v;

        public EciesP256EncryptedKey createEciesP256EncryptedKey() {
            return new EciesP256EncryptedKey(this.v, this.f228760c, this.f228761t);
        }

        public Builder setC(ASN1OctetString aSN1OctetString) {
            this.f228760c = aSN1OctetString;
            return this;
        }

        public Builder setT(ASN1OctetString aSN1OctetString) {
            this.f228761t = aSN1OctetString;
            return this;
        }

        public Builder setV(EccP256CurvePoint eccP256CurvePoint) {
            this.v = eccP256CurvePoint;
            return this;
        }

        public Builder setC(byte[] bArr) {
            this.f228760c = new DEROctetString(Arrays.clone(bArr));
            return this;
        }

        public Builder setT(byte[] bArr) {
            this.f228761t = new DEROctetString(Arrays.clone(bArr));
            return this;
        }
    }

    private EciesP256EncryptedKey(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("expected sequence size of 3");
        }
        this.v = EccP256CurvePoint.getInstance(aSN1Sequence.getObjectAt(0));
        this.f228758c = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
        this.f228759t = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EciesP256EncryptedKey getInstance(Object obj2) {
        if (obj2 instanceof EciesP256EncryptedKey) {
            return (EciesP256EncryptedKey) obj2;
        }
        if (obj2 != null) {
            return new EciesP256EncryptedKey(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public ASN1OctetString getC() {
        return this.f228758c;
    }

    public ASN1OctetString getT() {
        return this.f228759t;
    }

    public EccP256CurvePoint getV() {
        return this.v;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.v, this.f228758c, this.f228759t});
    }

    public EciesP256EncryptedKey(EccP256CurvePoint eccP256CurvePoint, ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        this.v = eccP256CurvePoint;
        this.f228758c = aSN1OctetString;
        this.f228759t = aSN1OctetString2;
    }
}
