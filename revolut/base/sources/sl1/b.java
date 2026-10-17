package sl1;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.c {
    public j60.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f264077w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f264078x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f264077w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f264078x |= Integer.MIN_VALUE;
        return this.f264077w.e(null, null, this);
    }
}
