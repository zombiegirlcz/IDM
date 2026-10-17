package mod;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f207607a;

    public c(int i) {
        this.f207607a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f207607a == ((c) obj2).f207607a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f207607a);
    }
}
