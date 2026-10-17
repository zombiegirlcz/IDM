package ui9;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f280344w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, gim.c cVar) {
        super(cVar);
        this.v = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f280344w |= Integer.MIN_VALUE;
        return this.v.c(this);
    }
}
