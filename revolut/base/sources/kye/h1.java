package kye;

/* JADX INFO: loaded from: classes8.dex */
public final class h1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f190737w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(k3 k3Var, gim.c cVar) {
        super(cVar);
        this.v = k3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f190737w |= Integer.MIN_VALUE;
        return this.v.Q2(null, this);
    }
}
