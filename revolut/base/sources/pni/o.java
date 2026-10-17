package pni;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f237819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f237820b;

    public o(long j2, boolean z) {
        this.f237819a = j2;
        this.f237820b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f237819a == oVar.f237819a && this.f237820b == oVar.f237820b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237820b) + (Long.hashCode(this.f237819a) * 31);
    }
}
