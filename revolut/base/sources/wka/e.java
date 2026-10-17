package wka;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.pagopa.impl.ui.bill_input.PagoPABillInputScreen;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.home.InsuranceCarHomeScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.documents.DocumentsScreen;
import com.revolut.feature.payments.messaging.common.impl.reactions.EmojiBottomSheetController;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_review_prompt.StudentReviewPromptScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.interactor.WaitlistDomainException;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.WaitlistInvitationScreen;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import gim.i;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import rp0.a0;
import vkm.j2;
import wgb.v;
import wlh.k;
import wok.m;
import wol.t;
import wq1.j;
import wq1.q;
import wqj.j;
import wr1.u;
import wrd.s;
import wt4.n;
import wtc.k0;
import yhm.o;
import yki.l;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f298263w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f298263w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((h) this.v, (yja.b) this.f298263w, continuation, 0);
            case 1:
                e eVar = new e((wkg.f) this.f298263w, continuation, 1);
                eVar.v = obj2;
                return eVar;
            case 2:
                e eVar2 = new e((com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.a) this.f298263w, continuation, 2);
                eVar2.v = obj2;
                return eVar2;
            case 3:
                return new e((k) this.v, (TradingAccount) this.f298263w, continuation, 3);
            case 4:
                e eVar3 = new e((wm1.h) this.f298263w, continuation, 4);
                eVar3.v = obj2;
                return eVar3;
            case 5:
                e eVar4 = new e((com.revolut.feature.payees.impl.ui.payees_overview.personal.a) this.f298263w, continuation, 5);
                eVar4.v = obj2;
                return eVar4;
            case 6:
                e eVar5 = new e((wmk.f) this.f298263w, continuation, 6);
                eVar5.v = obj2;
                return eVar5;
            case 7:
                e eVar6 = new e((InsuranceCarHomeScreen) this.f298263w, continuation, 7);
                eVar6.v = obj2;
                return eVar6;
            case 8:
                e eVar7 = new e((StudentReviewPromptScreen) this.f298263w, continuation, 8);
                eVar7.v = obj2;
                return eVar7;
            case 9:
                e eVar8 = new e((wnk.k) this.f298263w, continuation, 9);
                eVar8.v = obj2;
                return eVar8;
            case 10:
                return new e((com.revolut.feature.tax_residency.impl.stamp_duty.flow.a) this.v, (l) this.f298263w, continuation, 10);
            case 11:
                e eVar9 = new e((WaitlistInvitationScreen) this.f298263w, continuation, 11);
                eVar9.v = obj2;
                return eVar9;
            case 12:
                e eVar10 = new e((com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a) this.f298263w, continuation, 12);
                eVar10.v = obj2;
                return eVar10;
            case 13:
                return new e((t) this.v, (String) this.f298263w, continuation, 13);
            case 14:
                e eVar11 = new e((PagoPABillInputScreen) this.f298263w, continuation, 14);
                eVar11.v = obj2;
                return eVar11;
            case 15:
                e eVar12 = new e((wq8.c) this.f298263w, continuation, 15);
                eVar12.v = obj2;
                return eVar12;
            case 16:
                e eVar13 = new e((wqf.d) this.f298263w, continuation, 16);
                eVar13.v = obj2;
                return eVar13;
            case 17:
                e eVar14 = new e((j) this.f298263w, continuation, 17);
                eVar14.v = obj2;
                return eVar14;
            case 18:
                e eVar15 = new e((TapiTransferAmountScreen) this.f298263w, continuation, 18);
                eVar15.v = obj2;
                return eVar15;
            case 19:
                e eVar16 = new e((wrb.h) this.f298263w, continuation, 19);
                eVar16.v = obj2;
                return eVar16;
            case 20:
                e eVar17 = new e((s) this.f298263w, continuation, 20);
                eVar17.v = obj2;
                return eVar17;
            case 21:
                e eVar18 = new e((wrj.l) this.f298263w, continuation, 21);
                eVar18.v = obj2;
                return eVar18;
            case 22:
                e eVar19 = new e((wsk.b) this.f298263w, continuation, 22);
                eVar19.v = obj2;
                return eVar19;
            case 23:
                e eVar20 = new e((wsk.c) this.f298263w, continuation, 23);
                eVar20.v = obj2;
                return eVar20;
            case 24:
                e eVar21 = new e((n) this.f298263w, continuation, 24);
                eVar21.v = obj2;
                return eVar21;
            case 25:
                e eVar22 = new e((DocumentsScreen) this.f298263w, continuation, 25);
                eVar22.v = obj2;
                return eVar22;
            case 26:
                e eVar23 = new e((wt7.i) this.f298263w, continuation, 26);
                eVar23.v = obj2;
                return eVar23;
            case 27:
                return new e((k0) this.v, (ArrayList) this.f298263w, continuation, 27);
            case 28:
                e eVar24 = new e((com.revolut.feature.workflow.engine.product_closures.screen.a) this.f298263w, continuation, 28);
                eVar24.v = obj2;
                return eVar24;
            default:
                e eVar25 = new e((EmojiBottomSheetController) this.f298263w, continuation, 29);
                eVar25.v = obj2;
                return eVar25;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((zkg.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((e) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((e) create((a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((e) create((wqj.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((e) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((e) create((CustomAsset) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((e) create((vsk.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((e) create((vsk.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v77, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        Optional optional;
        Data data;
        int i = this.u;
        int i2 = 11;
        int i3 = 2;
        ?? mVar = 0;
        Object obj3 = null;
        Object obj4 = this.f298263w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) this.v).C2((yja.b) obj4);
                break;
            case 1:
                zkg.a aVar2 = (zkg.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                boolean z = aVar2.d;
                if (z || aVar2.f322977c) {
                    ((wkg.f) obj4).v2(new wkg.c(z));
                }
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.a aVar5 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.a) obj4;
                aVar5.H2(aVar5.f72810q, new wgd.k(data2, 8));
                break;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) this.v;
                TradingAccount tradingAccount = (TradingAccount) obj4;
                kVar.f298506w.getClass();
                Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
                String string = tradingAccount.getF105262a().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                wm1.h hVar = (wm1.h) obj4;
                hVar.H2(hVar.f298596r, new wgd.k(data3, i2));
                break;
            case 5:
                Data data4 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.payees.impl.ui.payees_overview.personal.a aVar9 = (com.revolut.feature.payees.impl.ui.payees_overview.personal.a) obj4;
                aVar9.H2(aVar9.f79021q, new wgd.k(data4, 12));
                break;
            case 6:
                Data data5 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j2 j2Var = ((wmk.f) obj4).f298691n;
                do {
                    value = j2Var.getValue();
                    optional = (Optional) data5.getContent();
                    ((wmk.a) value).getClass();
                } while (!j2Var.h(value, new wmk.a(optional)));
                break;
            case 7:
                String id10 = (String) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                wn7.l lVar = (wn7.l) ((InsuranceCarHomeScreen) obj4).f75524a0.getValue();
                Intrinsics.h(id10);
                lVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("NEW_POLICY_ITEM")) {
                    lVar.v2(new wn7.g(null));
                }
                break;
            case 8:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                wnk.g gVarD3 = ((StudentReviewPromptScreen) obj4).d();
                Intrinsics.h(clickData);
                wnk.k kVar2 = (wnk.k) gVarD3;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                kVar2.C2(new wnk.h(clickData));
                break;
            case 9:
                String str = (String) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((wnk.k) obj4).C2(new wnk.j(str));
                break;
            case 10:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.tax_residency.impl.stamp_duty.flow.a) this.v).C2(ene.c.f127821a);
                oki.h.D2((l) obj4);
                break;
            case 11:
                ty0.a aVar15 = (ty0.a) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                wok.h hVarE3 = ((WaitlistInvitationScreen) obj4).d();
                String deeplink = aVar15.f275445a;
                com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a aVar17 = (com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a) hVarE3;
                aVar17.getClass();
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                aVar17.l2(new v(aVar17, deeplink, mVar, 17), new yi5.b(26));
                break;
            case 12:
                com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a aVar18 = (com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a) obj4;
                Data data6 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (data6.getError() instanceof WaitlistDomainException) {
                    Throwable error = data6.getError();
                    Intrinsics.i(error, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.waitlist.impl.interactor.WaitlistDomainException");
                    WaitlistDomainException waitlistDomainException = (WaitlistDomainException) error;
                    aVar18.C2(new wok.g(waitlistDomainException.f103682b, waitlistDomainException.f103681a));
                } else {
                    aVar18.H2(aVar18.f103707t, new m(data6, aVar18));
                }
                break;
            case 13:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                break;
            case 14:
                String listId = (String) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                wq1.l lVarI3 = ((PagoPABillInputScreen) obj4).T2();
                Intrinsics.h(listId);
                q qVar = (q) lVarI3;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "SCAN_MENU_ITEM_LIST_ID")) {
                    qVar.v2(j.b.f299391a);
                }
                break;
            case 15:
                String str2 = (String) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = (List) p.a.j(tq8.c.class, KTypeProjection.INSTANCE, List.class, ((wq8.c) obj4).f299421a, wq8.c.b(str2));
                if (list != null) {
                }
                break;
            case 16:
                a0 a0Var = (a0) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (!a0Var.f256040a) {
                    wqf.d dVar = (wqf.d) obj4;
                    if (!dVar.v) {
                        dVar.v2(aii.q.f5292a);
                    }
                }
                break;
            case 17:
                wqj.e eVar = (wqj.e) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                rqj.n nVar = (rqj.n) j6.a.k(rqj.n.class, ((wqj.j) obj4).f299477c, eVar.a());
                if (nVar != null) {
                    Intrinsics.checkNotNullParameter(nVar, "<this>");
                    od0.h hVar2 = od0.i.Companion;
                    rqj.f fVar = nVar.f256571a;
                    if (fVar != null) {
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        xi0.a aVar25 = xi0.b.Companion;
                        String str3 = fVar.f256559c;
                        aVar25.getClass();
                        xi0.b bVarA = xi0.a.a(str3);
                        String id11 = fVar.f256557a;
                        Intrinsics.checkNotNullParameter(id11, "id");
                        dj0.d dVar2 = new dj0.d(fVar.f256558b, bVarA);
                        LocalDate localDate = LocalDate.parse(fVar.d);
                        Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                        LocalDate localDate2 = LocalDate.parse(fVar.e);
                        Intrinsics.checkNotNullExpressionValue(localDate2, "parse(...)");
                        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = new AnalyticsSpendingPeriod$Interval(localDate, localDate2);
                        List<rqj.c> list2 = fVar.f;
                        ArrayList arrayList = new ArrayList(w.t(list2, 10));
                        for (rqj.c cVar : list2) {
                            arrayList.add(new lzi.l(new dj0.d(cVar.f256554c, bVarA), cVar.f256552a, cVar.f256553b));
                        }
                        mVar = new lzi.m(id11, dVar2, analyticsSpendingPeriod$Interval, arrayList);
                    }
                    hVar2.getClass();
                }
                break;
            case 18:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                wr1.l lVarE3 = ((TapiTransferAmountScreen) obj4).R2();
                String amount = charSequence.toString();
                u uVar = (u) lVarE3;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                uVar.H2(uVar.f299511t, new wp5.v(uVar, amount, i2));
                break;
            case 19:
                Data data7 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                wrb.h hVar3 = (wrb.h) obj4;
                hVar3.H2(hVar3.f299545t, new wgd.k(data7, 22));
                break;
            case 20:
                CustomAsset customAsset = (CustomAsset) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                s sVar = (s) obj4;
                sVar.H2(sVar.f299571q, new srd.o(customAsset, i3));
                break;
            case 21:
                Data data8 = (Data) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((wrj.l) obj4).x2(new wgd.k(data8, 23));
                break;
            case 22:
                vsk.e eVar2 = (vsk.e) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((wsk.b) obj4).d.Z2(eVar2.f291842a);
                break;
            case 23:
                vsk.g gVar = (vsk.g) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                wsk.c cVar2 = (wsk.c) obj4;
                cVar2.X2(cVar2.o, new fvk.u(gVar, 1));
                break;
            case 24:
                Data data9 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                n nVar2 = (n) obj4;
                nVar2.H2(nVar2.f299783q, new wgd.k(data9, 24));
                break;
            case 25:
                String str4 = (String) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                wt7.i iVar = (wt7.i) ((DocumentsScreen) obj4).S.getValue();
                iVar.H2(iVar.f299837s, new wsg.j(str4, i3));
                break;
            case 26:
                Data data10 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                wt7.i iVar2 = (wt7.i) obj4;
                y yVar = iVar2.f299837s;
                os7.a aVar35 = (os7.a) data10.getContent();
                vs7.f fVar2 = aVar35 != null ? aVar35.f229256c : null;
                if (fVar2 != null) {
                    data = new Data(fVar2, data10.getError(), data10.getLoading());
                } else if (data10.getLoading()) {
                    data = new Data(null, data10.getError(), true, 1, null);
                } else {
                    Throwable error2 = data10.getError();
                    if (error2 == null) {
                        error2 = new IllegalStateException("Embedded insurance details layout documents must not be null when not loading.");
                    }
                    data = new Data(null, error2, false, 5, null);
                }
                vs7.f fVar3 = (vs7.f) data.getContent();
                List list3 = fVar3 != null ? fVar3.f291742b : null;
                if (list3 == null) {
                    list3 = f0.f322471a;
                }
                Iterator it8 = list3.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((vs7.e) next).f291739a, ((wt7.f) ((j2) yVar.f22677a).getValue()).f299828b)) {
                            obj3 = next;
                        }
                    }
                }
                vs7.e eVar3 = (vs7.e) obj3;
                if (eVar3 == null) {
                    eVar3 = (vs7.e) d0.d0(list3);
                }
                iVar2.H2(yVar, new wp5.v(data, eVar3, 19));
                break;
            case 27:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k0) this.v).e.G((ArrayList) obj4, "KEY_DISMISSED_STREET_MODE_WIFI_SSIDS", kii.e.o(String.class, KTypeProjection.INSTANCE, List.class));
                break;
            case 28:
                Data data11 = (Data) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.workflow.engine.product_closures.screen.a aVar38 = (com.revolut.feature.workflow.engine.product_closures.screen.a) obj4;
                aVar38.H2(aVar38.f96509q, new wgd.k(data11, 25));
                break;
            default:
                String str5 = (String) this.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Intrinsics.h(str5);
                ((EmojiBottomSheetController) obj4).c3(new fu9.d(str5));
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f298263w = obj2;
    }
}
