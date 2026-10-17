package bq5;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17700c;
    public final boolean d;

    public d() {
        this(false, false, false, false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f17698a == dVar.f17698a && this.f17699b == dVar.f17699b && this.f17700c == dVar.f17700c && this.d == dVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f17698a) * 31, 31, this.f17699b), 31, this.f17700c);
    }

    public d(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f17698a = z;
        this.f17699b = z3;
        this.f17700c = z4;
        this.d = z6;
    }
}
