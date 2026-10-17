package t61;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f268172a;

    public l(boolean z) {
        this.f268172a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f268172a == ((l) obj2).f268172a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268172a);
    }
}
