package qtc;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f249089a;

    public q(boolean z) {
        this.f249089a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f249089a == ((q) obj2).f249089a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249089a);
    }
}
