package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class em0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164127c;

    public em0(boolean z, boolean z3, boolean z4) {
        this.f164125a = z;
        this.f164126b = z3;
        this.f164127c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof em0)) {
            return false;
        }
        em0 em0Var = (em0) obj2;
        return this.f164125a == em0Var.f164125a && this.f164126b == em0Var.f164126b && this.f164127c == em0Var.f164127c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164127c) + j6.a.c(Boolean.hashCode(this.f164125a) * 31, 31, this.f164126b);
    }
}
