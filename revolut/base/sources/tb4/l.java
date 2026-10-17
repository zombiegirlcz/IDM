package tb4;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f269446a;

    public l(boolean z) {
        this.f269446a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f269446a == ((l) obj2).f269446a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f269446a);
    }
}
