package ssd;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265374a;

    public d(int i) {
        this.f265374a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f265374a == ((d) obj2).f265374a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265374a);
    }
}
