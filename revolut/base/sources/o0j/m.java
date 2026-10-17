package o0j;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f221243a;

    public m(boolean z) {
        this.f221243a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f221243a == ((m) obj2).f221243a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221243a);
    }
}
