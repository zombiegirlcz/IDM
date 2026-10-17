package q43;

/* JADX INFO: loaded from: classes21.dex */
public final class i0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ o0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f242020w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(o0 o0Var, gim.c cVar) {
        super(cVar);
        this.v = o0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f242020w |= Integer.MIN_VALUE;
        return o0.z2(this.v, null, this);
    }
}
