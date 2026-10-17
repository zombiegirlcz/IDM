package dj9;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f115167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f115168b;

    public d0(long j2, long j3) {
        this.f115167a = j2;
        this.f115168b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f115167a == d0Var.f115167a && this.f115168b == d0Var.f115168b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f115168b) + (Long.hashCode(this.f115167a) * 31);
    }
}
