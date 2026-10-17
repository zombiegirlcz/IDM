package q63;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f242454a;

    public b(boolean z) {
        this.f242454a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f242454a == ((b) obj2).f242454a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242454a);
    }
}
