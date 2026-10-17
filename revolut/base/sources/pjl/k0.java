package pjl;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ z0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f236821w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(z0 z0Var, gim.c cVar) {
        super(cVar);
        this.v = z0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f236821w |= Integer.MIN_VALUE;
        return this.v.e(null, this);
    }
}
