package vge;

/* JADX INFO: loaded from: classes8.dex */
public final class i3 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ t3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f288924w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(t3 t3Var, gim.c cVar) {
        super(cVar);
        this.v = t3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f288924w |= Integer.MIN_VALUE;
        return this.v.k(null, this);
    }
}
