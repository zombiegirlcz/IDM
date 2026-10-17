package t9j;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f269041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f269042b;

    public b(long j2, float f) {
        this.f269041a = j2;
        this.f269042b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f269041a == bVar.f269041a && Float.compare(this.f269042b, bVar.f269042b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f269042b) + (Long.hashCode(this.f269041a) * 31);
    }
}
