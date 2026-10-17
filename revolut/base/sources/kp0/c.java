package kp0;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f187976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f187977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f187978c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f187979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f187980h;
    public final boolean i;

    public c(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        this.f187976a = z;
        this.f187977b = z3;
        this.f187978c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f187979g = z29;
        this.f187980h = z31;
        this.i = z41;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f187976a == cVar.f187976a && this.f187977b == cVar.f187977b && this.f187978c == cVar.f187978c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.f187979g == cVar.f187979g && this.f187980h == cVar.f187980h && this.i == cVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f187976a) * 31, 31, this.f187977b), 31, this.f187978c), 31, this.d), 31, this.e), 31, this.f), 31, this.f187979g), 31, this.f187980h);
    }
}
