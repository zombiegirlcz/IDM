package qt1;

import com.revolut.feature.apm.core.models.transfers.money_requests.BizumMoneyRequestInfo;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.c {
    public BizumMoneyRequestInfo u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b f248913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f248914x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b bVar, gim.c cVar) {
        super(cVar);
        this.f248913w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f248914x |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b.Z2(this.f248913w, null, this);
    }
}
