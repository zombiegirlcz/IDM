package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class fd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164243c;

    public fd0(boolean z, boolean z3, boolean z4) {
        this.f164241a = z;
        this.f164242b = z3;
        this.f164243c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fd0)) {
            return false;
        }
        fd0 fd0Var = (fd0) obj2;
        return this.f164241a == fd0Var.f164241a && this.f164242b == fd0Var.f164242b && this.f164243c == fd0Var.f164243c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164243c) + j6.a.c(Boolean.hashCode(this.f164241a) * 31, 31, this.f164242b);
    }
}
