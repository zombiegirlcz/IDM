package cjd;

import com.revolut.feature.shops.api.model.ShopsCampaignOffer;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.c {
    public ShopsCampaignOffer u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f24651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f24652x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.details.a f24653y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.shops.impl.ui.details.a aVar, gim.c cVar) {
        super(cVar);
        this.f24653y = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f24652x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f24653y.O2(null, this);
    }
}
