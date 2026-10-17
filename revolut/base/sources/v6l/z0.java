package v6l;

/* JADX INFO: loaded from: classes12.dex */
public final class z0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b1 f286521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f286522x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(b1 b1Var, gim.c cVar) {
        super(cVar);
        this.f286521w = b1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f286522x |= Integer.MIN_VALUE;
        return this.f286521w.u(null, this);
    }
}
