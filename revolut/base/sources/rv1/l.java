package rv1;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.c {
    public r u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f257661w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f257662x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, gim.c cVar) {
        super(cVar);
        this.f257661w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f257662x |= Integer.MIN_VALUE;
        return this.f257661w.j(null, this);
    }
}
