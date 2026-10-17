package bw4;

import ba4.x;
import cbh.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardStatementFinancingRedesign;
import com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.CreditCardStatementFinancingConfirmationScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.details.ChallengesOverviewDetailsScreenContract$InputData;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.PortfolioInsightsAssetIndicatorControllerContract$InputData;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.automation.contract.AutomationLaunchMode;
import com.revolut.oauth.api.consent.OAuthAuthorizeParams;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreenContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreenContract$InputData;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import et6.a1;
import et6.l2;
import java.util.List;
import java.util.Set;
import klf.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import le3.b0;
import mif.e0;
import om4.r1;
import om4.x2;
import te0.w;
import vdl.c1;
import vkm.s1;
import wim.z;
import y5b.c0;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.z0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f19236w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f19237x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f19238y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f19238y = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                s sVar = new s(continuation, (com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a) this.f19238y, 0);
                sVar.f19236w = flowCollector;
                sVar.f19237x = obj3;
                return sVar.invokeSuspend(Unit.f186387a);
            case 1:
                s sVar2 = new s(continuation, (bx6.i) this.f19238y, 1);
                sVar2.f19236w = flowCollector;
                sVar2.f19237x = obj3;
                return sVar2.invokeSuspend(Unit.f186387a);
            case 2:
                s sVar3 = new s(continuation, (com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a) this.f19238y, 2);
                sVar3.f19236w = flowCollector;
                sVar3.f19237x = obj3;
                return sVar3.invokeSuspend(Unit.f186387a);
            case 3:
                s sVar4 = new s(continuation, (by6.k) this.f19238y, 3);
                sVar4.f19236w = flowCollector;
                sVar4.f19237x = obj3;
                return sVar4.invokeSuspend(Unit.f186387a);
            case 4:
                s sVar5 = new s(continuation, (c17.s) this.f19238y, 4);
                sVar5.f19236w = flowCollector;
                sVar5.f19237x = obj3;
                return sVar5.invokeSuspend(Unit.f186387a);
            case 5:
                s sVar6 = new s(continuation, (c2f.l) this.f19238y, 5);
                sVar6.f19236w = flowCollector;
                sVar6.f19237x = obj3;
                return sVar6.invokeSuspend(Unit.f186387a);
            case 6:
                s sVar7 = new s(continuation, (com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a) this.f19238y, 6);
                sVar7.f19236w = flowCollector;
                sVar7.f19237x = obj3;
                return sVar7.invokeSuspend(Unit.f186387a);
            case 7:
                s sVar8 = new s(continuation, (c75.g) this.f19238y, 7);
                sVar8.f19236w = flowCollector;
                sVar8.f19237x = obj3;
                return sVar8.invokeSuspend(Unit.f186387a);
            case 8:
                s sVar9 = new s(continuation, (c7b.t) this.f19238y, 8);
                sVar9.f19236w = flowCollector;
                sVar9.f19237x = obj3;
                return sVar9.invokeSuspend(Unit.f186387a);
            case 9:
                s sVar10 = new s(continuation, (com.revolut.feature_move_money.impl.automation.screen.c) this.f19238y, 9);
                sVar10.f19236w = flowCollector;
                sVar10.f19237x = obj3;
                return sVar10.invokeSuspend(Unit.f186387a);
            case 10:
                s sVar11 = new s(continuation, (cbf.j) this.f19238y, 10);
                sVar11.f19236w = flowCollector;
                sVar11.f19237x = obj3;
                return sVar11.invokeSuspend(Unit.f186387a);
            case 11:
                s sVar12 = new s(continuation, (y) this.f19238y, 11);
                sVar12.f19236w = flowCollector;
                sVar12.f19237x = obj3;
                return sVar12.invokeSuspend(Unit.f186387a);
            case 12:
                s sVar13 = new s(continuation, (cbk.h) this.f19238y, 12);
                sVar13.f19236w = flowCollector;
                sVar13.f19237x = obj3;
                return sVar13.invokeSuspend(Unit.f186387a);
            case 13:
                s sVar14 = new s(continuation, (cc7.h) this.f19238y, 13);
                sVar14.f19236w = flowCollector;
                sVar14.f19237x = obj3;
                return sVar14.invokeSuspend(Unit.f186387a);
            case 14:
                s sVar15 = new s(continuation, (cia.e) this.f19238y, 14);
                sVar15.f19236w = flowCollector;
                sVar15.f19237x = obj3;
                return sVar15.invokeSuspend(Unit.f186387a);
            case 15:
                s sVar16 = new s(continuation, (com.revolut.feature.travel.miles.impl.ui.screen.home.search.a) this.f19238y, 15);
                sVar16.f19236w = flowCollector;
                sVar16.f19237x = obj3;
                return sVar16.invokeSuspend(Unit.f186387a);
            case 16:
                s sVar17 = new s(continuation, (cjj.i) this.f19238y, 16);
                sVar17.f19236w = flowCollector;
                sVar17.f19237x = obj3;
                return sVar17.invokeSuspend(Unit.f186387a);
            case 17:
                s sVar18 = new s(continuation, (clf.a) this.f19238y, 17);
                sVar18.f19236w = flowCollector;
                sVar18.f19237x = obj3;
                return sVar18.invokeSuspend(Unit.f186387a);
            case 18:
                s sVar19 = new s(continuation, (cli.v) this.f19238y, 18);
                sVar19.f19236w = flowCollector;
                sVar19.f19237x = obj3;
                return sVar19.invokeSuspend(Unit.f186387a);
            case 19:
                s sVar20 = new s(continuation, (com.revolut.feature.pay_with_smile.impl.ui.settings.a) this.f19238y, 19);
                sVar20.f19236w = flowCollector;
                sVar20.f19237x = obj3;
                return sVar20.invokeSuspend(Unit.f186387a);
            case 20:
                s sVar21 = new s(continuation, (cni.q) this.f19238y, 20);
                sVar21.f19236w = flowCollector;
                sVar21.f19237x = obj3;
                return sVar21.invokeSuspend(Unit.f186387a);
            case 21:
                s sVar22 = new s(continuation, (cq6.l) this.f19238y, 21);
                sVar22.f19236w = flowCollector;
                sVar22.f19237x = obj3;
                return sVar22.invokeSuspend(Unit.f186387a);
            case 22:
                s sVar23 = new s(continuation, (cq8.m) this.f19238y, 22);
                sVar23.f19236w = flowCollector;
                sVar23.f19237x = obj3;
                return sVar23.invokeSuspend(Unit.f186387a);
            case 23:
                s sVar24 = new s(continuation, (com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.a) this.f19238y, 23);
                sVar24.f19236w = flowCollector;
                sVar24.f19237x = obj3;
                return sVar24.invokeSuspend(Unit.f186387a);
            case 24:
                s sVar25 = new s(continuation, (com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a) this.f19238y, 24);
                sVar25.f19236w = flowCollector;
                sVar25.f19237x = obj3;
                return sVar25.invokeSuspend(Unit.f186387a);
            case 25:
                s sVar26 = new s(continuation, (csj.u) this.f19238y, 25);
                sVar26.f19236w = flowCollector;
                sVar26.f19237x = obj3;
                return sVar26.invokeSuspend(Unit.f186387a);
            case 26:
                s sVar27 = new s(continuation, (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) this.f19238y, 26);
                sVar27.f19236w = flowCollector;
                sVar27.f19237x = obj3;
                return sVar27.invokeSuspend(Unit.f186387a);
            case 27:
                s sVar28 = new s(continuation, (cuj.y) this.f19238y, 27);
                sVar28.f19236w = flowCollector;
                sVar28.f19237x = obj3;
                return sVar28.invokeSuspend(Unit.f186387a);
            case 28:
                s sVar29 = new s(continuation, this.f19238y, 28);
                sVar29.f19236w = flowCollector;
                sVar29.f19237x = obj3;
                return sVar29.invokeSuspend(Unit.f186387a);
            default:
                s sVar30 = new s(continuation, (com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a) this.f19238y, 29);
                sVar30.f19236w = flowCollector;
                sVar30.f19237x = obj3;
                return sVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow flowI;
        Flow flowB;
        vkm.d dVarB;
        AccountWrapper accountWrapper;
        Flow hVar;
        String str;
        int i;
        int i2;
        Flow c0Var;
        c7i.o oVar;
        c7i.o oVar2;
        Flow yVar;
        String id10;
        String id11;
        Flow oVar3;
        int i3 = this.u;
        int i5 = 25;
        int i6 = 28;
        w4l.i loadingStrategy = w4l.i.f294643c;
        int i21 = 0;
        w4l.h loadingStrategy2 = w4l.h.f294642c;
        ?? r132 = this.f19238y;
        Continuation continuation = null;
        int i22 = 1;
        switch (i3) {
            case 0:
                com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a aVar = (com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a) r132;
                CreditCardStatementFinancingConfirmationScreenContract$InputData creditCardStatementFinancingConfirmationScreenContract$InputData = aVar.o;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f19236w;
                    akg.n nVarV = nim.a.v(((x2) aVar.f69735q).y(creditCardStatementFinancingConfirmationScreenContract$InputData.f69731a, loadingStrategy), new bq7.j(aVar, 18));
                    if (((jte.d) aVar.f69740x).c(CreditCardApi$Toggles$CreditCardStatementFinancingRedesign.f68687c)) {
                        smd.s sVar = aVar.v;
                        String facilityId = creditCardStatementFinancingConfirmationScreenContract$InputData.f69731a;
                        sVar.getClass();
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        flowI = nim.a.v(vkm.q.q(nim.a.v(((r1) ((al4.m) sVar.f264432a)).t(facilityId, loadingStrategy2), new tpi.g(6))), new bt9.t(17));
                    } else {
                        flowI = zi0.c.i(f0.f322471a);
                    }
                    Flow flowQ = vkm.q.q(nim.a.v(u0.m(nVarV, flowI), new a26.p(aVar, 11)));
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowQ, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                bx6.i iVar = (bx6.i) r132;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f19236w;
                    akg.n nVarI = u0.i(((zfc.d) iVar.o).a(), nim.a.v(((l2) iVar.f19502p).a(), new et6.r1(8)), rd0.e.b(hng.g.b(((ang.b) iVar.f19503q).f7765a)));
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarI, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f19236w;
                    w4l.k loadingStrategy3 = (w4l.k) this.f19237x;
                    com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a aVar5 = (com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a) r132;
                    jul.o oVar4 = aVar5.f95027q;
                    PortfolioInsightsAssetIndicatorControllerContract$InputData portfolioInsightsAssetIndicatorControllerContract$InputData = aVar5.f95026p;
                    pwg.n params = new pwg.n(portfolioInsightsAssetIndicatorControllerContract$InputData.f95022a, portfolioInsightsAssetIndicatorControllerContract$InputData.f95023b);
                    oVar4.getClass();
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    swg.f fVar = (swg.f) oVar4.f178695b;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(params, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    Flow flowE = boh.f.e(fVar.f.b(params, loadingStrategy3), new os9.t(oVar4, params, 7));
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowE, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f19236w;
                    akg.n nVarA = ((by6.k) r132).o.a();
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, nVarA, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f19236w;
                    String str2 = (String) this.f19237x;
                    if (str2.length() == 0) {
                        flowB = new go.g(new OnboardingInputDataValidator$ValidationState.Empty(str2), 2);
                    } else {
                        c17.s sVar2 = (c17.s) r132;
                        flowB = rd0.e.b(((com.revolut.feature.freelancer.impl.ui.onboarding.validation.a) sVar2.f20407q).b(str2, sVar2.f20409s.f74076b));
                    }
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, flowB, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f19236w;
                    c2f.l lVar = (c2f.l) r132;
                    vkm.d dVarH = lVar.f20777q.h(lVar.o.f91135b, (w4l.k) this.f19237x);
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, dVarH, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = this.f19236w;
                    com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a aVar10 = (com.revolut.feature.defi.exchange.impl.ui.exchange_summary.a) r132;
                    wkm.l lVarP = kgm.i.p(aVar10.f71777q, aVar10.o.f71771a);
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, lVarP, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = this.f19236w;
                    vkm.d dVarB2 = rd0.e.b(((c75.g) r132).f21880p.d(loadingStrategy2));
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, dVarB2, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = this.f19236w;
                    w4l.k loadingStrategy4 = (w4l.k) this.f19237x;
                    c7b.t tVar = (c7b.t) r132;
                    l6b.i iVar2 = tVar.f21909p;
                    String str3 = tVar.o.f82566b;
                    int i100 = iVar2.f192382a;
                    Intrinsics.checkNotNullParameter(loadingStrategy4, "loadingStrategy");
                    switch (i100) {
                        case 0:
                            c6b.i iVar3 = (c6b.i) iVar2.f192383b;
                            Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                            c0 c0Var2 = iVar3.f21763a;
                            c0Var2.getClass();
                            Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                            dVarB = c0Var2.f311029g.b(Unit.f186387a, loadingStrategy2);
                            break;
                        default:
                            c6b.i iVar4 = (c6b.i) iVar2.f192383b;
                            Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                            c0 c0Var3 = iVar4.f21763a;
                            c0Var3.getClass();
                            Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                            x4l.c cVar = c0Var3.f;
                            od0.i.Companion.getClass();
                            dVarB = cVar.b(od0.h.a(str3), loadingStrategy2);
                            break;
                    }
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, dVarB, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = this.f19236w;
                    Pair pair = (Pair) this.f19237x;
                    c7i.p pVar = (c7i.p) pair.f186385a;
                    c7i.f rule = (c7i.f) pair.f186386b;
                    AccountWrapper accountWrapperA = (pVar == null || (oVar2 = pVar.f22020a) == null) ? null : oVar2.a();
                    AccountWrapper accountWrapperA2 = (pVar == null || (oVar = pVar.f22021b) == null) ? null : oVar.a();
                    com.revolut.feature_move_money.impl.automation.screen.c cVar2 = (com.revolut.feature_move_money.impl.automation.screen.c) r132;
                    k7i.i iVar5 = cVar2.f97342x;
                    AutomationLaunchMode launchMode = cVar2.o.f97328a;
                    iVar5.getClass();
                    Intrinsics.checkNotNullParameter(launchMode, "launchMode");
                    Intrinsics.checkNotNullParameter(rule, "rule");
                    int i102 = k7i.h.f182067a[rule.ordinal()];
                    if (i102 == 1) {
                        accountWrapper = accountWrapperA2;
                    } else {
                        if (i102 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        accountWrapper = accountWrapperA;
                    }
                    k7i.e eVar = (k7i.e) iVar5.f182070c;
                    Intrinsics.checkNotNullParameter(rule, "rule");
                    int i103 = k7i.a.f182058a[rule.ordinal()];
                    if (i103 != 1) {
                        if (i103 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hVar = new go.g(null, 2);
                    } else if (accountWrapper == null) {
                        hVar = new go.g(null, 2);
                    } else {
                        AccountSource accountSource = accountWrapper.d;
                        hVar = ((accountSource instanceof AccountSource.PocketSource) && accountWrapper.f97224a == j8l.a.FIAT) ? new ie7.h(mo3.a.g(n14.k.p(xam.a.h(new k7i.d(eVar, null), nim.a.v(wzi.a.a(eVar.f182063a, ((AccountSource.PocketSource) accountSource).f97213a.f163146b, hzi.c.RECURRING, null, 4), new k7c.d(8))), new k7c.d(9)), null, null, 3), accountWrapper, 28) : new go.g(null, 2);
                    }
                    k7i.g gVar = (k7i.g) iVar5.f182069b;
                    Intrinsics.checkNotNullParameter(launchMode, "launchMode");
                    Set setI = z0.i(accountWrapperA != null ? accountWrapperA.getPocketId() : null, accountWrapperA2 != null ? accountWrapperA2.getPocketId() : null);
                    if (setI.isEmpty()) {
                        c0Var = new go.g(null, 2);
                        i2 = 1;
                        i = 3;
                    } else {
                        if (launchMode instanceof AutomationLaunchMode.EditingAutomation) {
                            str = ((AutomationLaunchMode.EditingAutomation) launchMode).f97310a.f104804a.f160150a;
                        } else {
                            if (!(launchMode instanceof AutomationLaunchMode.NewAutomation)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = null;
                        }
                        i = 3;
                        i2 = 1;
                        c0Var = new ard.c0(mo3.a.g(rd0.e.b(xua.a.a(gVar.f182066a, null, 3)), null, new k1f.n(28), 1), gVar, setI, str, 11);
                    }
                    hwi.b bVar = new hwi.b(i, 20, continuation);
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = i2;
                    vkm.q.w(flowCollector10);
                    Flow[] flowArr = new Flow[2];
                    flowArr[0] = hVar;
                    flowArr[i2] = c0Var;
                    Object objG = e0.g(this, s1.f290118a, new c1((Function3) bVar, continuation, 15), flowCollector10, flowArr);
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG == obj3) {
                        return obj3;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = this.f19236w;
                    vkm.d dVarB3 = rd0.e.b(ybl.l.c(((cbf.j) r132).o, Intrinsics.f((w4l.k) this.f19237x, loadingStrategy), 2));
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector11, dVarB3, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = this.f19236w;
                    wkm.l lVarZ2 = ((gah.e) ((y) r132).u).Z2((List) this.f19237x);
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector12, lVarZ2, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = this.f19236w;
                    cbk.h hVar2 = (cbk.h) r132;
                    PendingPaymentContract$InputData pendingPaymentContract$InputData = hVar2.f22873l;
                    if (!(pendingPaymentContract$InputData instanceof PendingPaymentContract$InputData.Apm)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Flow flowZ2 = hVar2.f22874m.Z2(pendingPaymentContract$InputData);
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector13, flowZ2, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = this.f19236w;
                    zb7.f npsScreen = (zb7.f) this.f19237x;
                    yb7.a aVar17 = ((cc7.h) r132).f22951n;
                    aVar17.getClass();
                    Intrinsics.checkNotNullParameter(npsScreen, "npsScreen");
                    vb7.f fVar2 = aVar17.f312204a;
                    fVar2.getClass();
                    Intrinsics.checkNotNullParameter(npsScreen, "npsScreen");
                    efm.r rVarDoOnSubscribe = fVar2.f.f(Unit.f186387a, false).doOnSubscribe(new v6l.e0(22, new vb7.b(fVar2, 3)));
                    Intrinsics.checkNotNullExpressionValue(rVarDoOnSubscribe, "doOnSubscribe(...)");
                    vkm.d dVarB4 = rd0.e.b(nim.a.w(rVarDoOnSubscribe, new v25.k(npsScreen, i5)));
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, dVarB4, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                cia.e eVar2 = (cia.e) r132;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = this.f19236w;
                    Flow xVar = ((Boolean) this.f19237x).booleanValue() ? new x(rd0.e.b(eVar2.f24437c.b()), eVar2, 21) : new go.g(f0.f322471a, 2);
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector15, xVar, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                com.revolut.feature.travel.miles.impl.ui.screen.home.search.a aVar19 = (com.revolut.feature.travel.miles.impl.ui.screen.home.search.a) r132;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = this.f19236w;
                    qr0.i iVar6 = aVar19.o;
                    u2f.j jVar = u2f.j.MILES;
                    j23.b bVarD = yh5.b.d(iVar6.i(jVar), aVar19.f94361p.p(jVar));
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector16, bVarD, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = this.f19236w;
                    cjj.i iVar7 = (cjj.i) r132;
                    vkm.d dVarA = iVar7.f24694p.a(iVar7.o.f101092a);
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector17, dVarA, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = this.f19236w;
                    Flow gVar2 = !((j1) this.f19237x).c() ? (Flow) ((clf.a) r132).f24989l.f185480c.getValue() : new go.g(f0.f322471a, 2);
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector18, gVar2, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                cli.v vVar = (cli.v) r132;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = this.f19236w;
                    cli.o oVar5 = (cli.o) this.f19237x;
                    vVar.i++;
                    Flow gVar3 = vVar.c() ? new go.g(oVar5, 2) : new x(vkm.q.P(vVar.f, 1), oVar5, i6);
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector19, gVar3, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = this.f19236w;
                    w4l.k loadingStrategy5 = (w4l.k) this.f19237x;
                    ql9.d dVar = ((com.revolut.feature.pay_with_smile.impl.ui.settings.a) r132).o;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy5, "loadingStrategy");
                    vkm.d dVarA2 = dVar.f247561c.a(Unit.f186387a, loadingStrategy5);
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector20, dVarA2, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                cni.q qVar = (cni.q) r132;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = this.f19236w;
                    vmi.d dVar2 = qVar.f25447p;
                    OAuthAuthorizeParams params2 = qVar.o.f98492a;
                    dVar2.getClass();
                    Intrinsics.checkNotNullParameter(params2, "params");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    jhi.k kVarU = nim.a.u(new cn0.d(qVar, continuation, 3), dVar2.d.b(params2, loadingStrategy));
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector21, kVarU, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                cq6.l lVar2 = (cq6.l) r132;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = this.f19236w;
                    StakingProduct stakingProduct = (StakingProduct) this.f19237x;
                    if (stakingProduct == null) {
                        yVar = null;
                    } else {
                        cq6.c cVar3 = lVar2.f108016n;
                        xi0.b currency = lVar2.f108018q;
                        cVar3.getClass();
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        yVar = new ahd.y(new a44.c(ue0.e.R(cVar3.f108003a, j6.a.q("FLEXIBLE_STAKING_BANNER_DISMISSED_KEY_", currency.f306286a), z.d(o0.b(Boolean.TYPE))), i22), lVar2, stakingProduct, 13);
                    }
                    if (yVar == null) {
                        yVar = new go.g(null, 2);
                    }
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector22, yVar, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                cq8.m mVar = (cq8.m) r132;
                ChallengesOverviewDetailsScreenContract$InputData challengesOverviewDetailsScreenContract$InputData = mVar.o;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = this.f19236w;
                    j23.b bVarE = yh5.b.e(nim.a.v(rd0.e.b(mVar.f108034q.a(challengesOverviewDetailsScreenContract$InputData.f77401a, true)), new a26.p(mVar, 16)), rd0.e.b(mVar.f108035r.m(challengesOverviewDetailsScreenContract$InputData.f77401a, true)), rd0.e.b(mVar.f108033p.k(false)));
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector23, bVarE, this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = this.f19236w;
                    vkm.d dVarH2 = ((com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.a) r132).f96247r.h((wgl.d) this.f19237x);
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector24, dVarH2, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = this.f19236w;
                    vkm.d dVarD = eqj.d.d(((com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a) r132).o);
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector25, dVarD, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i119 = this.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = this.f19236w;
                    csj.u uVar = (csj.u) r132;
                    ge3.e eVar3 = uVar.f108498p;
                    SetCategoryBudgetsScreenContract$InputData setCategoryBudgetsScreenContract$InputData = uVar.z;
                    AccountId accountId = setCategoryBudgetsScreenContract$InputData.f101557c;
                    AccountId accountId2 = setCategoryBudgetsScreenContract$InputData.f101557c;
                    sfm.b bVarD2 = ((b0) eVar3).d(accountId, true);
                    tzi.a aVar31 = uVar.f108500r;
                    AccountId.Joint joint = accountId2 instanceof AccountId.Joint ? (AccountId.Joint) accountId2 : null;
                    if (joint != null) {
                        id10 = joint.f51413b;
                        Intrinsics.checkNotNullParameter(id10, "id");
                    } else {
                        id10 = null;
                    }
                    sfm.b bVarA = tzi.a.a(aVar31, id10);
                    AccountId.Joint joint2 = accountId2 instanceof AccountId.Joint ? (AccountId.Joint) accountId2 : null;
                    if (joint2 != null) {
                        id11 = joint2.f51413b;
                        Intrinsics.checkNotNullParameter(id11, "id");
                    } else {
                        id11 = null;
                    }
                    efm.r rVarFlatMap = tzi.a.a(aVar31, id11).flatMap(new com.onfido.android.sdk.capture.ui.userconsent.c(new csj.p(uVar, i22), i5));
                    Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
                    efm.r rVarX = ((grj.i) uVar.f108501s).d(accountId2).firstOrError().x();
                    Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                    efm.r map = w.o(bVarD2, bVarA, rVarFlatMap, rVarX, rd0.e.c(((com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b) uVar.f108505y).f101545x, kotlin.coroutines.g.f186406a)).map(new com.onfido.android.sdk.capture.ui.userconsent.c(new csj.p(uVar, i21), 24));
                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                    vkm.d dVarB5 = rd0.e.b(ue0.e.H(map, h0.f322473a, new cs.a(5)));
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector26, dVarB5, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b bVar2 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) r132;
                AsftCheckoutScreenContract$InputData asftCheckoutScreenContract$InputData = bVar2.o;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i120 = this.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector27 = this.f19236w;
                    mti.n nVar = bVar2.f98813r;
                    String airportIataCode = asftCheckoutScreenContract$InputData.f98802a;
                    String terminalId = asftCheckoutScreenContract$InputData.f98803b;
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
                    Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    pti.e eVar4 = nVar.f208863a;
                    eVar4.getClass();
                    Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    t38.e eVarM = u0.m(eVar4.e.b(terminalId, loadingStrategy2), nVar.f208864b.a(airportIataCode, loadingStrategy2));
                    vkm.d dVarB6 = rd0.e.b(bVar2.f98812q.c(true));
                    zsi.h hVar3 = bVar2.f98814s;
                    String slotId = asftCheckoutScreenContract$InputData.f;
                    mti.l lVar3 = (mti.l) hVar3;
                    lVar3.getClass();
                    Intrinsics.checkNotNullParameter(slotId, "slotId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    pti.z zVar = lVar3.f208862a;
                    zVar.getClass();
                    Intrinsics.checkNotNullParameter(slotId, "slotId");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    vkm.d dVarB7 = zVar.f.b(slotId, loadingStrategy2);
                    axi.b0 b0Var = bVar2.f98817x;
                    r10.q qVar2 = b0Var.f10946a;
                    if (qVar2.E()) {
                        r10.q qVar3 = b0Var.f10946a;
                        do3.f fVar3 = do3.f.BANKING;
                        oVar3 = new ax9.o(yh5.b.d(r10.q.m0(qVar3, fVar3, zhm.u.c(do3.s.ACTIVE), 4), r10.q.k0(qVar2, fVar3)), 3);
                    } else {
                        oVar3 = new go.g(null, 2);
                    }
                    uf0.b bVarH = yh5.b.h(eVarM, dVarB6, dVarB7, oVar3, pti.k.a(bVar2.f98815t));
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector27, bVarH, this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i121 = this.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector28 = this.f19236w;
                    w4l.k loadingStrategy6 = (w4l.k) this.f19237x;
                    cuj.y yVar2 = (cuj.y) r132;
                    stj.h hVar4 = yVar2.f109067r;
                    String collectionId = yVar2.o.f101585a;
                    hVar4.getClass();
                    Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                    Intrinsics.checkNotNullParameter(loadingStrategy6, "loadingStrategy");
                    mtj.q qVar4 = (mtj.q) hVar4.f265610a;
                    qVar4.getClass();
                    Intrinsics.checkNotNullParameter(collectionId, "collectionId");
                    Intrinsics.checkNotNullParameter(loadingStrategy6, "loadingStrategy");
                    vkm.d dVarB8 = qVar4.f208901n.b(collectionId, loadingStrategy6);
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector28, dVarB8, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i122 = this.v;
                if (i122 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector29 = this.f19236w;
                    SourcePocket sourcePocket = (SourcePocket) this.f19237x;
                    Flow flowI2 = sourcePocket != null ? zi0.c.i(sourcePocket) : (Flow) r132.getValue();
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector29, flowI2, this) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i122 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i123 = this.v;
                if (i123 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector30 = this.f19236w;
                    akg.n nVarA2 = ((a1) ((com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a) r132).o).a();
                    this.f19236w = null;
                    this.f19237x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector30, nVarA2, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i123 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
