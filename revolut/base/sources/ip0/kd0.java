package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class kd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164998c;

    public kd0(boolean z, boolean z3, boolean z4) {
        this.f164996a = z;
        this.f164997b = z3;
        this.f164998c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof kd0)) {
            return false;
        }
        kd0 kd0Var = (kd0) obj2;
        return this.f164996a == kd0Var.f164996a && this.f164997b == kd0Var.f164997b && this.f164998c == kd0Var.f164998c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164998c) + j6.a.c(Boolean.hashCode(this.f164996a) * 31, 31, this.f164997b);
    }
}
