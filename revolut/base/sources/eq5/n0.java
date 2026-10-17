package eq5;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ x0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f128294w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(x0 x0Var, gim.c cVar) {
        super(cVar);
        this.v = x0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f128294w |= Integer.MIN_VALUE;
        return this.v.g(null, this);
    }
}
