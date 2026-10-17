package t87;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f268843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f268844b;

    public b(long j2, float f) {
        this.f268843a = j2;
        this.f268844b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f268843a == bVar.f268843a && Float.compare(this.f268844b, bVar.f268844b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f268844b) + (Long.hashCode(this.f268843a) * 31);
    }
}
