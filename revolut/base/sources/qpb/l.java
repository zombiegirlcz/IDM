package qpb;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f248344w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, gim.c cVar) {
        super(cVar);
        this.v = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f248344w |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
