package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ak implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163462c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f163463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f163464h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f163465j;

    public ak(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f163460a = z;
        this.f163461b = z3;
        this.f163462c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f163463g = z29;
        this.f163464h = z31;
        this.i = z41;
        this.f163465j = z49;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f163465j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ak)) {
            return false;
        }
        ak akVar = (ak) obj2;
        return this.f163460a == akVar.f163460a && this.f163461b == akVar.f163461b && this.f163462c == akVar.f163462c && this.d == akVar.d && this.e == akVar.e && this.f == akVar.f && this.f163463g == akVar.f163463g && this.f163464h == akVar.f163464h && this.i == akVar.i && this.f163465j == akVar.f163465j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163465j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163460a) * 31, 31, this.f163461b), 31, this.f163462c), 31, this.d), 31, this.e), 31, this.f), 31, this.f163463g), 31, this.f163464h), 31, this.i);
    }
}
