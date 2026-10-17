package w38;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends gim.c {
    public akd.s u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f294193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f294194x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(q0 q0Var, gim.c cVar) {
        super(cVar);
        this.f294193w = q0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f294194x |= Integer.MIN_VALUE;
        return this.f294193w.n(null, this);
    }
}
