package buf;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ a1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18806w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(a1 a1Var, gim.c cVar) {
        super(cVar);
        this.v = a1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f18806w |= Integer.MIN_VALUE;
        return this.v.A2(null, this);
    }
}
