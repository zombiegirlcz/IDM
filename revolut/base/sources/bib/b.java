package bib;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.webkit.WebView;
import androidx.camera.camera2.adapter.CameraFactoryAdapter;
import androidx.camera.camera2.adapter.CameraFactoryProvider;
import androidx.camera.camera2.impl.CameraInteropStateCallbackRepository;
import androidx.camera.camera2.pipe.core.DurationNs;
import androidx.camera.core.impl.CameraThreadConfig;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import b96.d;
import bfl.g;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerErrorPage;
import com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$Step;
import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreen;
import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreenContract$InputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$InputData;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$TargetPriceInputValue;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanContextualSelectionLayoutParams;
import com.revolut.retail.feature.pricing_plans.ui.impl.analytics.PricingPlanAnalyticsSource;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureDestination;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$CombinedAuthentication;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import com.revolut.sso.impl.ui.auth.AuthenticationFlowContract$InputData;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlow;
import com.revolut.tracking.v3.SettingsMultifactorContext;
import com.revolut.trading.orders.R$string;
import com.revolut.trading.orders.ui.invest.placement.models.InvestOutputValue;
import cuc.c;
import d27.d0;
import e0f.b1;
import e0f.e1;
import e0f.f0;
import e0f.i0;
import e0f.z0;
import eul.w;
import eul.x;
import ggk.g1;
import grl.fb;
import grl.hb;
import grl.jb;
import gvl.j;
import gvl.p;
import ip0.vh0;
import ip0.zh0;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import jhk.h;
import joi.v;
import k7c.l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import ljl.q0;
import n4d.t;
import nii.y0;
import nsf.r;
import o7j.a0;
import oul.k;
import oul.l;
import qv0.i;
import rch.o;
import wgb.n;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15466c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(NewRevolutCardDelegate newRevolutCardDelegate, NewRevolutCardView newRevolutCardView, Ref$ObjectRef ref$ObjectRef, NewRevolutCardDelegate.Model model) {
        this.f15464a = 12;
        this.f15465b = newRevolutCardDelegate;
        this.d = newRevolutCardView;
        this.f15466c = ref$ObjectRef;
        this.e = model;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a() {
        /*
            Method dump skipped, instruction units count: 2943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bib.b.a():java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r12v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.q] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        int i2 = this.f15464a;
        int i3 = 23;
        Object[] objArr = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f15466c;
        Object obj5 = this.f15465b;
        switch (i2) {
            case 0:
                ((o) obj5).invoke(new bek.a(i3), new d((Ref$ObjectRef) obj4, (wdb.b) obj3, (n) obj2, null, 15));
                return Unit.f186387a;
            case 1:
                Function3 function3 = (Function3) obj5;
                String str = (String) obj4;
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj3;
                Clause clause = (Clause) obj2;
                if (function3 != null) {
                    Click click = new Click(30, (Integer) null, (Object) null, str, false);
                    String string = spannableStringBuilder.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    function3.invoke(click, string, clause);
                }
                return Unit.f186387a;
            case 2:
                Function3 function32 = (Function3) obj5;
                Style style = (Style) obj4;
                SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) obj3;
                Clause clause2 = (Clause) obj2;
                if (function32 != null) {
                    String string2 = spannableStringBuilder2.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    function32.invoke(style, string2, clause2);
                }
                return Unit.f186387a;
            case 3:
                return APMPMWebContainerErrorPage.showIfNeeded$lambda$0((APMPMWebContainerErrorPage) obj5, (WebView) obj4, (String) obj3, (String) obj2);
            case 4:
                return InfiniteTransitionKt.animateValue$lambda$1$0(obj5, (InfiniteTransition.TransitionAnimationState) obj4, obj3, (InfiniteRepeatableSpec) obj2);
            case 5:
                ((q) obj5).invoke(new d0(26), new c((Ref$ObjectRef) obj4, (Function1) obj3, (Function0) obj2, (Continuation) null, 17));
                return Unit.f186387a;
            case 6:
                ((cgf.b) ((i0) obj5).f121614a).b(((e0f.d0) ((f0) obj4)).f121591b, (FeatureCommand) obj2, (String) obj3);
                return Unit.f186387a;
            case 7:
                ((cgf.b) ((e1) obj5).f121597a).b(((z0) ((b1) obj4)).f121712c, (FeatureCommand) obj2, (String) obj3);
                return Unit.f186387a;
            case 8:
                InvestOutputValue investOutputValue = (InvestOutputValue) obj5;
                x xVar = (x) obj4;
                aul.b inputMode = (aul.b) obj3;
                g tradeSide = (g) obj2;
                if (!d9.e1.D(investOutputValue.f106856a)) {
                    return null;
                }
                ChargeBreakdown chargeBreakdown = investOutputValue.f106857b;
                Intrinsics.checkNotNullParameter(inputMode, "inputMode");
                Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                if (chargeBreakdown != null) {
                    Amount amount = chargeBreakdown.f104722a;
                    if (d9.e1.G(amount.f104717a)) {
                        Intrinsics.checkNotNullParameter(amount, "<this>");
                        xVar.e().getClass();
                        if (!l4i.a.d(amount)) {
                            return null;
                        }
                        dj0.d dVarG = xVar.g(amount);
                        int i5 = w.d[tradeSide.ordinal()];
                        if (i5 == 1) {
                            int i6 = w.e[inputMode.ordinal()];
                            if (i6 == 1) {
                                i = R$string.wealth_stock_orders_hint_after_fee_format;
                            } else {
                                if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i = R$string.wealth_stock_orders_hint_inc_fee_format;
                            }
                        } else {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i21 = w.e[inputMode.a().ordinal()];
                            if (i21 == 1) {
                                i = R$string.wealth_stock_orders_hint_after_fee_format;
                            } else {
                                if (i21 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i = R$string.wealth_stock_orders_hint_inc_fee_format;
                            }
                        }
                        return xVar.a(new TextLocalisedClause(i, u.c(new MoneyClause(dVarG, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12));
                    }
                }
                if (chargeBreakdown == null || d9.e1.I(chargeBreakdown.f104722a.f104717a)) {
                    return xVar.a(new TextLocalisedClause(R$string.wealth_stock_orders_hint_no_fees, null, null, 14));
                }
                return null;
            case 9:
                return mra.d.b((gvl.o) obj5, (j) obj4, (a3e.u) obj3, (p) obj2, false, 8);
            case 10:
                List holders = (List) obj4;
                String sectionKey = (String) obj3;
                v vVar = ((hoi.p) obj5).f154341h;
                qv0.c fallback = ((hoi.n) obj2).d();
                vVar.getClass();
                Intrinsics.checkNotNullParameter(holders, "holders");
                Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
                Intrinsics.checkNotNullParameter(fallback, "fallback");
                koi.b bVarB = vVar.b(sectionKey, holders);
                Intrinsics.checkNotNullParameter(fallback, "fallback");
                koi.j jVar = bVarB != null ? bVarB.e : null;
                i iVar = jVar instanceof i ? (i) jVar : null;
                qv0.c f51675h = iVar != null ? iVar.getF53566g() : null;
                return f51675h == null ? fallback : f51675h;
            case 11:
                TransferReasonsScreen transferReasonsScreen = (TransferReasonsScreen) obj5;
                TransferReasonsScreenContract$InputData transferReasonsScreenContract$InputData = (TransferReasonsScreenContract$InputData) obj4;
                Flow flow = (Flow) obj3;
                Flow flow2 = (Flow) obj2;
                KProperty[] kPropertyArr = TransferReasonsScreen.T;
                qji.b bVarU2 = transferReasonsScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.reasons.di.TransferReasonsScreenInjector");
                nsf.q qVar = (nsf.q) ((itf.a) bVarU2).q().mo3808a(transferReasonsScreen);
                switch (qVar.f218847a) {
                    case 0:
                        qVar.d = transferReasonsScreenContract$InputData;
                        break;
                    default:
                        qVar.d = transferReasonsScreenContract$InputData;
                        break;
                }
                switch (qVar.f218847a) {
                    case 0:
                        qVar.e = flow;
                        break;
                    default:
                        qVar.e = flow;
                        break;
                }
                switch (qVar.f218847a) {
                    case 0:
                        qVar.f = flow2;
                        break;
                    default:
                        qVar.f = flow2;
                        break;
                }
                return (r) qVar.mo3783build();
            case 12:
                NewRevolutCardDelegate newRevolutCardDelegate = (NewRevolutCardDelegate) obj5;
                NewRevolutCardView newRevolutCardView = (NewRevolutCardView) obj3;
                NewRevolutCardDelegate.Model model = (NewRevolutCardDelegate.Model) obj2;
                NewRevolutCardDelegate.Model model2 = (NewRevolutCardDelegate.Model) ((Ref$ObjectRef) obj4).f186409a;
                if (model2 != null) {
                    model = model2;
                }
                newRevolutCardDelegate.t(newRevolutCardView, model);
                return Unit.f186387a;
            case 13:
                SwipeToActionDelegate.Companion companion = SwipeToActionDelegate.INSTANCE;
                ((SwipeToActionDelegate) obj5).t(((zh0) obj4).f, (wh) obj3, (SwipeToActionDelegate.SwipeAction) obj2, vh0.CLICK);
                return Unit.f186387a;
            case 14:
                hha.d dVar = (hha.d) obj5;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b bVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.b) obj4;
                g1 g1Var = (g1) obj3;
                hha.d dVar2 = (hha.d) obj2;
                if (dVar.f152296p) {
                    bVar.C2(new h(dVar));
                } else {
                    PlansDashboardLayout$PlanPageLayout$BillingOptions plansDashboardLayout$PlanPageLayout$BillingOptions = g1Var.k;
                    if (plansDashboardLayout$PlanPageLayout$BillingOptions == null) {
                        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("PlanSelectionCoreFlowModel.handleGetPlanClick: billingOptions is null. PlanId: ", g1Var.f143718a));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        return Unit.f186387a;
                    }
                    SelectedBillingPlan.Plan plan = new SelectedBillingPlan.Plan(dVar);
                    jhk.c cVar = bVar.o;
                    bVar.f103091q.Z2(new phk.i(plan, cVar.f174281c, plansDashboardLayout$PlanPageLayout$BillingOptions, cVar.f174282g), new j2c.o(bVar, 8, dVar, dVar2));
                }
                return Unit.f186387a;
            case 15:
                com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar2 = (com.revolut.feature.crypto.receive_widget.impl.ui.customize.c) obj5;
                cVar2.n2(new i4g.d(27, cVar2, (String) obj4, (wk5.a) obj3, (List) obj2, null), new whi.b(6));
                return Unit.f186387a;
            case 16:
                com.revolut.feature.product.lifecycle.flow.a aVar = (com.revolut.feature.product.lifecycle.flow.a) obj4;
                ProductLifecycleFlowContract$Step productLifecycleFlowContract$Step = (ProductLifecycleFlowContract$Step) obj3;
                jja.a aVar2 = (jja.a) obj2;
                if (((Ref$BooleanRef) obj5).f186407a) {
                    aVar.getClass();
                    aVar.l2(new l0(aVar, objArr == true ? 1 : 0, 16), new ke7.v(aVar, 11));
                } else {
                    aVar.getClass();
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    aVar.l2(new i4g.d(28, aVar, productLifecycleFlowContract$Step, aVar2, ref$BooleanRef, null), new ja3.d(aVar, ref$BooleanRef, productLifecycleFlowContract$Step, aVar2, 11));
                }
                return Unit.f186387a;
            case 17:
                ((q) obj5).invoke(new kxb.c(7), new knd.h0((AtomicReference) obj4, (Function1) obj3, (Function1) obj2, null, 14));
                return Unit.f186387a;
            case 18:
                CombinedAuthenticationFlow combinedAuthenticationFlow = (CombinedAuthenticationFlow) obj5;
                return new ljl.j(((q0) kli.a.n(combinedAuthenticationFlow.m2())).E, combinedAuthenticationFlow, (RevolutSsoApi$InputData$CombinedAuthentication) obj4, (ywj.i) obj3, (UICustomization) obj2);
            case 19:
                return CameraFactoryAdapter.appComponent_delegate$lambda$0((Context) obj5, (CameraThreadConfig) obj4, (CameraFactoryAdapter) obj3, (CameraInteropStateCallbackRepository) obj2);
            case 20:
                return CameraFactoryProvider.newInstance$lambda$0((CameraFactoryProvider) obj5, (Context) obj4, (CameraThreadConfig) obj3, (DurationNs) obj2);
            case 21:
                return new AnalyticsContext(m72.b.h("circuit_breaker", com.bumptech.glide.c.g(new t((String) obj5, (String) obj4, (String) obj3, (String) obj2, 2)), AnalyticsContext.INSTANCE));
            case 22:
                Boolean bool = (Boolean) obj5;
                jb jbVar = (jb) obj4;
                hb hbVar = (hb) obj3;
                fb fbVar = (fb) obj2;
                SettingsMultifactorContext.a aVarNewBuilder = SettingsMultifactorContext.newBuilder();
                if (bool != null) {
                    Intrinsics.h(aVarNewBuilder);
                    boolean zBooleanValue = bool.booleanValue();
                    aVarNewBuilder.c();
                    ((SettingsMultifactorContext) aVarNewBuilder.f49761b).setCodeAutofilled(zBooleanValue);
                }
                aVarNewBuilder.c();
                ((SettingsMultifactorContext) aVarNewBuilder.f49761b).setOutcome(jbVar);
                if (hbVar != null) {
                    aVarNewBuilder.c();
                    ((SettingsMultifactorContext) aVarNewBuilder.f49761b).setKind(hbVar);
                }
                if (fbVar != null) {
                    aVarNewBuilder.c();
                    ((SettingsMultifactorContext) aVarNewBuilder.f49761b).setFlow(fbVar);
                }
                AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
                w0 w0VarA = aVarNewBuilder.a();
                companion2.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
            case 23:
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b bVar2 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b) obj5;
                CommodityTargetPriceScreenContract$InputData commodityTargetPriceScreenContract$InputData = (CommodityTargetPriceScreenContract$InputData) obj4;
                q7j.g gVar = (q7j.g) obj3;
                a0 a0Var = (a0) obj2;
                BigDecimal bigDecimal = commodityTargetPriceScreenContract$InputData.f99912a;
                if (bigDecimal == null) {
                    bigDecimal = BigDecimal.ZERO;
                }
                Intrinsics.h(bigDecimal);
                return mra.d.b(bVar2, new o7j.j(new CommodityTargetPriceScreenContract$TargetPriceInputValue(bigDecimal, Boolean.TRUE, true), commodityTargetPriceScreenContract$InputData.f99913b, commodityTargetPriceScreenContract$InputData.f99914c, commodityTargetPriceScreenContract$InputData.d, commodityTargetPriceScreenContract$InputData.e, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), gVar, a0Var, false, 8);
            case 24:
                AuthenticationFlow authenticationFlow = (AuthenticationFlow) obj5;
                UICustomization uICustomization = (UICustomization) obj2;
                q0 q0Var = ((q0) kli.a.n(authenticationFlow.m2())).E;
                mki.b bVarQ2 = authenticationFlow.q2();
                bVarQ2.getClass();
                uICustomization.getClass();
                return new ljl.c(q0Var, authenticationFlow, (AuthenticationFlowContract$InputData) obj4, bVarQ2, (yil.a) obj3, uICustomization);
            case 25:
                return mra.d.b((com.revolut.trading.orders.ui.invest.placement.target_price.b) obj5, (k) obj4, (oul.n) obj3, (l) obj2, false, 8);
            case 26:
                return a();
            case 27:
                return vhi.c.c(new InternalPricingPlanFeatureDestination.PlanContextualSelection((PricingPlanAnalyticsSource) obj5, (String) obj4, (hha.w0) obj3, (PricingPlanContextualSelectionLayoutParams) obj2), yhi.b.POPUP, null, false, 12);
            case 28:
                ((com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d) obj5).l2(new oqk.i((AtomicReference) obj4, (ph4.c) obj3, (com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.a) obj2, null, 19), new pfk.h0(i3));
                return Unit.f186387a;
            default:
                qg7.u uVar = (qg7.u) obj5;
                String termsUrl = (String) obj3;
                String str2 = (String) obj2;
                sg7.a aVar3 = uVar.f245692s;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
                yji.l.a1(uVar, uVar.X1(new y0(null, new nii.l0(new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.lottery_draw_reject_claim_reward_second_reject_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.lottery_draw_reject_claim_reward_second_reject_description, u.c(new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.lottery_draw_reject_claim_reward_second_reject_description_terms, null, new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) termsUrl, "SECOND_CONFIRMATION_URL_CLICK_ID", false), 10)), null, 12), null, new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.lottery_draw_reject_claim_reward_second_reject_primary_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.lottery_draw_reject_claim_reward_second_reject_secondary_action, null, null, 14), null, false, aVar3.f262599a, 868), false, 5)), null, null, new a9h.c(new qg7.k(uVar, 0, (String) obj4, str2), uVar, termsUrl, str2, (Continuation) null, 6), 3);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f15464a = i;
        this.f15465b = obj2;
        this.f15466c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(Function2 function2, AtomicReference atomicReference, Function1 function1, Function1 function12) {
        this.f15464a = 17;
        this.f15465b = (q) function2;
        this.f15466c = atomicReference;
        this.d = function1;
        this.e = function12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(Function2 function2, Ref$ObjectRef ref$ObjectRef, Function1 function1, Function0 function0) {
        this.f15464a = 5;
        this.f15465b = (q) function2;
        this.f15466c = ref$ObjectRef;
        this.d = function1;
        this.e = function0;
    }
}
