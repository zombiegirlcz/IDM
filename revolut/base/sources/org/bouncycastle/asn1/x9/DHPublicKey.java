package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class DHPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ASN1Integer f228242y;

    public DHPublicKey(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'y' cannot be null");
        }
        this.f228242y = new ASN1Integer(bigInteger);
    }

    public static DHPublicKey getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof DHPublicKey)) {
            return (DHPublicKey) obj2;
        }
        if (obj2 instanceof ASN1Integer) {
            return new DHPublicKey((ASN1Integer) obj2);
        }
        throw new IllegalArgumentException(a.g(obj2, "Invalid DHPublicKey: "));
    }

    public BigInteger getY() {
        return this.f228242y.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f228242y;
    }

    private DHPublicKey(ASN1Integer aSN1Integer) {
        if (aSN1Integer == null) {
            throw new IllegalArgumentException("'y' cannot be null");
        }
        this.f228242y = aSN1Integer;
    }

    public static DHPublicKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Integer.getInstance(aSN1TaggedObject, z));
    }
}
