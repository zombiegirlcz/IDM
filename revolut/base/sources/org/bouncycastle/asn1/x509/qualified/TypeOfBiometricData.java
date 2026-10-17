package org.bouncycastle.asn1.x509.qualified;

import a0.d;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes14.dex */
public class TypeOfBiometricData extends ASN1Object implements ASN1Choice {
    public static final int HANDWRITTEN_SIGNATURE = 1;
    public static final int PICTURE = 0;

    /* JADX INFO: renamed from: obj, reason: collision with root package name */
    ASN1Encodable f228237obj;

    public TypeOfBiometricData(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(d.n("unknow PredefinedBiometricType : ", i));
        }
        this.f228237obj = ASN1Integer.valueOf(i);
    }

    public static TypeOfBiometricData getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof TypeOfBiometricData)) {
            return (TypeOfBiometricData) obj2;
        }
        if (obj2 instanceof ASN1Integer) {
            return new TypeOfBiometricData(ASN1Integer.getInstance(obj2).intValueExact());
        }
        if (obj2 instanceof ASN1ObjectIdentifier) {
            return new TypeOfBiometricData(ASN1ObjectIdentifier.getInstance(obj2));
        }
        throw new IllegalArgumentException("unknown object in getInstance");
    }

    public ASN1ObjectIdentifier getBiometricDataOid() {
        return (ASN1ObjectIdentifier) this.f228237obj;
    }

    public int getPredefinedBiometricType() {
        return ((ASN1Integer) this.f228237obj).intValueExact();
    }

    public boolean isPredefined() {
        return this.f228237obj instanceof ASN1Integer;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f228237obj.toASN1Primitive();
    }

    public TypeOfBiometricData(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f228237obj = aSN1ObjectIdentifier;
    }
}
