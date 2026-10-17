package ry5;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f258231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f258232b;

    public k(int i, int i2) {
        this.f258231a = i;
        this.f258232b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f258231a == kVar.f258231a && this.f258232b == kVar.f258232b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f258232b) + (Integer.hashCode(this.f258231a) * 31);
    }
}
