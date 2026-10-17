package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes14.dex */
public class Point256 extends ASN1Object {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ASN1OctetString f228763x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ASN1OctetString f228764y;

    public static class Builder {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ASN1OctetString f228765x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ASN1OctetString f228766y;

        public Point256 createPoint256() {
            return new Point256(this.f228765x, this.f228766y);
        }

        public Builder setX(BigInteger bigInteger) {
            return setX(BigIntegers.asUnsignedByteArray(32, bigInteger));
        }

        public Builder setY(BigInteger bigInteger) {
            return setY(BigIntegers.asUnsignedByteArray(32, bigInteger));
        }

        public Builder setX(ASN1OctetString aSN1OctetString) {
            this.f228765x = aSN1OctetString;
            return this;
        }

        public Builder setY(ASN1OctetString aSN1OctetString) {
            this.f228766y = aSN1OctetString;
            return this;
        }

        public Builder setX(byte[] bArr) {
            this.f228765x = new DEROctetString(bArr);
            return this;
        }

        public Builder setY(byte[] bArr) {
            this.f228766y = new DEROctetString(bArr);
            return this;
        }
    }

    public Point256(ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        if (aSN1OctetString == null || aSN1OctetString.getOctets().length != 32) {
            throw new IllegalArgumentException("x must be 32 bytes long");
        }
        if (aSN1OctetString2 == null || aSN1OctetString2.getOctets().length != 32) {
            throw new IllegalArgumentException("y must be 32 bytes long");
        }
        this.f228763x = aSN1OctetString;
        this.f228764y = aSN1OctetString2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Point256 getInstance(Object obj2) {
        if (obj2 instanceof Point256) {
            return (Point256) obj2;
        }
        if (obj2 != null) {
            return new Point256(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public ASN1OctetString getX() {
        return this.f228763x;
    }

    public ASN1OctetString getY() {
        return this.f228764y;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.f228763x, this.f228764y});
    }

    private Point256(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("expected sequence size of 2");
        }
        ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        this.f228763x = aSN1OctetString;
        ASN1OctetString aSN1OctetString2 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
        this.f228764y = aSN1OctetString2;
        if (aSN1OctetString.getOctets().length != 32) {
            throw new IllegalArgumentException("x must be 32 bytes long");
        }
        if (aSN1OctetString2.getOctets().length != 32) {
            throw new IllegalArgumentException("y must be 32 bytes long");
        }
    }
}
