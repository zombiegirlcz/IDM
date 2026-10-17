package clh;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25003a;

    public k(boolean z) {
        this.f25003a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f25003a == ((k) obj2).f25003a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25003a);
    }
}
