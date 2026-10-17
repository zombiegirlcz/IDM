package eai;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f124261a;

    public g(boolean z) {
        this.f124261a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f124261a == ((g) obj2).f124261a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124261a);
    }
}
