package di3;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f114907w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, gim.c cVar) {
        super(cVar);
        this.v = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f114907w |= Integer.MIN_VALUE;
        return this.v.j(this);
    }
}
