package et6;

/* JADX INFO: loaded from: classes3.dex */
public final class g3 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f129233w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(h3 h3Var, gim.c cVar) {
        super(cVar);
        this.v = h3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f129233w |= Integer.MIN_VALUE;
        return this.v.b(this);
    }
}
