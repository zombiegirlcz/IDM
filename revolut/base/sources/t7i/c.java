package t7i;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ nd.m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f268718w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(nd.m mVar, gim.c cVar) {
        super(cVar);
        this.v = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f268718w |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
