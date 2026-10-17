package com.revolut.feature.travel.experiences.impl.ui.flow.checkout;

import ang.f;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceAvailabilitySelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import com.revolut.feature.travel.experiences.impl.ui.flow.checkout.TravelExperiencesCheckoutFlowContract$Step;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.discovery.TravelExperiencesDestinationDiscoveryScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.discovery.TravelExperiencesDestinationDiscoveryScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2Screen;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2ScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.TravelExperiencesPickupDetailsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.TravelExperiencesPickupDetailsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperienceQuestionsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperiencesQuestionsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.a;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.visitors.TravelExperiencesVisitorsSelectionScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.visitors.TravelExperiencesVisitorsSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import gvc.m;
import gvi.s;
import h1g.b;
import h1g.h;
import io3.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import rd0.e;
import wsg.n;
import yji.l;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f92972t;
    public final f u;
    public final c1g.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f92973w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TravelExperiencesCheckoutFlowContract$Step f92974x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final TravelExperiencesCheckoutFlowContract$Empty f92975y;

    public a(n walletInteractor, f userInteractor, c1g.g urlProviderInteractor, h stateHolder, TravelExperiencesCheckoutFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(urlProviderInteractor, "urlProviderInteractor");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f92972t = walletInteractor;
        this.u = userInteractor;
        this.v = urlProviderInteractor;
        this.f92973w = stateHolder;
        this.f92974x = inputData.f92938a;
        this.f92975y = TravelExperiencesCheckoutFlowContract$Empty.f92937a;
    }

    @Override // dki.g
    public final boolean H2() {
        return true;
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, e.b(m70.a.g(this.u.k(false), null, null, 3)), null, null, new h1g.g(this, null, 0), 3);
        l.a1(this, e.b(m70.a.g(nim.a.w(u1.d(osg.b.d(this.f92972t), osg.b.e(this.f92972t, false, null, null, null, null, null, null, 126)), new h1g.e(this, 5)), null, null, 3)), null, null, new h1g.g(this, null, 1), 3);
        l2(new m(this, null, 4), new yi5.b(26));
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        final TravelExperiencesCheckoutFlowContract$Step step = (TravelExperiencesCheckoutFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof TravelExperiencesCheckoutFlowContract$Step.Details) {
            TravelExperiencesCheckoutFlowContract$Step.Details details = (TravelExperiencesCheckoutFlowContract$Step.Details) step;
            TravelExperiencesDetailsScreen travelExperiencesDetailsScreen = new TravelExperiencesDetailsScreen(new TravelExperiencesDetailsScreenContract$InputData(details.f92949a, details.f92950b, details.f92951c, a2g.h.BOOKING_FLOW));
            h1g.e eVar = new h1g.e(this, 0);
            Intrinsics.checkNotNullParameter(eVar, "<set-?>");
            travelExperiencesDetailsScreen.H = eVar;
            return travelExperiencesDetailsScreen;
        }
        if (step instanceof TravelExperiencesCheckoutFlowContract$Step.DatesSelection) {
            TravelExperiencesCheckoutFlowContract$Step.DatesSelection datesSelection = (TravelExperiencesCheckoutFlowContract$Step.DatesSelection) step;
            TravelExperiencesDatesSelectionScreen travelExperiencesDatesSelectionScreen = new TravelExperiencesDatesSelectionScreen(new TravelExperiencesDatesSelectionScreenContract$InputData(datesSelection.f92945a, o3g.e.SINGLE, datesSelection.f92946b));
            h1g.e eVar2 = new h1g.e(this, 1);
            Intrinsics.checkNotNullParameter(eVar2, "<set-?>");
            travelExperiencesDatesSelectionScreen.H = eVar2;
            return travelExperiencesDatesSelectionScreen;
        }
        if (step instanceof TravelExperiencesCheckoutFlowContract$Step.VisitorsSelection) {
            TravelExperiencesVisitorsSelectionScreen travelExperiencesVisitorsSelectionScreen = new TravelExperiencesVisitorsSelectionScreen(new TravelExperiencesVisitorsSelectionScreenContract$InputData(((TravelExperiencesCheckoutFlowContract$Step.VisitorsSelection) step).f92971a));
            h1g.e eVar3 = new h1g.e(this, 2);
            Intrinsics.checkNotNullParameter(eVar3, "<set-?>");
            travelExperiencesVisitorsSelectionScreen.H = eVar3;
            return travelExperiencesVisitorsSelectionScreen;
        }
        boolean z = step instanceof TravelExperiencesCheckoutFlowContract$Step.Options;
        h hVar = this.f92973w;
        if (z) {
            TravelExperiencesCheckoutFlowContract$Step.Options options = (TravelExperiencesCheckoutFlowContract$Step.Options) step;
            TravelExperiencesOptionsV2Screen travelExperiencesOptionsV2Screen = new TravelExperiencesOptionsV2Screen(new TravelExperiencesOptionsV2ScreenContract$InputData(options.f92952a, options.f92953b, options.f92954c, hVar.f148571a.e));
            h1g.e eVar4 = new h1g.e(this, 6);
            Intrinsics.checkNotNullParameter(eVar4, "<set-?>");
            travelExperiencesOptionsV2Screen.H = eVar4;
            return travelExperiencesOptionsV2Screen;
        }
        if (step instanceof TravelExperiencesCheckoutFlowContract$Step.VisitorsDetails) {
            TravelExperiencesCheckoutFlowContract$Step.VisitorsDetails visitorsDetails = (TravelExperiencesCheckoutFlowContract$Step.VisitorsDetails) step;
            TravelExperienceQuestionsScreen travelExperienceQuestionsScreen = new TravelExperienceQuestionsScreen(new TravelExperiencesQuestionsScreenContract$InputData.VisitorsQuestions(visitorsDetails.f92969a, visitorsDetails.f92970b));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: h1g.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.travel.experiences.impl.ui.flow.checkout.a f148568b;

                {
                    this.f148568b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    FlowStep checkout;
                    switch (i) {
                        case 0:
                            com.revolut.feature.travel.experiences.impl.ui.screen.questions.a outputData = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.a) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            com.revolut.feature.travel.experiences.impl.ui.flow.checkout.a aVar = this.f148568b;
                            h hVar2 = aVar.f92973w;
                            d dVarA = d.a(hVar2.f148571a, null, null, null, null, null, null, null, null, null, ((a.C0563a) outputData).f93123a, null, null, null, 15871);
                            Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                            hVar2.f148571a = dVarA;
                            List list = ((TravelExperiencesCheckoutFlowContract$Step.VisitorsDetails) step).f92969a;
                            if (a1g.a.b(list)) {
                                d dVar = hVar2.f148571a;
                                checkout = new TravelExperiencesCheckoutFlowContract$Step.PickupDetails(list, dVar.f148561j, dVar.k);
                            } else {
                                checkout = new TravelExperiencesCheckoutFlowContract$Step.Checkout(hVar2.f148571a.d, list);
                            }
                            aVar.E2(checkout, true, null, false);
                            break;
                        default:
                            com.revolut.feature.travel.experiences.impl.ui.screen.questions.a outputData2 = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.a) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            d3g.l lVar = (d3g.l) outputData2;
                            com.revolut.feature.travel.experiences.impl.ui.flow.checkout.a aVar2 = this.f148568b;
                            h hVar3 = aVar2.f92973w;
                            d dVarA2 = d.a(hVar3.f148571a, null, null, lVar.f111126b, null, null, null, null, null, null, null, lVar.f111127c, lVar.f111125a, null, 13307);
                            Intrinsics.checkNotNullParameter(dVarA2, "<set-?>");
                            hVar3.f148571a = dVarA2;
                            aVar2.E2(new TravelExperiencesCheckoutFlowContract$Step.Checkout(hVar3.f148571a.d, ((TravelExperiencesCheckoutFlowContract$Step.AdditionalDetails) step).f92940a), true, null, false);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            travelExperienceQuestionsScreen.H = function1;
            return travelExperienceQuestionsScreen;
        }
        if (step instanceof TravelExperiencesCheckoutFlowContract$Step.AdditionalDetails) {
            TravelExperiencesCheckoutFlowContract$Step.AdditionalDetails additionalDetails = (TravelExperiencesCheckoutFlowContract$Step.AdditionalDetails) step;
            TravelExperienceQuestionsScreen travelExperienceQuestionsScreen2 = new TravelExperienceQuestionsScreen(new TravelExperiencesQuestionsScreenContract$InputData.BookingQuestions(additionalDetails.f92940a, additionalDetails.f92941b, additionalDetails.d));
            final int i2 = 1;
            Function1 function12 = new Function1(this) { // from class: h1g.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.travel.experiences.impl.ui.flow.checkout.a f148568b;

                {
                    this.f148568b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    FlowStep checkout;
                    switch (i2) {
                        case 0:
                            com.revolut.feature.travel.experiences.impl.ui.screen.questions.a outputData = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.a) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            com.revolut.feature.travel.experiences.impl.ui.flow.checkout.a aVar = this.f148568b;
                            h hVar2 = aVar.f92973w;
                            d dVarA = d.a(hVar2.f148571a, null, null, null, null, null, null, null, null, null, ((a.C0563a) outputData).f93123a, null, null, null, 15871);
                            Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                            hVar2.f148571a = dVarA;
                            List list = ((TravelExperiencesCheckoutFlowContract$Step.VisitorsDetails) step).f92969a;
                            if (a1g.a.b(list)) {
                                d dVar = hVar2.f148571a;
                                checkout = new TravelExperiencesCheckoutFlowContract$Step.PickupDetails(list, dVar.f148561j, dVar.k);
                            } else {
                                checkout = new TravelExperiencesCheckoutFlowContract$Step.Checkout(hVar2.f148571a.d, list);
                            }
                            aVar.E2(checkout, true, null, false);
                            break;
                        default:
                            com.revolut.feature.travel.experiences.impl.ui.screen.questions.a outputData2 = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.a) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            d3g.l lVar = (d3g.l) outputData2;
                            com.revolut.feature.travel.experiences.impl.ui.flow.checkout.a aVar2 = this.f148568b;
                            h hVar3 = aVar2.f92973w;
                            d dVarA2 = d.a(hVar3.f148571a, null, null, lVar.f111126b, null, null, null, null, null, null, null, lVar.f111127c, lVar.f111125a, null, 13307);
                            Intrinsics.checkNotNullParameter(dVarA2, "<set-?>");
                            hVar3.f148571a = dVarA2;
                            aVar2.E2(new TravelExperiencesCheckoutFlowContract$Step.Checkout(hVar3.f148571a.d, ((TravelExperiencesCheckoutFlowContract$Step.AdditionalDetails) step).f92940a), true, null, false);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            travelExperienceQuestionsScreen2.H = function12;
            return travelExperienceQuestionsScreen2;
        }
        if (step instanceof TravelExperiencesCheckoutFlowContract$Step.PickupDetails) {
            TravelExperiencesPickupDetailsScreen travelExperiencesPickupDetailsScreen = new TravelExperiencesPickupDetailsScreen(new TravelExperiencesPickupDetailsScreenContract$InputData(((TravelExperiencesCheckoutFlowContract$Step.PickupDetails) step).f92955a, hVar.f148571a.f148562l));
            h1g.e eVar5 = new h1g.e(this, 3);
            Intrinsics.checkNotNullParameter(eVar5, "<set-?>");
            travelExperiencesPickupDetailsScreen.H = eVar5;
            return travelExperiencesPickupDetailsScreen;
        }
        if (step instanceof TravelExperiencesCheckoutFlowContract$Step.Checkout) {
            TravelExperiencesCheckoutFlowContract$Step.Checkout checkout = (TravelExperiencesCheckoutFlowContract$Step.Checkout) step;
            d dVar = checkout.f92943a;
            h1g.d dVar2 = hVar.f148571a;
            TravelExperienceDatesSelection travelExperienceDatesSelection = dVar2.f148556a;
            TravelExperienceVisitorsSelection travelExperienceVisitorsSelection = dVar2.f148559g;
            TravelExperienceAvailabilitySelection travelExperienceAvailabilitySelection = dVar2.f148560h;
            TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = dVar2.f148558c;
            ArrayList arrayListE0 = d0.E0(dVar2.f148562l, dVar2.f148561j);
            h1g.d dVar3 = hVar.f148571a;
            TravelExperiencesCheckoutScreen travelExperiencesCheckoutScreen = new TravelExperiencesCheckoutScreen(new TravelExperiencesCheckoutScreenContract$InputData(dVar, travelExperienceDatesSelection, travelExperienceVisitorsSelection, travelExperienceAvailabilitySelection, travelExperiencesBookingContactDetails, arrayListE0, dVar3.k, dVar3.i, checkout.f92944b));
            h1g.e block = new h1g.e(this, 4);
            Intrinsics.checkNotNullParameter(block, "block");
            travelExperiencesCheckoutScreen.H = block;
            return travelExperiencesCheckoutScreen;
        }
        if (step instanceof TravelExperiencesCheckoutFlowContract$Step.Search) {
            TravelExperiencesCheckoutFlowContract$Step.Search search = (TravelExperiencesCheckoutFlowContract$Step.Search) step;
            TravelExperienceDatesSelection travelExperienceDatesSelection2 = search.f92959b;
            if (travelExperienceDatesSelection2 != null) {
                h1g.d dVarA = h1g.d.a(hVar.f148571a, travelExperienceDatesSelection2, null, null, null, null, null, null, null, null, null, null, null, null, 16382);
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                hVar.f148571a = dVarA;
            }
            TravelExperiencesSearchScreen travelExperiencesSearchScreen = new TravelExperiencesSearchScreen(new TravelExperiencesSearchScreenContract$InputData(hVar.f148571a.f148556a));
            s sVar = new s(this, search.f92958a, 16);
            Intrinsics.checkNotNullParameter(sVar, "<set-?>");
            travelExperiencesSearchScreen.H = sVar;
            return travelExperiencesSearchScreen;
        }
        if (step instanceof TravelExperiencesCheckoutFlowContract$Step.DestinationDiscovery) {
            TravelExperiencesCheckoutFlowContract$Step.DestinationDiscovery destinationDiscovery = (TravelExperiencesCheckoutFlowContract$Step.DestinationDiscovery) step;
            TravelExperiencesDestinationDiscoveryScreen travelExperiencesDestinationDiscoveryScreen = new TravelExperiencesDestinationDiscoveryScreen(new TravelExperiencesDestinationDiscoveryScreenContract$InputData(destinationDiscovery.f92947a, destinationDiscovery.f92948b));
            s block2 = new s(this, destinationDiscovery, 15);
            Intrinsics.checkNotNullParameter(block2, "block");
            travelExperiencesDestinationDiscoveryScreen.H = block2;
            return travelExperiencesDestinationDiscoveryScreen;
        }
        if (step instanceof TravelExperiencesCheckoutFlowContract$Step.SearchResults.Destination) {
            TravelExperiencesCheckoutFlowContract$Step.SearchResults.Destination destination = (TravelExperiencesCheckoutFlowContract$Step.SearchResults.Destination) step;
            TravelExperiencesSearchResultsScreen travelExperiencesSearchResultsScreen = new TravelExperiencesSearchResultsScreen(new TravelExperiencesSearchResultsScreenContract$InputData.Destination(destination.f92963a, destination.f92964b, destination.f92965c, destination.d));
            h1g.e eVar6 = new h1g.e(this, 7);
            Intrinsics.checkNotNullParameter(eVar6, "<set-?>");
            travelExperiencesSearchResultsScreen.H = eVar6;
            return travelExperiencesSearchResultsScreen;
        }
        if (step instanceof TravelExperiencesCheckoutFlowContract$Step.SearchResults.Attraction) {
            TravelExperiencesCheckoutFlowContract$Step.SearchResults.Attraction attraction = (TravelExperiencesCheckoutFlowContract$Step.SearchResults.Attraction) step;
            TravelExperiencesSearchResultsScreen travelExperiencesSearchResultsScreen2 = new TravelExperiencesSearchResultsScreen(new TravelExperiencesSearchResultsScreenContract$InputData.Attraction(attraction.f92960a, attraction.f92961b, attraction.f92962c, attraction.d));
            h1g.e eVar7 = new h1g.e(this, 7);
            Intrinsics.checkNotNullParameter(eVar7, "<set-?>");
            travelExperiencesSearchResultsScreen2.H = eVar7;
            return travelExperiencesSearchResultsScreen2;
        }
        if (!(step instanceof TravelExperiencesCheckoutFlowContract$Step.SearchResults.PreciseLocation)) {
            throw new NoWhenBranchMatchedException();
        }
        TravelExperiencesCheckoutFlowContract$Step.SearchResults.PreciseLocation preciseLocation = (TravelExperiencesCheckoutFlowContract$Step.SearchResults.PreciseLocation) step;
        TravelExperiencesSearchResultsScreen travelExperiencesSearchResultsScreen3 = new TravelExperiencesSearchResultsScreen(new TravelExperiencesSearchResultsScreenContract$InputData.PreciseLocation(preciseLocation.f92966a, preciseLocation.f92967b, preciseLocation.f92968c));
        h1g.e eVar8 = new h1g.e(this, 7);
        Intrinsics.checkNotNullParameter(eVar8, "<set-?>");
        travelExperiencesSearchResultsScreen3.H = eVar8;
        return travelExperiencesSearchResultsScreen3;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f92975y;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f92974x;
    }
}
