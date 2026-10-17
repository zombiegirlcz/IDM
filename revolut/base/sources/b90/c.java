package b90;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13521a;

    public c(boolean z) {
        this.f13521a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f13521a == ((c) obj2).f13521a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13521a);
    }
}
