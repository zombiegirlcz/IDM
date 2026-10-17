package ht3;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155317a;

    public y(int i) {
        this.f155317a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f155317a == ((y) obj2).f155317a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f155317a);
    }
}
