package kye;

/* JADX INFO: loaded from: classes8.dex */
public final class u0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190845w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f190846x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(k3 k3Var, gim.c cVar) {
        super(cVar);
        this.f190845w = k3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f190846x |= Integer.MIN_VALUE;
        return k3.I2(this.f190845w, null, this);
    }
}
