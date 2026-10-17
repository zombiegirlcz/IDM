package ts6;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f274018w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, gim.c cVar) {
        super(cVar);
        this.v = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f274018w |= Integer.MIN_VALUE;
        return s0.b(this.v, this);
    }
}
