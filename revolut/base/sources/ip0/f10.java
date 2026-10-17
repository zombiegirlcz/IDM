package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class f10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164183c;

    public f10(boolean z, boolean z3, boolean z4) {
        this.f164181a = z;
        this.f164182b = z3;
        this.f164183c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f10)) {
            return false;
        }
        f10 f10Var = (f10) obj2;
        return this.f164181a == f10Var.f164181a && this.f164182b == f10Var.f164182b && this.f164183c == f10Var.f164183c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164183c) + j6.a.c(Boolean.hashCode(this.f164181a) * 31, 31, this.f164182b);
    }
}
