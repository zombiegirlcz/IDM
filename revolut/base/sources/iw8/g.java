package iw8;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f168991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168993c;

    public g(boolean z, boolean z3, boolean z4) {
        this.f168991a = z;
        this.f168992b = z3;
        this.f168993c = z4;
    }

    public static g a(g gVar, int i) {
        boolean z = (i & 1) != 0 ? gVar.f168991a : true;
        boolean z3 = (i & 2) != 0 ? gVar.f168992b : true;
        boolean z4 = gVar.f168993c;
        gVar.getClass();
        return new g(z, z3, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f168991a == gVar.f168991a && this.f168992b == gVar.f168992b && this.f168993c == gVar.f168993c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168993c) + j6.a.c(Boolean.hashCode(this.f168991a) * 31, 31, this.f168992b);
    }
}
