package p1j;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lal.a f231949w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f231950x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(lal.a aVar, gim.c cVar) {
        super(cVar);
        this.f231949w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f231950x |= Integer.MIN_VALUE;
        return this.f231949w.t(null, this);
    }
}
