package h6i;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ p0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f149692w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, gim.c cVar) {
        super(cVar);
        this.v = p0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f149692w |= Integer.MIN_VALUE;
        return p0.c(this.v, null, this);
    }
}
