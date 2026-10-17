package ms0;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f208334a;

    public m() {
        this(true);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f208334a == ((m) obj2).f208334a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f208334a);
    }

    public m(boolean z) {
        this.f208334a = z;
    }
}
