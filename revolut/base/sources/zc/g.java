package zc;

/* JADX INFO: loaded from: classes16.dex */
public final class g extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f320983c;

    public g(i iVar, int i) {
        super(iVar.size(), i);
        this.f320983c = iVar;
    }

    @Override // zc.e
    public final Object a(int i) {
        return this.f320983c.get(i);
    }
}
