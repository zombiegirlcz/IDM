package vge;

/* JADX INFO: loaded from: classes8.dex */
public final class g3 extends gim.c {
    public hlm.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t3 f288905w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f288906x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(t3 t3Var, gim.c cVar) {
        super(cVar);
        this.f288905w = t3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f288906x |= Integer.MIN_VALUE;
        return this.f288905w.i(this);
    }
}
