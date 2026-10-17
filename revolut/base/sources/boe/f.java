package boe;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17398a;

    public f(boolean z) {
        this.f17398a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f17398a == ((f) obj2).f17398a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17398a);
    }
}
