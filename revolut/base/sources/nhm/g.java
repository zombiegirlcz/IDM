package nhm;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f215591a;

    public g(h hVar) {
        this.f215591a = hVar;
    }

    @Override // nhm.a
    public final Object a() {
        i iVar = this.f215591a;
        if (iVar instanceof k) {
            this.f215591a = null;
            return iVar;
        }
        this.f215591a = ((h) iVar).e;
        return iVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f215591a != null;
    }
}
