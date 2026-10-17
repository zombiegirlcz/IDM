package com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home;

import aim.e;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.travel.hotels.api.TravelHotelsApi$Toggles;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.TravelHotelsHomeFlowContract$PagerItem;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.TravelHotelsHomeBookingsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.discover.TravelHotelsHomeDiscoverScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.TravelHotelsHomeFavoritesScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.TravelHotelsFavoritesScreenV2;
import fag.i0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.e0;
import nyb.j;
import nyb.k;
import oki.h;
import org.jetbrains.annotations.NotNull;
import r10.r;
import u3a.q;
import u7k.f0;
import uag.d;
import uag.s;
import uag.v;
import yji.l;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends h implements d {

    @NotNull
    public static final s Companion = new s();
    public final TravelHotelsHomeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p8g.c f93734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f93735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zja.a f93736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i0 f93737s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f93738t;
    public final f01.c u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93739w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ali.b f93740x;

    public c(TravelHotelsHomeFlowContract$InputData inputData, v stateMapper, p8g.c travelHotelsFeatureInteractor, k revPointsInteractor, zja.a productArticleInteractor, i0 bookingEventsRepository, j revPointsEarningRatesInteractor, r hotelTransfersFeatureAvailabilityInteractor, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(bookingEventsRepository, "bookingEventsRepository");
        Intrinsics.checkNotNullParameter(revPointsEarningRatesInteractor, "revPointsEarningRatesInteractor");
        Intrinsics.checkNotNullParameter(hotelTransfersFeatureAvailabilityInteractor, "hotelTransfersFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.o = inputData;
        this.f93734p = travelHotelsFeatureInteractor;
        this.f93735q = revPointsInteractor;
        this.f93736r = productArticleInteractor;
        this.f93737s = bookingEventsRepository;
        this.f93738t = revPointsEarningRatesInteractor;
        this.u = uiKitResources;
        e eVarB = u.b();
        TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem = TravelHotelsHomeFlowContract$PagerItem.DISCOVER;
        eVarB.add(travelHotelsHomeFlowContract$PagerItem);
        eVarB.add(TravelHotelsHomeFlowContract$PagerItem.FAVORITES);
        eVarB.add(TravelHotelsHomeFlowContract$PagerItem.BOOKINGS);
        if (hotelTransfersFeatureAvailabilityInteractor.t()) {
            eVarB.add(TravelHotelsHomeFlowContract$PagerItem.TRANSFERS);
        }
        e eVarA = u.a(eVarB);
        TravelHotelsHomeFlowContract$PagerItem travelHotelsHomeFlowContract$PagerItem2 = inputData.f93723b;
        this.v = mra.d.b(this, new uag.e(new Data(null, null, false, 7, null), (travelHotelsHomeFlowContract$PagerItem2 == null || !eVarA.contains(travelHotelsHomeFlowContract$PagerItem2)) ? travelHotelsHomeFlowContract$PagerItem.getF94249a() : travelHotelsHomeFlowContract$PagerItem2.getF94249a(), eVarA), stateMapper, null, false, 12);
        final int i = 0;
        this.f93739w = hx7.e.a(this, new Function2(this) { // from class: uag.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c f278653b;

            {
                this.f278653b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        TravelHotelsHomeFlowContract$ModalStep step = (TravelHotelsHomeFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        boolean z = step instanceof TravelHotelsHomeFlowContract$ModalStep.RevPointsBottomSheet;
                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c cVar = this.f278653b;
                        if (z) {
                            return cVar.e1(new hub.c(e0.STAYS));
                        }
                        if (step instanceof TravelHotelsHomeFlowContract$ModalStep.Onboarding) {
                            return cVar.e1(new ProductArticleDescriptor(((TravelHotelsHomeFlowContract$ModalStep.Onboarding) step).f93724a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        TravelHotelsHomeFlowContract$PagerItem pagerItem = (TravelHotelsHomeFlowContract$PagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
                        int i2 = t.f278656a[pagerItem.ordinal()];
                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c cVar2 = this.f278653b;
                        if (i2 == 1) {
                            TravelHotelsHomeDiscoverScreen travelHotelsHomeDiscoverScreen = new TravelHotelsHomeDiscoverScreen();
                            r block = new r(cVar2, 2);
                            Intrinsics.checkNotNullParameter(block, "block");
                            travelHotelsHomeDiscoverScreen.H = block;
                            return travelHotelsHomeDiscoverScreen;
                        }
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    return cVar2.e1(e8g.a.f123667a);
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            TravelHotelsHomeBookingsScreen travelHotelsHomeBookingsScreen = new TravelHotelsHomeBookingsScreen(0);
                            r block2 = new r(cVar2, 0);
                            Intrinsics.checkNotNullParameter(block2, "block");
                            travelHotelsHomeBookingsScreen.H = block2;
                            return travelHotelsHomeBookingsScreen;
                        }
                        if (((jte.d) ((i9g.v) cVar2.f93734p).f159842a).c(TravelHotelsApi$Toggles.StaysFavoritesImprovements.f93616c)) {
                            TravelHotelsFavoritesScreenV2 travelHotelsFavoritesScreenV2 = new TravelHotelsFavoritesScreenV2();
                            r block3 = new r(cVar2, 3);
                            Intrinsics.checkNotNullParameter(block3, "block");
                            travelHotelsFavoritesScreenV2.H = block3;
                            return travelHotelsFavoritesScreenV2;
                        }
                        TravelHotelsHomeFavoritesScreen travelHotelsHomeFavoritesScreen = new TravelHotelsHomeFavoritesScreen();
                        r block4 = new r(cVar2, 4);
                        Intrinsics.checkNotNullParameter(block4, "block");
                        travelHotelsHomeFavoritesScreen.H = block4;
                        return travelHotelsHomeFavoritesScreen;
                }
            }
        });
        final int i2 = 1;
        this.f93740x = md6.s.b(this, new Function2(this) { // from class: uag.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c f278653b;

            {
                this.f278653b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        TravelHotelsHomeFlowContract$ModalStep step = (TravelHotelsHomeFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        boolean z = step instanceof TravelHotelsHomeFlowContract$ModalStep.RevPointsBottomSheet;
                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c cVar = this.f278653b;
                        if (z) {
                            return cVar.e1(new hub.c(e0.STAYS));
                        }
                        if (step instanceof TravelHotelsHomeFlowContract$ModalStep.Onboarding) {
                            return cVar.e1(new ProductArticleDescriptor(((TravelHotelsHomeFlowContract$ModalStep.Onboarding) step).f93724a, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        TravelHotelsHomeFlowContract$PagerItem pagerItem = (TravelHotelsHomeFlowContract$PagerItem) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
                        int i22 = t.f278656a[pagerItem.ordinal()];
                        com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c cVar2 = this.f278653b;
                        if (i22 == 1) {
                            TravelHotelsHomeDiscoverScreen travelHotelsHomeDiscoverScreen = new TravelHotelsHomeDiscoverScreen();
                            r block = new r(cVar2, 2);
                            Intrinsics.checkNotNullParameter(block, "block");
                            travelHotelsHomeDiscoverScreen.H = block;
                            return travelHotelsHomeDiscoverScreen;
                        }
                        if (i22 != 2) {
                            if (i22 != 3) {
                                if (i22 == 4) {
                                    return cVar2.e1(e8g.a.f123667a);
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            TravelHotelsHomeBookingsScreen travelHotelsHomeBookingsScreen = new TravelHotelsHomeBookingsScreen(0);
                            r block2 = new r(cVar2, 0);
                            Intrinsics.checkNotNullParameter(block2, "block");
                            travelHotelsHomeBookingsScreen.H = block2;
                            return travelHotelsHomeBookingsScreen;
                        }
                        if (((jte.d) ((i9g.v) cVar2.f93734p).f159842a).c(TravelHotelsApi$Toggles.StaysFavoritesImprovements.f93616c)) {
                            TravelHotelsFavoritesScreenV2 travelHotelsFavoritesScreenV2 = new TravelHotelsFavoritesScreenV2();
                            r block3 = new r(cVar2, 3);
                            Intrinsics.checkNotNullParameter(block3, "block");
                            travelHotelsFavoritesScreenV2.H = block3;
                            return travelHotelsFavoritesScreenV2;
                        }
                        TravelHotelsHomeFavoritesScreen travelHotelsHomeFavoritesScreen = new TravelHotelsHomeFavoritesScreen();
                        r block4 = new r(cVar2, 4);
                        Intrinsics.checkNotNullParameter(block4, "block");
                        travelHotelsHomeFavoritesScreen.H = block4;
                        return travelHotelsHomeFavoritesScreen;
                }
            }
        });
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f93740x;
    }

    @Override // yji.l
    public final void I1() {
        c cVar;
        efm.r rVarJust;
        i9g.v vVar = (i9g.v) this.f93734p;
        Continuation continuation = null;
        if (vVar.b()) {
            cVar = this;
            l.a1(cVar, rd0.e.b(this.f93735q.c(false)), null, null, new f0(this, continuation, 14), 3);
            l2(new u07.b(this, continuation, 20), new yi5.b(26));
        } else {
            cVar = this;
        }
        if (vVar.b()) {
            efm.r map = zi0.c.J(uj3.b.s(cVar.f93738t)).take(1L).map(new q(new uag.r(this, 1), 28));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            rVarJust = ue0.e.H(map, h0.f322473a, new u8c.c(15));
        } else {
            rVarJust = efm.r.just(p9g.c.f234312a);
            Intrinsics.h(rVarJust);
        }
        l.a1(cVar, rd0.e.b(rVarJust), null, null, new b(this, null), 3);
    }

    public final void I2(TravelHotelsHomeFlowContract$PagerItem pagerItem) {
        Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
        H2(this.v, new u6b.k(pagerItem, 17));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93739w;
    }

    @Override // ali.h, cli.z
    public final g getState() {
        return this.v;
    }
}
