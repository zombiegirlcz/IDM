package ncj;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f214228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f214229b;

    public f(long j2, float f) {
        this.f214228a = j2;
        this.f214229b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f214228a == fVar.f214228a && Float.compare(this.f214229b, fVar.f214229b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f214229b) + (Long.hashCode(this.f214228a) * 31);
    }
}
