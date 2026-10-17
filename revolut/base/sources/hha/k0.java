package hha;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152319a;

    public k0(int i) {
        this.f152319a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && this.f152319a == ((k0) obj2).f152319a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f152319a);
    }
}
