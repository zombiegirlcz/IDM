package dwi;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f120444w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, gim.c cVar) {
        super(cVar);
        this.v = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f120444w |= Integer.MIN_VALUE;
        return r.a(this.v, null, null, 0L, 0L, this);
    }
}
