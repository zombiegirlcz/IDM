package cjd;

import com.revolut.feature.shops.api.model.ShopsCampaignOffer;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.c {
    public ShopsCampaignOffer u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f24654w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.details.a f24655x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f24656y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.shops.impl.ui.details.a aVar, gim.c cVar) {
        super(cVar);
        this.f24655x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f24654w = obj2;
        this.f24656y |= Integer.MIN_VALUE;
        return this.f24655x.P2(null, this);
    }
}
