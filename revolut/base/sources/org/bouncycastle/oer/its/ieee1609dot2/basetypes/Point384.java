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
public class Point384 extends ASN1Object {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ASN1OctetString f228767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ASN1OctetString f228768y;

    public static class Builder {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private ASN1OctetString f228769x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ASN1OctetString f228770y;

        public Point384 createPoint384() {
            return new Point384(this.f228769x, this.f228770y);
        }

        public Builder setX(BigInteger bigInteger) {
            this.f228769x = new DEROctetString(BigIntegers.asUnsignedByteArray(48, bigInteger));
            return this;
        }

        public Builder setY(BigInteger bigInteger) {
            this.f228770y = new DEROctetString(BigIntegers.asUnsignedByteArray(48, bigInteger));
            return this;
        }

        public Builder setX(ASN1OctetString aSN1OctetString) {
            this.f228769x = aSN1OctetString;
            return this;
        }

        public Builder setY(ASN1OctetString aSN1OctetString) {
            this.f228770y = aSN1OctetString;
            return this;
        }

        public Builder setX(byte[] bArr) {
            this.f228769x = new DEROctetString(bArr);
            return this;
        }

        public Builder setY(byte[] bArr) {
            this.f228770y = new DEROctetString(bArr);
            return this;
        }
    }

    public Point384(ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        if (aSN1OctetString.getOctets().length != 48) {
            throw new IllegalArgumentException("x must be 48 bytes long");
        }
        if (aSN1OctetString2.getOctets().length != 48) {
            throw new IllegalArgumentException("y must be 48 bytes long");
        }
        this.f228767x = aSN1OctetString;
        this.f228768y = aSN1OctetString2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Point384 getInstance(Object obj2) {
        if (obj2 instanceof Point384) {
            return (Point384) obj2;
        }
        if (obj2 != null) {
            return new Point384(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public ASN1OctetString getX() {
        return this.f228767x;
    }

    public ASN1OctetString getY() {
        return this.f228768y;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.f228767x, this.f228768y});
    }

    private Point384(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("expected sequence size of 2");
        }
        ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        this.f228767x = aSN1OctetString;
        ASN1OctetString aSN1OctetString2 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
        this.f228768y = aSN1OctetString2;
        if (aSN1OctetString.getOctets().length != 48) {
            throw new IllegalArgumentException("x must be 48 bytes long");
        }
        if (aSN1OctetString2.getOctets().length != 48) {
            throw new IllegalArgumentException("y must be 48 bytes long");
        }
    }
}
