package eub;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f129540a;

    public c(boolean z) {
        this.f129540a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f129540a == ((c) obj2).f129540a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129540a);
    }
}
