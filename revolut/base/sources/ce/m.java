package ce;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f23306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23307b;

    public m(t tVar, boolean z) {
        this.f23306a = tVar;
        this.f23307b = z;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof m) {
            m mVar = (m) obj2;
            if (mVar.f23306a.equals(this.f23306a) && mVar.f23307b == this.f23307b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23306a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f23307b).hashCode();
    }
}
