package b4g;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m0 f12346w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12347x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, gim.c cVar) {
        super(cVar);
        this.f12346w = m0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f12347x |= Integer.MIN_VALUE;
        return this.f12346w.b(this);
    }
}
