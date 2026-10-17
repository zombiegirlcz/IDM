package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class rp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166221c;
    public final boolean d;
    public final boolean e;

    public rp(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f166219a = z;
        this.f166220b = z3;
        this.f166221c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rp)) {
            return false;
        }
        rp rpVar = (rp) obj2;
        return this.f166219a == rpVar.f166219a && this.f166220b == rpVar.f166220b && this.f166221c == rpVar.f166221c && this.d == rpVar.d && this.e == rpVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166219a) * 31, 31, this.f166220b), 31, this.f166221c), 31, this.d);
    }
}
