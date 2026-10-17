package rpb;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ a0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f256353w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.v = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f256353w |= Integer.MIN_VALUE;
        return this.v.b(null, this);
    }
}
