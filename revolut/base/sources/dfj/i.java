package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public int u;
    public pej.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f113992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f113993x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f113994y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f113993x = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f113992w = obj2;
        this.f113994y |= Integer.MIN_VALUE;
        return this.f113993x.b(0, this);
    }
}
