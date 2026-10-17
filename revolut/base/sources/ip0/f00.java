package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class f00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164176c;

    public f00(boolean z, boolean z3, boolean z4) {
        this.f164174a = z;
        this.f164175b = z3;
        this.f164176c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f00)) {
            return false;
        }
        f00 f00Var = (f00) obj2;
        return this.f164174a == f00Var.f164174a && this.f164175b == f00Var.f164175b && this.f164176c == f00Var.f164176c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164176c) + j6.a.c(Boolean.hashCode(this.f164174a) * 31, 31, this.f164175b);
    }
}
