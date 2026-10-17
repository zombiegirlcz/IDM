package fwj;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.c {
    public cdd.c u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f138679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f138680x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f138681y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, gim.c cVar) {
        super(cVar);
        this.f138680x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f138679w = obj2;
        this.f138681y |= Integer.MIN_VALUE;
        return this.f138680x.g(null, null, false, this);
    }
}
