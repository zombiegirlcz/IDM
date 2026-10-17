package e0f;

/* JADX INFO: loaded from: classes8.dex */
public final class d1 extends gim.c {
    public cue.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f121593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f121594x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, gim.c cVar) {
        super(cVar);
        this.f121593w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f121594x |= Integer.MIN_VALUE;
        return this.f121593w.a(null, this);
    }
}
