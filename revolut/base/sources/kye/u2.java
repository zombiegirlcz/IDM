package kye;

/* JADX INFO: loaded from: classes8.dex */
public final class u2 extends gim.c {
    public k3 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190848w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f190849x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(k3 k3Var, gim.c cVar) {
        super(cVar);
        this.f190848w = k3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f190849x |= Integer.MIN_VALUE;
        return k3.N2(this.f190848w, null, this);
    }
}
