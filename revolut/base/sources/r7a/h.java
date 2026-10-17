package r7a;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f252057a;

    public h(boolean z) {
        this.f252057a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f252057a == ((h) obj2).f252057a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f252057a);
    }
}
