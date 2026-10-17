package lr6;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f199414a;

    public n(int i) {
        this.f199414a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f199414a == ((n) obj2).f199414a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f199414a);
    }
}
