package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163899c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public dh(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f163897a = z;
        this.f163898b = z3;
        this.f163899c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dh)) {
            return false;
        }
        dh dhVar = (dh) obj2;
        return this.f163897a == dhVar.f163897a && this.f163898b == dhVar.f163898b && this.f163899c == dhVar.f163899c && this.d == dhVar.d && this.e == dhVar.e && this.f == dhVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163897a) * 31, 31, this.f163898b), 31, this.f163899c), 31, this.d), 31, this.e);
    }
}
