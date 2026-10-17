package t73;

/* JADX INFO: loaded from: classes21.dex */
public final class h1 implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f268471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f268472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f268473c;

    public h1(boolean z, boolean z3, boolean z4) {
        this.f268471a = z;
        this.f268472b = z3;
        this.f268473c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return this.f268471a == h1Var.f268471a && this.f268472b == h1Var.f268472b && this.f268473c == h1Var.f268473c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268473c) + j6.a.c(Boolean.hashCode(this.f268471a) * 31, 31, this.f268472b);
    }
}
