package fwj;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.c {
    public cdd.c u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f138676w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f138677x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f138678y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, gim.c cVar) {
        super(cVar);
        this.f138677x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f138676w = obj2;
        this.f138678y |= Integer.MIN_VALUE;
        return this.f138677x.f(null, null, false, this);
    }
}
