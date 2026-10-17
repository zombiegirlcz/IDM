package au6;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ k1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9534w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(k1 k1Var, gim.c cVar) {
        super(cVar);
        this.v = k1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f9534w |= Integer.MIN_VALUE;
        return this.v.a(this);
    }
}
