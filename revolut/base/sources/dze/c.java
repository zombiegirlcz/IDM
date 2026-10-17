package dze;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f121324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f121325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f121326c;
    public final boolean d;

    public c() {
        this(false, false, false, false);
    }

    public static c a(c cVar, boolean z, int i) {
        boolean z3 = (i & 1) != 0 ? cVar.f121324a : true;
        if ((i & 2) != 0) {
            z = cVar.f121325b;
        }
        boolean z4 = (i & 4) != 0 ? cVar.f121326c : true;
        boolean z6 = (i & 8) != 0 ? cVar.d : true;
        cVar.getClass();
        return new c(z3, z, z4, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f121324a == cVar.f121324a && this.f121325b == cVar.f121325b && this.f121326c == cVar.f121326c && this.d == cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f121324a) * 31, 31, this.f121325b), 31, this.f121326c);
    }

    public c(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f121324a = z;
        this.f121325b = z3;
        this.f121326c = z4;
        this.d = z6;
    }
}
