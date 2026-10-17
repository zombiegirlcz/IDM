package kye;

/* JADX INFO: loaded from: classes8.dex */
public final class x0 extends gim.c {
    public vye.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190870w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f190871x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(k3 k3Var, gim.c cVar) {
        super(cVar);
        this.f190870w = k3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f190871x |= Integer.MIN_VALUE;
        return k3.J2(this.f190870w, null, null, null, this);
    }
}
