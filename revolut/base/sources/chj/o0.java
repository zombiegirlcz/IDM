package chj;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ u0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f24282w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(u0 u0Var, gim.c cVar) {
        super(cVar);
        this.v = u0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f24282w |= Integer.MIN_VALUE;
        return u0.m3(this.v, null, null, null, null, null, null, null, null, null, null, this);
    }
}
