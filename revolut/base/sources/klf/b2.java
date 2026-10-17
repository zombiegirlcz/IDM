package klf;

/* JADX INFO: loaded from: classes8.dex */
public final class b2 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ c2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f185449w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, gim.c cVar) {
        super(cVar);
        this.v = c2Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f185449w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
