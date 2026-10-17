package aw0;

/* JADX INFO: loaded from: classes19.dex */
public final class d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10281c;

    public d6(boolean z, boolean z3, boolean z4) {
        this.f10279a = z;
        this.f10280b = z3;
        this.f10281c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d6)) {
            return false;
        }
        d6 d6Var = (d6) obj2;
        return this.f10279a == d6Var.f10279a && this.f10280b == d6Var.f10280b && this.f10281c == d6Var.f10281c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10281c) + j6.a.c(Boolean.hashCode(this.f10279a) * 31, 31, this.f10280b);
    }
}
