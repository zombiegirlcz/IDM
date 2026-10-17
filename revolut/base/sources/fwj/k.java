package fwj;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.c {
    public cdd.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f138674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f138675x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, gim.c cVar) {
        super(cVar);
        this.f138674w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f138675x |= Integer.MIN_VALUE;
        return this.f138674w.c(null, this);
    }
}
