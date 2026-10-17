package rrc;

/* JADX INFO: loaded from: classes6.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ f0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f256807w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(f0 f0Var, gim.c cVar) {
        super(cVar);
        this.v = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f256807w |= Integer.MIN_VALUE;
        return f0.I2(this.v, this);
    }
}
