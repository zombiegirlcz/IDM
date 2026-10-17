package ts5;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f273966w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n nVar, gim.c cVar) {
        super(cVar);
        this.v = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f273966w |= Integer.MIN_VALUE;
        return n.i(this.v, this);
    }
}
