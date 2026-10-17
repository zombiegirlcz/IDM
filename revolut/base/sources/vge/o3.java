package vge;

/* JADX INFO: loaded from: classes8.dex */
public final class o3 extends gim.c {
    public d0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t3 f288965w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f288966x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(t3 t3Var, gim.c cVar) {
        super(cVar);
        this.f288965w = t3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f288966x |= Integer.MIN_VALUE;
        return this.f288965w.o(null, this);
    }
}
