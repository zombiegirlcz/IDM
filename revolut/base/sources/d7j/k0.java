package d7j;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f112015a;

    public k0(boolean z) {
        this.f112015a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && this.f112015a == ((k0) obj2).f112015a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112015a);
    }
}
