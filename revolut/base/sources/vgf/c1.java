package vgf;

/* JADX INFO: loaded from: classes8.dex */
public final class c1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ e1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f289076w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1 e1Var, gim.c cVar) {
        super(cVar);
        this.v = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f289076w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
