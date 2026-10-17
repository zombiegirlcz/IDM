package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes14.dex */
public class CramerShoupPrivateKeyParameters extends CramerShoupKeyParameters {
    private CramerShoupPublicKeyParameters pk;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private BigInteger f228477x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private BigInteger f228478x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private BigInteger f228479y1;
    private BigInteger y2;
    private BigInteger z;

    public CramerShoupPrivateKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
        super(true, cramerShoupParameters);
        this.f228477x1 = bigInteger;
        this.f228478x2 = bigInteger2;
        this.f228479y1 = bigInteger3;
        this.y2 = bigInteger4;
        this.z = bigInteger5;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj2) {
        if (!(obj2 instanceof CramerShoupPrivateKeyParameters)) {
            return false;
        }
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) obj2;
        return cramerShoupPrivateKeyParameters.getX1().equals(this.f228477x1) && cramerShoupPrivateKeyParameters.getX2().equals(this.f228478x2) && cramerShoupPrivateKeyParameters.getY1().equals(this.f228479y1) && cramerShoupPrivateKeyParameters.getY2().equals(this.y2) && cramerShoupPrivateKeyParameters.getZ().equals(this.z) && super.equals(obj2);
    }

    public CramerShoupPublicKeyParameters getPk() {
        return this.pk;
    }

    public BigInteger getX1() {
        return this.f228477x1;
    }

    public BigInteger getX2() {
        return this.f228478x2;
    }

    public BigInteger getY1() {
        return this.f228479y1;
    }

    public BigInteger getY2() {
        return this.y2;
    }

    public BigInteger getZ() {
        return this.z;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((((this.f228477x1.hashCode() ^ this.f228478x2.hashCode()) ^ this.f228479y1.hashCode()) ^ this.y2.hashCode()) ^ this.z.hashCode()) ^ super.hashCode();
    }

    public void setPk(CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters) {
        this.pk = cramerShoupPublicKeyParameters;
    }
}
