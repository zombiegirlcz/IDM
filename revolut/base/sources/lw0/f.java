package lw0;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f200395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f200396b;

    public f(long j2, long j3) {
        this.f200395a = j2;
        this.f200396b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f200395a == fVar.f200395a && this.f200396b == fVar.f200396b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f200396b) + (Long.hashCode(this.f200395a) * 31);
    }
}
