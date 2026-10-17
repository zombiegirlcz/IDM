package ivb;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.c {
    public Object u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f168815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f168816x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f168817y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f168816x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f168815w = obj2;
        this.f168817y |= Integer.MIN_VALUE;
        return this.f168816x.b(null, null, 0L, this);
    }
}
