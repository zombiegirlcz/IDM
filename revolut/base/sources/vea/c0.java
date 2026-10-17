package vea;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ d0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f288182w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, gim.c cVar) {
        super(cVar);
        this.v = d0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f288182w |= Integer.MIN_VALUE;
        return this.v.l(null, null, this);
    }
}
