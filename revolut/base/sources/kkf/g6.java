package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class g6 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ h6 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f184702w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(h6 h6Var, gim.c cVar) {
        super(cVar);
        this.v = h6Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f184702w |= Integer.MIN_VALUE;
        return this.v.d3(null, this);
    }
}
