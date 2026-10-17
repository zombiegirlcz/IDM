package uj6;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f280515w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f280515w |= Integer.MIN_VALUE;
        return com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.b.I2(this.v, null, this);
    }
}
