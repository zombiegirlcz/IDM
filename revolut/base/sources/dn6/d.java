package dn6;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116220b;

    public d(int i, int i2) {
        this.f116219a = i;
        this.f116220b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f116219a == dVar.f116219a && this.f116220b == dVar.f116220b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116220b) + (Integer.hashCode(this.f116219a) * 31);
    }
}
