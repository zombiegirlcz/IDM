package rh8;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ n0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f254354w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, gim.c cVar) {
        super(cVar);
        this.v = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f254354w |= Integer.MIN_VALUE;
        Object objA = this.v.a(null, null, this);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
    }
}
