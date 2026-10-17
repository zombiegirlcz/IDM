package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class x90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167116c;
    public final boolean d;
    public final boolean e;

    public x90(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f167114a = z;
        this.f167115b = z3;
        this.f167116c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x90)) {
            return false;
        }
        x90 x90Var = (x90) obj2;
        return this.f167114a == x90Var.f167114a && this.f167115b == x90Var.f167115b && this.f167116c == x90Var.f167116c && this.d == x90Var.d && this.e == x90Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167114a) * 31, 31, this.f167115b), 31, this.f167116c), 31, this.d);
    }
}
