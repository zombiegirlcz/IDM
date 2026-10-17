package ybh;

/* JADX INFO: loaded from: classes9.dex */
public final class l0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ tb4.t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f312318w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(tb4.t tVar, gim.c cVar) {
        super(cVar);
        this.v = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f312318w |= Integer.MIN_VALUE;
        return this.v.B(this);
    }
}
