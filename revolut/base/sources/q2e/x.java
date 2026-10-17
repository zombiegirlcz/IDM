package q2e;

import com.revolut.feature.store.api.model.StoreCampaignOffer;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.c {
    public StoreCampaignOffer u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.store.impl.ui.brand_detail.flow.c f241631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f241632x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f241631w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f241632x |= Integer.MIN_VALUE;
        return this.f241631w.J2(null, this);
    }
}
