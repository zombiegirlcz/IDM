package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 extends gim.c {
    public ir6.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x2 f129280w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f129281x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(x2 x2Var, gim.c cVar) {
        super(cVar);
        this.f129280w = x2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f129281x |= Integer.MIN_VALUE;
        return this.f129280w.a(null, this);
    }
}
