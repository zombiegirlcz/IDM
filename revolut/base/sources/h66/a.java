package h66;

import cli.j;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f149593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f149594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f149595c;
    public final boolean d;

    public a() {
        this(false, false, false, false);
    }

    public static a a(a aVar, boolean z, boolean z3, boolean z4, boolean z6, int i) {
        if ((i & 1) != 0) {
            z = aVar.f149593a;
        }
        if ((i & 2) != 0) {
            z3 = aVar.f149594b;
        }
        if ((i & 4) != 0) {
            z4 = aVar.f149595c;
        }
        if ((i & 8) != 0) {
            z6 = aVar.d;
        }
        aVar.getClass();
        return new a(z, z3, z4, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f149593a == aVar.f149593a && this.f149594b == aVar.f149594b && this.f149595c == aVar.f149595c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f149593a) * 31, 31, this.f149594b), 31, this.f149595c);
    }

    public a(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f149593a = z;
        this.f149594b = z3;
        this.f149595c = z4;
        this.d = z6;
    }
}
