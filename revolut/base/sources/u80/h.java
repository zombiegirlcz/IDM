package u80;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f278040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f278041b;

    public h(long j2, int i) {
        this.f278040a = j2;
        this.f278041b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f278040a == hVar.f278040a && this.f278041b == hVar.f278041b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f278041b) + (Long.hashCode(this.f278040a) * 31);
    }
}
