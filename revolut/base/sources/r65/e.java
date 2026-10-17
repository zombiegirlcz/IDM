package r65;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f251637a;

    public e(int i) {
        this.f251637a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f251637a == ((e) obj2).f251637a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f251637a);
    }
}
