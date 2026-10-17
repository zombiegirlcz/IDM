package h93;

/* JADX INFO: loaded from: classes21.dex */
public final class r0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f150160a;

    public r0(int i) {
        this.f150160a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r0) && this.f150160a == ((r0) obj2).f150160a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f150160a);
    }
}
