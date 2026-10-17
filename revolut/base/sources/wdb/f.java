package wdb;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f296516w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n nVar, gim.c cVar) {
        super(cVar);
        this.v = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f296516w |= Integer.MIN_VALUE;
        return this.v.e(null, null, null, 0, this);
    }
}
