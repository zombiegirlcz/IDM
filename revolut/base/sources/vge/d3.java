package vge;

/* JADX INFO: loaded from: classes8.dex */
public final class d3 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f288885w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(t3 t3Var, gim.c cVar) {
        super(cVar);
        this.v = t3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f288885w |= Integer.MIN_VALUE;
        return this.v.d(this);
    }
}
