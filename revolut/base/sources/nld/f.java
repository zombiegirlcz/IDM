package nld;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f217117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f217118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f217119c;

    public f(int i, int i2, int i3) {
        this.f217117a = i;
        this.f217118b = i2;
        this.f217119c = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f217117a == fVar.f217117a && this.f217118b == fVar.f217118b && this.f217119c == fVar.f217119c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f217119c) + j6.a.b(this.f217118b, Integer.hashCode(this.f217117a) * 31, 31);
    }
}
