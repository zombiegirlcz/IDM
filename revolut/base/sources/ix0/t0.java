package ix0;

/* JADX INFO: loaded from: classes20.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f169308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f169309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f169310c;

    public t0(int i, int i2, int i3) {
        this.f169308a = i;
        this.f169309b = i2;
        this.f169310c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return this.f169308a == t0Var.f169308a && this.f169309b == t0Var.f169309b && this.f169310c == t0Var.f169310c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f169310c) + j6.a.b(this.f169309b, Integer.hashCode(this.f169308a) * 31, 31);
    }
}
