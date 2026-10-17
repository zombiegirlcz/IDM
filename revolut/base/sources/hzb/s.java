package hzb;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f157117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f157118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f157119c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f157120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f157121h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f157122j;

    public s(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f157117a = z;
        this.f157118b = z3;
        this.f157119c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f157120g = z29;
        this.f157121h = z31;
        this.i = z41;
        this.f157122j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f157117a == sVar.f157117a && this.f157118b == sVar.f157118b && this.f157119c == sVar.f157119c && this.d == sVar.d && this.e == sVar.e && this.f == sVar.f && this.f157120g == sVar.f157120g && this.f157121h == sVar.f157121h && this.i == sVar.i && this.f157122j == sVar.f157122j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f157122j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f157117a) * 31, 31, this.f157118b), 31, this.f157119c), 31, this.d), 31, this.e), 31, this.f), 31, this.f157120g), 31, this.f157121h), 31, this.i);
    }
}
