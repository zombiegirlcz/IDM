package org.bouncycastle.oer.its.etsi103097.extension;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes14.dex */
public class ExtId extends ASN1Object {
    private static final BigInteger MAX = BigInteger.valueOf(255);
    private final BigInteger extId;

    public ExtId(long j2) {
        this(BigInteger.valueOf(j2));
    }

    public static ExtId getInstance(Object obj2) {
        if (obj2 instanceof ExtId) {
            return (ExtId) obj2;
        }
        if (obj2 != null) {
            return new ExtId(ASN1Integer.getInstance(obj2));
        }
        return null;
    }

    public BigInteger getExtId() {
        return this.extId;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.extId);
    }

    public ExtId(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.compareTo(MAX) <= 0) {
            this.extId = bigInteger;
            return;
        }
        throw new IllegalArgumentException("value " + bigInteger + " outside of range 0...255");
    }

    private ExtId(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }

    public ExtId(byte[] bArr) {
        this(new BigInteger(bArr));
    }
}
