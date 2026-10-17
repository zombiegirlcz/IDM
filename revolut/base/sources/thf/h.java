package thf;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f271372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f271373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f271374c;

    public h() {
        this(false, false, 7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f271372a == hVar.f271372a && this.f271373b == hVar.f271373b && this.f271374c == hVar.f271374c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271374c) + j6.a.c(Boolean.hashCode(this.f271372a) * 31, 31, this.f271373b);
    }

    public h(boolean z, boolean z3, int i) {
        boolean z4 = (i & 1) == 0;
        z = (i & 2) != 0 ? true : z;
        z3 = (i & 4) != 0 ? false : z3;
        this.f271372a = z4;
        this.f271373b = z;
        this.f271374c = z3;
    }
}
