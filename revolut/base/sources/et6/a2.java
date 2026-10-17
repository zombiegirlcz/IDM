package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ d2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129190w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(d2 d2Var, gim.c cVar) {
        super(cVar);
        this.v = d2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f129190w |= Integer.MIN_VALUE;
        return this.v.b(null, this);
    }
}
