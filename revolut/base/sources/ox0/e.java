package ox0;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f230478a;

    public e(boolean z) {
        this.f230478a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f230478a == ((e) obj2).f230478a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f230478a);
    }
}
