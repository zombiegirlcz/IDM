package o97;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f223092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f223093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f223094c;

    public c0(long j2, long j3, long j5) {
        this.f223092a = j2;
        this.f223093b = j3;
        this.f223094c = j5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f223092a == c0Var.f223092a && this.f223093b == c0Var.f223093b && this.f223094c == c0Var.f223094c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f223094c) + a0.d.c(Long.hashCode(this.f223092a) * 31, 31, this.f223093b);
    }
}
