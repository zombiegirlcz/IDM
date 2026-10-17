package hba;

import cjk.b;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue_management.CatalogueManagementScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.topItem.OfferTopItemContentScreen;
import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.BrPaymentExpiryDateUpdateScreen;
import com.revolut.feature.insurance_embedded.api.navigation.InsuranceEmbeddedDestinations;
import com.revolut.feature.retail.salary_account.impl.work_email.input.WorkEmailInputController;
import com.revolut.feature.support.impl.transfer_tracker.ui.input_form.TransferTrackerInputFormScreen;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.partner_taxes_disclaimer.TravelHotelsPartnerTaxesDisclaimerScreen;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.bottom_sheet.time.date_picker.DatePickerBottomSheetController;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.address_list.ReturnCryptoDepositAddressListScreen;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a;
import com.revolut.retail.feature.esim.impl.ui.screens.country_picker.EsimCountryPickerScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.EsimMobilePlanInvoicesScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.checkout.FamilyPlanCheckoutScreen;
import dfj.o0;
import dfj.p0;
import dfj.q0;
import dfj.r0;
import dfj.s0;
import dfj.t0;
import dfj.u0;
import dfj.v0;
import dfj.w0;
import dfj.x0;
import djc.z;
import hcj.p;
import he1.g;
import he4.s;
import hea.e0;
import hg4.u;
import hi2.n;
import hib.q;
import ip0.vd;
import java.io.File;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f150633w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(hl9.d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 27;
        this.v = dVar;
        this.f150633w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k((l) this.f150633w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                k kVar2 = new k((hbh.b) this.f150633w, continuation, 1);
                kVar2.v = obj2;
                return kVar2;
            case 2:
                k kVar3 = new k((ReturnCryptoDepositAddressListScreen) this.f150633w, continuation, 2);
                kVar3.v = obj2;
                return kVar3;
            case 3:
                k kVar4 = new k((p) this.f150633w, continuation, 3);
                kVar4.v = obj2;
                return kVar4;
            case 4:
                k kVar5 = new k((TravelHotelsPartnerTaxesDisclaimerScreen) this.f150633w, continuation, 4);
                kVar5.v = obj2;
                return kVar5;
            case 5:
                k kVar6 = new k((hdg.d) this.f150633w, continuation, 5);
                kVar6.v = obj2;
                return kVar6;
            case 6:
                k kVar7 = new k((CatalogueManagementScreen) this.f150633w, continuation, 6);
                kVar7.v = obj2;
                return kVar7;
            case 7:
                k kVar8 = new k((he1.l) this.f150633w, continuation, 7);
                kVar8.v = obj2;
                return kVar8;
            case 8:
                k kVar9 = new k((s) this.f150633w, continuation, 8);
                kVar9.v = obj2;
                return kVar9;
            case 9:
                k kVar10 = new k((com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a) this.f150633w, continuation, 9);
                kVar10.v = obj2;
                return kVar10;
            case 10:
                k kVar11 = new k((TransferTrackerInputFormScreen) this.f150633w, continuation, 10);
                kVar11.v = obj2;
                return kVar11;
            case 11:
                k kVar12 = new k((com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b) this.f150633w, continuation, 11);
                kVar12.v = obj2;
                return kVar12;
            case 12:
                k kVar13 = new k((OfferTopItemContentScreen) this.f150633w, continuation, 12);
                kVar13.v = obj2;
                return kVar13;
            case 13:
                k kVar14 = new k((u) this.f150633w, continuation, 13);
                kVar14.v = obj2;
                return kVar14;
            case 14:
                k kVar15 = new k((com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b) this.f150633w, continuation, 14);
                kVar15.v = obj2;
                return kVar15;
            case 15:
                k kVar16 = new k((MandateDetailsScreen) this.f150633w, continuation, 15);
                kVar16.v = obj2;
                return kVar16;
            case 16:
                k kVar17 = new k((hh6.p) this.f150633w, continuation, 16);
                kVar17.v = obj2;
                return kVar17;
            case 17:
                k kVar18 = new k((EsimCountryPickerScreen) this.f150633w, continuation, 17);
                kVar18.v = obj2;
                return kVar18;
            case 18:
                k kVar19 = new k((n) this.f150633w, continuation, 18);
                kVar19.v = obj2;
                return kVar19;
            case 19:
                k kVar20 = new k((WorkEmailInputController) this.f150633w, continuation, 19);
                kVar20.v = obj2;
                return kVar20;
            case 20:
                k kVar21 = new k((DatePickerBottomSheetController) this.f150633w, continuation, 20);
                kVar21.v = obj2;
                return kVar21;
            case 21:
                k kVar22 = new k((hjh.b) this.f150633w, continuation, 21);
                kVar22.v = obj2;
                return kVar22;
            case 22:
                k kVar23 = new k((BrPaymentExpiryDateUpdateScreen) this.f150633w, continuation, 22);
                kVar23.v = obj2;
                return kVar23;
            case 23:
                k kVar24 = new k((hkb.d) this.f150633w, continuation, 23);
                kVar24.v = obj2;
                return kVar24;
            case 24:
                k kVar25 = new k((EsimMobilePlanInvoicesScreen) this.f150633w, continuation, 24);
                kVar25.v = obj2;
                return kVar25;
            case 25:
                k kVar26 = new k((hkj.f) this.f150633w, continuation, 25);
                kVar26.v = obj2;
                return kVar26;
            case 26:
                k kVar27 = new k((FamilyPlanCheckoutScreen) this.f150633w, continuation, 26);
                kVar27.v = obj2;
                return kVar27;
            case 27:
                return new k((hl9.d) this.v, (String) this.f150633w, continuation);
            case 28:
                k kVar28 = new k((com.revolut.sso.impl.ui.consent.qr.b) this.f150633w, continuation, 28);
                kVar28.v = obj2;
                return kVar28;
            default:
                k kVar29 = new k((ho8.j) this.f150633w, continuation, 29);
                kVar29.v = obj2;
                return kVar29;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((h1h.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((k) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((k) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((k) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((k) create((dx4.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((k) create((x0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((k) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((k) create((hi2.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((k) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((k) create((hjh.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((k) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((k) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((vf0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 29;
        int i3 = 8;
        int i5 = 1;
        int i6 = 6;
        int i21 = 7;
        int i22 = 26;
        Continuation continuation = null;
        Object obj3 = this.f150633w;
        switch (i) {
            case 0:
                rp0.p pVar = (rp0.p) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (pVar == rp0.p.USER) {
                    ((l) obj3).C2(d.DISMISS);
                }
                return Unit.f186387a;
            case 1:
                h1h.e eVar = (h1h.e) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (eVar == null) {
                    throw new NoWhenBranchMatchedException();
                }
                ((hbh.b) obj3).d.Z2(eVar);
                return Unit.f186387a;
            case 2:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hcj.l lVarE3 = ((ReturnCryptoDepositAddressListScreen) obj3).d();
                String id10 = aVar3.f275445a;
                p pVar2 = (p) lVarE3;
                pVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "NO_ADDRESSES_STATE") || Intrinsics.f(id10, "NO_COMPATIBLE_STATE")) {
                    pVar2.C2(hcj.g.f150906a);
                }
                return Unit.f186387a;
            case 3:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                p pVar3 = (p) obj3;
                pVar3.H2(pVar3.f150920r, new h1k.k(data, 27));
                return Unit.f186387a;
            case 4:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hdg.c cVar = (hdg.c) ((TravelHotelsPartnerTaxesDisclaimerScreen) obj3).T.getValue();
                Intrinsics.h(clickData);
                hdg.d dVar = (hdg.d) cVar;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "PROVIDER_TERMS_AND_CONDITIONS_ID")) {
                    Object obj4 = clickData.d;
                    String str = obj4 instanceof String ? (String) obj4 : null;
                    if (str != null) {
                        dVar.C1(new ExternalDestination.Browser(str, null));
                    }
                }
                return Unit.f186387a;
            case 5:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hdg.d dVar2 = (hdg.d) obj3;
                dVar2.H2(dVar2.f151431q, new z(i6, iVar));
                return Unit.f186387a;
            case 6:
                String listId = (String) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                he1.j jVarH3 = ((CatalogueManagementScreen) obj3).T2();
                Intrinsics.h(listId);
                he1.l lVar = (he1.l) jVarH3;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (!listId.equals("NAV_BAR_ADD_ITEM_LIST_ID")) {
                    throw new IllegalStateException("Unsupported menu item list id: ".concat(listId).toString());
                }
                lVar.v2(new g.b(null));
                return Unit.f186387a;
            case 7:
                Data data2 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((he1.l) obj3).x2(new h1k.k(data2, 28));
                return Unit.f186387a;
            case 8:
                Data data3 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                s sVar = (s) obj3;
                sVar.H2(sVar.f151592p, new h1k.k(data3, i2));
                return Unit.f186387a;
            case 9:
                n1 n1Var = (n1) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if ((n1Var instanceof j1) || (n1Var instanceof l1) || (n1Var instanceof m1)) {
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected type of result: ".concat(n1Var.getClass().getSimpleName()));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "handleSecondaryButtonClickResult", null, illegalStateException, h0Var);
                } else {
                    if (!(n1Var instanceof k1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(((com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a) obj3).f76881t);
                }
                return Unit.f186387a;
            case 10:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hee.o oVarE3 = ((TransferTrackerInputFormScreen) obj3).R2();
                String newAmount = charSequence.toString();
                com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b bVar = (com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b) oVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(newAmount, "newAmount");
                bVar.H2(bVar.v, new gqh.a(newAmount, 23));
                return Unit.f186387a;
            case 11:
                Data data4 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b bVar2 = (com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b) obj3;
                bVar2.H2(bVar2.v, new e0(data4, 2));
                return Unit.f186387a;
            case 12:
                dx4.l lVar2 = (dx4.l) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                c8g.c.i(((OfferTopItemContentScreen) obj3).R2(), lVar2);
                return Unit.f186387a;
            case 13:
                Data data5 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                u uVar = (u) obj3;
                uVar.H2(uVar.f152106r, new e0(data5, 3));
                return Unit.f186387a;
            case 14:
                x0 x0Var = (x0) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b bVar3 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.b) obj3;
                if ((bVar3.f100770t.d() instanceof EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.PortabilityInstruction) && !(x0Var instanceof q0) && !(x0Var instanceof r0) && !(x0Var instanceof s0) && !(x0Var instanceof t0) && !(x0Var instanceof u0) && !(x0Var instanceof o0) && !(x0Var instanceof v0)) {
                    if (Intrinsics.f(x0Var, p0.f114063a)) {
                        bVar3.C2(new a.C0612a(true));
                    } else {
                        if (!Intrinsics.f(x0Var, w0.f114140a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar3.M2();
                    }
                }
                return Unit.f186387a;
            case 15:
                ty0.a aVar17 = (ty0.a) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hh6.k kVarI3 = ((MandateDetailsScreen) obj3).i3();
                String url2 = aVar17.f275445a;
                hh6.p pVar4 = (hh6.p) kVarI3;
                pVar4.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                BridgeDestination bridgeDestinationA = pVar4.f152271s.a(url2);
                if (bridgeDestinationA != null) {
                    pVar4.C1(bridgeDestinationA);
                }
                return Unit.f186387a;
            case 16:
                Pair pair = (Pair) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((hh6.p) obj3).x2(new h8b.b((qe6.b) pair.f186386b, (bh6.e) pair.f186385a, 20));
                return Unit.f186387a;
            case 17:
                String text = (String) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hhj.e eVar2 = (hhj.e) ((EsimCountryPickerScreen) obj3).Y.getValue();
                Intrinsics.h(text);
                hhj.g gVar = (hhj.g) eVar2;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                gVar.x2(new gqh.a(text, i22));
                return Unit.f186387a;
            case 18:
                hi2.f fVar = (hi2.f) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                n nVar = (n) obj3;
                nVar.H2(nVar.f152469t, new hg4.a(fVar, i21));
                return Unit.f186387a;
            case 19:
                ty0.a aVar22 = (ty0.a) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hib.f fVarE3 = ((WorkEmailInputController) obj3).R2();
                String clickId = aVar22.f275445a;
                q qVar = (q) fVarE3;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(clickId, "clickId");
                if (Intrinsics.f(clickId, "PRIVACY_LINK_ID")) {
                    TermsScope.INSTANCE.getClass();
                    qVar.n2(new hg0.n(qVar, TermsScope.f90360a0, continuation, 5), new whi.b(i6));
                } else {
                    hx7.e.h(new IllegalStateException(j6.a.q("Unable to handle clause with identifier: ", clickId)));
                }
                return Unit.f186387a;
            case 20:
                vd vdVar = (vd) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hii.b bVar4 = ((DatePickerBottomSheetController) obj3).Q;
                LocalDate date = vdVar.f166807b;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                bVar4.C2(new hii.a(date));
                return Unit.f186387a;
            case 21:
                hjh.g gVar2 = (hjh.g) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f88.f fVar2 = ((hjh.b) obj3).d;
                WealthAccount account = gVar2.f152824a;
                Intrinsics.checkNotNullParameter(account, "account");
                fVar2.V2(new hg0.n(fVar2, account, continuation, i21), new yi5.b(i2));
                return Unit.f186387a;
            case 22:
                vd vdVar2 = (vd) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hk6.f fVarE32 = ((BrPaymentExpiryDateUpdateScreen) obj3).e3();
                LocalDate date2 = vdVar2.f166807b;
                com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.a aVar27 = (com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.screen.expiry_date_update.a) fVarE32;
                aVar27.getClass();
                Intrinsics.checkNotNullParameter(date2, "date");
                aVar27.H2(aVar27.f72716p, new a15.l(i3, date2));
                return Unit.f186387a;
            case 23:
                Data data6 = (Data) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hkb.d dVar3 = (hkb.d) obj3;
                dVar3.H2(dVar3.f152915t, new e0(data6, i21));
                return Unit.f186387a;
            case 24:
                String invoiceId = (String) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hkj.f fVar3 = (hkj.f) ((EsimMobilePlanInvoicesScreen) obj3).R.getValue();
                Intrinsics.h(invoiceId);
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
                fVar3.l2(new hg0.n(fVar3, invoiceId, continuation, 9), new yi5.b(i22));
                return Unit.f186387a;
            case 25:
                Data data7 = (Data) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hkj.f fVar4 = (hkj.f) obj3;
                fVar4.H2(fVar4.f152938t, new e0(data7, i3));
                return Unit.f186387a;
            case 26:
                ty0.a aVar31 = (ty0.a) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hkk.h hVarE3 = ((FamilyPlanCheckoutScreen) obj3).d();
                Object obj5 = aVar31.d;
                hkk.p pVar5 = (hkk.p) hVarE3;
                pVar5.getClass();
                if (obj5 instanceof String) {
                    pVar5.l2(new hkk.l(pVar5, (String) obj5, continuation, i5), new yi5.b(i22));
                } else if (obj5 instanceof b.AbstractC0155b) {
                    b.AbstractC0155b abstractC0155b = (b.AbstractC0155b) obj5;
                    int i32 = 11;
                    if (abstractC0155b.equals(b.AbstractC0155b.C0156b.f24699a)) {
                        TermsScope.INSTANCE.getClass();
                        pVar5.l2(new hg0.n(pVar5, TermsScope.Q, continuation, i32), new yi5.b(i22));
                    } else if (abstractC0155b.equals(b.AbstractC0155b.a.f24698a)) {
                        TermsScope.INSTANCE.getClass();
                        pVar5.l2(new hg0.n(pVar5, TermsScope.P, continuation, i32), new yi5.b(i22));
                    } else if (abstractC0155b.equals(b.AbstractC0155b.c.f24700a)) {
                        ggk.a aVar33 = (ggk.a) ((hkk.e) ((j2) pVar5.v.f22677a).getValue()).f152941a.getContent();
                        if (aVar33 != null) {
                            pVar5.l2(new hg0.n(pVar5, aVar33, continuation, 10), new yi5.b(i22));
                        }
                    } else {
                        if (!(abstractC0155b instanceof cjk.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pVar5.C1(new InsuranceEmbeddedDestinations.InsuranceDocumentsReview(((cjk.c) obj5).f24701a));
                    }
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hl9.d.Companion.getClass();
                List list = hl9.d.d;
                hl9.d dVar4 = (hl9.d) this.v;
                String str2 = (String) obj3;
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    File fileC = dVar4.c(str2, (String) it8.next());
                    if (fileC.exists()) {
                        return new ScannedBillDetails(fileC);
                    }
                }
                return null;
            case 28:
                com.revolut.sso.impl.ui.consent.qr.b bVar5 = (com.revolut.sso.impl.ui.consent.qr.b) obj3;
                n1 n1Var2 = (n1) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if ((n1Var2 instanceof j1) || (n1Var2 instanceof k1) || (n1Var2 instanceof m1)) {
                    oki.h.D2(bVar5.v);
                } else {
                    if (!(n1Var2 instanceof l1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((rqk.k) bVar5.f106479s).getClass();
                    bVar5.C1(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, null, 7), null, null, 6), false));
                }
                return Unit.f186387a;
            default:
                vf0.g gVar3 = (vf0.g) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ho8.j) obj3).x2(new aqd.f((Data) gVar3.f288429b, (Data) gVar3.e, (Data) gVar3.f288428a, (Data) gVar3.f288430c, (Data) gVar3.d, (Data) gVar3.f, (Data) gVar3.f288431g, (Data) gVar3.f288432h, 2));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f150633w = obj2;
    }
}
