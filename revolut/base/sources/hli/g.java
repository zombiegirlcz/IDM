package hli;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f153469a;

    public /* synthetic */ g(boolean z) {
        this.f153469a = z;
    }

    public static final /* synthetic */ g a(boolean z) {
        return new g(z);
    }

    public final /* synthetic */ boolean b() {
        return this.f153469a;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof g) {
            return this.f153469a == ((g) obj2).f153469a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153469a);
    }

    public final String toString() {
        return "ActiveTransition(indefinite=" + this.f153469a + ")";
    }
}
