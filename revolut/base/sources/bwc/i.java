package bwc;

import aw0.o9;
import c84.t;
import c84.y;
import cc7.n;
import cc7.o;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$State;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$Step;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.insurance_car.impl.ui.flow.delivery.DeliveryFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlowContract$Step;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import fq7.d;
import ip0.q80;
import ip0.t80;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import lq7.g;
import nii.y0;
import nii.z;
import rn7.d;
import skm.p0;
import sri.m;
import tn7.e;
import vkm.j2;
import xq7.d;
import yji.l;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zx7.s;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        int i = 25;
        int i2 = 0;
        int i3 = 1;
        Integer numValueOf = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.f) {
            case 0:
                dwc.f p0 = (dwc.f) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.b.I2((com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow.b) this.receiver, p0);
                return Unit.f186387a;
            case 1:
                String input = (String) obj2;
                Intrinsics.checkNotNullParameter(input, "p0");
                zx7.q qVar = (zx7.q) this.receiver;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                ((s) qVar.f326086c).z0().set(input);
                return Unit.f186387a;
            case 2:
                z38.d p03 = (z38.d) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((b48.b) this.receiver).getClass();
                return b48.b.c(p03);
            case 3:
                a49.c p010 = (a49.c) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                return ((c49.f) this.receiver).f21126a.updateLocationBackground(p010);
            case 4:
                Throwable p011 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.receiver).getClass();
                hx7.e.h(p011);
                return Boolean.TRUE;
            case 5:
                Throwable p012 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.receiver).getClass();
                hx7.e.h(p012);
                return Boolean.TRUE;
            case 6:
                Throwable p013 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.receiver).getClass();
                hx7.e.h(p013);
                return Boolean.TRUE;
            case 7:
                hq3.d p014 = (hq3.d) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                c84.i iVar = (c84.i) this.receiver;
                iVar.getClass();
                if (p014 instanceof hq3.c) {
                    iVar.A2(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), ((hq3.c) p014).f154591a)));
                } else if (p014 instanceof hq3.b) {
                    iVar.A2(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), ((hq3.b) p014).f154590a)));
                } else {
                    int i5 = jli.h.f175850a;
                    Unit unit = Unit.f186387a;
                }
                return Unit.f186387a;
            case 8:
                NaviCommand naviCommand = (NaviCommand) obj2;
                c84.i iVar2 = (c84.i) this.receiver;
                if (naviCommand == null) {
                    iVar2.b3();
                } else {
                    iVar2.getClass();
                    iVar2.A2(new BridgeDestination(r6.b.g(null, null, null, 7, naviCommand)));
                }
                return Unit.f186387a;
            case 9:
                ((t) this.receiver).K2((NaviCommand) obj2);
                return Unit.f186387a;
            case 10:
                Throwable p015 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                com.revolut.feature.retail.goals.impl.ui.a.I2((com.revolut.feature.retail.goals.impl.ui.a) this.receiver, p015);
                return Boolean.TRUE;
            case 11:
                Throwable p016 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                com.revolut.feature.retail.goals.impl.ui.a.I2((com.revolut.feature.retail.goals.impl.ui.a) this.receiver, p016);
                return Boolean.TRUE;
            case 12:
                Throwable p017 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                com.revolut.feature_retail_user_declarations.email_verification.b bVar = (com.revolut.feature_retail_user_declarations.email_verification.b) this.receiver;
                bVar.getClass();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p017, h0Var);
                bVar.I2();
                return Boolean.TRUE;
            case 13:
                Throwable p018 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                cc3.j jVar = (cc3.j) this.receiver;
                jVar.getClass();
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p018, h0Var2);
                jVar.C2(new cc3.g(p018));
                return Boolean.TRUE;
            case 14:
                cc7.e npsWidgetState = (cc7.e) obj2;
                Intrinsics.checkNotNullParameter(npsWidgetState, "p0");
                ((cc7.a) ((cc7.c) this.receiver)).getClass();
                Intrinsics.checkNotNullParameter(npsWidgetState, "npsWidgetState");
                if (npsWidgetState.f22947a.getContent() == null) {
                    return f0.f322471a;
                }
                zb7.g gVar = (zb7.g) zi0.c.I(npsWidgetState.f22947a);
                TextClause textClause = new TextClause(gVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                n nVar = o.Companion;
                q80 q80VarA = cc7.a.a(true);
                zb7.c cVar = gVar.f320840c;
                if (cVar != null) {
                    nVar.getClass();
                    numValueOf = Integer.valueOf(n.a(cVar));
                }
                List listC = u.c(new t80("NPS_RATING_BAR_ID", textClause, q80VarA, numValueOf, true, gVar, 960));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 15:
                v44.j p019 = (v44.j) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                com.revolut.feature.credit.application.plugins.impl.ui.offer.e eVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer.e) this.receiver;
                if (p019 instanceof v44.i) {
                    qki.d dVar = eVar.v;
                    j2 j2Var = (j2) dVar.f22677a;
                    j2 j2Var2 = (j2) dVar.f22677a;
                    oki.h.t2(eVar, eVar.f68088w, new OfferFlowContract$Step.OfferContent(((OfferFlowContract$State) j2Var.getValue()).f68063a, ((OfferFlowContract$State) j2Var2.getValue()).f68064b, ((OfferFlowContract$State) j2Var2.getValue()).f68065c), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
                } else {
                    eVar.getClass();
                }
                return Unit.f186387a;
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "p0");
                com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b bVar2 = (com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b) this.receiver;
                bVar2.getClass();
                l.a1(bVar2, bVar2.X1(new y0(null, new z(new TextLocalisedClause(R$string.general_error_common, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new ch1.e(bVar2, objArr == true ? 1 : 0, i2), 3);
                return Boolean.TRUE;
            case 17:
                List p020 = (List) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                ((ihm.f) this.receiver).onNext(p020);
                return Unit.f186387a;
            case 18:
                igk.c p021 = (igk.c) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                ((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c) this.receiver).getClass();
                hx7.e.n(new IllegalStateException(j6.a.q("Billing selection is not supported in plan referrals claim flow: planId=", p021.f161237a)));
                return Unit.f186387a;
            case 19:
                PricingPlanSubscription p022 = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                clk.c cVar2 = (clk.c) this.receiver;
                cVar2.getClass();
                return pd.b.n(p0.f264003c, new y(cVar2, p022, objArr2 == true ? 1 : 0, i));
            case 20:
                Throwable p023 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                vl7.a.g((l) this.receiver, p023);
                return Boolean.TRUE;
            case 21:
                rn7.d p024 = (rn7.d) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.delivery.a aVar = (com.revolut.feature.insurance_car.impl.ui.flow.delivery.a) this.receiver;
                aVar.getClass();
                if (Intrinsics.f(p024, d.a.f255513a)) {
                    aVar.A1(new cm7.d(aVar, objArr3 == true ? 1 : 0, i3), new yi5.b(i));
                } else {
                    if (!Intrinsics.f(p024, d.b.f255514a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.f75352w.x(vn7.a.b(aVar.u, com.revolut.feature.insurance_car.impl.R$string.car_insurance_disc_placement_confirm_title, Integer.valueOf(com.revolut.feature.insurance_car.impl.R$string.car_insurance_disc_placement_confirm_content), com.revolut.feature.insurance_car.impl.R$string.car_insurance_common_confirm, 8));
                }
                return Unit.f186387a;
            case 22:
                tn7.e p025 = (tn7.e) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.delivery.a aVar2 = (com.revolut.feature.insurance_car.impl.ui.flow.delivery.a) this.receiver;
                aVar2.getClass();
                if (Intrinsics.f(p025, e.a.f272323a)) {
                    aVar2.E2(DeliveryFlowContract$Step.Print.f75349a, true, null, false);
                } else if (Intrinsics.f(p025, e.b.f272324a)) {
                    aVar2.f75352w.x(vn7.a.b(aVar2.u, com.revolut.feature.insurance_car.impl.R$string.car_insurance_disc_placement_confirm_title, Integer.valueOf(com.revolut.feature.insurance_car.impl.R$string.car_insurance_disc_placement_confirm_content), com.revolut.feature.insurance_car.impl.R$string.car_insurance_common_confirm, 8));
                } else {
                    if (!Intrinsics.f(p025, e.c.f272325a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
                }
                return Unit.f186387a;
            case 23:
                NaviCommand p026 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                ((m) this.receiver).c(p026);
                return Unit.f186387a;
            case 24:
                Throwable p027 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                vl7.a.g((l) this.receiver, p027);
                return Boolean.TRUE;
            case 25:
                fq7.d p028 = (fq7.d) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.policy.d dVar2 = (com.revolut.feature.insurance_car.impl.ui.flow.policy.d) this.receiver;
                dVar2.getClass();
                if (p028 instanceof fq7.e) {
                    dVar2.C1(sl7.b.c(((fq7.e) p028).f137202a));
                } else {
                    if (!(p028 instanceof d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar2.C1(sl7.c.a("topic.car-insurance"));
                }
                return Unit.f186387a;
            case 26:
                vq7.g p029 = (vq7.g) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.policy.d dVar3 = (com.revolut.feature.insurance_car.impl.ui.flow.policy.d) this.receiver;
                dVar3.getClass();
                if (!(p029 instanceof vq7.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar3.O2(new CarPolicyFlowContract$Step.ActivateTelematicsDevice(((vq7.f) p029).f291350a));
                return Unit.f186387a;
            case 27:
                xq7.d p030 = (xq7.d) obj2;
                Intrinsics.checkNotNullParameter(p030, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.policy.d dVar4 = (com.revolut.feature.insurance_car.impl.ui.flow.policy.d) this.receiver;
                dVar4.getClass();
                if (Intrinsics.f(p030, d.a.f308119a)) {
                    dVar4.O2(new CarPolicyFlowContract$Step.ActivateTelematicsDevice(null));
                } else {
                    if (!Intrinsics.f(p030, d.b.f308120a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar4.O2(CarPolicyFlowContract$Step.DocumentsList.f75474a);
                }
                return Unit.f186387a;
            case 28:
                com.revolut.feature.full_screen_prompt.c p031 = (com.revolut.feature.full_screen_prompt.c) obj2;
                Intrinsics.checkNotNullParameter(p031, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.policy.d dVar5 = (com.revolut.feature.insurance_car.impl.ui.flow.policy.d) this.receiver;
                dVar5.getClass();
                if (p031 instanceof c.d) {
                    dVar5.C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, (TicketCreationContext) null, (String) null, 15), true));
                }
                return Unit.f186387a;
            default:
                lq7.g p032 = (lq7.g) obj2;
                Intrinsics.checkNotNullParameter(p032, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.policy.d dVar6 = (com.revolut.feature.insurance_car.impl.ui.flow.policy.d) this.receiver;
                if (p032 instanceof g.a) {
                    dVar6.O2(CarPolicyFlowContract$Step.PolicyCancellation.f75480a);
                } else {
                    dVar6.getClass();
                    if (!(p032 instanceof lq7.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lq7.h hVar = (lq7.h) p032;
                    dVar6.O2(new CarPolicyFlowContract$Step.MidTermAdjustment(hVar.f199198a, hVar.f199199b));
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c49.f fVar) {
        super(1, 0, c49.f.class, fVar, "sendLocationToServer", "sendLocationToServer(Lcom/revolut/feature/location/impl/data/network/models/location/LocationModelRequest;)Lio/reactivex/Completable;");
        this.f = 3;
    }
}
