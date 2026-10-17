package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class v3 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ y3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f226725w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(y3 y3Var, gim.c cVar) {
        super(cVar);
        this.v = y3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f226725w |= Integer.MIN_VALUE;
        return this.v.d(false, this);
    }
}
