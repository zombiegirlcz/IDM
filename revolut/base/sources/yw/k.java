package yw;

/* JADX INFO: loaded from: classes16.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f317244a;

    public k(int i) {
        this.f317244a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f317244a == ((k) obj2).f317244a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f317244a);
    }
}
