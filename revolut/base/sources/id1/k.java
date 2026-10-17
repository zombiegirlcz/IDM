package id1;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f160396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f160397x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, gim.c cVar) {
        super(cVar);
        this.f160396w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f160397x |= Integer.MIN_VALUE;
        return this.f160396w.b(null, this);
    }
}
