package oul;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f229904a;

    public j(boolean z) {
        this.f229904a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f229904a == ((j) obj2).f229904a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f229904a);
    }
}
