package rc8;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f253227a;

    public f(boolean z) {
        this.f253227a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f253227a == ((f) obj2).f253227a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f253227a);
    }
}
