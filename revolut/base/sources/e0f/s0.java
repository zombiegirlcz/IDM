package e0f;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t0 f121684w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f121685x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, gim.c cVar) {
        super(cVar);
        this.f121684w = t0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f121685x |= Integer.MIN_VALUE;
        return this.f121684w.h(null, null, this);
    }
}
