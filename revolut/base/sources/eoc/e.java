package eoc;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f127899a;

    public e() {
        this(true);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f127899a == ((e) obj2).f127899a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127899a);
    }

    public e(boolean z) {
        this.f127899a = z;
    }
}
