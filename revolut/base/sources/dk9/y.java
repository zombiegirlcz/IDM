package dk9;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ a0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f115489w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, gim.c cVar) {
        super(cVar);
        this.v = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f115489w |= Integer.MIN_VALUE;
        return a0.z2(this.v, this);
    }
}
