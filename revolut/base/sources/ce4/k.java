package ce4;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.c {
    public cv3.u u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f23367w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f23368x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, gim.c cVar) {
        super(cVar);
        this.f23367w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f23368x |= Integer.MIN_VALUE;
        return this.f23367w.n(null, this);
    }
}
