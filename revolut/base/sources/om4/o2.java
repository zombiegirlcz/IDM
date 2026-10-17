package om4;

/* JADX INFO: loaded from: classes22.dex */
public final class o2 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x2 f226654w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226655x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(x2 x2Var, gim.c cVar) {
        super(cVar);
        this.f226654w = x2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226655x |= Integer.MIN_VALUE;
        return this.f226654w.F(null, this);
    }
}
