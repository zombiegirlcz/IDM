package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class q9 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165941c;

    public q9(boolean z, boolean z3, boolean z4) {
        this.f165939a = z;
        this.f165940b = z3;
        this.f165941c = z4;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f165941c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q9)) {
            return false;
        }
        q9 q9Var = (q9) obj2;
        return this.f165939a == q9Var.f165939a && this.f165940b == q9Var.f165940b && this.f165941c == q9Var.f165941c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165941c) + j6.a.c(Boolean.hashCode(this.f165939a) * 31, 31, this.f165940b);
    }
}
