package bt0;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18235a;

    public i(int i) {
        this.f18235a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f18235a == ((i) obj2).f18235a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18235a);
    }
}
