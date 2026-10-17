package mjf;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f206005w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, gim.c cVar) {
        super(cVar);
        this.v = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f206005w |= Integer.MIN_VALUE;
        return k0.d(this.v, false, false, this);
    }
}
