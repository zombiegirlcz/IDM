package org.bouncycastle.crypto.ec;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes14.dex */
public class ECPair {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ECPoint f228328x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ECPoint f228329y;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f228328x = eCPoint;
        this.f228329y = eCPoint2;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof ECPair) {
            return equals((ECPair) obj2);
        }
        return false;
    }

    public ECPoint getX() {
        return this.f228328x;
    }

    public ECPoint getY() {
        return this.f228329y;
    }

    public int hashCode() {
        return (this.f228329y.hashCode() * 37) + this.f228328x.hashCode();
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }
}
