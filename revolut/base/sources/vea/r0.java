package vea;

/* JADX INFO: loaded from: classes5.dex */
public final class r0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ s0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f288234w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, gim.c cVar) {
        super(cVar);
        this.v = s0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f288234w |= Integer.MIN_VALUE;
        return this.v.l(null, null, this);
    }
}
