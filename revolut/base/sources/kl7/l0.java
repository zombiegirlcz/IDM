package kl7;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f185353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f185354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f185355c;
    public final int d;
    public final int e;
    public final int f;

    public l0(int i, int i2, int i3, int i5, int i6, int i21) {
        this.f185353a = i;
        this.f185354b = i2;
        this.f185355c = i3;
        this.d = i5;
        this.e = i6;
        this.f = i21;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return this.f185353a == l0Var.f185353a && this.f185354b == l0Var.f185354b && this.f185355c == l0Var.f185355c && this.d == l0Var.d && this.e == l0Var.e && this.f == l0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f185355c, j6.a.b(this.f185354b, Integer.hashCode(this.f185353a) * 31, 31), 31), 31), 31);
    }
}
