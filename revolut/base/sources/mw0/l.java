package mw0;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f209295a;

    public l() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f209295a == ((l) obj2).f209295a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f209295a);
    }

    public l(boolean z) {
        this.f209295a = z;
    }
}
