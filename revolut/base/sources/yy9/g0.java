package yy9;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f317891w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f317892x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, gim.c cVar) {
        super(cVar);
        this.f317891w = h0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f317892x |= Integer.MIN_VALUE;
        return this.f317891w.a(null, this);
    }
}
