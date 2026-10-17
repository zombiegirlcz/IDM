package wph;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f299337a;

    public r(boolean z) {
        this.f299337a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f299337a == ((r) obj2).f299337a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f299337a);
    }
}
