package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ l0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129203w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(l0 l0Var, gim.c cVar) {
        super(cVar);
        this.v = l0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f129203w |= Integer.MIN_VALUE;
        return this.v.d(this);
    }
}
