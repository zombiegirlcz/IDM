package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class fg implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164259c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f164261h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f164262j;

    public fg(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f164257a = z;
        this.f164258b = z3;
        this.f164259c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164260g = z29;
        this.f164261h = z31;
        this.i = z41;
        this.f164262j = z49;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f164262j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fg)) {
            return false;
        }
        fg fgVar = (fg) obj2;
        return this.f164257a == fgVar.f164257a && this.f164258b == fgVar.f164258b && this.f164259c == fgVar.f164259c && this.d == fgVar.d && this.e == fgVar.e && this.f == fgVar.f && this.f164260g == fgVar.f164260g && this.f164261h == fgVar.f164261h && this.i == fgVar.i && this.f164262j == fgVar.f164262j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164262j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164257a) * 31, 31, this.f164258b), 31, this.f164259c), 31, this.d), 31, this.e), 31, this.f), 31, this.f164260g), 31, this.f164261h), 31, this.i);
    }
}
