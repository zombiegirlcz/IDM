package a6f;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1672a;

    public e(int i) {
        this.f1672a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f1672a == ((e) obj2).f1672a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1672a);
    }
}
