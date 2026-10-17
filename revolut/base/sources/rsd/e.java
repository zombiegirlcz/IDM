package rsd;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements amd.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f257051a;

    public e(int i) {
        this.f257051a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f257051a == ((e) obj2).f257051a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f257051a);
    }
}
