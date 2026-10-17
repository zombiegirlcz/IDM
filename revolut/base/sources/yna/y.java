package yna;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f315385a;

    public y(int i) {
        this.f315385a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f315385a == ((y) obj2).f315385a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f315385a);
    }
}
