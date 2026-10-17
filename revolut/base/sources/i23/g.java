package i23;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f157818w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f157819x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n nVar, gim.c cVar) {
        super(cVar);
        this.f157818w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f157819x |= Integer.MIN_VALUE;
        return this.f157818w.Z2(null, this);
    }
}
