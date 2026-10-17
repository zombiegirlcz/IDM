package cjd;

import com.revolut.feature.shops.api.model.ShopsCampaignOffer;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.c {
    public ShopsCampaignOffer u;
    public co3.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f24648w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.details.a f24649x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f24650y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.shops.impl.ui.details.a aVar, gim.c cVar) {
        super(cVar);
        this.f24649x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f24648w = obj2;
        this.f24650y |= Integer.MIN_VALUE;
        return this.f24649x.N2(null, null, this);
    }
}
