package uwa;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.c {
    public pwa.n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f283586w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f283587x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, gim.c cVar) {
        super(cVar);
        this.f283586w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f283587x |= Integer.MIN_VALUE;
        return this.f283586w.e(null, this);
    }
}
