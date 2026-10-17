package dv;

/* JADX INFO: loaded from: classes16.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f118008a;

    public h(boolean z) {
        this.f118008a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f118008a == ((h) obj2).f118008a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f118008a);
    }
}
