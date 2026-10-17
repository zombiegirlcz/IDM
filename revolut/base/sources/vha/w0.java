package vha;

/* JADX INFO: loaded from: classes5.dex */
public final class w0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ y0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f289451w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(y0 y0Var, gim.c cVar) {
        super(cVar);
        this.v = y0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f289451w |= Integer.MIN_VALUE;
        return this.v.c(this);
    }
}
