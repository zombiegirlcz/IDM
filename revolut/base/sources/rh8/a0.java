package rh8;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ c0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f254320w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, gim.c cVar) {
        super(cVar);
        this.v = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f254320w |= Integer.MIN_VALUE;
        return this.v.c(this);
    }
}
