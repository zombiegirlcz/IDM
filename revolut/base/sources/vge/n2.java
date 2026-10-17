package vge;

/* JADX INFO: loaded from: classes8.dex */
public final class n2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f288958w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(t2 t2Var, gim.c cVar) {
        super(cVar);
        this.v = t2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f288958w |= Integer.MIN_VALUE;
        return this.v.k(this);
    }
}
