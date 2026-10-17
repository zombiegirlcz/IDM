package rch;

import android.os.Parcelable;
import aw0.o9;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.joint.impl.ui.deeplink.JointDeeplinkFlowContract$PromptConfig;
import com.revolut.feature.joint.impl.ui.deeplink.JointDeeplinkFlowContract$Step;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlow;
import com.revolut.feature.joint.impl.ui.invite_flow.InviteFlowContract$InputData;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.a;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntro;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import grl.k9;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s4f.x;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o extends kotlin.jvm.internal.q implements Function2 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object p17) {
        String str;
        PromptContentDelegate.Model modelA;
        int i = 1;
        switch (this.f) {
            case 0:
                Function1 p0 = (Function1) obj2;
                Function2 p110 = (Function2) p17;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p110, "p1");
                return ((com.revolut.feature.wealth.impl.ui.screens.popularassets.a) this.receiver).n2(p110, p0);
            case 1:
                String p03 = (String) obj2;
                String p111 = (String) p17;
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p111, "p1");
                ((rf9.l) this.receiver).q3(p03, p111);
                return Unit.f186387a;
            case 2:
                com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar = (com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) ((rq4.k) this.receiver);
                ow4.a aVar = cVar.u;
                y yVar = cVar.C;
                long jA = aVar.a((String) obj2, ((rq4.i) zi0.c.I(((rq4.j) ((j2) yVar.f22677a).getValue()).f256465a)).f256462a.f.f306286a);
                cVar.H2(yVar, new a80.a(jA, g4i.a.s(jA, ((rq4.i) zi0.c.I(((rq4.j) ((j2) yVar.f22677a).getValue()).f256465a)).f256462a.f175591b.f115082a), 1));
                return Unit.f186387a;
            case 3:
                Function1 p010 = (Function1) obj2;
                Function2 p112 = (Function2) p17;
                Intrinsics.checkNotNullParameter(p010, "p0");
                Intrinsics.checkNotNullParameter(p112, "p1");
                return ((x) this.receiver).n2(p112, p010);
            case 4:
                String p011 = (String) obj2;
                TemplateIntro p113 = (TemplateIntro) p17;
                Intrinsics.checkNotNullParameter(p011, "p0");
                Intrinsics.checkNotNullParameter(p113, "p1");
                ((s5f.b) this.receiver).d.f(tz4.d.b(p011), p113);
                return Unit.f186387a;
            case 5:
                String p012 = (String) obj2;
                String p114 = (String) p17;
                Intrinsics.checkNotNullParameter(p012, "p0");
                Intrinsics.checkNotNullParameter(p114, "p1");
                ((sf9.g) this.receiver).p3(p012, p114);
                return Unit.f186387a;
            case 6:
                return si5.b.c3((si5.b) this.receiver, (ec5.c) obj2, (Continuation) p17);
            case 7:
                Function1 p013 = (Function1) obj2;
                Function2 p115 = (Function2) p17;
                Intrinsics.checkNotNullParameter(p013, "p0");
                Intrinsics.checkNotNullParameter(p115, "p1");
                return ((com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g) this.receiver).n2(p115, p013);
            case 8:
                Function1 p014 = (Function1) obj2;
                Function2 p116 = (Function2) p17;
                Intrinsics.checkNotNullParameter(p014, "p0");
                Intrinsics.checkNotNullParameter(p116, "p1");
                return ((com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g) this.receiver).n2(p116, p014);
            case 9:
                boolean z = false;
                SerialDescriptor p015 = (SerialDescriptor) obj2;
                int iIntValue = ((Number) p17).intValue();
                Intrinsics.checkNotNullParameter(p015, "p0");
                slm.p pVar = (slm.p) this.receiver;
                pVar.getClass();
                if (!p015.i(iIntValue) && p015.b(iIntValue).f()) {
                    z = true;
                }
                pVar.f264277b = z;
                return Boolean.valueOf(z);
            case 10:
                Function1 p016 = (Function1) obj2;
                Function2 p117 = (Function2) p17;
                Intrinsics.checkNotNullParameter(p016, "p0");
                Intrinsics.checkNotNullParameter(p117, "p1");
                return ((com.revolut.feature.rev_points.impl.ui.c) this.receiver).l2(p117, p016);
            case 11:
                String p017 = (String) obj2;
                String p118 = (String) p17;
                Intrinsics.checkNotNullParameter(p017, "p0");
                Intrinsics.checkNotNullParameter(p118, "p1");
                ((tf9.f) this.receiver).q3(p017, p118);
                return Unit.f186387a;
            case 12:
                Function1 p018 = (Function1) obj2;
                Function2 p119 = (Function2) p17;
                Intrinsics.checkNotNullParameter(p018, "p0");
                Intrinsics.checkNotNullParameter(p119, "p1");
                return ((com.revolut.feature.wealth_discovery.impl.screener.screens.collection.a) this.receiver).l2(p119, p018);
            case 13:
                return tzl.l.a((tzl.l) this.receiver, (tzl.e) obj2, (Continuation) p17);
            case 14:
                String p019 = (String) obj2;
                String p120 = (String) p17;
                Intrinsics.checkNotNullParameter(p019, "p0");
                Intrinsics.checkNotNullParameter(p120, "p1");
                ((sh0.a) this.receiver).b(p019, p120);
                return Unit.f186387a;
            case 15:
                xx4.b p020 = (xx4.b) obj2;
                CreditPostTerminationPlanDetails p121 = (CreditPostTerminationPlanDetails) p17;
                Intrinsics.checkNotNullParameter(p020, "p0");
                Intrinsics.checkNotNullParameter(p121, "p1");
                ((xx4.d) this.receiver).b(p020, p121);
                return Unit.f186387a;
            case 16:
                Continuation frame = (Continuation) p17;
                v99.c cVar2 = (v99.c) this.receiver;
                cVar2.getClass();
                skm.l lVar = new skm.l(1, fim.h.b(frame));
                lVar.u();
                ifm.c cVarSubscribe = ((kpi.c) cVar2.f287010m.getValue()).N(9877).take(1L).subscribe(new t1j.b(new nyb.q(lVar, cVar2, 23)));
                cVar2.k.c(new FeatureCommand(new KompotOverlayFeatureConfig(new ExchangeGlobalAccessFeatureConfig$ExchangeGlobalAccessFeatureV2Destination((bla.c) obj2, AnalyticsProduct.Shared.Onboarding.f, null, true), yhi.b.SOLID, new Integer(9877), 8)));
                lVar.r(new ro7.n(cVarSubscribe, 16));
                Object objT = lVar.t();
                if (objT == fim.a.COROUTINE_SUSPENDED) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return objT;
            case 17:
                return ((ssi.m) this.receiver).b3(obj2, (Continuation) p17);
            case 18:
                ty0.a aVar2 = (ty0.a) obj2;
                vzk.u uVar = (vzk.u) ((vzk.m) this.receiver);
                uVar.getClass();
                Object obj3 = aVar2.d;
                if (obj3 instanceof vzk.j) {
                    vzk.j jVar = (vzk.j) obj3;
                    if (jVar.equals(vzk.h.f293550a)) {
                        str = aVar2.f275445a;
                    } else {
                        if (!(jVar instanceof vzk.i)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((vzk.i) obj3).f293551a;
                    }
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "NationalitiesScreenModel", a0.d.m(obj3, "unsupported parcel="), null, null, 16);
                    str = null;
                }
                if (str != null) {
                    uVar.C1(new ExternalDestination.Browser(str, null));
                }
                return Unit.f186387a;
            case 19:
                yki.b p021 = (yki.b) obj2;
                JointDeeplinkFlowContract$Step p122 = (JointDeeplinkFlowContract$Step) p17;
                Intrinsics.checkNotNullParameter(p021, "p0");
                Intrinsics.checkNotNullParameter(p122, "p1");
                com.revolut.feature.joint.impl.ui.deeplink.a aVar3 = (com.revolut.feature.joint.impl.ui.deeplink.a) this.receiver;
                if (!(p122 instanceof JointDeeplinkFlowContract$Step.Prompt)) {
                    aVar3.getClass();
                    if (!(p122 instanceof JointDeeplinkFlowContract$Step.InviteFlow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InviteFlow inviteFlow = new InviteFlow(new InviteFlowContract$InputData(((JointDeeplinkFlowContract$Step.InviteFlow) p122).f76544a, true));
                    w38.v block = new w38.v(aVar3, p021, 6);
                    Intrinsics.checkNotNullParameter(block, "block");
                    inviteFlow.H = block;
                    return inviteFlow;
                }
                com.revolut.feature.joint.impl.ui.deeplink.b bVar = aVar3.f76548q;
                JointDeeplinkFlowContract$PromptConfig config = ((JointDeeplinkFlowContract$Step.Prompt) p122).f76545a;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(config, "config");
                if (config instanceof JointDeeplinkFlowContract$PromptConfig.Cancelled) {
                    boolean z3 = ((JointDeeplinkFlowContract$PromptConfig.Cancelled) config).f76538a;
                    modelA = com.revolut.feature.joint.impl.ui.deeplink.b.a(new TextLocalisedClause(R$string.joint_home_invitation_cancelled_prompt_title, null, null, 14), new TextLocalisedClause(z3 ? R$string.joint_home_invitation_cancelled_prompt_subtitle : R$string.joint_home_invitation_cancelled_prompt_no_joint_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d051", null, null, null, 30), z3);
                } else if (config instanceof JointDeeplinkFlowContract$PromptConfig.Expired) {
                    JointDeeplinkFlowContract$PromptConfig.Expired expired = (JointDeeplinkFlowContract$PromptConfig.Expired) config;
                    String str2 = expired.f76539a;
                    long j2 = expired.f76540b;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.joint_home_invitation_expired_prompt_title, null, null, 14);
                    int i2 = R$string.joint_home_invitation_expired_prompt_no_joint_subtitle;
                    TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    TimeClause.Format.INSTANCE.getClass();
                    modelA = com.revolut.feature.joint.impl.ui.deeplink.b.a(textLocalisedClause, new TextLocalisedClause(i2, zhm.v.k(textClause, new TimeClause(j2, TimeClause.Format.f57959a, null, null, 12)), null, 12), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d101", null, null, null, 30), false);
                } else {
                    if (!(config instanceof JointDeeplinkFlowContract$PromptConfig.Rejected)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    JointDeeplinkFlowContract$PromptConfig.Rejected rejected = (JointDeeplinkFlowContract$PromptConfig.Rejected) config;
                    boolean z4 = rejected.f76541a;
                    modelA = com.revolut.feature.joint.impl.ui.deeplink.b.a(new TextLocalisedClause(R$string.joint_home_invitation_declined_prompt_title, null, null, 14), new TextLocalisedClause(z4 ? R$string.joint_home_invitation_declined_prompt_description : R$string.joint_home_invitation_declined_prompt_no_joint_description, zhm.u.c(new TextClause(rejected.f76542b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d051", null, null, null, 30), z4);
                }
                k9 value = k9.JointAccounts;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(new d67.f(modelA, new AnalyticsProduct.Retail(value), null, false));
                vx9.v block2 = new vx9.v(p122, 7, aVar3, p021);
                Intrinsics.checkNotNullParameter(block2, "block");
                fullScreenPromptScreen.H = block2;
                return fullScreenPromptScreen;
            case 20:
                r5b.p p022 = (r5b.p) obj2;
                String str3 = (String) p17;
                Intrinsics.checkNotNullParameter(p022, "p0");
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c cVar3 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) this.receiver;
                cVar3.getClass();
                int i3 = w7b.q.f295511a[p022.ordinal()];
                if (i3 == 1) {
                    cVar3.l2(new com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.b(cVar3, str3, null), new w7b.p(cVar3, i));
                } else if (i3 == 2) {
                    cVar3.C2(new a.b(str3));
                } else if (i3 == 3) {
                    cVar3.C2(new a.C0525a(str3));
                } else if (i3 == 4) {
                    cVar3.C2(a.f.f82626a);
                } else if (i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 21:
                return wac.d.a((wac.d) this.receiver, ((Boolean) obj2).booleanValue(), (Continuation) p17);
            case 22:
                String p023 = (String) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                ((com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a) this.receiver).O2(p17, p023);
                return Unit.f186387a;
            case 23:
                Function1 p024 = (Function1) obj2;
                Function2 p123 = (Function2) p17;
                Intrinsics.checkNotNullParameter(p024, "p0");
                Intrinsics.checkNotNullParameter(p123, "p1");
                return ((com.revolut.feature.retail.salary_account.impl.salary_promotion.b) this.receiver).n2(p123, p024);
            case 24:
                Function1 p025 = (Function1) obj2;
                Function2 p124 = (Function2) p17;
                Intrinsics.checkNotNullParameter(p025, "p0");
                Intrinsics.checkNotNullParameter(p124, "p1");
                return ((com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) this.receiver).n2(p124, p025);
            case 25:
                Function1 p026 = (Function1) obj2;
                Function2 p125 = (Function2) p17;
                Intrinsics.checkNotNullParameter(p026, "p0");
                Intrinsics.checkNotNullParameter(p125, "p1");
                return ((com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.c) this.receiver).n2(p125, p026);
            case 26:
                return ((xt4.c) this.receiver).b((List) obj2, (Continuation) p17);
            case 27:
                u10.q p027 = (u10.q) obj2;
                u10.q p126 = (u10.q) p17;
                Intrinsics.checkNotNullParameter(p027, "p0");
                Intrinsics.checkNotNullParameter(p126, "p1");
                ((y20.h) this.receiver).getClass();
                return Boolean.valueOf((p027.f276320g == null || p126.f276320g == null || !y20.h.f(p027, p126)) ? false : true);
            case 28:
                return com.revolut.feature_retail_user_declarations.email.screen.a.I2((com.revolut.feature_retail_user_declarations.email.screen.a) this.receiver, (String) obj2, (Continuation) p17);
            default:
                String p028 = (String) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                Intrinsics.checkNotNullParameter(p17, "p1");
                ((com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a) this.receiver).N2(p17, p028);
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(sh0.a aVar) {
        super(2, 0, sh0.a.class, aVar, "setCustomKey", "setCustomKey(Ljava/lang/String;Ljava/lang/String;)V");
        this.f = 14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(slm.p pVar) {
        super(2, 0, slm.p.class, pVar, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z");
        this.f = 9;
    }
}
