package pqg;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements jki.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f238762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f238763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f238764c;
    public final boolean d;
    public final boolean e;

    public s(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f238762a = z;
        this.f238763b = z3;
        this.f238764c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f238762a == sVar.f238762a && this.f238763b == sVar.f238763b && this.f238764c == sVar.f238764c && this.d == sVar.d && this.e == sVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f238762a) * 31, 31, this.f238763b), 31, this.f238764c), 31, this.d);
    }
}
