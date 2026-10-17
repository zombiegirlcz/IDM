package x9f;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f303706a;

    public i(int i) {
        this.f303706a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f303706a == ((i) obj2).f303706a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f303706a);
    }
}
