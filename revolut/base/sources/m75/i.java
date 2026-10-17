package m75;

import android.net.Uri;
import b4c.t;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.EditCatalogueProductEntryScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.EditCatalogueProductEntryScreenContract$ModalStep;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.schedule.RecurringDonationScheduleScreen;
import com.revolut.feature.global_markets.impl.ui.redesign.flow.GlobalMarketsRedesignFlow;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.screens.root.SecretAccountsRootScreen;
import com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams;
import com.revolut.feature.junior_consent.impl.ui.screen.JuniorConsentRequestPromptScreen;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureDetails;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.PixQrCodeAdditionalInformationScreen;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.partysizepicker.PartySizePickerScreen;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.payroll_manager_input.PayrollManagerInputController;
import com.revolut.feature.staking.api.model.StakingModes;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.pastcancelled.TravelHotelsBookingsPastAndCancelledScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreenContract$ModalStep;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreen;
import com.revolut.retail.feature.pod_nominees.impl.edit.a;
import com.revolut.shared.feature.wealth.statements.impl.costchargesreport.CostChargesController;
import e60.l;
import ep6.n;
import ip0.c10;
import ip0.wd;
import ip0.y;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import m2f.b0;
import m7i.m;
import m8c.q;
import m98.p;
import maa.s;
import mfl.o;
import mg7.u;
import mh4.x;
import mic.g0;
import vkm.j2;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f203325w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f203325w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i((j) this.f203325w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i((kpj.f) this.f203325w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            case 2:
                i iVar3 = new i((GlobalMarketsRedesignFlow) this.f203325w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
            case 3:
                i iVar4 = new i((q) this.f203325w, continuation, 3);
                iVar4.v = obj2;
                return iVar4;
            case 4:
                i iVar5 = new i((p) this.f203325w, continuation, 4);
                iVar5.v = obj2;
                return iVar5;
            case 5:
                i iVar6 = new i((n) this.f203325w, continuation, 5);
                iVar6.v = obj2;
                return iVar6;
            case 6:
                i iVar7 = new i((CryptoHoldingScreen) this.f203325w, continuation, 6);
                iVar7.v = obj2;
                return iVar7;
            case 7:
                i iVar8 = new i((s) this.f203325w, continuation, 7);
                iVar8.v = obj2;
                return iVar8;
            case 8:
                i iVar9 = new i((com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a) this.f203325w, continuation, 8);
                iVar9.v = obj2;
                return iVar9;
            case 9:
                i iVar10 = new i((SecretAccountsRootScreen) this.f203325w, continuation, 9);
                iVar10.v = obj2;
                return iVar10;
            case 10:
                i iVar11 = new i((PixQrCodeAdditionalInformationScreen) this.f203325w, continuation, 10);
                iVar11.v = obj2;
                return iVar11;
            case 11:
                i iVar12 = new i((TravelHotelsBookingsPastAndCancelledScreen) this.f203325w, continuation, 11);
                iVar12.v = obj2;
                return iVar12;
            case 12:
                i iVar13 = new i((mbg.f) this.f203325w, continuation, 12);
                iVar13.v = obj2;
                return iVar13;
            case 13:
                i iVar14 = new i((RecurringDonationScheduleScreen) this.f203325w, continuation, 13);
                iVar14.v = obj2;
                return iVar14;
            case 14:
                i iVar15 = new i((mc6.k) this.f203325w, continuation, 14);
                iVar15.v = obj2;
                return iVar15;
            case 15:
                return new i((com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b) this.v, (ESignatureDetails) this.f203325w, continuation, 15);
            case 16:
                i iVar16 = new i((md8.q) this.f203325w, continuation, 16);
                iVar16.v = obj2;
                return iVar16;
            case 17:
                i iVar17 = new i((JuniorConsentRequestPromptScreen) this.f203325w, continuation, 17);
                iVar17.v = obj2;
                return iVar17;
            case 18:
                i iVar18 = new i((EditCatalogueProductEntryScreen) this.f203325w, continuation, 18);
                iVar18.v = obj2;
                return iVar18;
            case 19:
                i iVar19 = new i((PartySizePickerScreen) this.f203325w, continuation, 19);
                iVar19.v = obj2;
                return iVar19;
            case 20:
                i iVar20 = new i((PodNomineeEditScreen) this.f203325w, continuation, 20);
                iVar20.v = obj2;
                return iVar20;
            case 21:
                i iVar21 = new i((CostChargesController) this.f203325w, continuation, 21);
                iVar21.v = obj2;
                return iVar21;
            case 22:
                i iVar22 = new i((o) this.f203325w, continuation, 22);
                iVar22.v = obj2;
                return iVar22;
            case 23:
                i iVar23 = new i((mg2.p) this.f203325w, continuation, 23);
                iVar23.v = obj2;
                return iVar23;
            case 24:
                return new i((u) this.v, (IncentiveRewardDetailsParams) this.f203325w, continuation, 24);
            case 25:
                return new i((mh7.c) this.v, (String) this.f203325w, continuation, 25);
            case 26:
                i iVar24 = new i((PayrollManagerInputController) this.f203325w, continuation, 26);
                iVar24.v = obj2;
                return iVar24;
            case 27:
                i iVar25 = new i((mhh.c) this.f203325w, continuation, 27);
                iVar25.v = obj2;
                return iVar25;
            case 28:
                i iVar26 = new i((g0) this.f203325w, continuation, 28);
                iVar26.v = obj2;
                return iVar26;
            default:
                i iVar27 = new i((com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.a) this.f203325w, continuation, 29);
                iVar27.v = obj2;
                return iVar27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r2v1, types: [h7i.k[], java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        StakingModes.Auto auto;
        List list;
        int i = this.u;
        int i2 = 7;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i3 = 2;
        int i5 = 25;
        int i6 = 14;
        int i21 = 6;
        int i22 = 0;
        int i32 = 1;
        com.bumptech.glide.load.data.i iVar = null;
        Object obj3 = this.f203325w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVar = (j) obj3;
                jVar.H2(jVar.f203328r, new m58.l(data, i2));
                return Unit.f186387a;
            case 1:
                m7i.i input = (m7i.i) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj4 = ((kpj.f) obj3).f188258b;
                Intrinsics.checkNotNullParameter(input, "input");
                h7i.p pVar = input.f203413h;
                h7i.e eVar = pVar instanceof h7i.l ? new h7i.e(((h7i.l) pVar).f149894a) : null;
                h7i.k kVarA = m7i.k.a(input);
                Intrinsics.checkNotNullParameter(input, "input");
                h7i.p pVar2 = input.f203413h;
                ?? elements = {eVar, kVarA, pVar2 instanceof h7i.n ? new h7i.f(((h7i.n) pVar2).f149896a) : 0, m.a(input), m7i.d.a(input), m7i.e.a(input), m7i.g.a(input)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            case 2:
                String tabId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m87.b bVar = (m87.b) ((GlobalMarketsRedesignFlow) obj3).O.getValue();
                Intrinsics.h(tabId);
                com.revolut.feature.global_markets.impl.ui.redesign.flow.a aVar4 = (com.revolut.feature.global_markets.impl.ui.redesign.flow.a) bVar;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                aVar4.H2(aVar4.o, new lu6.p(tabId, i6));
                return Unit.f186387a;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q) obj3).x2(new m58.l(data2, 8));
                return Unit.f186387a;
            case 4:
                vf0.h hVar = (vf0.h) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((p) obj3).x2(new t((Data) hVar.f288433a, (Data) hVar.f288434b, (Data) hVar.f288435c, (Data) hVar.d, 4));
                return Unit.f186387a;
            case 5:
                y yVar = (y) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(yVar);
                ((n) obj3).v1(yVar);
                return Unit.f186387a;
            case 6:
                String listId = (String) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m9j.k kVarE3 = ((CryptoHoldingScreen) obj3).d();
                Intrinsics.h(listId);
                com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a aVar9 = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a) kVarE3;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                StakingProduct stakingProduct = ((m9j.h) ((j2) aVar9.C.f22677a).getValue()).f203802b;
                if (listId.equals("INFO_MENU_ITEM_LIST_ID") && stakingProduct != null && (auto = stakingProduct.f88088c.f88072b) != null) {
                    oki.h.v2(aVar9.D, new CryptoHoldingScreenContract$ModalStep.StakeRisksDisclaimerDialog(auto), bottom_dialog);
                }
                return Unit.f186387a;
            case 7:
                Data data3 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                maa.i iVar2 = (maa.i) data3.getContent();
                if (iVar2 != null && (list = iVar2.f203976a) != null) {
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        if (pyd.c.F((f5j.a) it8.next())) {
                            ref$IntRef.f186408a++;
                        } else {
                            ref$IntRef2.f186408a++;
                        }
                    }
                }
                s sVar = (s) obj3;
                sVar.H2(sVar.f203994t, new li8.n(data3, 23, ref$IntRef, ref$IntRef2));
                return Unit.f186387a;
            case 8:
                e60.l lVar = (e60.l) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (lVar instanceof e60.m) {
                    com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a aVar12 = (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.flow.a) obj3;
                    aVar12.l2(new b0(aVar12, ((e60.m) lVar).b(), , i6), new yi5.b(26));
                } else if (lVar instanceof e60.j) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "AddEvidenceFlowModel", "File selection failed: " + ((e60.j) lVar).f122857a, null, h0Var);
                } else {
                    if (!(lVar instanceof e60.k) && !(lVar instanceof l.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.INFO, "AddEvidenceFlowModel", lVar + " is not supported.", null, null, 16);
                }
                return Unit.f186387a;
            case 9:
                String id10 = (String) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mb7.i iVar3 = (mb7.i) ((SecretAccountsRootScreen) obj3).M.getValue();
                Intrinsics.h(id10);
                mb7.k kVar = (mb7.k) iVar3;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("INFO_MENU_ITEM_ID")) {
                    kVar.C2(mb7.f.f204175a);
                } else if (id10.equals("HIDE_ACCOUNT_MENU_ITEM_ID")) {
                    kVar.C2(mb7.e.f204174a);
                } else {
                    hx7.e.h(new IllegalArgumentException("Unknown menuItemId ".concat(id10)));
                }
                return Unit.f186387a;
            case 10:
                String text = (String) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mba.i iVar4 = (mba.i) ((PixQrCodeAdditionalInformationScreen) obj3).N.getValue();
                iVar4.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                iVar4.o.a(null, text, false);
                if (!c70.a.g()) {
                    iVar4.X1(new mii.k("SHOT_DIALOG_ID", new TextLocalisedClause(R$string.pix_qr_request_tooltip_copy, null, null, 14), null, null, null, 28));
                }
                return Unit.f186387a;
            case 11:
                u8 u8Var = (u8) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj5 = u8Var.f54816p;
                hxf.a travelBooking = obj5 instanceof hxf.a ? (hxf.a) obj5 : null;
                if (travelBooking != null) {
                    mbg.f fVar = (mbg.f) ((TravelHotelsBookingsPastAndCancelledScreen) obj3).Z.getValue();
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(travelBooking, "travelBooking");
                    fVar.v2(new mbg.c(travelBooking.f156582a));
                }
                return Unit.f186387a;
            case 12:
                List list2 = (List) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((mbg.f) obj3).x2(new lsl.d(list2, i21));
                return Unit.f186387a;
            case 13:
                wd data4 = (wd) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mc6.h hVarH3 = ((RecurringDonationScheduleScreen) obj3).T2();
                Intrinsics.h(data4);
                mc6.k kVar2 = (mc6.k) hVarH3;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(data4, "data");
                kVar2.f204289w = data4.f166989c;
                return Unit.f186387a;
            case 14:
                Data data5 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((mc6.k) obj3).x2(new m58.l(data5, i5));
                return Unit.f186387a;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b bVar2 = (com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b) this.v;
                bVar2.s1();
                bVar2.C2(new mc9.g((ESignatureDetails) obj3));
                return Unit.f186387a;
            case 16:
                Data data6 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                md8.q qVar = (md8.q) obj3;
                qVar.H2(qVar.f204521x, new m58.l(data6, 28));
                return Unit.f186387a;
            case 17:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                md8.e eVarD3 = ((JuniorConsentRequestPromptScreen) obj3).d();
                Intrinsics.h(clickData);
                md8.q qVar2 = (md8.q) eVarD3;
                qVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "LINK_CLICK_ID")) {
                    qVar2.n2(new b0(qVar2, new md8.h(qVar2, null), (Continuation) null), new whi.b(i21));
                }
                return Unit.f186387a;
            case 18:
                String itemId = (String) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                me1.e eVarE3 = ((EditCatalogueProductEntryScreen) obj3).e3();
                Intrinsics.h(itemId);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a aVar23 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a) eVarE3;
                aVar23.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("DELETE_MENU_ITEM_ID")) {
                    oki.h.v2(aVar23.f60799s, EditCatalogueProductEntryScreenContract$ModalStep.DeleteConfirmation.f60795a, bottom_dialog);
                }
                return Unit.f186387a;
            case 19:
                Pair pair = (Pair) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int iIntValue = ((Number) pair.f186386b).intValue();
                meb.g gVar = (meb.g) ((PartySizePickerScreen) obj3).Q.getValue();
                Object obj6 = ((c10) gVar.o.get(iIntValue)).f163673b;
                Intrinsics.i(obj6, "null cannot be cast to non-null type kotlin.Int");
                gVar.H2(gVar.f204648p, new meb.f(((Integer) obj6).intValue(), iIntValue, i22));
                return Unit.f186387a;
            case 20:
                String id11 = (String) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mek.j jVarE3 = ((PodNomineeEditScreen) obj3).R2();
                Intrinsics.h(id11);
                com.revolut.retail.feature.pod_nominees.impl.edit.c cVar = (com.revolut.retail.feature.pod_nominees.impl.edit.c) jVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                if (Intrinsics.f(id11, "NOT_NOW_MENU_ID")) {
                    cVar.C2(a.C0629a.f102595a);
                }
                return Unit.f186387a;
            case 21:
                wbl.j jVar2 = (wbl.j) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) ((CostChargesController) obj3).O.getValue();
                Intrinsics.h(jVar2);
                oVar.accept(new mfl.e(jVar2));
                return Unit.f186387a;
            case 22:
                mfl.g gVar2 = (mfl.g) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar2 = (o) obj3;
                oVar2.H2(oVar2.f205036r, new m98.k(gVar2, 19));
                return Unit.f186387a;
            case 23:
                Data data7 = (Data) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mg2.p pVar3 = (mg2.p) obj3;
                pVar3.H2(pVar3.v, new me7.h(data7, i3));
                return Unit.f186387a;
            case 24:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u) this.v).C2(new mg7.l((IncentiveRewardDetailsParams) obj3));
                return Unit.f186387a;
            case 25:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mh7.c cVar2 = (mh7.c) this.v;
                kpj.f fVar2 = cVar2.f205422b;
                ue0.c cVar3 = cVar2.f205421a;
                String rawData = (String) obj3;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(rawData, "rawData");
                try {
                    String strDecode = URLDecoder.decode(rawData, StandardCharsets.UTF_8.name());
                    Uri uriF = ((f80.b) ((f80.a) fVar2.f188258b)).f("?" + strDecode);
                    Set<String> queryParameterNames = uriF.getQueryParameterNames();
                    Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
                    Set<String> set = queryParameterNames;
                    int iB = q0.b(w.t(set, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (Object obj7 : set) {
                        String queryParameter = uriF.getQueryParameter((String) obj7);
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                        linkedHashMap.put(obj7, queryParameter);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (((String) entry.getValue()).length() > 0) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    iVar = new com.bumptech.glide.load.data.i((Map) linkedHashMap2);
                } catch (Exception e) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
                }
                if (iVar == null) {
                    iVar = new com.bumptech.glide.load.data.i(r0.g());
                }
                for (Map.Entry entry2 : iVar.f26112a.entrySet()) {
                    z9h.n.l(String.class, cVar3, (String) entry2.getKey(), (String) entry2.getValue());
                }
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, cVar3, "install_data_provided", Boolean.TRUE);
                return Unit.f186387a;
            case 26:
                ty0.a aVar31 = (ty0.a) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mhb.b bVarE3 = ((PayrollManagerInputController) obj3).d();
                String id12 = aVar31.f275445a;
                mhb.h hVar2 = (mhb.h) bVarE3;
                cli.y yVar2 = hVar2.o;
                Intrinsics.checkNotNullParameter(id12, "id");
                if (Intrinsics.f(id12, "LIST_ID_ADD_CONTACT") && ((mhb.a) ((j2) yVar2.f22677a).getValue()).f205470a.size() < 3) {
                    hVar2.H2(yVar2, new x(i32));
                }
                return Unit.f186387a;
            case 27:
                Data data8 = (Data) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mhh.c cVar4 = (mhh.c) obj3;
                cVar4.d3(new ma2.s(cVar4, data8, 18));
                return Unit.f186387a;
            case 28:
                Data data9 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mic.k kVar3 = (mic.k) data9.getContent();
                if (kVar3 != null) {
                    g0 g0Var = (g0) obj3;
                    g0Var.H2(g0Var.f205665x, new m98.k(kVar3, i5));
                }
                return Unit.f186387a;
            default:
                Data data10 = (Data) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.a aVar36 = (com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details.a) obj3;
                aVar36.H2(aVar36.f72569q, new me7.h(data10, 9));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f203325w = obj2;
    }
}
