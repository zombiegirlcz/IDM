package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.PolynomialExtensionField;

/* JADX INFO: loaded from: classes14.dex */
public class X9ECParameters extends ASN1Object implements X9ObjectIdentifiers {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private X9Curve curve;
    private X9FieldID fieldID;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private X9ECPoint f228247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BigInteger f228248h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BigInteger f228249n;

    private X9ECParameters(ASN1Sequence aSN1Sequence) {
        if (!(aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) || !((ASN1Integer) aSN1Sequence.getObjectAt(0)).hasValue(1)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.f228249n = ((ASN1Integer) aSN1Sequence.getObjectAt(4)).getValue();
        if (aSN1Sequence.size() == 6) {
            this.f228248h = ((ASN1Integer) aSN1Sequence.getObjectAt(5)).getValue();
        }
        X9FieldID x9FieldID = X9FieldID.getInstance(aSN1Sequence.getObjectAt(1));
        this.fieldID = x9FieldID;
        this.curve = new X9Curve(x9FieldID, this.f228249n, this.f228248h, ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2)));
        ASN1Encodable objectAt = aSN1Sequence.getObjectAt(3);
        if (objectAt instanceof X9ECPoint) {
            this.f228247g = (X9ECPoint) objectAt;
        } else {
            this.f228247g = new X9ECPoint(this.curve.getCurve(), (ASN1OctetString) objectAt);
        }
    }

    public static X9ECParameters getInstance(Object obj2) {
        if (obj2 instanceof X9ECParameters) {
            return (X9ECParameters) obj2;
        }
        if (obj2 != null) {
            return new X9ECParameters(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public X9ECPoint getBaseEntry() {
        return this.f228247g;
    }

    public ECCurve getCurve() {
        return this.curve.getCurve();
    }

    public X9Curve getCurveEntry() {
        return this.curve;
    }

    public X9FieldID getFieldIDEntry() {
        return this.fieldID;
    }

    public ECPoint getG() {
        return this.f228247g.getPoint();
    }

    public BigInteger getH() {
        return this.f228248h;
    }

    public BigInteger getN() {
        return this.f228249n;
    }

    public byte[] getSeed() {
        return this.curve.getSeed();
    }

    public boolean hasSeed() {
        return this.curve.hasSeed();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(new ASN1Integer(ONE));
        aSN1EncodableVector.add(this.fieldID);
        aSN1EncodableVector.add(this.curve);
        aSN1EncodableVector.add(this.f228247g);
        aSN1EncodableVector.add(new ASN1Integer(this.f228249n));
        if (this.f228248h != null) {
            aSN1EncodableVector.add(new ASN1Integer(this.f228248h));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public X9ECParameters(ECCurve eCCurve, X9ECPoint x9ECPoint, BigInteger bigInteger) {
        this(eCCurve, x9ECPoint, bigInteger, null, null);
    }

    public X9ECParameters(ECCurve eCCurve, X9ECPoint x9ECPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, x9ECPoint, bigInteger, bigInteger2, null);
    }

    public X9ECParameters(ECCurve eCCurve, X9ECPoint x9ECPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        X9FieldID x9FieldID;
        this.curve = new X9Curve(eCCurve, bArr);
        this.f228247g = x9ECPoint;
        this.f228249n = bigInteger;
        this.f228248h = bigInteger2;
        FiniteField field = eCCurve.getField();
        if (ECAlgorithms.isFpField(field)) {
            x9FieldID = new X9FieldID(field.getCharacteristic());
        } else {
            if (!ECAlgorithms.isF2mField(field)) {
                throw new IllegalArgumentException("'curve' is of an unsupported type");
            }
            int[] exponentsPresent = ((PolynomialExtensionField) field).getMinimalPolynomial().getExponentsPresent();
            if (exponentsPresent.length == 3) {
                x9FieldID = new X9FieldID(exponentsPresent[2], exponentsPresent[1]);
            } else {
                if (exponentsPresent.length != 5) {
                    throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
                }
                x9FieldID = new X9FieldID(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
            }
        }
        this.fieldID = x9FieldID;
    }
}
