package vh4;

import vge.r;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.c {
    public r u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a f289312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289313x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f289312w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f289313x |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a.P2(this.f289312w, null, null, null, this);
    }
}
