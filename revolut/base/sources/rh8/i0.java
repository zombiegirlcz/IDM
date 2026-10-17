package rh8;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k0 f254343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f254344x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, gim.c cVar) {
        super(cVar);
        this.f254343w = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f254344x |= Integer.MIN_VALUE;
        return k0.a(this.f254343w, null, this);
    }
}
