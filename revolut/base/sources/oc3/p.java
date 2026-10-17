package oc3;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements jki.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f224075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f224076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f224077c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public p(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f224075a = z;
        this.f224076b = z3;
        this.f224077c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f224075a == pVar.f224075a && this.f224076b == pVar.f224076b && this.f224077c == pVar.f224077c && this.d == pVar.d && this.e == pVar.e && this.f == pVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f224075a) * 31, 31, this.f224076b), 31, this.f224077c), 31, this.d), 31, this.e);
    }
}
