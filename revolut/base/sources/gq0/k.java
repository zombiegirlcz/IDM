package gq0;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f145503a;

    public k(boolean z) {
        this.f145503a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f145503a == ((k) obj2).f145503a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145503a);
    }
}
