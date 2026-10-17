package bb2;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends gim.c {
    public r10.w u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r10.w f14131w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14132x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r10.w wVar, gim.c cVar) {
        super(cVar);
        this.f14131w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f14132x |= Integer.MIN_VALUE;
        return this.f14131w.c(null, this);
    }
}
