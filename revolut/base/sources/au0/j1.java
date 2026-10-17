package au0;

/* JADX INFO: loaded from: classes19.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9240a;

    public j1(boolean z) {
        this.f9240a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j1) && this.f9240a == ((j1) obj2).f9240a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9240a);
    }
}
