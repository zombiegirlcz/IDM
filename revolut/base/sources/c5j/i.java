package c5j;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21567a;

    public i(boolean z) {
        this.f21567a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f21567a == ((i) obj2).f21567a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21567a);
    }
}
