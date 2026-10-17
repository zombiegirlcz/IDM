package cbh;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22807a;

    public c0() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && this.f22807a == ((c0) obj2).f22807a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22807a);
    }

    public c0(boolean z) {
        this.f22807a = z;
    }
}
