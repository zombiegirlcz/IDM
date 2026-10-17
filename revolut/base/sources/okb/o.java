package okb;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.c {
    public npg.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kpj.f f225963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f225964x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kpj.f fVar, gim.c cVar) {
        super(cVar);
        this.f225963w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f225964x |= Integer.MIN_VALUE;
        return this.f225963w.a(null, this);
    }
}
