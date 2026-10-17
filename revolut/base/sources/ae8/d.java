package ae8;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a5h.g f3505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3506x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a5h.g gVar, gim.c cVar) {
        super(cVar);
        this.f3505w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f3506x |= Integer.MIN_VALUE;
        return this.f3505w.c(null, this);
    }
}
