package rh8;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k0 f254337w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f254338x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k0 k0Var, gim.c cVar) {
        super(cVar);
        this.f254337w = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f254338x |= Integer.MIN_VALUE;
        return this.f254337w.b(null, this);
    }
}
