package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class du implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163953c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f163954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f163955h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f163956j;
    public final boolean k;

    public du(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54) {
        this.f163951a = z;
        this.f163952b = z3;
        this.f163953c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f163954g = z29;
        this.f163955h = z31;
        this.i = z41;
        this.f163956j = z49;
        this.k = z54;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.k;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof du)) {
            return false;
        }
        du duVar = (du) obj2;
        return this.f163951a == duVar.f163951a && this.f163952b == duVar.f163952b && this.f163953c == duVar.f163953c && this.d == duVar.d && this.e == duVar.e && this.f == duVar.f && this.f163954g == duVar.f163954g && this.f163955h == duVar.f163955h && this.i == duVar.i && this.f163956j == duVar.f163956j && this.k == duVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163951a) * 31, 31, this.f163952b), 31, this.f163953c), 31, this.d), 31, this.e), 31, this.f), 31, this.f163954g), 31, this.f163955h), 31, this.i), 31, this.f163956j);
    }
}
