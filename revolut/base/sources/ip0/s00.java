package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class s00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166268a;

    public s00(boolean z) {
        this.f166268a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s00) && this.f166268a == ((s00) obj2).f166268a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166268a);
    }
}
