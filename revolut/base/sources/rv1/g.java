package rv1;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.c {
    public r u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f257653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f257654x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r rVar, gim.c cVar) {
        super(cVar);
        this.f257653w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f257654x |= Integer.MIN_VALUE;
        return this.f257653w.f(null, this);
    }
}
