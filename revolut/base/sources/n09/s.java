package n09;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f210967a;

    public s(int i) {
        this.f210967a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f210967a == ((s) obj2).f210967a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f210967a);
    }
}
