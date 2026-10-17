package nfj;

/* JADX INFO: loaded from: classes11.dex */
public final class y1 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z1 f215075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f215076x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, gim.c cVar) {
        super(cVar);
        this.f215075w = z1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f215076x |= Integer.MIN_VALUE;
        return z1.a(this.f215075w, null, this);
    }
}
