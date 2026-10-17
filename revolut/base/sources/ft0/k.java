package ft0;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f137762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f137763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f137764c;

    public k(boolean z, boolean z3, boolean z4) {
        this.f137762a = z;
        this.f137763b = z3;
        this.f137764c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f137762a == kVar.f137762a && this.f137763b == kVar.f137763b && this.f137764c == kVar.f137764c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137764c) + j6.a.c(Boolean.hashCode(this.f137762a) * 31, 31, this.f137763b);
    }
}
