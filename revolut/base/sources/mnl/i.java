package mnl;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.sso.impl.ui.manual_review.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f207524w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.sso.impl.ui.manual_review.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f207524w |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.manual_review.b.I2(this.v, null, null, this);
    }
}
