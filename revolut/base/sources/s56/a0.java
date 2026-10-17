package s56;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends gim.c {
    public wk5.a u;
    public u66.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f259932w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f259933x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i0 f259934y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.f259934y = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f259933x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f259934y.d(null, this);
    }
}
