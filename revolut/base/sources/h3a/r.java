package h3a;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f149067a;

    public r(boolean z) {
        this.f149067a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f149067a == ((r) obj2).f149067a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149067a);
    }
}
