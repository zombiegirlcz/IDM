package oid;

import b9.w2;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.impl.service.AdvertisingService;
import ip0.v7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2 f225634b;

    public /* synthetic */ g(w2 w2Var, int i) {
        this.f225633a = i;
        this.f225634b = w2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f225633a) {
            case 0:
                j request = (j) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                return new ufm.i(((AdvertisingService) this.f225634b.f13499b).getCampaign(request.f225644a, request.f225646c, request.d).s(hhm.f.f152431c), new oc8.e(26, new o9h.b(request, 27)), 1);
            case 1:
                i params = (i) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (ShopsCampaignOffer) v7.r("KEY_CAMPAIGN_CACHE", params.f225642a, (ne0.j) this.f225634b.f13500c);
            case 2:
                i params2 = (i) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                sid.f fVar = (sid.f) ((ue0.c) this.f225634b.d).T2("KEY_CAMPAIGN_CACHE" + params2.f225642a, sid.f.class);
                if (fVar != null) {
                    return lid.c.b(fVar, params2.f225643b, null, null);
                }
                return null;
            case 3:
                h params3 = (h) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return (ShopsCampaignOffer) v7.r("KEY_CAMPAIGN_BRAND_CACHE", params3.f225638a, (ne0.j) this.f225634b.f13500c);
            default:
                h params4 = (h) obj2;
                Intrinsics.checkNotNullParameter(params4, "params");
                sid.f fVar2 = (sid.f) ((ue0.c) this.f225634b.d).T2("KEY_CAMPAIGN_BRAND_CACHE" + params4.f225638a, sid.f.class);
                if (fVar2 != null) {
                    return lid.c.b(fVar2, "GiftCardsCheckout", null, null);
                }
                return null;
        }
    }
}
