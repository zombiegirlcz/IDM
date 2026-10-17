package gli;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f144705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f144706b;

    public c(long j2, boolean z) {
        this.f144705a = j2;
        this.f144706b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f144705a == cVar.f144705a && this.f144706b == cVar.f144706b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f144706b) + (Long.hashCode(this.f144705a) * 31);
    }
}
