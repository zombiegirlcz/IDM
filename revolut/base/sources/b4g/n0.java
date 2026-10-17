package b4g;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ o0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12355w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, gim.c cVar) {
        super(cVar);
        this.v = o0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f12355w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
