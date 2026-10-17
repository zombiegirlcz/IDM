package ce4;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.c {
    public cv3.a u;
    public cv3.u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f23361w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f23362x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23363y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, gim.c cVar) {
        super(cVar);
        this.f23362x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f23361w = obj2;
        this.f23363y |= Integer.MIN_VALUE;
        return this.f23362x.m(null, null, this);
    }
}
