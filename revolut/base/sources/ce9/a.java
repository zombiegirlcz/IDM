package ce9;

import android.content.Intent;
import android.nfc.Tag;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import c84.y;
import cea.z;
import cie.k0;
import com.google.android.material.snackbar.BaseShot;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.data.database.models.openbanking.ExternalInstitutionsDao_Impl;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentDao_Impl;
import com.revolut.data.database.models.splitbill.SplitBillDao_Impl;
import com.revolut.data.model.Data;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMContainerPlugin;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerRuntime;
import com.revolut.feature.commodities.onboarding.impl.ui_kompot.risks.CommoditiesOnboardingRisksController;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$State;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$Step;
import com.revolut.feature.pay_with_smile.api.declaration.PayWithSmileApi$Toggles$PayWithSmileChangePasscode;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_number.EnterCardNumberScreen;
import efm.d0;
import hha.s;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ljl.v;
import skm.a2;
import unk.d;
import we6.g0;
import we6.z0;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23423b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f23422a = i;
        this.f23423b = obj2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f23422a;
        int i2 = 2;
        int i3 = 26;
        int i5 = 25;
        int i6 = 6;
        char c2 = 1;
        int i21 = 0;
        Continuation continuation = null;
        Object obj3 = this.f23423b;
        switch (i) {
            case 0:
                n nVar = (n) obj3;
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                if (data.getContent() != null) {
                    Object content = data.getContent();
                    Intrinsics.h(content);
                    return new h((o) content);
                }
                if (data.getError() == null) {
                    return new g(nVar == n.FORCE_REFRESH);
                }
                Throwable error = data.getError();
                Intrinsics.h(error);
                return new f(error);
            case 1:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new cea.o(((z) obj3).f23468b.c(), cea.m.f23451a);
            case 2:
                ((cek.e) obj3).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM pod_nominees");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "displayName");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dateOfBirth");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "email");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "percentage");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new cek.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), cek.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)), (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow8)));
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 3:
                OfferFlowContract$Step.OfferContent offerContent = (OfferFlowContract$Step.OfferContent) obj3;
                OfferFlowContract$State update = (OfferFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return new OfferFlowContract$State(offerContent.f68073a, offerContent.f68074b, update.f68065c);
            case 4:
                com.revolut.feature.credit.application.plugins.impl.ui.offer.e eVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer.e) obj3;
                aii.q it9 = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                oki.h.t2(eVar, eVar.f68088w, new OfferFlowContract$Step.OfferContent(null, null, null), false, null, false, 12);
                return Unit.f186387a;
            case 5:
                cfj.g gVar = (cfj.g) obj3;
                List subscriptions = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                if (subscriptions.isEmpty()) {
                    return hb9.b.j(f0.f322471a);
                }
                return nim.a.v(u0.m(gVar.f23724b.b(w4l.i.f294643c), ((efj.d) gVar.d).a() ? hb9.b.x(rd0.e.b(gVar.f.j0(true, false)), f0.f322471a) : new go.g(new Data(f0.f322471a, null, false, 6, null), 2)), new c7e.i(gVar, subscriptions, 13));
            case 6:
                com.revolut.feature.external_accounts.impl.mandate.create_mandate.b bVar = (com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) obj3;
                z0 result = (z0) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                bVar.H2(bVar.f72449y, new ch6.l(result, 0));
                return Unit.f186387a;
            case 7:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.a aVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.hide_student.a) obj3;
                unk.d output = (unk.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.A1(new bv4.h(aVar, continuation, 22), new yi5.b(i5));
                return Unit.f186387a;
            case 8:
                jx1.g outputData = (jx1.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                ((c1g.o) obj3).invoke(outputData);
                return Unit.f186387a;
            case 9:
                ci4.h hVar = (ci4.h) obj3;
                ci4.f update2 = (ci4.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                String str = hVar.f24372a;
                switch (str.hashCode()) {
                    case -1897644094:
                        if (str.equals("email-input-field-id")) {
                            return ci4.f.a(update2, null, hVar.f24373b, null, null, 13);
                        }
                        break;
                    case -1783760954:
                        if (str.equals("contact-name-input-field-id")) {
                            return ci4.f.a(update2, null, null, hVar.f24373b, null, 11);
                        }
                        break;
                    case -1769872042:
                        if (str.equals("phone-number-input-field-id")) {
                            return ci4.f.a(update2, null, null, null, hVar.f24373b, 7);
                        }
                        break;
                    case -1131268706:
                        if (str.equals("solicitor-name-input-field-id")) {
                            return ci4.f.a(update2, hVar.f24373b, null, null, null, 14);
                        }
                        break;
                }
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "CustomSolicitorDetailsControllerModel", j6.a.q("Unsupported input text delegate id: ", str), null, h0Var);
                return update2;
            case 10:
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = (com.revolut.feature.tab.accounts.impl.ui.tab.d) obj3;
                kkd.d output2 = (kkd.d) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                dVar.n2(new y(output2, dVar, continuation, 18), new whi.b(i6));
                return Unit.f186387a;
            case 11:
                TabAccountsScreenContract$State update3 = (TabAccountsScreenContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                AnimationRequest animationRequest = new AnimationRequest(false);
                ((sfe.c) obj3).getClass();
                return TabAccountsScreenContract$State.a(update3, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, new tx0.j(animationRequest, y0.b("HOME_ACTION_MOVE_MONEY_ID")), false, false, null, 3932159);
            case 12:
                return TabAccountsScreenContract$State.a((TabAccountsScreenContract$State) obj2, null, null, null, null, null, null, null, null, null, (k0) obj3, null, false, null, false, null, null, null, null, null, false, false, null, 4193791);
            case 13:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c cVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c) obj3;
                umk.i result2 = (umk.i) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof umk.h) {
                    oki.h.D2(cVar.u);
                } else {
                    if (!(result2 instanceof umk.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PricingPlanAction pricingPlanAction = ((umk.g) result2).f281324a;
                    if (pricingPlanAction instanceof PricingPlanAction.FlowSpecific) {
                        PricingPlanAction.FlowSpecific flowSpecific = (PricingPlanAction.FlowSpecific) pricingPlanAction;
                        if (flowSpecific instanceof PricingPlanAction.Confirm) {
                            rgk.q.a(flowSpecific, "PlanReferralsClaimFlowModel");
                        } else {
                            if (!(flowSpecific instanceof PricingPlanAction.ClaimPlanReferral)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar.l2(new cik.g(cVar, (PricingPlanAction.ClaimPlanReferral) pricingPlanAction, null), new yi5.b(i3));
                        }
                    } else if (pricingPlanAction instanceof PricingPlanAction.Common) {
                        cVar.f103217q.c3((PricingPlanAction.Common) pricingPlanAction, cVar.f103220t, new rgk.c(new cik.c(cVar, c2 == true ? 1 : 0), new bvb.a(cVar, 20), null, 12));
                    } else {
                        if (!(pricingPlanAction instanceof PricingPlanAction.Unsupported)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rgk.q.b((PricingPlanAction.Unsupported) pricingPlanAction, "PlanReferralsClaimFlowModel");
                    }
                }
                return Unit.f186387a;
            case 14:
                yj1.e params = (yj1.e) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                yj1.a aVar2 = (yj1.a) ((ck1.c) obj3).f24742b.get(ngm.n.c(params));
                if (aVar2 == null) {
                    return null;
                }
                od0.i.Companion.getClass();
                return od0.h.a(aVar2);
            case 15:
                CommoditiesOnboardingRisksController commoditiesOnboardingRisksController = (CommoditiesOnboardingRisksController) obj3;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (!commoditiesOnboardingRisksController.T.getAndSet(false)) {
                    commoditiesOnboardingRisksController.f3().setCollapsed(!zBooleanValue, true);
                }
                return Unit.f186387a;
            case 16:
                cli.j jVar = (cli.j) obj3;
                Intrinsics.checkNotNullParameter((cli.j) obj2, "$this$update");
                return jVar;
            case 17:
                clk.c cVar2 = (clk.c) obj3;
                hha.d currentPlan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
                if (!s.n(currentPlan)) {
                    ufm.b bVarM = d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                d0 d0VarFirstOrError = m70.a.g(cVar2.f25045a.n(), null, null, 3).firstOrError();
                ch6.d dVar2 = new ch6.d(new clk.a(currentPlan, i21), 10);
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, dVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return ue0.e.F(iVar, Boolean.FALSE);
            case 18:
                Intent intent = (Intent) obj2;
                KProperty[] kPropertyArr = EnterCardNumberScreen.f106397e0;
                Intrinsics.checkNotNullParameter(intent, "it");
                d63.a aVar3 = (d63.a) ((v) ((EnterCardNumberScreen) obj3).f106399b0.getValue()).f196117c.get();
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(intent, "intent");
                w53.b.Companion.getClass();
                Tag tag2 = w53.a.a(intent);
                if (tag2 != null) {
                    d63.c cVar3 = aVar3.f111441c;
                    cVar3.getClass();
                    Intrinsics.checkNotNullParameter(tag2, "tag");
                    cVar3.V2(new d3i.g(cVar3, tag2, continuation, i2), new yi5.b(29));
                }
                return Unit.f186387a;
            case 19:
                com.revolut.feature.pay_with_smile.impl.ui.settings.a aVar4 = (com.revolut.feature.pay_with_smile.impl.ui.settings.a) obj3;
                dii.g output3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof dii.f) {
                    aVar4.l2(new bv4.h(aVar4, continuation, i5), new yi5.b(i3));
                }
                return Unit.f186387a;
            case 20:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                aim.e eVarB = u.b();
                nb0 nb0Var = pb0.Companion;
                eVarB.add(nb0.a(nb0Var, "LOADING_ITEM_ID", false, 6));
                if (((jte.d) ((cm9.o) obj3).f25177a).c(PayWithSmileApi$Toggles$PayWithSmileChangePasscode.f78948c)) {
                    eVarB.add(nb0.a(nb0Var, "LOADING_ITEM_ID_2", false, 6));
                }
                aim.e eVarA = u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return eVarA;
            case 21:
                cn.a data2 = (cn.a) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                ((fy7.f) ((cn.b) obj3)).getClass();
                Intrinsics.checkNotNullParameter(data2, "data");
                if (!(data2.f25323a instanceof fy7.b)) {
                    ufm.b bVarM2 = d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                    return bVarM2;
                }
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                rfm.f0 f0VarF = ue0.e.v(mVar).f(d0.m(Boolean.FALSE));
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                return f0VarF;
            case 22:
                com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar2 = (com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e) obj3;
                g0 result3 = (g0) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof g0.a) {
                    eVar2.B2();
                } else {
                    if (!(result3 instanceof we6.h0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar2.C1(new ExternalDestination.Browser(((we6.h0) result3).f296645a, null));
                }
                return Unit.f186387a;
            case 23:
                com.revolut.feature.insurance_car.impl.ui.flow.policy.d dVar3 = (com.revolut.feature.insurance_car.impl.ui.flow.policy.d) obj3;
                nq7.e output4 = (nq7.e) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                if (!(output4 instanceof nq7.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar3.C1(sl7.i.a(((nq7.d) output4).f218373a));
                return Unit.f186387a;
            case 24:
                ((a2) obj3).f(null);
                return Unit.f186387a;
            case 25:
                return BaseShot.animateContentOut$lambda$0((BaseShot) obj3, ((Integer) obj2).intValue());
            case 26:
                return ((ExternalInstitutionsDao_Impl) obj3).lambda$getAll$3((SQLiteConnection) obj2);
            case 27:
                return ((RecurringPaymentDao_Impl) obj3).lambda$getAllSync$1((SQLiteConnection) obj2);
            case 28:
                return ((SplitBillDao_Impl) obj3).lambda$splitBills$3((SQLiteConnection) obj2);
            default:
                return Boolean.valueOf(APMPMWebContainerRuntime.registerPlugin$lambda$0((APMPMContainerPlugin) obj3, (APMPMContainerPlugin) obj2));
        }
    }
}
