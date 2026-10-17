package m72;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.c {
    public z92.j u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f203289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f203290x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, gim.c cVar) {
        super(cVar);
        this.f203289w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f203290x |= Integer.MIN_VALUE;
        return this.f203289w.d(null, this);
    }
}
