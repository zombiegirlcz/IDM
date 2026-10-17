package buf;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f18815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f18816x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18817y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, gim.c cVar) {
        super(cVar);
        this.f18816x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f18815w = obj2;
        this.f18817y |= Integer.MIN_VALUE;
        return this.f18816x.a(null, null, this);
    }
}
