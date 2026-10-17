package g2e;

import com.revolut.feature.store.api.model.StoreExclusivesFiltersResponse;
import com.revolut.feature.store.api.model.StoreExclusivesHeaderResponse;
import com.revolut.feature.store.api.model.StoreExclusivesOffersResponse;
import com.revolut.feature.store.api.model.StorePurchaseDetailsResponse;
import com.revolut.feature.store.api.model.StorePurchasesResponse;
import com.revolut.feature.store.impl.data.network.StoreService;
import dp4.f1;
import ip0.v7;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class n0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreService f140015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f140016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f140017c;
    public final twg.c d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f140018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f140019h;
    public final x4l.c i;

    public n0(StoreService storeService, ne0.j memoryCache, ue0.c storage, twg.c shopsFeaturesHeaderProvider) {
        Intrinsics.checkNotNullParameter(storeService, "storeService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(shopsFeaturesHeaderProvider, "shopsFeaturesHeaderProvider");
        this.f140015a = storeService;
        this.f140016b = memoryCache;
        this.f140017c = storage;
        this.d = shopsFeaturesHeaderProvider;
        Continuation continuation = null;
        final int i = 0;
        this.e = new x4l.c(new frk.a(this, continuation, 12), new Function1(this) { // from class: g2e.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f139994b;

            {
                this.f139994b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        e0 params = (e0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (StoreExclusivesHeaderResponse) v7.r("STORE_EXCLUSIVES_HEADER_MEM_KEY", n0.b(params), this.f139994b.f140016b);
                    case 1:
                        d0 params2 = (d0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (StoreExclusivesFiltersResponse) v7.r("STORE_EXCLUSIVES_FILTERS_MEM_KEY", n0.a(params2), this.f139994b.f140016b);
                    case 2:
                        f0 params3 = (f0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (StoreExclusivesOffersResponse) v7.r("STORE_EXCLUSIVES_OFFERS_MEM_KEY_", n0.c(params3), this.f139994b.f140016b);
                    case 3:
                        String purchaseId = (String) obj2;
                        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                        return (StorePurchaseDetailsResponse) v7.r("STORE_EXCLUSIVES_PURCHASE_DETAILS_MEM_KEY_", purchaseId, this.f139994b.f140016b);
                    default:
                        g0 params4 = (g0) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (StorePurchasesResponse) v7.r("STORE_EXCLUSIVES_PURCHASES_MEM_KEY_", n0.d(params4), this.f139994b.f140016b);
                }
            }
        }, new Function2(this) { // from class: g2e.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f139999b;

            {
                this.f139999b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                switch (i) {
                    case 0:
                        e0 params = (e0) obj2;
                        StoreExclusivesHeaderResponse response = (StoreExclusivesHeaderResponse) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_HEADER_MEM_KEY" + n0.b(params), response);
                        break;
                    case 1:
                        d0 params2 = (d0) obj2;
                        StoreExclusivesFiltersResponse response2 = (StoreExclusivesFiltersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_FILTERS_MEM_KEY" + n0.a(params2), response2);
                        break;
                    case 2:
                        f0 params3 = (f0) obj2;
                        StoreExclusivesOffersResponse response3 = (StoreExclusivesOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_OFFERS_MEM_KEY_" + n0.c(params3), response3);
                        break;
                    case 3:
                        String purchaseId = (String) obj2;
                        StorePurchaseDetailsResponse response4 = (StorePurchaseDetailsResponse) obj3;
                        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_PURCHASE_DETAILS_MEM_KEY_" + purchaseId, response4);
                        break;
                    default:
                        g0 params4 = (g0) obj2;
                        StorePurchasesResponse response5 = (StorePurchasesResponse) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_PURCHASES_MEM_KEY_" + n0.d(params4), response5);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l0(this, continuation, 1), new m0(this, continuation, 0));
        final int i2 = 1;
        this.f = new x4l.c(new frk.a(this, continuation, 11), new Function1(this) { // from class: g2e.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f139994b;

            {
                this.f139994b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        e0 params = (e0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (StoreExclusivesHeaderResponse) v7.r("STORE_EXCLUSIVES_HEADER_MEM_KEY", n0.b(params), this.f139994b.f140016b);
                    case 1:
                        d0 params2 = (d0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (StoreExclusivesFiltersResponse) v7.r("STORE_EXCLUSIVES_FILTERS_MEM_KEY", n0.a(params2), this.f139994b.f140016b);
                    case 2:
                        f0 params3 = (f0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (StoreExclusivesOffersResponse) v7.r("STORE_EXCLUSIVES_OFFERS_MEM_KEY_", n0.c(params3), this.f139994b.f140016b);
                    case 3:
                        String purchaseId = (String) obj2;
                        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                        return (StorePurchaseDetailsResponse) v7.r("STORE_EXCLUSIVES_PURCHASE_DETAILS_MEM_KEY_", purchaseId, this.f139994b.f140016b);
                    default:
                        g0 params4 = (g0) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (StorePurchasesResponse) v7.r("STORE_EXCLUSIVES_PURCHASES_MEM_KEY_", n0.d(params4), this.f139994b.f140016b);
                }
            }
        }, new Function2(this) { // from class: g2e.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f139999b;

            {
                this.f139999b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                switch (i2) {
                    case 0:
                        e0 params = (e0) obj2;
                        StoreExclusivesHeaderResponse response = (StoreExclusivesHeaderResponse) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_HEADER_MEM_KEY" + n0.b(params), response);
                        break;
                    case 1:
                        d0 params2 = (d0) obj2;
                        StoreExclusivesFiltersResponse response2 = (StoreExclusivesFiltersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_FILTERS_MEM_KEY" + n0.a(params2), response2);
                        break;
                    case 2:
                        f0 params3 = (f0) obj2;
                        StoreExclusivesOffersResponse response3 = (StoreExclusivesOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_OFFERS_MEM_KEY_" + n0.c(params3), response3);
                        break;
                    case 3:
                        String purchaseId = (String) obj2;
                        StorePurchaseDetailsResponse response4 = (StorePurchaseDetailsResponse) obj3;
                        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_PURCHASE_DETAILS_MEM_KEY_" + purchaseId, response4);
                        break;
                    default:
                        g0 params4 = (g0) obj2;
                        StorePurchasesResponse response5 = (StorePurchasesResponse) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_PURCHASES_MEM_KEY_" + n0.d(params4), response5);
                        break;
                }
                return Unit.f186387a;
            }
        }, new l0(this, continuation, 0), new f1(this, continuation, 29));
        final int i3 = 2;
        int i5 = 2;
        int i6 = 3;
        this.f140018g = new x4l.c(new frk.a(this, continuation, 13), new Function1(this) { // from class: g2e.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f139994b;

            {
                this.f139994b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        e0 params = (e0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (StoreExclusivesHeaderResponse) v7.r("STORE_EXCLUSIVES_HEADER_MEM_KEY", n0.b(params), this.f139994b.f140016b);
                    case 1:
                        d0 params2 = (d0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (StoreExclusivesFiltersResponse) v7.r("STORE_EXCLUSIVES_FILTERS_MEM_KEY", n0.a(params2), this.f139994b.f140016b);
                    case 2:
                        f0 params3 = (f0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (StoreExclusivesOffersResponse) v7.r("STORE_EXCLUSIVES_OFFERS_MEM_KEY_", n0.c(params3), this.f139994b.f140016b);
                    case 3:
                        String purchaseId = (String) obj2;
                        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                        return (StorePurchaseDetailsResponse) v7.r("STORE_EXCLUSIVES_PURCHASE_DETAILS_MEM_KEY_", purchaseId, this.f139994b.f140016b);
                    default:
                        g0 params4 = (g0) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (StorePurchasesResponse) v7.r("STORE_EXCLUSIVES_PURCHASES_MEM_KEY_", n0.d(params4), this.f139994b.f140016b);
                }
            }
        }, new Function2(this) { // from class: g2e.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f139999b;

            {
                this.f139999b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                switch (i3) {
                    case 0:
                        e0 params = (e0) obj2;
                        StoreExclusivesHeaderResponse response = (StoreExclusivesHeaderResponse) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_HEADER_MEM_KEY" + n0.b(params), response);
                        break;
                    case 1:
                        d0 params2 = (d0) obj2;
                        StoreExclusivesFiltersResponse response2 = (StoreExclusivesFiltersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_FILTERS_MEM_KEY" + n0.a(params2), response2);
                        break;
                    case 2:
                        f0 params3 = (f0) obj2;
                        StoreExclusivesOffersResponse response3 = (StoreExclusivesOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_OFFERS_MEM_KEY_" + n0.c(params3), response3);
                        break;
                    case 3:
                        String purchaseId = (String) obj2;
                        StorePurchaseDetailsResponse response4 = (StorePurchaseDetailsResponse) obj3;
                        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_PURCHASE_DETAILS_MEM_KEY_" + purchaseId, response4);
                        break;
                    default:
                        g0 params4 = (g0) obj2;
                        StorePurchasesResponse response5 = (StorePurchasesResponse) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_PURCHASES_MEM_KEY_" + n0.d(params4), response5);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e31.i(i5, 15, continuation), new eci.a(i6, 10, continuation));
        final int i21 = 3;
        this.f140019h = new x4l.c(new frk.a(this, continuation, 14), new Function1(this) { // from class: g2e.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f139994b;

            {
                this.f139994b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        e0 params = (e0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (StoreExclusivesHeaderResponse) v7.r("STORE_EXCLUSIVES_HEADER_MEM_KEY", n0.b(params), this.f139994b.f140016b);
                    case 1:
                        d0 params2 = (d0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (StoreExclusivesFiltersResponse) v7.r("STORE_EXCLUSIVES_FILTERS_MEM_KEY", n0.a(params2), this.f139994b.f140016b);
                    case 2:
                        f0 params3 = (f0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (StoreExclusivesOffersResponse) v7.r("STORE_EXCLUSIVES_OFFERS_MEM_KEY_", n0.c(params3), this.f139994b.f140016b);
                    case 3:
                        String purchaseId = (String) obj2;
                        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                        return (StorePurchaseDetailsResponse) v7.r("STORE_EXCLUSIVES_PURCHASE_DETAILS_MEM_KEY_", purchaseId, this.f139994b.f140016b);
                    default:
                        g0 params4 = (g0) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (StorePurchasesResponse) v7.r("STORE_EXCLUSIVES_PURCHASES_MEM_KEY_", n0.d(params4), this.f139994b.f140016b);
                }
            }
        }, new Function2(this) { // from class: g2e.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f139999b;

            {
                this.f139999b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                switch (i21) {
                    case 0:
                        e0 params = (e0) obj2;
                        StoreExclusivesHeaderResponse response = (StoreExclusivesHeaderResponse) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_HEADER_MEM_KEY" + n0.b(params), response);
                        break;
                    case 1:
                        d0 params2 = (d0) obj2;
                        StoreExclusivesFiltersResponse response2 = (StoreExclusivesFiltersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_FILTERS_MEM_KEY" + n0.a(params2), response2);
                        break;
                    case 2:
                        f0 params3 = (f0) obj2;
                        StoreExclusivesOffersResponse response3 = (StoreExclusivesOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_OFFERS_MEM_KEY_" + n0.c(params3), response3);
                        break;
                    case 3:
                        String purchaseId = (String) obj2;
                        StorePurchaseDetailsResponse response4 = (StorePurchaseDetailsResponse) obj3;
                        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_PURCHASE_DETAILS_MEM_KEY_" + purchaseId, response4);
                        break;
                    default:
                        g0 params4 = (g0) obj2;
                        StorePurchasesResponse response5 = (StorePurchasesResponse) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_PURCHASES_MEM_KEY_" + n0.d(params4), response5);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e31.i(i5, 16, continuation), new eci.a(i6, 11, continuation));
        final int i22 = 4;
        this.i = new x4l.c(new frk.a(this, continuation, 15), new Function1(this) { // from class: g2e.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f139994b;

            {
                this.f139994b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        e0 params = (e0) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (StoreExclusivesHeaderResponse) v7.r("STORE_EXCLUSIVES_HEADER_MEM_KEY", n0.b(params), this.f139994b.f140016b);
                    case 1:
                        d0 params2 = (d0) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (StoreExclusivesFiltersResponse) v7.r("STORE_EXCLUSIVES_FILTERS_MEM_KEY", n0.a(params2), this.f139994b.f140016b);
                    case 2:
                        f0 params3 = (f0) obj2;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (StoreExclusivesOffersResponse) v7.r("STORE_EXCLUSIVES_OFFERS_MEM_KEY_", n0.c(params3), this.f139994b.f140016b);
                    case 3:
                        String purchaseId = (String) obj2;
                        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                        return (StorePurchaseDetailsResponse) v7.r("STORE_EXCLUSIVES_PURCHASE_DETAILS_MEM_KEY_", purchaseId, this.f139994b.f140016b);
                    default:
                        g0 params4 = (g0) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        return (StorePurchasesResponse) v7.r("STORE_EXCLUSIVES_PURCHASES_MEM_KEY_", n0.d(params4), this.f139994b.f140016b);
                }
            }
        }, new Function2(this) { // from class: g2e.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f139999b;

            {
                this.f139999b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                switch (i22) {
                    case 0:
                        e0 params = (e0) obj2;
                        StoreExclusivesHeaderResponse response = (StoreExclusivesHeaderResponse) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(response, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_HEADER_MEM_KEY" + n0.b(params), response);
                        break;
                    case 1:
                        d0 params2 = (d0) obj2;
                        StoreExclusivesFiltersResponse response2 = (StoreExclusivesFiltersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(response2, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_FILTERS_MEM_KEY" + n0.a(params2), response2);
                        break;
                    case 2:
                        f0 params3 = (f0) obj2;
                        StoreExclusivesOffersResponse response3 = (StoreExclusivesOffersResponse) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(response3, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_OFFERS_MEM_KEY_" + n0.c(params3), response3);
                        break;
                    case 3:
                        String purchaseId = (String) obj2;
                        StorePurchaseDetailsResponse response4 = (StorePurchaseDetailsResponse) obj3;
                        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
                        Intrinsics.checkNotNullParameter(response4, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_PURCHASE_DETAILS_MEM_KEY_" + purchaseId, response4);
                        break;
                    default:
                        g0 params4 = (g0) obj2;
                        StorePurchasesResponse response5 = (StorePurchasesResponse) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(response5, "response");
                        this.f139999b.f140016b.f("STORE_EXCLUSIVES_PURCHASES_MEM_KEY_" + n0.d(params4), response5);
                        break;
                }
                return Unit.f186387a;
            }
        }, new e31.i(i5, 17, continuation), new eci.a(i6, 12, continuation));
    }

    public static String a(d0 d0Var) {
        String str = d0Var.f139980a;
        if (str == null) {
            str = "";
        }
        return "shopsFeatures=".concat(str);
    }

    public static String b(e0 e0Var) {
        String str = e0Var.f139982a;
        if (str == null) {
            str = "";
        }
        return "shopsFeatures=".concat(str);
    }

    public static String c(f0 f0Var) throws IOException {
        String strK0 = zhm.d0.k0(zhm.d0.O0(f0Var.f139983a), "_", null, null, 0, null, 62);
        String str = f0Var.f139984b;
        Integer num = f0Var.f139985c;
        Integer num2 = f0Var.d;
        String str2 = f0Var.e;
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sbM = v0.a.m("filter=", strK0, "_brandId=", str, "_offset=");
        sbM.append(num);
        sbM.append("_limit=");
        sbM.append(num2);
        sbM.append("_shopsFeatures=");
        sbM.append(str2);
        return sbM.toString();
    }

    public static String d(g0 g0Var) {
        Integer num = g0Var.f139987a;
        Integer num2 = g0Var.f139988b;
        String str = g0Var.f139989c;
        if (str == null) {
            str = "";
        }
        return "limit=" + num + "_offset=" + num2 + "_shopsFeatures=" + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g2e.k0
            if (r0 == 0) goto L13
            r0 = r6
            g2e.k0 r0 = (g2e.k0) r0
            int r1 = r0.f140004w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140004w = r1
            goto L18
        L13:
            g2e.k0 r0 = new g2e.k0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140004w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f140004w = r3
            com.revolut.feature.store.impl.data.network.StoreService r6 = r4.f140015a
            java.lang.Object r6 = r6.cancelPurchase(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            retrofit2.Response r6 = (retrofit2.Response) r6
            boolean r5 = r6.isSuccessful()
            if (r5 == 0) goto L48
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L48:
            retrofit2.HttpException r5 = new retrofit2.HttpException
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g2e.n0.e(java.lang.String, gim.c):java.lang.Object");
    }
}
