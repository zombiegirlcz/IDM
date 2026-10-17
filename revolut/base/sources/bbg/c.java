package bbg;

import aw0.n6;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.ve;
import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.feature.travel.hotels.impl.model.checkout.RevolutCardWithBalanceCheck;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.model.PropertyPayment$Card;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payment_options.api.PaymentOptionsFeatureConfig;
import ip0.y7;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.r0;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsAmendmentConfirmationScreen f14273w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelHotelsAmendmentConfirmationScreen travelHotelsAmendmentConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f14273w = travelHotelsAmendmentConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f14273w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f14273w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(this.f14273w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c(this.f14273w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c(this.f14273w, continuation, 4);
                cVar5.v = obj2;
                return cVar5;
            case 5:
                c cVar6 = new c(this.f14273w, continuation, 5);
                cVar6.v = obj2;
                return cVar6;
            case 6:
                c cVar7 = new c(this.f14273w, continuation, 6);
                cVar7.v = obj2;
                return cVar7;
            default:
                c cVar8 = new c(this.f14273w, continuation, 7);
                cVar8.v = obj2;
                return cVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c) create((ve) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        cgi.k kVar;
        cgi.f fVar;
        boolean z;
        r0 r0Var;
        int i = this.u;
        TravelHotelsAmendmentConfirmationScreen travelHotelsAmendmentConfirmationScreen = this.f14273w;
        switch (i) {
            case 0:
                ve model = (ve) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE3 = travelHotelsAmendmentConfirmationScreen.R2();
                Intrinsics.h(model);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) rVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.f54872j;
                kVar = obj3 instanceof cgi.k ? (cgi.k) obj3 : null;
                if (kVar != null) {
                    cgi.o oVarB = kVar.b();
                    HotelsProperty hotelsProperty = (HotelsProperty) ((j) ((j2) aVar2.D.f22677a).getValue()).f14282a.getContent();
                    if (hotelsProperty != null) {
                        aVar2.C2(new l(oVarB.a().getE(), hotelsProperty.u));
                    }
                }
                return Unit.f186387a;
            case 1:
                sa model2 = (sa) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE32 = travelHotelsAmendmentConfirmationScreen.R2();
                Intrinsics.h(model2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar4 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) rVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                aVar4.f93833y.getClass();
                aVar4.C1(fcg.f.a());
                return Unit.f186387a;
            case 2:
                y7 model3 = (y7) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE33 = travelHotelsAmendmentConfirmationScreen.R2();
                Intrinsics.h(model3);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar6 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) rVarE33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                aVar6.M2();
                return Unit.f186387a;
            case 3:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE34 = travelHotelsAmendmentConfirmationScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar8 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) rVarE34;
                aVar8.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "VIEW_DETAILS_ITEM_ID")) {
                    aVar8.M2();
                }
                return Unit.f186387a;
            case 4:
                String menuItemId = (String) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE35 = travelHotelsAmendmentConfirmationScreen.R2();
                Intrinsics.h(menuItemId);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar10 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) rVarE35;
                aVar10.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                ((lzb.a) aVar10.A).b3(menuItemId, m1c.e0.STAYS);
                return Unit.f186387a;
            case 5:
                n6 buttonModel = (n6) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE36 = travelHotelsAmendmentConfirmationScreen.R2();
                Intrinsics.h(buttonModel);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar12 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) rVarE36;
                aVar12.getClass();
                com.revolut.kompot.navigable.vc.modal.a aVar13 = aVar12.E;
                Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
                cli.y yVar = aVar12.D;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                od0.i iVar = (od0.i) ((j) j2Var.getValue()).i.getContent();
                if (iVar == null || (r0Var = (r0) iVar.f224257a) == null || !qk.d.l(r0Var)) {
                    ecg.j jVar = (ecg.j) ((j) j2Var2.getValue()).d.getContent();
                    if (jVar == null) {
                        throw new IllegalStateException("Payment is clickable, but payment is not selected");
                    }
                    List list = (List) ((j) j2Var2.getValue()).f14284c.getContent();
                    if (list == null || (fVar = (cgi.f) zhm.d0.d0(list)) == null) {
                        throw new IllegalStateException("One bed must be selected");
                    }
                    ecg.e eVar = (ecg.e) ((j) j2Var2.getValue()).e.getContent();
                    if (eVar == null) {
                        throw new IllegalStateException("Payment is clickable, but no calculated price");
                    }
                    Continuation continuation = null;
                    if (jVar instanceof ecg.g) {
                        z = ((ecg.g) jVar).f124733b;
                        if (!z) {
                            Intrinsics.checkNotNullParameter(eVar, "<this>");
                            ecg.b bVar = eVar instanceof ecg.b ? (ecg.b) eVar : null;
                            if (bVar == null) {
                                throw new IllegalStateException("Card and Pocket require payment");
                            }
                            oki.h.v2(aVar13, new TravelHotelsAmendmentConfirmationScreenContract$ModalStep.RevPayPocketSelection(bVar.f124728a), ModalDestination.Style.POPUP.f98311a);
                        }
                    } else {
                        z = false;
                        if (jVar instanceof PropertyPayment$Card) {
                            RevolutCardWithBalanceCheck revolutCardWithBalanceCheck = ((PropertyPayment$Card) jVar).f93915a;
                            if (revolutCardWithBalanceCheck != null && revolutCardWithBalanceCheck.f93667b) {
                                z = true;
                            }
                            if (!z) {
                                Intrinsics.checkNotNullParameter(eVar, "<this>");
                                ecg.b bVar2 = eVar instanceof ecg.b ? (ecg.b) eVar : null;
                                if (bVar2 == null) {
                                    throw new IllegalStateException("Card and Pocket require payment");
                                }
                                aVar12.C1(new BridgeDestination(new FeatureCommand(new PaymentOptionsFeatureConfig.PaymentOptions(bVar2.f124728a))));
                            }
                        } else if ((jVar instanceof ecg.h) || (jVar instanceof ecg.f)) {
                            z = true;
                        } else if (!(jVar instanceof ecg.i)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (z) {
                        aVar12.l2(new b96.d(aVar12, jVar, fVar, continuation, 3), new ax9.d(1, aVar12, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 9));
                    }
                } else {
                    oki.h.v2(aVar13, new TravelHotelsAmendmentConfirmationScreenContract$ModalStep.TermsReview(new RevPointsTermsReviewInputData(((m1c.s) r0Var.f201448b).f201451a)), ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
                }
                return Unit.f186387a;
            case 6:
                ve model4 = (ve) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE37 = travelHotelsAmendmentConfirmationScreen.R2();
                Intrinsics.h(model4);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar15 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) rVarE37;
                aVar15.getClass();
                Intrinsics.checkNotNullParameter(model4, "model");
                Object obj4 = model4.f54872j;
                kVar = obj4 instanceof cgi.k ? (cgi.k) obj4 : null;
                if (kVar != null) {
                    aVar15.C2(new n(vc.o.H(kVar)));
                }
                return Unit.f186387a;
            default:
                ve model5 = (ve) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE38 = travelHotelsAmendmentConfirmationScreen.R2();
                Intrinsics.h(model5);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar17 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) rVarE38;
                aVar17.getClass();
                Intrinsics.checkNotNullParameter(model5, "model");
                Object obj5 = model5.f54872j;
                kVar = obj5 instanceof cgi.k ? (cgi.k) obj5 : null;
                if (kVar != null) {
                    oki.h.v2(aVar17.E, new TravelHotelsAmendmentConfirmationScreenContract$ModalStep.BedOptionsSelection(kVar.getF98091b(), kVar.b().c().b(), vc.o.H(kVar)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
        }
    }
}
