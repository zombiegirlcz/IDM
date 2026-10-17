package cvi;

import a83.p0;
import com.revolut.data.model.Data;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.ExpiringCardsBottomSheetScreen;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ActiveCreditFacilityRetention;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferences;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferencesSelection;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.IncompleteApplicationRetention;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.preferences.LegacyConsentPreferencesScreen;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsController;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.SchemeInsuranceDetailsScreen;
import com.revolut.feature.licenses.impl.ui.licenses.LicensesController;
import com.revolut.feature.licenses.impl.ui.licenses.model.LicenseItem;
import com.revolut.feature.paynow.impl.screens.qr.PayNowQrScreen;
import com.revolut.feature.referrals.shared.ui.impl.ui.reward_details.RewardDetailsScreen;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$ModalStep;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.ManagedPortfolioSelectTemplateScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.discovery.TravelExperiencesDestinationDiscoveryScreen;
import com.revolut.feature.travel.flights.models.domain.booking.BookingStatus;
import com.revolut.kompot.common.ModalDestination;
import cul.w0;
import czc.b0;
import czc.c0;
import d2g.v;
import d2g.y;
import d67.p;
import d74.m;
import d7d.n;
import d8f.o;
import d8f.w;
import ip0.t5;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mx0.pc;
import nii.l1;
import nii.n1;
import rp0.z;
import skm.e0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f109476w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109476w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j((k) this.f109476w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j((cw6.l) this.f109476w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j((SchemeInsuranceDetailsScreen) this.f109476w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            case 3:
                j jVar4 = new j((com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.a) this.f109476w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
            case 4:
                j jVar5 = new j((com.revolut.retail.feature.impl.userauth.flow.f) this.f109476w, continuation, 4);
                jVar5.v = obj2;
                return jVar5;
            case 5:
                j jVar6 = new j((co7.a) this.f109476w, continuation, 5);
                jVar6.v = obj2;
                return jVar6;
            case 6:
                return new j((ty0.a) this.v, (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) this.f109476w, continuation);
            case 7:
                j jVar7 = new j((com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) this.f109476w, continuation, 7);
                jVar7.v = obj2;
                return jVar7;
            case 8:
                j jVar8 = new j((CryptoCollectionDetailsController) this.f109476w, continuation, 8);
                jVar8.v = obj2;
                return jVar8;
            case 9:
                j jVar9 = new j((cyc.h) this.f109476w, continuation, 9);
                jVar9.v = obj2;
                return jVar9;
            case 10:
                j jVar10 = new j((RewardDetailsScreen) this.f109476w, continuation, 10);
                jVar10.v = obj2;
                return jVar10;
            case 11:
                j jVar11 = new j((c0) this.f109476w, continuation, 11);
                jVar11.v = obj2;
                return jVar11;
            case 12:
                j jVar12 = new j((LicensesController) this.f109476w, continuation, 12);
                jVar12.v = obj2;
                return jVar12;
            case 13:
                j jVar13 = new j((d19.f) this.f109476w, continuation, 13);
                jVar13.v = obj2;
                return jVar13;
            case 14:
                j jVar14 = new j((TravelExperiencesDestinationDiscoveryScreen) this.f109476w, continuation, 14);
                jVar14.v = obj2;
                return jVar14;
            case 15:
                j jVar15 = new j((y) this.f109476w, continuation, 15);
                jVar15.v = obj2;
                return jVar15;
            case 16:
                j jVar16 = new j((com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.a) this.f109476w, continuation, 16);
                jVar16.v = obj2;
                return jVar16;
            case 17:
                j jVar17 = new j((d5g.f) this.f109476w, continuation, 17);
                jVar17.v = obj2;
                return jVar17;
            case 18:
                j jVar18 = new j((FullScreenPromptScreen) this.f109476w, continuation, 18);
                jVar18.v = obj2;
                return jVar18;
            case 19:
                j jVar19 = new j((PromptMarketingScreen) this.f109476w, continuation, 19);
                jVar19.v = obj2;
                return jVar19;
            case 20:
                j jVar20 = new j((com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a) this.f109476w, continuation, 20);
                jVar20.v = obj2;
                return jVar20;
            case 21:
                j jVar21 = new j((d6l.h) this.f109476w, continuation, 21);
                jVar21.v = obj2;
                return jVar21;
            case 22:
                j jVar22 = new j((LegacyConsentPreferencesScreen) this.f109476w, continuation, 22);
                jVar22.v = obj2;
                return jVar22;
            case 23:
                j jVar23 = new j((m) this.f109476w, continuation, 23);
                jVar23.v = obj2;
                return jVar23;
            case 24:
                j jVar24 = new j((PayNowQrScreen) this.f109476w, continuation, 24);
                jVar24.v = obj2;
                return jVar24;
            case 25:
                j jVar25 = new j((n) this.f109476w, continuation, 25);
                jVar25.v = obj2;
                return jVar25;
            case 26:
                j jVar26 = new j((com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.a) this.f109476w, continuation, 26);
                jVar26.v = obj2;
                return jVar26;
            case 27:
                j jVar27 = new j((ExpiringCardsBottomSheetScreen) this.f109476w, continuation, 27);
                jVar27.v = obj2;
                return jVar27;
            case 28:
                j jVar28 = new j((ManagedPortfolioSelectTemplateScreen) this.f109476w, continuation, 28);
                jVar28.v = obj2;
                return jVar28;
            default:
                j jVar29 = new j((com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b) this.f109476w, continuation, 29);
                jVar29.v = obj2;
                return jVar29;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((j) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((j) create((pc) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((j) create((BookingStatus) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((j) create((d6l.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((j) create((ConsentRetention) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((j) create((t5) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((j) create((d83.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EditPreferencesConfiguration application;
        o oVar;
        int i = this.u;
        int i2 = 27;
        int i3 = 8;
        int i5 = 4;
        int i6 = 1;
        int i21 = 0;
        int i22 = 2;
        int i32 = 3;
        Continuation continuation = null;
        Object obj3 = this.f109476w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVar = (k) obj3;
                kVar.H2(kVar.f109480s, new p0((Data) pair.f186385a, (Data) pair.f186386b, 10));
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cw6.l lVar = (cw6.l) obj3;
                lVar.H2(lVar.f109555t, new w0(data, 26));
                return Unit.f186387a;
            case 2:
                z zVar = (z) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cw7.g gVarE3 = ((SchemeInsuranceDetailsScreen) obj3).d();
                String id10 = zVar.f256227a;
                com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.a aVar4 = (com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.a) gVarE3;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                j60.a.v(aVar4.f76149q, false, null, 3);
                aVar4.J2(id10);
                return Unit.f186387a;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.a aVar6 = (com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.a) obj3;
                aVar6.H2(aVar6.f76150r, new w0(data2, i2));
                return Unit.f186387a;
            case 4:
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.impl.userauth.flow.f fVar = (com.revolut.retail.feature.impl.userauth.flow.f) obj3;
                e0.C(coroutineScope, null, null, new cwj.j(fVar, continuation, i22), 3);
                e0.C(coroutineScope, null, null, new cwj.j(fVar, continuation, i32), 3);
                return e0.C(coroutineScope, null, null, new cwj.j(fVar, continuation, i5), 3);
            case 5:
                n1 n1Var = (n1) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    ((co7.a) obj3).invoke();
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ty0.a aVar10 = (ty0.a) this.v;
                if (Intrinsics.f(aVar10.f275445a, "FOOTER_PRE_KYC_LEARN_MORE_ID")) {
                    com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) obj3;
                    cVar.f90745q.getClass();
                    oki.h.v2(cVar.z, new CheckoutScreenContract$ModalStep.ShowDialog(CheckoutBottomSheetInput.PreKycLearnMore.f90741a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Footer clause click is invalid for id ", aVar10.f275445a));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 7:
                Data data3 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Throwable error = data3.getError();
                if (error != null) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error, h0Var2);
                }
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar2 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) obj3;
                cVar2.H2(cVar2.f90751y, new w0(data3, 28));
                cVar2.B.setValue(data3);
                return Unit.f186387a;
            case 8:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cy5.d dVar = (cy5.d) ((CryptoCollectionDetailsController) obj3).L.getValue();
                Intrinsics.h(clickData);
                cy5.i iVar = (cy5.i) dVar;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) iVar.f110058s).d(clickData);
                if (cryptoFcaRisksDestinationD != null) {
                    iVar.C1(cryptoFcaRisksDestinationD);
                }
                return Unit.f186387a;
            case 9:
                Data data4 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cyc.h hVar = (cyc.h) obj3;
                hVar.H2(hVar.f110085r, new w0(data4, 29));
                return Unit.f186387a;
            case 10:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cza.g gVar = (cza.g) ((RewardDetailsScreen) obj3).N.getValue();
                Intrinsics.h(clickData2);
                gVar.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                gVar.n2(new cn0.d(gVar, clickData2, continuation, i2), new whi.b(6));
                return Unit.f186387a;
            case 11:
                Data data5 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0 c0Var = (c0) obj3;
                c0Var.H2(c0Var.f110188q, new b0(data5, i21));
                return Unit.f186387a;
            case 12:
                pc pcVar = (pc) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj4 = pcVar.f209945c;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.licenses.impl.ui.licenses.model.LicenseItem");
                ((d19.f) ((d19.d) ((LicensesController) obj3).Q.getValue())).I2((LicenseItem) obj4);
                return Unit.f186387a;
            case 13:
                Data data6 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d19.f fVar2 = (d19.f) obj3;
                fVar2.H2(fVar2.f110613q, new b0(data6, i6));
                return Unit.f186387a;
            case 14:
                String menuId = (String) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVarE3 = ((TravelExperiencesDestinationDiscoveryScreen) obj3).d();
                Intrinsics.h(menuId);
                y yVar = (y) vVarE3;
                yVar.getClass();
                Intrinsics.checkNotNullParameter(menuId, "menuId");
                ((lzb.a) yVar.f110828q).b3(menuId, m1c.e0.EXPERIENCES);
                return Unit.f186387a;
            case 15:
                Data data7 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar2 = (y) obj3;
                yVar2.H2(yVar2.f110830s, new b0(data7, 5));
                return Unit.f186387a;
            case 16:
                Data data8 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.a aVar21 = (com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.a) obj3;
                aVar21.H2(aVar21.f84238r, new b0(data8, 7));
                return Unit.f186387a;
            case 17:
                BookingStatus bookingStatus = (BookingStatus) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d5g.f fVar3 = (d5g.f) obj3;
                fVar3.H2(fVar3.f111417q, new d3i.k(fVar3, bookingStatus, i3));
                return Unit.f186387a;
            case 18:
                ty0.a clickData3 = (ty0.a) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.full_screen_prompt.d dVarD3 = ((FullScreenPromptScreen) obj3).R2();
                Intrinsics.h(clickData3);
                com.revolut.feature.full_screen_prompt.e eVar = (com.revolut.feature.full_screen_prompt.e) dVarD3;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(clickData3, "clickData");
                eVar.C2(new d67.h(clickData3));
                return Unit.f186387a;
            case 19:
                ty0.a clickData4 = (ty0.a) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d67.v vVarD3 = ((PromptMarketingScreen) obj3).R2();
                Intrinsics.h(clickData4);
                vVarD3.getClass();
                Intrinsics.checkNotNullParameter(clickData4, "clickData");
                vVarD3.C2(new p(clickData4));
                return Unit.f186387a;
            case 20:
                com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a aVar25 = (com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a) obj3;
                Data data9 = (Data) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.checkNotNullParameter(data9, "<this>");
                if (v04.b.h(data9.getError())) {
                    aVar25.f93346p.Z2(new co7.a(aVar25, 24));
                }
                aVar25.H2(aVar25.f93348r, new b0(data9, i3));
                return Unit.f186387a;
            case 21:
                d6l.d dVar2 = (d6l.d) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar3 = ((d6l.h) obj3).e;
                String strC = d6l.h.c(dVar2);
                d6l.h.Companion.getClass();
                Type type = d6l.h.f111635m;
                Intrinsics.checkNotNullExpressionValue(type, "<get-CARD_REQUEST_TYPE>(...)");
                List list = (List) cVar3.T2(strC, type);
                if (list != null) {
                    return g4i.a.E(list);
                }
                return null;
            case 22:
                ConsentRetention retention = (ConsentRetention) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar = (m) ((LegacyConsentPreferencesScreen) obj3).d();
                mVar.getClass();
                Intrinsics.checkNotNullParameter(retention, "retention");
                ConsentPreferences consentPreferences = (ConsentPreferences) ((d74.f) ((j2) mVar.f111822r.f22677a).getValue()).f111811a.getContent();
                if (consentPreferences != null) {
                    if (retention instanceof ConsentRetention.ActiveFacility) {
                        ActiveCreditFacilityRetention activeCreditFacilityRetention = consentPreferences.f66434a;
                        application = new EditPreferencesConfiguration.ActiveFacility((ConsentRetention.ActiveFacility) retention, activeCreditFacilityRetention.f66432b, activeCreditFacilityRetention.f66433c, activeCreditFacilityRetention.d);
                    } else {
                        if (!(retention instanceof ConsentRetention.Application)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ConsentRetention.Application application2 = (ConsentRetention.Application) retention;
                        IncompleteApplicationRetention incompleteApplicationRetention = consentPreferences.f66435b;
                        application = new EditPreferencesConfiguration.Application(application2, incompleteApplicationRetention.f66443b, incompleteApplicationRetention.f66444c, incompleteApplicationRetention.d, incompleteApplicationRetention.e);
                    }
                    ConsentPreferencesSelection consentPreferencesSelectionI2 = mVar.I2();
                    if (consentPreferencesSelectionI2 != null) {
                        mVar.C2(new d74.i(consentPreferences, consentPreferencesSelectionI2, application));
                    }
                }
                return Unit.f186387a;
            case 23:
                Data data10 = (Data) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar2 = (m) obj3;
                mVar2.H2(mVar2.f111822r, new b0(data10, 16));
                return Unit.f186387a;
            case 24:
                t5 t5Var = (t5) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d7a.g gVarE32 = ((PayNowQrScreen) obj3).d();
                Intrinsics.h(t5Var);
                ((com.revolut.feature.paynow.impl.screens.qr.a) gVarE32).K2(new d7a.k(t5Var));
                return Unit.f186387a;
            case 25:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar = (n) obj3;
                nVar.f111932s = e0.C(coroutineScope2, null, null, new d7d.k(nVar, continuation, i21), 3);
                return Unit.f186387a;
            case 26:
                Data data11 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.a aVar33 = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.a) obj3;
                aVar33.H2(aVar33.u, new b0(data11, 17));
                return Unit.f186387a;
            case 27:
                d83.d dVar3 = (d83.d) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((d83.j) ((ExpiringCardsBottomSheetScreen) obj3).T.getValue()).I2(dVar3);
                return Unit.f186387a;
            case 28:
                String templateId = (String) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d8f.n nVarE3 = ((ManagedPortfolioSelectTemplateScreen) obj3).d();
                Intrinsics.h(templateId);
                com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b bVar = (com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b) nVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(templateId, "templateId");
                cli.y yVar3 = bVar.v;
                if (((d8f.i) ((j2) yVar3.f22677a).getValue()).f112247c == o.MULTIPLE_TABS) {
                    bVar.H2(yVar3, new d7a.p(templateId, i22));
                }
                return Unit.f186387a;
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d8f.h selectionMode = (d8f.h) pair2.f186385a;
                ilc.a roboContext = (ilc.a) pair2.f186386b;
                com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b bVar2 = (com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b) obj3;
                bVar2.f91452s.getClass();
                Intrinsics.checkNotNullParameter(roboContext, "roboContext");
                Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
                int i33 = w.f112262a[roboContext.ordinal()];
                if (i33 == 1 || i33 == 2) {
                    oVar = o.MULTIPLE_TABS;
                } else {
                    if (i33 != 3 && i33 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (selectionMode instanceof d8f.e) {
                        oVar = o.MULTIPLE_TABS;
                    } else {
                        if (!(selectionMode instanceof d8f.f) && !(selectionMode instanceof d8f.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oVar = o.SINGLE_TAB;
                    }
                }
                bVar2.H2(bVar2.v, new a5b.b(bVar2, oVar, selectionMode, roboContext, 25));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ty0.a aVar, com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = 6;
        this.v = aVar;
        this.f109476w = cVar;
    }
}
