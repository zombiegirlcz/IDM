package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class gi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164428c;

    public gi0(boolean z, boolean z3, boolean z4) {
        this.f164426a = z;
        this.f164427b = z3;
        this.f164428c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gi0)) {
            return false;
        }
        gi0 gi0Var = (gi0) obj2;
        return this.f164426a == gi0Var.f164426a && this.f164427b == gi0Var.f164427b && this.f164428c == gi0Var.f164428c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164428c) + j6.a.c(Boolean.hashCode(this.f164426a) * 31, 31, this.f164427b);
    }
}
