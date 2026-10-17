package com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search;

import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.AirportLoungeSearchFlowContract$Step;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlow;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.AirportDetailsScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.AirportDetailsScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_search.AirportSearchScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.AirportLoungesAmenitiesScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.AirportLoungesAmenitiesScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreenContract$InputData;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sxi.j;
import sxi.k;
import uwi.l;
import uwi.m;
import wwi.i;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends g implements pwi.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AirportLoungeSearchFlowContract$InputData f98983t;
    public final AirportLoungeSearchFlowContract$Step.AirportSearch u;
    public final AirportLoungeSearchFlowContract$EmptyState v;

    public a(AirportLoungeSearchFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f98983t = inputData;
        this.u = AirportLoungeSearchFlowContract$Step.AirportSearch.f98977a;
        this.v = AirportLoungeSearchFlowContract$EmptyState.f98974a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        AirportLoungeSearchFlowContract$Step step = (AirportLoungeSearchFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof AirportLoungeSearchFlowContract$Step.AirportSearch) {
            AirportSearchScreen airportSearchScreen = new AirportSearchScreen();
            final int i = 2;
            Function1 function1 = new Function1(this) { // from class: pwi.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.a f240484b;

                {
                    this.f240484b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            k output = (k) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof j;
                            com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.a aVar = this.f240484b;
                            if (z) {
                                aVar.E2(new AirportLoungeSearchFlowContract$Step.LoungeAmenities(((j) output).f266507a), true, null, false);
                            } else if (Intrinsics.f(output, k.b.f266509a)) {
                                aVar.E2(AirportLoungeSearchFlowContract$Step.PurchasePass.f98982a, true, null, false);
                            } else {
                                if (!Intrinsics.f(output, k.a.f266508a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.E2(AirportLoungeSearchFlowContract$Step.PassDetails.f98981a, true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            l output2 = (l) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z3 = output2 instanceof m;
                            com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.a aVar2 = this.f240484b;
                            if (z3) {
                                m mVar = (m) output2;
                                aVar2.E2(new AirportLoungeSearchFlowContract$Step.LoungeDetails(mVar.f283680a, mVar.f283682c), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false);
                            } else if (Intrinsics.f(output2, l.a.f283678a)) {
                                aVar2.E2(AirportLoungeSearchFlowContract$Step.PassDetails.f98981a, true, null, false);
                            } else {
                                if (!Intrinsics.f(output2, l.b.f283679a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(AirportLoungeSearchFlowContract$Step.PurchasePass.f98982a, true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            wwi.j output3 = (wwi.j) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (!(output3 instanceof i)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f240484b.E2(new AirportLoungeSearchFlowContract$Step.AirportDetails(((i) output3).f300679a), true, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            airportSearchScreen.H = function1;
            return airportSearchScreen;
        }
        boolean z = step instanceof AirportLoungeSearchFlowContract$Step.AirportDetails;
        AirportLoungeSearchFlowContract$InputData airportLoungeSearchFlowContract$InputData = this.f98983t;
        if (z) {
            AirportDetailsScreen airportDetailsScreen = new AirportDetailsScreen(new AirportDetailsScreenContract$InputData(((AirportLoungeSearchFlowContract$Step.AirportDetails) step).f98976a, airportLoungeSearchFlowContract$InputData.f98975a));
            final int i2 = 1;
            Function1 function12 = new Function1(this) { // from class: pwi.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.a f240484b;

                {
                    this.f240484b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            k output = (k) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z3 = output instanceof j;
                            com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.a aVar = this.f240484b;
                            if (z3) {
                                aVar.E2(new AirportLoungeSearchFlowContract$Step.LoungeAmenities(((j) output).f266507a), true, null, false);
                            } else if (Intrinsics.f(output, k.b.f266509a)) {
                                aVar.E2(AirportLoungeSearchFlowContract$Step.PurchasePass.f98982a, true, null, false);
                            } else {
                                if (!Intrinsics.f(output, k.a.f266508a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.E2(AirportLoungeSearchFlowContract$Step.PassDetails.f98981a, true, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            l output2 = (l) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z310 = output2 instanceof m;
                            com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.a aVar2 = this.f240484b;
                            if (z310) {
                                m mVar = (m) output2;
                                aVar2.E2(new AirportLoungeSearchFlowContract$Step.LoungeDetails(mVar.f283680a, mVar.f283682c), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false);
                            } else if (Intrinsics.f(output2, l.a.f283678a)) {
                                aVar2.E2(AirportLoungeSearchFlowContract$Step.PassDetails.f98981a, true, null, false);
                            } else {
                                if (!Intrinsics.f(output2, l.b.f283679a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(AirportLoungeSearchFlowContract$Step.PurchasePass.f98982a, true, null, false);
                            }
                            return Unit.f186387a;
                        default:
                            wwi.j output3 = (wwi.j) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            if (!(output3 instanceof i)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f240484b.E2(new AirportLoungeSearchFlowContract$Step.AirportDetails(((i) output3).f300679a), true, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            airportDetailsScreen.H = function12;
            return airportDetailsScreen;
        }
        if (!(step instanceof AirportLoungeSearchFlowContract$Step.LoungeDetails)) {
            if (step instanceof AirportLoungeSearchFlowContract$Step.LoungeAmenities) {
                return new AirportLoungesAmenitiesScreen(new AirportLoungesAmenitiesScreenContract$InputData(((AirportLoungeSearchFlowContract$Step.LoungeAmenities) step).f98978a));
            }
            if (step instanceof AirportLoungeSearchFlowContract$Step.PassDetails) {
                return new AirportLoungePassDetailsFlow(0);
            }
            if (step instanceof AirportLoungeSearchFlowContract$Step.PurchasePass) {
                return new AirportLoungePassDetailsFlow(AirportLoungePassDetailsFlowContract$InputData.Checkout.f98984a);
            }
            throw new NoWhenBranchMatchedException();
        }
        AirportLoungeSearchFlowContract$Step.LoungeDetails loungeDetails = (AirportLoungeSearchFlowContract$Step.LoungeDetails) step;
        AirportLoungeDetailsScreen airportLoungeDetailsScreen = new AirportLoungeDetailsScreen(new AirportLoungeDetailsScreenContract$InputData(loungeDetails.f98979a, loungeDetails.f98980b, airportLoungeSearchFlowContract$InputData.f98975a));
        final int i3 = 0;
        Function1 function13 = new Function1(this) { // from class: pwi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.a f240484b;

            {
                this.f240484b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        k output = (k) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z3 = output instanceof j;
                        com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.a aVar = this.f240484b;
                        if (z3) {
                            aVar.E2(new AirportLoungeSearchFlowContract$Step.LoungeAmenities(((j) output).f266507a), true, null, false);
                        } else if (Intrinsics.f(output, k.b.f266509a)) {
                            aVar.E2(AirportLoungeSearchFlowContract$Step.PurchasePass.f98982a, true, null, false);
                        } else {
                            if (!Intrinsics.f(output, k.a.f266508a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.E2(AirportLoungeSearchFlowContract$Step.PassDetails.f98981a, true, null, false);
                        }
                        return Unit.f186387a;
                    case 1:
                        l output2 = (l) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        boolean z310 = output2 instanceof m;
                        com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.a aVar2 = this.f240484b;
                        if (z310) {
                            m mVar = (m) output2;
                            aVar2.E2(new AirportLoungeSearchFlowContract$Step.LoungeDetails(mVar.f283680a, mVar.f283682c), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false);
                        } else if (Intrinsics.f(output2, l.a.f283678a)) {
                            aVar2.E2(AirportLoungeSearchFlowContract$Step.PassDetails.f98981a, true, null, false);
                        } else {
                            if (!Intrinsics.f(output2, l.b.f283679a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.E2(AirportLoungeSearchFlowContract$Step.PurchasePass.f98982a, true, null, false);
                        }
                        return Unit.f186387a;
                    default:
                        wwi.j output3 = (wwi.j) obj2;
                        Intrinsics.checkNotNullParameter(output3, "output");
                        if (!(output3 instanceof i)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f240484b.E2(new AirportLoungeSearchFlowContract$Step.AirportDetails(((i) output3).f300679a), true, null, false);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function13, "<set-?>");
        airportLoungeDetailsScreen.H = function13;
        return airportLoungeDetailsScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
