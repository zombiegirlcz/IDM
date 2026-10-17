package aw0;

/* JADX INFO: loaded from: classes19.dex */
public final class q8 extends r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10497c;
    public final boolean d;

    public q8(int i, int i2, float f, boolean z) {
        this.f10495a = i;
        this.f10496b = i2;
        this.f10497c = f;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) obj2;
        return this.f10495a == q8Var.f10495a && this.f10496b == q8Var.f10496b && Float.compare(this.f10497c, q8Var.f10497c) == 0 && this.d == q8Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + m72.b.b(this.f10497c, j6.a.b(this.f10496b, Integer.hashCode(this.f10495a) * 31, 31), 31);
    }
}
