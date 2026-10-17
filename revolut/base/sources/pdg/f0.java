package pdg;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ i0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f235185w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.v = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f235185w |= Integer.MIN_VALUE;
        return i0.I2(this.v, null, null, null, this);
    }
}
