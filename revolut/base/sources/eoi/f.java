package eoi;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f127935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f127936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f127937c;
    public final long d;
    public final long e;

    public f(int i, int i2, long j2, long j3, int i3) {
        this.f127935a = i;
        this.f127936b = i2;
        this.f127937c = i3;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f127935a == fVar.f127935a && this.f127936b == fVar.f127936b && this.f127937c == fVar.f127937c && this.d == fVar.d && this.e == fVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + a0.d.c(j6.a.b(this.f127937c, j6.a.b(this.f127936b, Integer.hashCode(this.f127935a) * 31, 31), 31), 31, this.d);
    }
}
