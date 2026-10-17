package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ p1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129266w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(p1 p1Var, gim.c cVar) {
        super(cVar);
        this.v = p1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f129266w |= Integer.MIN_VALUE;
        return this.v.b(false, this);
    }
}
