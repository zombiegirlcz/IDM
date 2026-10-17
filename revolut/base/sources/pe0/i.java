package pe0;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends gim.c {
    public e u;
    public hlm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f235289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f235290x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f235291y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q qVar, gim.c cVar) {
        super(cVar);
        this.f235290x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f235289w = obj2;
        this.f235291y |= Integer.MIN_VALUE;
        return q.a(this.f235290x, null, this);
    }
}
