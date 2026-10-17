package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class qx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166064c;
    public final boolean d;

    public qx(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f166062a = z;
        this.f166063b = z3;
        this.f166064c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qx)) {
            return false;
        }
        qx qxVar = (qx) obj2;
        return this.f166062a == qxVar.f166062a && this.f166063b == qxVar.f166063b && this.f166064c == qxVar.f166064c && this.d == qxVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f166062a) * 31, 31, this.f166063b), 31, this.f166064c);
    }
}
