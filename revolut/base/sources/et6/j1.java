package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129253w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, gim.c cVar) {
        super(cVar);
        this.v = k1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f129253w |= Integer.MIN_VALUE;
        return this.v.b(this);
    }
}
