package om4;

import android.content.Context;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card_add_to_googlepay.impl.R$string;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.feature.rev_points.exclusive_store.impl.data.repository.ExclusiveStoreRepository$QuoteTokenIsNullException;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.a;
import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import com.revolut.feature_exchange.impl.ui.exchange_v2.recurring_order_settings.RecurringOrderSettingsActivityV2;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class m1 extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [zhm.f0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = 5;
        boolean z = true;
        boolean z3 = true;
        boolean z4 = true;
        int i2 = 0;
        switch (this.f) {
            case 0:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((ql4.e) obj2);
            case 1:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((ql4.a0) obj2);
            case 2:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "p0");
                oma.g gVar = (oma.g) this.receiver;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(list, "list");
                oma.t tVar = (oma.t) gVar.f226781a;
                efm.b bVarIgnoreElements = tVar.f226808b.getValue(tVar, oma.t.f226807c[0]).b(list).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                return bVarIgnoreElements;
            case 3:
                String str = (String) obj2;
                TripsListController tripsListController = (TripsListController) this.receiver;
                tripsListController.f87634b0 = str;
                ((ood.q0) tripsListController.R2()).M2(str, null);
                return Unit.f186387a;
            case 4:
                Context p0 = (Context) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((GridWidgetDelegate) this.receiver).u(p0);
            case 5:
                NaviCommand p03 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((sri.m) this.receiver).c(p03);
                return Unit.f186387a;
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                com.revolut.feature.apm.breb.impl.flow.a aVar = (com.revolut.feature.apm.breb.impl.flow.a) this.receiver;
                aVar.f61723t.getClass();
                yji.l.a1(aVar, aVar.X1(sv1.d.a()), null, null, new ocb.d(aVar, , 24), 3);
                return Boolean.TRUE;
            case 7:
                Throwable p010 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar = (com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) this.receiver;
                dVar.getClass();
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p010, h0Var);
                if (p010 instanceof ExclusiveStoreRepository$QuoteTokenIsNullException) {
                    dVar.l2(new omg.e(dVar, , 13), new yi5.b(26));
                }
                dVar.C2(a.c.f83600a);
                return Boolean.TRUE;
            case 8:
                Throwable p011 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e eVar = (com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e) this.receiver;
                eVar.getClass();
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p011, h0Var2);
                yji.l.a1(eVar, eVar.X1(new nii.y0(null, new nii.z(new TextLocalisedClause(R$string.google_pay_confirm_declined_activation_dialog_title, null, null, 14), new TextLocalisedClause(R$string.google_pay_confirm_declined_activation_dialog_message, null, null, 14), new TextLocalisedClause(R$string.google_pay_confirm_declined_activation_dialog_ok_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, null, new com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.c(eVar, null), 3);
                return Boolean.TRUE;
            case 9:
                ty0.a p012 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                ((ihm.f) this.receiver).onNext(p012);
                return Unit.f186387a;
            case 10:
                Throwable p013 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c cVar = (com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c) this.receiver;
                cVar.H2(cVar.f99142r, new nd8.l(p013, i));
                return Boolean.TRUE;
            case 11:
                f2i.g p014 = (f2i.g) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                return ((p2i.u) ((p2i.e) this.receiver)).a(p014);
            case 12:
                rp0.y p015 = (rp0.y) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                ((opi.b) ((opi.d) this.receiver)).b0(p015);
                return Unit.f186387a;
            case 13:
                List p016 = (List) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                ((RecurringOrderSettingsActivityV2) ((p2i.f) this.receiver)).setItems(p016);
                return Unit.f186387a;
            case 14:
                ((ypi.i) this.receiver).setVisible(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 15:
                ((ypi.i) this.receiver).f((Clause) obj2);
                return Unit.f186387a;
            case 16:
                Clause p017 = (Clause) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                ((iqi.b) ((iqi.h) this.receiver)).a0(p017);
                return Unit.f186387a;
            case 17:
                Clause p018 = (Clause) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                ((iqi.b) ((iqi.h) this.receiver)).d0(p018);
                return Unit.f186387a;
            case 18:
                ((iqi.b) ((iqi.h) this.receiver)).setVisible(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 19:
                ((iqi.b) ((iqi.h) this.receiver)).e0(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 20:
                od0.i p019 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                e3c.a aVar2 = ((p4c.x) this.receiver).f232904r;
                d3c.p pVar = (d3c.p) p019.f224257a;
                 = pVar != null ? pVar.f111055g : 0;
                if ( == 0) {
                     = zhm.f0.f322471a;
                }
                if (isEmpty()) {
                    return zi0.c.i(zhm.f0.f322471a);
                }
                int size = size();
                w4l.h loadingStrategy = w4l.h.f294642c;
                if (size != 1) {
                    k3c.p pVar2 = (k3c.p) aVar2;
                    pVar2.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    return nim.a.v(pVar2.f180682c.b(Unit.f186387a, loadingStrategy), new njf.e((List) , 15));
                }
                IppProductType ippProductType = (IppProductType) zhm.d0.b0();
                k3c.p pVar3 = (k3c.p) aVar2;
                pVar3.getClass();
                Intrinsics.checkNotNullParameter(ippProductType, "ippProductType");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return nim.a.v(pVar3.d.b(ippProductType.getF84197a(), loadingStrategy), new p4c.u(i2));
            case 21:
                String investorUpdateId = (String) obj2;
                Intrinsics.checkNotNullParameter(investorUpdateId, "p0");
                p5f.b bVar = (p5f.b) this.receiver;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(investorUpdateId, "investorUpdateId");
                return (z5f.h) bVar.f233114c.get(investorUpdateId);
            case 22:
                p5f.f params = (p5f.f) obj2;
                Intrinsics.checkNotNullParameter(params, "p0");
                p5f.e eVar2 = (p5f.e) this.receiver;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                return (List) eVar2.f233120c.get(ebm.a.C(params));
            case 23:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "p0");
                com.revolut.feature.onboarding.impl.onboarding.country.flow.c cVar2 = (com.revolut.feature.onboarding.impl.onboarding.country.flow.c) this.receiver;
                cVar2.getClass();
                zhm.h0 h0Var3 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var3);
                pa9.f fVar = cVar2.u;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                yji.l.a1(cVar2, cVar2.X1(new nii.y0("ERROR_DIALOG_ID", ((ua9.a) fVar.f234455a).a(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.error_country_step_config, null, null, 14), error), false, 4)), null, null, new pa9.j(cVar2, null), 3);
                return Boolean.TRUE;
            case 24:
                Throwable p020 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) this.receiver;
                bVar2.getClass();
                zhm.h0 h0Var4 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p020, h0Var4);
                bVar2.L2(new Data(null, p020, false, 5, null));
                return Boolean.TRUE;
            case 25:
                List p021 = (List) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                ((ihm.f) this.receiver).onNext(p021);
                return Unit.f186387a;
            case 26:
                igk.c p022 = (igk.c) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a aVar3 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a) this.receiver;
                com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar3 = aVar3.f103120r;
                String str2 = p022.f161237a;
                hha.i iVar = p022.f161238b;
                PricingPlanOffer pricingPlanOffer = p022.d;
                bVar3.c3(new PricingPlanAction.Upgrade(str2, iVar, pricingPlanOffer != null ? pricingPlanOffer.f81123a : null, false), aVar3.u, new rgk.c(new phk.n(aVar3, z4 ? 1 : 0), new phk.o(aVar3, i2), new phk.o(aVar3, z3 ? 1 : 0), 4));
                return Unit.f186387a;
            case 27:
                Throwable p023 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar4 = (com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) this.receiver;
                aVar4.getClass();
                if (p023 instanceof IllegalStateException) {
                    zhm.h0 h0Var5 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, p023, h0Var5);
                    aVar4.f94391t.a("miles-topup");
                    aVar4.X1(new nii.y0(null, new nii.z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                Name p024 = (Name) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                return ((LazyJavaClassMemberScope) this.receiver).B(p024);
            default:
                Name p025 = (Name) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                return ((LazyJavaClassMemberScope) this.receiver).C(p025);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(Object obj2) {
        super(1, 0, ihm.f.class, obj2, "onNext", "onNext(Ljava/lang/Object;)V");
        this.f = 9;
    }
}
