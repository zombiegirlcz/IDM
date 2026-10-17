package op0;

/* JADX INFO: loaded from: classes19.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f227237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f227238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f227239c;
    public final boolean d;
    public final boolean e;

    public e4(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f227237a = z;
        this.f227238b = z3;
        this.f227239c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj2;
        return this.f227237a == e4Var.f227237a && this.f227238b == e4Var.f227238b && this.f227239c == e4Var.f227239c && this.d == e4Var.d && this.e == e4Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f227237a) * 31, 31, this.f227238b), 31, this.f227239c), 31, this.d);
    }
}
