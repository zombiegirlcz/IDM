package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165335c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165336g;

    public m8(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f165333a = z;
        this.f165334b = z3;
        this.f165335c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165336g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m8)) {
            return false;
        }
        m8 m8Var = (m8) obj2;
        return this.f165333a == m8Var.f165333a && this.f165334b == m8Var.f165334b && this.f165335c == m8Var.f165335c && this.d == m8Var.d && this.e == m8Var.e && this.f == m8Var.f && this.f165336g == m8Var.f165336g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165336g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165333a) * 31, 31, this.f165334b), 31, this.f165335c), 31, this.d), 31, this.e), 31, this.f);
    }
}
