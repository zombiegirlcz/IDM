package kq2;

/* JADX INFO: loaded from: classes21.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f188321a;

    public n(boolean z) {
        this.f188321a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f188321a == ((n) obj2).f188321a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188321a);
    }
}
