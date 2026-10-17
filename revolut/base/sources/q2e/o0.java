package q2e;

import com.revolut.feature.store.api.model.StoreCampaignOffer;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 extends gim.c {
    public StoreCampaignOffer u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.store.impl.ui.brand_detail.flow.c f241607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f241608x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f241607w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f241608x |= Integer.MIN_VALUE;
        return this.f241607w.O2(null, this);
    }
}
