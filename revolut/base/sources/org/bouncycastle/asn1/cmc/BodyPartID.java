package org.bouncycastle.asn1.cmc;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes14.dex */
public class BodyPartID extends ASN1Object {
    public static final long bodyIdMax = 4294967295L;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final long f228150id;

    public BodyPartID(long j2) {
        if (j2 < 0 || j2 > bodyIdMax) {
            throw new IllegalArgumentException("id out of range");
        }
        this.f228150id = j2;
    }

    private static long convert(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 32) {
            return bigInteger.longValue();
        }
        throw new IllegalArgumentException("id out of range");
    }

    public static BodyPartID getInstance(Object obj2) {
        if (obj2 instanceof BodyPartID) {
            return (BodyPartID) obj2;
        }
        if (obj2 != null) {
            return new BodyPartID(ASN1Integer.getInstance(obj2));
        }
        return null;
    }

    public long getID() {
        return this.f228150id;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return ASN1Integer.valueOf(this.f228150id);
    }

    private BodyPartID(ASN1Integer aSN1Integer) {
        this(convert(aSN1Integer.getValue()));
    }
}
