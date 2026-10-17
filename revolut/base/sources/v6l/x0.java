package v6l;

/* JADX INFO: loaded from: classes12.dex */
public final class x0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ b1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f286515w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(b1 b1Var, gim.c cVar) {
        super(cVar);
        this.v = b1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f286515w |= Integer.MIN_VALUE;
        return this.v.s(null, null, this);
    }
}
