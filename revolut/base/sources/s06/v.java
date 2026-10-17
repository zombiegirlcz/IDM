package s06;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f258876a;

    public v(boolean z) {
        this.f258876a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f258876a == ((v) obj2).f258876a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258876a);
    }
}
