package tph;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f273383a;

    public j(boolean z) {
        this.f273383a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f273383a == ((j) obj2).f273383a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273383a);
    }
}
