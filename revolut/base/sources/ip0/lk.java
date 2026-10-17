package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165216c;
    public final boolean d;

    public lk(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f165214a = z;
        this.f165215b = z3;
        this.f165216c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof lk)) {
            return false;
        }
        lk lkVar = (lk) obj2;
        return this.f165214a == lkVar.f165214a && this.f165215b == lkVar.f165215b && this.f165216c == lkVar.f165216c && this.d == lkVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f165214a) * 31, 31, this.f165215b), 31, this.f165216c);
    }
}
