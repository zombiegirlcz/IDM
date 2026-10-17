package z25;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f318959w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, gim.c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f318959w |= Integer.MIN_VALUE;
        return g.e3(this.v, this);
    }
}
