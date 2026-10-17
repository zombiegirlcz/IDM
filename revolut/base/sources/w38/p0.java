package w38;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f294202w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, gim.c cVar) {
        super(cVar);
        this.v = q0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f294202w |= Integer.MIN_VALUE;
        return this.v.i(null, this);
    }
}
