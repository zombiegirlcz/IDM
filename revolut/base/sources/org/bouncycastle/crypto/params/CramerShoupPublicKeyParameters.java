package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes14.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f228480c;
    private BigInteger d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BigInteger f228481h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f228480c = bigInteger;
        this.d = bigInteger2;
        this.f228481h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj2) {
        if (!(obj2 instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj2;
        return cramerShoupPublicKeyParameters.getC().equals(this.f228480c) && cramerShoupPublicKeyParameters.getD().equals(this.d) && cramerShoupPublicKeyParameters.getH().equals(this.f228481h) && super.equals(obj2);
    }

    public BigInteger getC() {
        return this.f228480c;
    }

    public BigInteger getD() {
        return this.d;
    }

    public BigInteger getH() {
        return this.f228481h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f228480c.hashCode() ^ this.d.hashCode()) ^ this.f228481h.hashCode()) ^ super.hashCode();
    }
}
