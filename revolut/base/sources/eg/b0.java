package eg;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f125404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f125405x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, gim.c cVar) {
        super(cVar);
        this.f125404w = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f125405x |= Integer.MIN_VALUE;
        return this.f125404w.a(null, this);
    }
}
