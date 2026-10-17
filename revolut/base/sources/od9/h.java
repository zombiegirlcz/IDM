package od9;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f224336a;

    public h() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f224336a == ((h) obj2).f224336a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224336a);
    }

    public h(boolean z) {
        this.f224336a = z;
    }
}
