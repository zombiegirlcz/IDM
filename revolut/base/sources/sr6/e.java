package sr6;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265128a;

    public e(int i) {
        this.f265128a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f265128a == ((e) obj2).f265128a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265128a);
    }
}
