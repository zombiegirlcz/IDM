package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class g2 extends gim.c {
    public au6.v1 u;
    public xi0.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f129230w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i2 f129231x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f129232y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(i2 i2Var, gim.c cVar) {
        super(cVar);
        this.f129231x = i2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f129230w = obj2;
        this.f129232y |= Integer.MIN_VALUE;
        return this.f129231x.a(null, this);
    }
}
