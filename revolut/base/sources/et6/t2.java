package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class t2 extends gim.c {
    public ir6.f u;
    public zr6.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f129332w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x2 f129333x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f129334y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(x2 x2Var, gim.c cVar) {
        super(cVar);
        this.f129333x = x2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f129332w = obj2;
        this.f129334y |= Integer.MIN_VALUE;
        return this.f129333x.i(null, this);
    }
}
