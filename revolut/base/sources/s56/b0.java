package s56;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends gim.c {
    public final /* synthetic */ i0 A;
    public int B;
    public String u;
    public wk5.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f259935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public w4l.k f259936x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public xi0.b f259937y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(i0 i0Var, gim.c cVar) {
        super(cVar);
        this.A = i0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.e(null, null, null, null, this);
    }
}
