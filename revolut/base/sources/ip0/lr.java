package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class lr implements mr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f165251a;

    public lr(int i) {
        this.f165251a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof lr) && this.f165251a == ((lr) obj2).f165251a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f165251a);
    }
}
