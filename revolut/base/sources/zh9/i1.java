package zh9;

/* JADX INFO: loaded from: classes5.dex */
public final class i1 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f322288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f322289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f322290c;

    public i1(long j2, int i, int i2) {
        this.f322288a = j2;
        this.f322289b = i;
        this.f322290c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return this.f322288a == i1Var.f322288a && this.f322289b == i1Var.f322289b && this.f322290c == i1Var.f322290c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f322290c) + j6.a.b(this.f322289b, Long.hashCode(this.f322288a) * 31, 31);
    }
}
