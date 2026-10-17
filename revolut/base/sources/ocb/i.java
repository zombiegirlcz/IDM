package ocb;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f224183a;

    public i(boolean z) {
        this.f224183a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f224183a == ((i) obj2).f224183a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224183a);
    }
}
