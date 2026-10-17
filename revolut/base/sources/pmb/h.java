package pmb;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f237534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f237535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f237536c;
    public final boolean d;

    public h(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f237534a = z;
        this.f237535b = z3;
        this.f237536c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f237534a == hVar.f237534a && this.f237535b == hVar.f237535b && this.f237536c == hVar.f237536c && this.d == hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f237534a) * 31, 31, this.f237535b), 31, this.f237536c);
    }
}
