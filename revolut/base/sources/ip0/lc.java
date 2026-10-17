package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165186c;

    public lc(boolean z, boolean z3, boolean z4) {
        this.f165184a = z;
        this.f165185b = z3;
        this.f165186c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof lc)) {
            return false;
        }
        lc lcVar = (lc) obj2;
        return this.f165184a == lcVar.f165184a && this.f165185b == lcVar.f165185b && this.f165186c == lcVar.f165186c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165186c) + j6.a.c(Boolean.hashCode(this.f165184a) * 31, 31, this.f165185b);
    }
}
