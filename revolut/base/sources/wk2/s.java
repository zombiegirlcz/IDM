package wk2;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f298221a;

    public s(boolean z) {
        this.f298221a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f298221a == ((s) obj2).f298221a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f298221a);
    }
}
