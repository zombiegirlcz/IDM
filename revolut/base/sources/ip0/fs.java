package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class fs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164309c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f164311h;
    public final boolean i;

    public fs(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        this.f164307a = z;
        this.f164308b = z3;
        this.f164309c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164310g = z29;
        this.f164311h = z31;
        this.i = z41;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fs)) {
            return false;
        }
        fs fsVar = (fs) obj2;
        return this.f164307a == fsVar.f164307a && this.f164308b == fsVar.f164308b && this.f164309c == fsVar.f164309c && this.d == fsVar.d && this.e == fsVar.e && this.f == fsVar.f && this.f164310g == fsVar.f164310g && this.f164311h == fsVar.f164311h && this.i == fsVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164307a) * 31, 31, this.f164308b), 31, this.f164309c), 31, this.d), 31, this.e), 31, this.f), 31, this.f164310g), 31, this.f164311h);
    }
}
