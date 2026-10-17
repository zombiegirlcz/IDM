package a00;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95a;

    public c(int i) {
        this.f95a = i;
    }

    @Override // xv.q
    public final boolean d() {
        return true;
    }

    @Override // a00.d
    public final Integer e() {
        return Integer.valueOf(this.f95a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f95a == ((c) obj2).f95a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95a);
    }
}
