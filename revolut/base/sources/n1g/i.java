package n1g;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.c {
    public r u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f211330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f211331x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, gim.c cVar) {
        super(cVar);
        this.f211330w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f211331x |= Integer.MIN_VALUE;
        return r.y2(this.f211330w, null, this);
    }
}
