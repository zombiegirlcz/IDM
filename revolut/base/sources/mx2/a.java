package mx2;

import aii.g;
import aii.p;
import aii.u;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_design.api.CardDesignCarouselDestination;
import com.revolut.feature.card_design.api.CardDesignCatalogueDestination;
import com.revolut.feature.card_design.api.CardLimitDestination;
import com.revolut.feature.card_design.api.model.SkipConfig;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlow;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData;
import com.revolut.feature.card_design.impl.card_design.card_personalisation_info.CardPersonalisationInfoController;
import com.revolut.feature.card_design.impl.card_design.card_personalisation_info.CardPersonalisationInfoScreenContract$InputData;
import com.revolut.feature.card_design.impl.card_design.local_global_card_info.LocalGlobalCardInfoController;
import com.revolut.feature.card_design.impl.card_design.local_global_card_info.LocalGlobalCardInfoScreenContract$InputData;
import com.revolut.feature.card_design.impl.card_limit_controller.CardLimitControllerScreen;
import com.revolut.feature.card_design.impl.card_limit_controller.CardLimitControllerScreenContract$InputData;
import com.revolut.retail.core.navigation.NaviCommand;
import h93.j0;
import h93.l0;
import hx2.l;
import kotlin.jvm.internal.Intrinsics;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f210154a = 0;

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof hx2.a) {
            hx2.a aVar = (hx2.a) descriptor;
            return aVar.a(new CardDesignFlow(new CardDesignFlowContract$InputData.Catalogue(aVar.f156353a, aVar.f156354b, aVar.f156355c, aVar.d, null, aVar.e, false, aVar.f, null, null, aVar.f156357h, null, null, null, null, null, aVar.f156356g, false, aVar.i, null, false, false, false, null, null, 24772608)));
        }
        if (descriptor instanceof hx2.d) {
            hx2.d dVar = (hx2.d) descriptor;
            return dVar.a(new CardLimitControllerScreen(new CardLimitControllerScreenContract$InputData(dVar.f156360a, dVar.f156361b, dVar.f156362c)));
        }
        if (descriptor instanceof hx2.g) {
            hx2.g gVar = (hx2.g) descriptor;
            return gVar.a(new CardPersonalisationInfoController(new CardPersonalisationInfoScreenContract$InputData(gVar.f156365a, gVar.f156366b)));
        }
        if (!(descriptor instanceof l)) {
            return null;
        }
        l lVar = (l) descriptor;
        return lVar.a(new LocalGlobalCardInfoController(new LocalGlobalCardInfoScreenContract$InputData(lVar.f156369a, lVar.f156370b, lVar.f156371c, lVar.d)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CardLimitDestination) {
            CardLimitDestination cardLimitDestination = (CardLimitDestination) destination;
            return gc0.c.b(new CardLimitControllerScreen(new CardLimitControllerScreenContract$InputData(cardLimitDestination.f64588a, cardLimitDestination.f64589b, cardLimitDestination.f64590c)), new aab.b(26));
        }
        if (destination instanceof CardDesignCatalogueDestination) {
            CardDesignCatalogueDestination cardDesignCatalogueDestination = (CardDesignCatalogueDestination) destination;
            h hVar = cardDesignCatalogueDestination.f64555a;
            c93.e eVar = cardDesignCatalogueDestination.f64556b;
            j0 j0Var = cardDesignCatalogueDestination.f64557c;
            l0 l0Var = cardDesignCatalogueDestination.d;
            AccountId accountId = cardDesignCatalogueDestination.e;
            String str = cardDesignCatalogueDestination.f;
            String str2 = cardDesignCatalogueDestination.f64558g;
            e93.l0 l0Var2 = cardDesignCatalogueDestination.f64559h;
            boolean z = cardDesignCatalogueDestination.i;
            boolean z3 = cardDesignCatalogueDestination.f64560j;
            return new CardDesignFlow(new CardDesignFlowContract$InputData.Catalogue(hVar, eVar, j0Var, l0Var, str2, accountId, z, l0Var2, cardDesignCatalogueDestination.k, cardDesignCatalogueDestination.f64561l, cardDesignCatalogueDestination.f64562m, str, cardDesignCatalogueDestination.o, cardDesignCatalogueDestination.f64564p, cardDesignCatalogueDestination.f64563n, cardDesignCatalogueDestination.f64565q, z3, cardDesignCatalogueDestination.f64566r, null, cardDesignCatalogueDestination.f64567s, cardDesignCatalogueDestination.f64568t, cardDesignCatalogueDestination.u, cardDesignCatalogueDestination.v, cardDesignCatalogueDestination.f64569w, cardDesignCatalogueDestination.f64570x, 262144));
        }
        if (!(destination instanceof CardDesignCarouselDestination)) {
            return null;
        }
        CardDesignCarouselDestination cardDesignCarouselDestination = (CardDesignCarouselDestination) destination;
        h hVar2 = cardDesignCarouselDestination.f64539a;
        c93.e eVar2 = cardDesignCarouselDestination.f64540b;
        j0 j0Var2 = cardDesignCarouselDestination.f64541c;
        l0 l0Var3 = cardDesignCarouselDestination.d;
        String str3 = cardDesignCarouselDestination.e;
        String str4 = cardDesignCarouselDestination.f;
        String str5 = cardDesignCarouselDestination.f64542g;
        AccountId accountId2 = cardDesignCarouselDestination.f64543h;
        String str6 = cardDesignCarouselDestination.i;
        String str7 = cardDesignCarouselDestination.f64544j;
        e93.l0 l0Var4 = cardDesignCarouselDestination.k;
        boolean z4 = cardDesignCarouselDestination.f64545l;
        NaviCommand naviCommand = cardDesignCarouselDestination.f64546m;
        SkipConfig skipConfig = cardDesignCarouselDestination.f64547n;
        AnalyticsProduct analyticsProduct = cardDesignCarouselDestination.o;
        String str8 = cardDesignCarouselDestination.f64548p;
        String str9 = cardDesignCarouselDestination.f64553w;
        return new CardDesignFlow(new CardDesignFlowContract$InputData.Carousel(hVar2, eVar2, j0Var2, l0Var3, str7, accountId2, l0Var4, z4, naviCommand, skipConfig, analyticsProduct, str6, cardDesignCarouselDestination.f64549q, cardDesignCarouselDestination.f64550r, str8, cardDesignCarouselDestination.f64552t, str3, str4, str5, cardDesignCarouselDestination.f64551s, cardDesignCarouselDestination.u, false, false, cardDesignCarouselDestination.v, str9, cardDesignCarouselDestination.f64554x));
    }
}
