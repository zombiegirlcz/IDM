package ccb;

/* JADX INFO: loaded from: classes6.dex */
public final class l0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ m0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23003w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, gim.c cVar) {
        super(cVar);
        this.v = m0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f23003w |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
