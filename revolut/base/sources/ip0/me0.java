package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class me0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165368c;

    public me0(boolean z, boolean z3, boolean z4) {
        this.f165366a = z;
        this.f165367b = z3;
        this.f165368c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof me0)) {
            return false;
        }
        me0 me0Var = (me0) obj2;
        return this.f165366a == me0Var.f165366a && this.f165367b == me0Var.f165367b && this.f165368c == me0Var.f165368c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165368c) + j6.a.c(Boolean.hashCode(this.f165366a) * 31, 31, this.f165367b);
    }
}
