package gq0;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f145504a;

    public l(boolean z) {
        this.f145504a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f145504a == ((l) obj2).f145504a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145504a) * 31;
    }
}
