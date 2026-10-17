package l85;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public n u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f192795w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f192796x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, gim.c cVar) {
        super(cVar);
        this.f192795w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f192796x |= Integer.MIN_VALUE;
        return n.I2(this.f192795w, this);
    }
}
