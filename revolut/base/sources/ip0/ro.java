package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166218a;

    public ro(boolean z) {
        this.f166218a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ro) && this.f166218a == ((ro) obj2).f166218a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166218a);
    }
}
