package svi;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265873a;

    public a0(int i) {
        this.f265873a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && this.f265873a == ((a0) obj2).f265873a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265873a);
    }
}
