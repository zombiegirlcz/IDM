package wid;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f297880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f297881b;

    public a(long j2, boolean z) {
        this.f297880a = j2;
        this.f297881b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f297880a == aVar.f297880a && this.f297881b == aVar.f297881b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f297881b) + (Long.hashCode(this.f297880a) * 31);
    }
}
