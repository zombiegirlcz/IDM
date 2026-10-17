package flf;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f135974w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, gim.c cVar) {
        super(cVar);
        this.v = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f135974w |= Integer.MIN_VALUE;
        return this.v.c(null, null, this);
    }
}
