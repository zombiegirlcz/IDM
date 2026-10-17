package bb2;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.c {
    public r10.w u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r10.w f14141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14142x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r10.w wVar, gim.c cVar) {
        super(cVar);
        this.f14141w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f14142x |= Integer.MIN_VALUE;
        return this.f14141w.A(null, this);
    }
}
