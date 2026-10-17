package dfj;

/* JADX INFO: loaded from: classes11.dex */
public final class o3 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ q3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f114060w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(q3 q3Var, gim.c cVar) {
        super(cVar);
        this.v = q3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f114060w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
