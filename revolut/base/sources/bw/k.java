package bw;

/* JADX INFO: loaded from: classes16.dex */
public final class k extends gim.c {
    public yw.j u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f19147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f19148x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, gim.c cVar) {
        super(cVar);
        this.f19147w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f19148x |= Integer.MIN_VALUE;
        return this.f19147w.a(null, this);
    }
}
