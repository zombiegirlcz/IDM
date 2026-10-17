package f01;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f130989a;

    public /* synthetic */ b(int i) {
        this.f130989a = i;
    }

    public static final /* synthetic */ b a(int i) {
        return new b(i);
    }

    public final /* synthetic */ int b() {
        return this.f130989a;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof b) {
            return this.f130989a == ((b) obj2).f130989a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f130989a);
    }

    public final String toString() {
        return j6.a.l(this.f130989a, "ResourceId(id=", ")");
    }
}
