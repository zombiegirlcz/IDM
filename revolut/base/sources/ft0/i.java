package ft0;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f137759a;

    public i(boolean z) {
        this.f137759a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f137759a == ((i) obj2).f137759a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f137759a);
    }
}
