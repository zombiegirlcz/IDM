package ux0;

/* JADX INFO: loaded from: classes20.dex */
public final class y0 implements z0, tx0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f283844a;

    public y0() {
        this(4);
    }

    @Override // tx0.b
    public final int a() {
        return this.f283844a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y0) && this.f283844a == ((y0) obj2).f283844a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f283844a);
    }

    public y0(int i) {
        this.f283844a = i;
    }
}
