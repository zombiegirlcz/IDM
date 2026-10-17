package l13;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f191431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f191432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f191433c;

    public g() {
        this(false, false, false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f191431a == gVar.f191431a && this.f191432b == gVar.f191432b && this.f191433c == gVar.f191433c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191433c) + j6.a.c(Boolean.hashCode(this.f191431a) * 31, 31, this.f191432b);
    }

    public g(boolean z, boolean z3, boolean z4) {
        this.f191431a = z;
        this.f191432b = z3;
        this.f191433c = z4;
    }
}
