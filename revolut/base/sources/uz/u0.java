package uz;

/* JADX INFO: loaded from: classes16.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f284560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f284561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f284562c;

    public u0() {
        this(0, 0, 0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return this.f284560a == u0Var.f284560a && this.f284561b == u0Var.f284561b && this.f284562c == u0Var.f284562c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f284562c) + j6.a.b(this.f284561b, Integer.hashCode(this.f284560a) * 31, 31);
    }

    public u0(int i, int i2, int i3) {
        this.f284560a = i;
        this.f284561b = i2;
        this.f284562c = i3;
    }
}
