package rrc;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ f0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f256760w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, gim.c cVar) {
        super(cVar);
        this.v = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f256760w |= Integer.MIN_VALUE;
        return f0.J2(this.v, this);
    }
}
