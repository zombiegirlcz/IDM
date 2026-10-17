package g2e;

import com.revolut.feature.store.api.model.StoreCampaignBadge;
import com.revolut.feature.store.api.model.StoreCampaignCategory;
import com.revolut.feature.store.api.model.StoreCampaignEarningRate;
import com.revolut.feature.store.api.model.StoreCampaignInstalmentOption;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import com.revolut.feature.store.api.model.StoreCampaignOutlet;
import com.revolut.feature.store.api.model.StoreInstructionList;
import com.revolut.feature.store.api.model.StoreMegaFiltersResponse;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.api.model.StoreMegaOffersResponse;
import com.revolut.feature.store.api.model.StoreSearchMegaOffersResponse;
import com.revolut.feature.store.impl.data.network.StoreService;
import dp4.f1;
import ip0.v7;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreService f140021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f140022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f140023c;
    public final t d;
    public final twg.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f140024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f140025h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x4l.c f140026j;

    public r(StoreService storeService, ne0.j memoryCache, ue0.c storage, t campaignRequestBuilder, twg.c shopsFeaturesHeaderProvider) {
        Intrinsics.checkNotNullParameter(storeService, "storeService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(campaignRequestBuilder, "campaignRequestBuilder");
        Intrinsics.checkNotNullParameter(shopsFeaturesHeaderProvider, "shopsFeaturesHeaderProvider");
        this.f140021a = storeService;
        this.f140022b = memoryCache;
        this.f140023c = storage;
        this.d = campaignRequestBuilder;
        this.e = shopsFeaturesHeaderProvider;
        Continuation continuation = null;
        frk.a aVar = new frk.a(this, continuation, 6);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: g2e.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f140010b;

            {
                this.f140010b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (StoreMegaOffersResponse) v7.r("STORE_MEGA_OFFERS_MEM_KEY_", r.e(params), this.f140010b.f140022b);
                    case 1:
                        h params2 = (h) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        StoreCampaignOffer storeCampaignOffer = (StoreCampaignOffer) v7.r("STORE_CAMPAIGN_MEM_KEY_", r.b(params2), this.f140010b.f140022b);
                        if (storeCampaignOffer == null) {
                            return null;
                        }
                        String source = params2.f139991b;
                        String id10 = storeCampaignOffer.f88447a;
                        String str = storeCampaignOffer.f88448b;
                        String str2 = storeCampaignOffer.f88449c;
                        String brandId = storeCampaignOffer.d;
                        String name = storeCampaignOffer.e;
                        String logoUrl = storeCampaignOffer.f;
                        Boolean bool = storeCampaignOffer.f88450g;
                        t1e.b bVar = storeCampaignOffer.f88451h;
                        String str3 = storeCampaignOffer.i;
                        String str4 = storeCampaignOffer.f88452j;
                        BigDecimal bigDecimal = storeCampaignOffer.k;
                        Double d = storeCampaignOffer.f88453l;
                        StoreCampaignEarningRate storeCampaignEarningRate = storeCampaignOffer.f88454m;
                        StoreCampaignBadge storeCampaignBadge = storeCampaignOffer.f88455n;
                        boolean z = storeCampaignOffer.o;
                        boolean z3 = storeCampaignOffer.f88456p;
                        boolean z4 = storeCampaignOffer.f88457q;
                        StoreCampaignCategory storeCampaignCategory = storeCampaignOffer.f88458r;
                        String str5 = storeCampaignOffer.f88459s;
                        String str6 = storeCampaignOffer.f88460t;
                        List list = storeCampaignOffer.v;
                        List list2 = storeCampaignOffer.f88461w;
                        StoreCampaignOutlet storeCampaignOutlet = storeCampaignOffer.f88462x;
                        Instant instant = storeCampaignOffer.f88463y;
                        Integer num = storeCampaignOffer.z;
                        StoreCampaignInstalmentOption storeCampaignInstalmentOption = storeCampaignOffer.A;
                        StoreInstructionList storeInstructionList = storeCampaignOffer.B;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(brandId, "brandId");
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
                        Intrinsics.checkNotNullParameter(source, "source");
                        return new StoreCampaignOffer(id10, str, str2, brandId, name, logoUrl, bool, bVar, str3, str4, bigDecimal, d, storeCampaignEarningRate, storeCampaignBadge, z, z3, z4, storeCampaignCategory, str5, str6, source, list, list2, storeCampaignOutlet, instant, num, storeCampaignInstalmentOption, storeInstructionList);
                    case 2:
                        j params3 = (j) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (StoreMegaFiltersResponse) v7.r("STORE_MEGA_OFFERS_FILTERS_MEM_KEY", r.d(params3), this.f140010b.f140022b);
                    case 3:
                        i params4 = (i) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (StoreMegaOffer) v7.r("STORE_MEGA_OFFER_MEM_KEY_", r.c(params4), this.f140010b.f140022b);
                    default:
                        l params5 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (StoreSearchMegaOffersResponse) v7.r("STORE_SEARCH_MEGA_OFFERS_MEM_KEY_", r.f(params5), this.f140010b.f140022b);
                }
            }
        };
        final int i2 = 1;
        this.f = new x4l.c(aVar, function1, new Function2(this) { // from class: g2e.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f140014b;

            {
                this.f140014b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        h params = (h) obj2;
                        StoreCampaignOffer campaign = (StoreCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        this.f140014b.f140022b.f("STORE_CAMPAIGN_MEM_KEY_" + r.b(params), campaign);
                        break;
                    case 1:
                        k params2 = (k) obj2;
                        StoreMegaOffersResponse response = (StoreMegaOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFERS_MEM_KEY_" + r.e(params2), response);
                        break;
                    case 2:
                        j params3 = (j) obj2;
                        StoreMegaFiltersResponse response2 = (StoreMegaFiltersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFERS_FILTERS_MEM_KEY" + r.d(params3), response2);
                        break;
                    case 3:
                        i params4 = (i) obj2;
                        StoreMegaOffer offer = (StoreMegaOffer) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFER_MEM_KEY_" + r.c(params4), offer);
                        break;
                    default:
                        l params5 = (l) obj2;
                        StoreSearchMegaOffersResponse response3 = (StoreSearchMegaOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f140014b.f140022b.f("STORE_SEARCH_MEGA_OFFERS_MEM_KEY_" + r.f(params5), response3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new q(this, continuation, 3), new f1(this, continuation, 26));
        final int i3 = 2;
        this.f140024g = new x4l.c(new frk.a(this, continuation, 7), new Function1(this) { // from class: g2e.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f140010b;

            {
                this.f140010b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (StoreMegaOffersResponse) v7.r("STORE_MEGA_OFFERS_MEM_KEY_", r.e(params), this.f140010b.f140022b);
                    case 1:
                        h params2 = (h) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        StoreCampaignOffer storeCampaignOffer = (StoreCampaignOffer) v7.r("STORE_CAMPAIGN_MEM_KEY_", r.b(params2), this.f140010b.f140022b);
                        if (storeCampaignOffer == null) {
                            return null;
                        }
                        String source = params2.f139991b;
                        String id10 = storeCampaignOffer.f88447a;
                        String str = storeCampaignOffer.f88448b;
                        String str2 = storeCampaignOffer.f88449c;
                        String brandId = storeCampaignOffer.d;
                        String name = storeCampaignOffer.e;
                        String logoUrl = storeCampaignOffer.f;
                        Boolean bool = storeCampaignOffer.f88450g;
                        t1e.b bVar = storeCampaignOffer.f88451h;
                        String str3 = storeCampaignOffer.i;
                        String str4 = storeCampaignOffer.f88452j;
                        BigDecimal bigDecimal = storeCampaignOffer.k;
                        Double d = storeCampaignOffer.f88453l;
                        StoreCampaignEarningRate storeCampaignEarningRate = storeCampaignOffer.f88454m;
                        StoreCampaignBadge storeCampaignBadge = storeCampaignOffer.f88455n;
                        boolean z = storeCampaignOffer.o;
                        boolean z3 = storeCampaignOffer.f88456p;
                        boolean z4 = storeCampaignOffer.f88457q;
                        StoreCampaignCategory storeCampaignCategory = storeCampaignOffer.f88458r;
                        String str5 = storeCampaignOffer.f88459s;
                        String str6 = storeCampaignOffer.f88460t;
                        List list = storeCampaignOffer.v;
                        List list2 = storeCampaignOffer.f88461w;
                        StoreCampaignOutlet storeCampaignOutlet = storeCampaignOffer.f88462x;
                        Instant instant = storeCampaignOffer.f88463y;
                        Integer num = storeCampaignOffer.z;
                        StoreCampaignInstalmentOption storeCampaignInstalmentOption = storeCampaignOffer.A;
                        StoreInstructionList storeInstructionList = storeCampaignOffer.B;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(brandId, "brandId");
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
                        Intrinsics.checkNotNullParameter(source, "source");
                        return new StoreCampaignOffer(id10, str, str2, brandId, name, logoUrl, bool, bVar, str3, str4, bigDecimal, d, storeCampaignEarningRate, storeCampaignBadge, z, z3, z4, storeCampaignCategory, str5, str6, source, list, list2, storeCampaignOutlet, instant, num, storeCampaignInstalmentOption, storeInstructionList);
                    case 2:
                        j params3 = (j) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (StoreMegaFiltersResponse) v7.r("STORE_MEGA_OFFERS_FILTERS_MEM_KEY", r.d(params3), this.f140010b.f140022b);
                    case 3:
                        i params4 = (i) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (StoreMegaOffer) v7.r("STORE_MEGA_OFFER_MEM_KEY_", r.c(params4), this.f140010b.f140022b);
                    default:
                        l params5 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (StoreSearchMegaOffersResponse) v7.r("STORE_SEARCH_MEGA_OFFERS_MEM_KEY_", r.f(params5), this.f140010b.f140022b);
                }
            }
        }, new Function2(this) { // from class: g2e.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f140014b;

            {
                this.f140014b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        h params = (h) obj2;
                        StoreCampaignOffer campaign = (StoreCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        this.f140014b.f140022b.f("STORE_CAMPAIGN_MEM_KEY_" + r.b(params), campaign);
                        break;
                    case 1:
                        k params2 = (k) obj2;
                        StoreMegaOffersResponse response = (StoreMegaOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFERS_MEM_KEY_" + r.e(params2), response);
                        break;
                    case 2:
                        j params3 = (j) obj2;
                        StoreMegaFiltersResponse response2 = (StoreMegaFiltersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFERS_FILTERS_MEM_KEY" + r.d(params3), response2);
                        break;
                    case 3:
                        i params4 = (i) obj2;
                        StoreMegaOffer offer = (StoreMegaOffer) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFER_MEM_KEY_" + r.c(params4), offer);
                        break;
                    default:
                        l params5 = (l) obj2;
                        StoreSearchMegaOffersResponse response3 = (StoreSearchMegaOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f140014b.f140022b.f("STORE_SEARCH_MEGA_OFFERS_MEM_KEY_" + r.f(params5), response3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new q(this, continuation, 4), new f1(this, continuation, 27));
        final int i5 = 3;
        this.f140025h = new x4l.c(new frk.a(this, continuation, 5), new Function1(this) { // from class: g2e.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f140010b;

            {
                this.f140010b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (StoreMegaOffersResponse) v7.r("STORE_MEGA_OFFERS_MEM_KEY_", r.e(params), this.f140010b.f140022b);
                    case 1:
                        h params2 = (h) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        StoreCampaignOffer storeCampaignOffer = (StoreCampaignOffer) v7.r("STORE_CAMPAIGN_MEM_KEY_", r.b(params2), this.f140010b.f140022b);
                        if (storeCampaignOffer == null) {
                            return null;
                        }
                        String source = params2.f139991b;
                        String id10 = storeCampaignOffer.f88447a;
                        String str = storeCampaignOffer.f88448b;
                        String str2 = storeCampaignOffer.f88449c;
                        String brandId = storeCampaignOffer.d;
                        String name = storeCampaignOffer.e;
                        String logoUrl = storeCampaignOffer.f;
                        Boolean bool = storeCampaignOffer.f88450g;
                        t1e.b bVar = storeCampaignOffer.f88451h;
                        String str3 = storeCampaignOffer.i;
                        String str4 = storeCampaignOffer.f88452j;
                        BigDecimal bigDecimal = storeCampaignOffer.k;
                        Double d = storeCampaignOffer.f88453l;
                        StoreCampaignEarningRate storeCampaignEarningRate = storeCampaignOffer.f88454m;
                        StoreCampaignBadge storeCampaignBadge = storeCampaignOffer.f88455n;
                        boolean z = storeCampaignOffer.o;
                        boolean z3 = storeCampaignOffer.f88456p;
                        boolean z4 = storeCampaignOffer.f88457q;
                        StoreCampaignCategory storeCampaignCategory = storeCampaignOffer.f88458r;
                        String str5 = storeCampaignOffer.f88459s;
                        String str6 = storeCampaignOffer.f88460t;
                        List list = storeCampaignOffer.v;
                        List list2 = storeCampaignOffer.f88461w;
                        StoreCampaignOutlet storeCampaignOutlet = storeCampaignOffer.f88462x;
                        Instant instant = storeCampaignOffer.f88463y;
                        Integer num = storeCampaignOffer.z;
                        StoreCampaignInstalmentOption storeCampaignInstalmentOption = storeCampaignOffer.A;
                        StoreInstructionList storeInstructionList = storeCampaignOffer.B;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(brandId, "brandId");
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
                        Intrinsics.checkNotNullParameter(source, "source");
                        return new StoreCampaignOffer(id10, str, str2, brandId, name, logoUrl, bool, bVar, str3, str4, bigDecimal, d, storeCampaignEarningRate, storeCampaignBadge, z, z3, z4, storeCampaignCategory, str5, str6, source, list, list2, storeCampaignOutlet, instant, num, storeCampaignInstalmentOption, storeInstructionList);
                    case 2:
                        j params3 = (j) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (StoreMegaFiltersResponse) v7.r("STORE_MEGA_OFFERS_FILTERS_MEM_KEY", r.d(params3), this.f140010b.f140022b);
                    case 3:
                        i params4 = (i) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (StoreMegaOffer) v7.r("STORE_MEGA_OFFER_MEM_KEY_", r.c(params4), this.f140010b.f140022b);
                    default:
                        l params5 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (StoreSearchMegaOffersResponse) v7.r("STORE_SEARCH_MEGA_OFFERS_MEM_KEY_", r.f(params5), this.f140010b.f140022b);
                }
            }
        }, new Function2(this) { // from class: g2e.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f140014b;

            {
                this.f140014b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i5) {
                    case 0:
                        h params = (h) obj2;
                        StoreCampaignOffer campaign = (StoreCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        this.f140014b.f140022b.f("STORE_CAMPAIGN_MEM_KEY_" + r.b(params), campaign);
                        break;
                    case 1:
                        k params2 = (k) obj2;
                        StoreMegaOffersResponse response = (StoreMegaOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFERS_MEM_KEY_" + r.e(params2), response);
                        break;
                    case 2:
                        j params3 = (j) obj2;
                        StoreMegaFiltersResponse response2 = (StoreMegaFiltersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFERS_FILTERS_MEM_KEY" + r.d(params3), response2);
                        break;
                    case 3:
                        i params4 = (i) obj2;
                        StoreMegaOffer offer = (StoreMegaOffer) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFER_MEM_KEY_" + r.c(params4), offer);
                        break;
                    default:
                        l params5 = (l) obj2;
                        StoreSearchMegaOffersResponse response3 = (StoreSearchMegaOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f140014b.f140022b.f("STORE_SEARCH_MEGA_OFFERS_MEM_KEY_" + r.f(params5), response3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new q(this, continuation, 2), new f1(this, continuation, 25));
        final int i6 = 4;
        this.i = new x4l.c(new frk.a(this, continuation, 8), new Function1(this) { // from class: g2e.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f140010b;

            {
                this.f140010b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (StoreMegaOffersResponse) v7.r("STORE_MEGA_OFFERS_MEM_KEY_", r.e(params), this.f140010b.f140022b);
                    case 1:
                        h params2 = (h) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        StoreCampaignOffer storeCampaignOffer = (StoreCampaignOffer) v7.r("STORE_CAMPAIGN_MEM_KEY_", r.b(params2), this.f140010b.f140022b);
                        if (storeCampaignOffer == null) {
                            return null;
                        }
                        String source = params2.f139991b;
                        String id10 = storeCampaignOffer.f88447a;
                        String str = storeCampaignOffer.f88448b;
                        String str2 = storeCampaignOffer.f88449c;
                        String brandId = storeCampaignOffer.d;
                        String name = storeCampaignOffer.e;
                        String logoUrl = storeCampaignOffer.f;
                        Boolean bool = storeCampaignOffer.f88450g;
                        t1e.b bVar = storeCampaignOffer.f88451h;
                        String str3 = storeCampaignOffer.i;
                        String str4 = storeCampaignOffer.f88452j;
                        BigDecimal bigDecimal = storeCampaignOffer.k;
                        Double d = storeCampaignOffer.f88453l;
                        StoreCampaignEarningRate storeCampaignEarningRate = storeCampaignOffer.f88454m;
                        StoreCampaignBadge storeCampaignBadge = storeCampaignOffer.f88455n;
                        boolean z = storeCampaignOffer.o;
                        boolean z3 = storeCampaignOffer.f88456p;
                        boolean z4 = storeCampaignOffer.f88457q;
                        StoreCampaignCategory storeCampaignCategory = storeCampaignOffer.f88458r;
                        String str5 = storeCampaignOffer.f88459s;
                        String str6 = storeCampaignOffer.f88460t;
                        List list = storeCampaignOffer.v;
                        List list2 = storeCampaignOffer.f88461w;
                        StoreCampaignOutlet storeCampaignOutlet = storeCampaignOffer.f88462x;
                        Instant instant = storeCampaignOffer.f88463y;
                        Integer num = storeCampaignOffer.z;
                        StoreCampaignInstalmentOption storeCampaignInstalmentOption = storeCampaignOffer.A;
                        StoreInstructionList storeInstructionList = storeCampaignOffer.B;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(brandId, "brandId");
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
                        Intrinsics.checkNotNullParameter(source, "source");
                        return new StoreCampaignOffer(id10, str, str2, brandId, name, logoUrl, bool, bVar, str3, str4, bigDecimal, d, storeCampaignEarningRate, storeCampaignBadge, z, z3, z4, storeCampaignCategory, str5, str6, source, list, list2, storeCampaignOutlet, instant, num, storeCampaignInstalmentOption, storeInstructionList);
                    case 2:
                        j params3 = (j) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (StoreMegaFiltersResponse) v7.r("STORE_MEGA_OFFERS_FILTERS_MEM_KEY", r.d(params3), this.f140010b.f140022b);
                    case 3:
                        i params4 = (i) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (StoreMegaOffer) v7.r("STORE_MEGA_OFFER_MEM_KEY_", r.c(params4), this.f140010b.f140022b);
                    default:
                        l params5 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (StoreSearchMegaOffersResponse) v7.r("STORE_SEARCH_MEGA_OFFERS_MEM_KEY_", r.f(params5), this.f140010b.f140022b);
                }
            }
        }, new Function2(this) { // from class: g2e.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f140014b;

            {
                this.f140014b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        h params = (h) obj2;
                        StoreCampaignOffer campaign = (StoreCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        this.f140014b.f140022b.f("STORE_CAMPAIGN_MEM_KEY_" + r.b(params), campaign);
                        break;
                    case 1:
                        k params2 = (k) obj2;
                        StoreMegaOffersResponse response = (StoreMegaOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFERS_MEM_KEY_" + r.e(params2), response);
                        break;
                    case 2:
                        j params3 = (j) obj2;
                        StoreMegaFiltersResponse response2 = (StoreMegaFiltersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFERS_FILTERS_MEM_KEY" + r.d(params3), response2);
                        break;
                    case 3:
                        i params4 = (i) obj2;
                        StoreMegaOffer offer = (StoreMegaOffer) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFER_MEM_KEY_" + r.c(params4), offer);
                        break;
                    default:
                        l params5 = (l) obj2;
                        StoreSearchMegaOffersResponse response3 = (StoreSearchMegaOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f140014b.f140022b.f("STORE_SEARCH_MEGA_OFFERS_MEM_KEY_" + r.f(params5), response3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e31.i(2, 13, continuation), new eci.a(3, 8, continuation));
        f5h.b bVar = new f5h.b(this, continuation, 22);
        final int i21 = 1;
        Function1 function12 = new Function1(this) { // from class: g2e.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f140010b;

            {
                this.f140010b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        k params = (k) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (StoreMegaOffersResponse) v7.r("STORE_MEGA_OFFERS_MEM_KEY_", r.e(params), this.f140010b.f140022b);
                    case 1:
                        h params2 = (h) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        StoreCampaignOffer storeCampaignOffer = (StoreCampaignOffer) v7.r("STORE_CAMPAIGN_MEM_KEY_", r.b(params2), this.f140010b.f140022b);
                        if (storeCampaignOffer == null) {
                            return null;
                        }
                        String source = params2.f139991b;
                        String id10 = storeCampaignOffer.f88447a;
                        String str = storeCampaignOffer.f88448b;
                        String str2 = storeCampaignOffer.f88449c;
                        String brandId = storeCampaignOffer.d;
                        String name = storeCampaignOffer.e;
                        String logoUrl = storeCampaignOffer.f;
                        Boolean bool = storeCampaignOffer.f88450g;
                        t1e.b bVar2 = storeCampaignOffer.f88451h;
                        String str3 = storeCampaignOffer.i;
                        String str4 = storeCampaignOffer.f88452j;
                        BigDecimal bigDecimal = storeCampaignOffer.k;
                        Double d = storeCampaignOffer.f88453l;
                        StoreCampaignEarningRate storeCampaignEarningRate = storeCampaignOffer.f88454m;
                        StoreCampaignBadge storeCampaignBadge = storeCampaignOffer.f88455n;
                        boolean z = storeCampaignOffer.o;
                        boolean z3 = storeCampaignOffer.f88456p;
                        boolean z4 = storeCampaignOffer.f88457q;
                        StoreCampaignCategory storeCampaignCategory = storeCampaignOffer.f88458r;
                        String str5 = storeCampaignOffer.f88459s;
                        String str6 = storeCampaignOffer.f88460t;
                        List list = storeCampaignOffer.v;
                        List list2 = storeCampaignOffer.f88461w;
                        StoreCampaignOutlet storeCampaignOutlet = storeCampaignOffer.f88462x;
                        Instant instant = storeCampaignOffer.f88463y;
                        Integer num = storeCampaignOffer.z;
                        StoreCampaignInstalmentOption storeCampaignInstalmentOption = storeCampaignOffer.A;
                        StoreInstructionList storeInstructionList = storeCampaignOffer.B;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(brandId, "brandId");
                        Intrinsics.checkNotNullParameter(name, "name");
                        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
                        Intrinsics.checkNotNullParameter(source, "source");
                        return new StoreCampaignOffer(id10, str, str2, brandId, name, logoUrl, bool, bVar2, str3, str4, bigDecimal, d, storeCampaignEarningRate, storeCampaignBadge, z, z3, z4, storeCampaignCategory, str5, str6, source, list, list2, storeCampaignOutlet, instant, num, storeCampaignInstalmentOption, storeInstructionList);
                    case 2:
                        j params3 = (j) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (StoreMegaFiltersResponse) v7.r("STORE_MEGA_OFFERS_FILTERS_MEM_KEY", r.d(params3), this.f140010b.f140022b);
                    case 3:
                        i params4 = (i) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (StoreMegaOffer) v7.r("STORE_MEGA_OFFER_MEM_KEY_", r.c(params4), this.f140010b.f140022b);
                    default:
                        l params5 = (l) obj2;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        return (StoreSearchMegaOffersResponse) v7.r("STORE_SEARCH_MEGA_OFFERS_MEM_KEY_", r.f(params5), this.f140010b.f140022b);
                }
            }
        };
        final int i22 = 0;
        this.f140026j = new x4l.c(bVar, function12, new Function2(this) { // from class: g2e.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f140014b;

            {
                this.f140014b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        h params = (h) obj2;
                        StoreCampaignOffer campaign = (StoreCampaignOffer) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(campaign, "campaign");
                        this.f140014b.f140022b.f("STORE_CAMPAIGN_MEM_KEY_" + r.b(params), campaign);
                        break;
                    case 1:
                        k params2 = (k) obj2;
                        StoreMegaOffersResponse response = (StoreMegaOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFERS_MEM_KEY_" + r.e(params2), response);
                        break;
                    case 2:
                        j params3 = (j) obj2;
                        StoreMegaFiltersResponse response2 = (StoreMegaFiltersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFERS_FILTERS_MEM_KEY" + r.d(params3), response2);
                        break;
                    case 3:
                        i params4 = (i) obj2;
                        StoreMegaOffer offer = (StoreMegaOffer) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(offer, "offer");
                        this.f140014b.f140022b.f("STORE_MEGA_OFFER_MEM_KEY_" + r.c(params4), offer);
                        break;
                    default:
                        l params5 = (l) obj2;
                        StoreSearchMegaOffersResponse response3 = (StoreSearchMegaOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params5, "params");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f140014b.f140022b.f("STORE_SEARCH_MEGA_OFFERS_MEM_KEY_" + r.f(params5), response3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new q(this, continuation, 1), new f1(this, continuation, 24));
        new x4l.c(new p(this, null, 0), new g1k.k(this, 13), new g0c.h(this, 19), new q(this, continuation, 0), new p(this, null, 1));
    }

    public static final boolean a(r rVar, k kVar) {
        String str = kVar.d;
        return (str == null || kotlin.text.d0.W(str)) && kVar.e.isEmpty() && kVar.f.isEmpty() && kVar.f140003c == null && kVar.f140002b == null;
    }

    public static String b(h hVar) {
        String str = hVar.f139990a;
        String str2 = hVar.f139992c;
        if (str2 == null) {
            str2 = "";
        }
        return a0.d.s("id=", str, "_shopsFeatures=", str2);
    }

    public static String c(i iVar) {
        String str = iVar.f139995a;
        String str2 = iVar.f139996b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = iVar.f139997c;
        String str4 = str3 != null ? str3 : "";
        StringBuilder sbM = v0.a.m("id=", str, "_shopsFeatures=", str2, "_adSetId=");
        sbM.append(str4);
        return sbM.toString();
    }

    public static String d(j jVar) {
        String str = jVar.f140000a;
        if (str == null) {
            str = "";
        }
        return "shopsFeatures=".concat(str);
    }

    public static String e(k kVar) {
        String lowerCase;
        String string;
        String str = kVar.f140001a;
        if (str == null) {
            str = "";
        }
        String str2 = kVar.d;
        if (str2 == null || (string = kotlin.text.d0.F0(str2).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        String str3 = lowerCase != null ? lowerCase : "";
        String strK0 = zhm.d0.k0(zhm.d0.O0(zhm.d0.E0(kVar.f, kVar.e)), "_", null, null, 0, null, 62);
        Integer num = kVar.f140002b;
        Integer num2 = kVar.f140003c;
        StringBuilder sbM = v0.a.m("shopsFeatures=", str, "_query=", str3, "_filter=");
        sbM.append(strK0);
        sbM.append("_limit=");
        sbM.append(num);
        sbM.append("_offset=");
        sbM.append(num2);
        return sbM.toString();
    }

    public static String f(l lVar) {
        String lowerCase;
        String string;
        String str = lVar.f140005a;
        if (str == null) {
            str = "";
        }
        String str2 = lVar.f140007c;
        if (str2 == null || (string = kotlin.text.d0.F0(str2).toString()) == null) {
            lowerCase = null;
        } else {
            lowerCase = string.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        }
        String str3 = lowerCase != null ? lowerCase : "";
        Integer num = lVar.f140006b;
        StringBuilder sbM = v0.a.m("shopsFeatures=", str, "_query=", str3, "_limit=");
        sbM.append(num);
        return sbM.toString();
    }
}
