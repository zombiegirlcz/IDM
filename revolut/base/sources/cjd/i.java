package cjd;

import com.revolut.feature.shops.api.model.ShopsCampaignOffer;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.c {
    public ShopsCampaignOffer u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.details.a f24645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f24646x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.shops.impl.ui.details.a aVar, gim.c cVar) {
        super(cVar);
        this.f24645w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f24646x |= Integer.MIN_VALUE;
        return com.revolut.feature.shops.impl.ui.details.a.I2(this.f24645w, null, this);
    }
}
