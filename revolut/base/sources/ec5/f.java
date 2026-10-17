package ec5;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f124440a;

    public f(boolean z) {
        this.f124440a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f124440a == ((f) obj2).f124440a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124440a);
    }
}
