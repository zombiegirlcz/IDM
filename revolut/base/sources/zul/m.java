package zul;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f325538a;

    public m(int i) {
        this.f325538a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f325538a == ((m) obj2).f325538a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f325538a);
    }
}
