package gc;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f142279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zb.j f142280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zb.i f142281c;

    public b(long j2, zb.j jVar, zb.i iVar) {
        this.f142279a = j2;
        this.f142280b = jVar;
        this.f142281c = iVar;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f142279a == bVar.f142279a && this.f142280b.equals(bVar.f142280b) && this.f142281c.equals(bVar.f142281c);
    }

    public final int hashCode() {
        long j2 = this.f142279a;
        return ((((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ this.f142280b.hashCode()) * 1000003) ^ this.f142281c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f142279a + ", transportContext=" + this.f142280b + ", event=" + this.f142281c + "}";
    }
}
