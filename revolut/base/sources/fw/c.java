package fw;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f138507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f138508b;

    public c(int i, int i2) {
        this.f138507a = i;
        this.f138508b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f138507a == cVar.f138507a && this.f138508b == cVar.f138508b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f138508b) + (Integer.hashCode(this.f138507a) * 31);
    }
}
