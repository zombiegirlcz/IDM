package ffk;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.c {
    public hha.i u;
    public t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f134844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t f134845x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f134846y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, gim.c cVar) {
        super(cVar);
        this.f134845x = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f134844w = obj2;
        this.f134846y |= Integer.MIN_VALUE;
        return this.f134845x.i(null, null, this);
    }
}
