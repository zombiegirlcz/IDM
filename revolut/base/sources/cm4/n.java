package cm4;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25131a;

    public n(int i) {
        this.f25131a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f25131a == ((n) obj2).f25131a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25131a);
    }
}
