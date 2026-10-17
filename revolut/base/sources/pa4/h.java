package pa4;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f234340w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f234340w |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c.Q2(this.v, null, this);
    }
}
