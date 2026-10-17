package sz;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f266713a;

    public c(boolean z) {
        this.f266713a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f266713a == ((c) obj2).f266713a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266713a);
    }
}
