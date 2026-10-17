package b02;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11546a;

    public f(boolean z) {
        this.f11546a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f11546a == ((f) obj2).f11546a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11546a);
    }
}
