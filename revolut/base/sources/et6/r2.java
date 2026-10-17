package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 extends gim.c {
    public ir6.e u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x2 f129318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129319x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(x2 x2Var, gim.c cVar) {
        super(cVar);
        this.f129318w = x2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129319x |= Integer.MIN_VALUE;
        return this.f129318w.e(null, this);
    }
}
