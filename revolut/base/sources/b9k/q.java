package b9k;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13845w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, gim.c cVar) {
        super(cVar);
        this.v = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f13845w |= Integer.MIN_VALUE;
        return this.v.c(null, null, this);
    }
}
