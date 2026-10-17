package yjh;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f314482w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, gim.c cVar) {
        super(cVar);
        this.v = k0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f314482w |= Integer.MIN_VALUE;
        return this.v.f3(this);
    }
}
