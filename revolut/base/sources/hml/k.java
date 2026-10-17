package hml;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.sso.impl.ui.consent.qr.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f153998w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.sso.impl.ui.consent.qr.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f153998w |= Integer.MIN_VALUE;
        return com.revolut.sso.impl.ui.consent.qr.b.J2(this.v, this);
    }
}
