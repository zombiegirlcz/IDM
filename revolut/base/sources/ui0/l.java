package ui0;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f280289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f280290b;

    public l(long j2, long j3) {
        this.f280289a = j2;
        this.f280290b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f280289a == lVar.f280289a && this.f280290b == lVar.f280290b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f280290b) + (Long.hashCode(this.f280289a) * 31);
    }
}
