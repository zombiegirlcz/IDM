package ll7;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ e0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f196602w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, gim.c cVar) {
        super(cVar);
        this.v = e0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f196602w |= Integer.MIN_VALUE;
        return e0.e(this.v, null, this);
    }
}
