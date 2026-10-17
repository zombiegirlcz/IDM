package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 extends gim.c {
    public ir6.d u;
    public do3.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f129299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x2 f129300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f129301y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(x2 x2Var, gim.c cVar) {
        super(cVar);
        this.f129300x = x2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f129299w = obj2;
        this.f129301y |= Integer.MIN_VALUE;
        return this.f129300x.c(null, this);
    }
}
