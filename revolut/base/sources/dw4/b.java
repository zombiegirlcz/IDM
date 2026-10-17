package dw4;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f120333a;

    public b(boolean z) {
        this.f120333a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f120333a == ((b) obj2).f120333a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f120333a);
    }
}
