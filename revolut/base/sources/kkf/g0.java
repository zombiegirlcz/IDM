package kkf;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 extends gim.c {
    public h0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f184693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184694x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, gim.c cVar) {
        super(cVar);
        this.f184693w = h0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184694x |= Integer.MIN_VALUE;
        return this.f184693w.c3(this);
    }
}
