package odc;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f224452a;

    public l(boolean z) {
        this.f224452a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f224452a == ((l) obj2).f224452a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224452a);
    }
}
