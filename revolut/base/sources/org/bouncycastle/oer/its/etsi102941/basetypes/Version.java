package org.bouncycastle.oer.its.etsi102941.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

/* JADX INFO: loaded from: classes14.dex */
public class Version extends ASN1Object {
    private final BigInteger version;

    public Version(int i) {
        this(BigInteger.valueOf(i));
    }

    public static Version getInstance(Object obj2) {
        if (obj2 instanceof UINT8) {
            return (Version) obj2;
        }
        if (obj2 != null) {
            return new Version(ASN1Integer.getInstance(obj2));
        }
        return null;
    }

    public BigInteger getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.version);
    }

    public Version(long j2) {
        this(BigInteger.valueOf(j2));
    }

    public Version(BigInteger bigInteger) {
        this.version = bigInteger;
    }

    public Version(ASN1Integer aSN1Integer) {
        this.version = aSN1Integer.getValue();
    }
}
