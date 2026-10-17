package q63;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f242468a;

    public h(boolean z) {
        this.f242468a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f242468a == ((h) obj2).f242468a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f242468a);
    }
}
