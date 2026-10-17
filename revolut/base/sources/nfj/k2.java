package nfj;

/* JADX INFO: loaded from: classes11.dex */
public final class k2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f214975w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(s2 s2Var, gim.c cVar) {
        super(cVar);
        this.v = s2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f214975w |= Integer.MIN_VALUE;
        return this.v.j(null, null, this);
    }
}
