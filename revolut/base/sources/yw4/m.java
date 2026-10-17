package yw4;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f317321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f317322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f317323c;
    public final long d;
    public final int e;

    public m(long j2, long j3, long j5, long j16, int i) {
        this.f317321a = j2;
        this.f317322b = j3;
        this.f317323c = j5;
        this.d = j16;
        this.e = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f317321a == mVar.f317321a && this.f317322b == mVar.f317322b && this.f317323c == mVar.f317323c && this.d == mVar.d && this.e == mVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + a0.d.c(a0.d.c(a0.d.c(Long.hashCode(this.f317321a) * 31, 31, this.f317322b), 31, this.f317323c), 31, this.d);
    }
}
