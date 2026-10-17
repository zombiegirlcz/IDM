package xkf;

/* JADX INFO: loaded from: classes8.dex */
public final class o1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f306744w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(q1 q1Var, gim.c cVar) {
        super(cVar);
        this.v = q1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f306744w |= Integer.MIN_VALUE;
        return this.v.e3(null, this);
    }
}
