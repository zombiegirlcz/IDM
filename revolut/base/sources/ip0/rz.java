package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class rz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166255c;

    public rz(boolean z, boolean z3, boolean z4) {
        this.f166253a = z;
        this.f166254b = z3;
        this.f166255c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rz)) {
            return false;
        }
        rz rzVar = (rz) obj2;
        return this.f166253a == rzVar.f166253a && this.f166254b == rzVar.f166254b && this.f166255c == rzVar.f166255c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166255c) + j6.a.c(Boolean.hashCode(this.f166253a) * 31, 31, this.f166254b);
    }
}
