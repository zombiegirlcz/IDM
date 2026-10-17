package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2;

import aii.m;
import aii.n;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$Step;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.a;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.IncomeSorterCreationScenario;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CurrencySelectionMode;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kqd.g;
import kqd.j;
import kqd.k;
import kqd.o;
import kqd.t;
import kqd.u;
import mii.l;
import oki.h;
import yki.i;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends h implements o {
    public final IncomeSorterFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kqd.e f87820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v6e.a f87821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c1l.e f87822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final prl.e f87823s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f87824t;

    public e(IncomeSorterFlowContract$InputData inputData, kqd.e incomeSorterDestinationsUpdatesProvider, v6e.a createSubaccountFlowProvider, c1l.e tradingOnboardingStartCommandProvider, prl.e selectIncomeTransactionFilterProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(incomeSorterDestinationsUpdatesProvider, "incomeSorterDestinationsUpdatesProvider");
        Intrinsics.checkNotNullParameter(createSubaccountFlowProvider, "createSubaccountFlowProvider");
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(selectIncomeTransactionFilterProvider, "selectIncomeTransactionFilterProvider");
        this.o = inputData;
        this.f87820p = incomeSorterDestinationsUpdatesProvider;
        this.f87821q = createSubaccountFlowProvider;
        this.f87822r = tradingOnboardingStartCommandProvider;
        this.f87823s = selectIncomeTransactionFilterProvider;
        this.f87824t = d8l.d.a(this, new kj4.c(this, 13));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof kqd.r
            if (r0 == 0) goto L13
            r0 = r8
            kqd.r r0 = (kqd.r) r0
            int r1 = r0.f188400x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f188400x = r1
            goto L18
        L13:
            kqd.r r0 = new kqd.r
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f188400x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.List r7 = r0.u
            java.util.List r7 = (java.util.List) r7
            yhm.o.b(r8)
            goto L7d
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            com.revolut.retail.feature.api.AnalyticsAccount$Personal$All r8 = com.revolut.retail.feature.api.AnalyticsAccount.Personal.All.f99192a
            java.util.List r8 = zhm.u.c(r8)
            prl.e r7 = r7.f87823s
            r7.getClass()
            java.lang.String r2 = "accounts"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.Object r2 = r7.e
            ge3.a r2 = (ge3.a) r2
            r4 = r8
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Set r4 = zhm.d0.i1(r4)
            le3.f r2 = (le3.f) r2
            kotlinx.coroutines.flow.Flow r2 = r2.e(r4)
            rqd.l r4 = new rqd.l
            r5 = 0
            r4.<init>(r7, r8, r5)
            jhi.k r7 = nim.a.u(r4, r2)
            koe.x r2 = new koe.x
            r4 = 23
            r2.<init>(r4)
            jhi.b r7 = mo3.a.g(r7, r5, r2, r3)
            r2 = r8
            java.util.List r2 = (java.util.List) r2
            r0.u = r2
            r0.f188400x = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            r6 = r8
            r8 = r7
            r7 = r6
        L7d:
            com.revolut.feature.categorisation.api.model.CategorisationFilter r8 = (com.revolut.feature.categorisation.api.model.CategorisationFilter) r8
            com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$Step$SelectIncome r0 = new com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.IncomeSorterFlowContract$Step$SelectIncome
            r0.<init>(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e.I2(com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kqd.s
            if (r0 == 0) goto L13
            r0 = r12
            kqd.s r0 = (kqd.s) r0
            int r1 = r0.f188401w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f188401w = r1
            goto L18
        L13:
            kqd.s r0 = new kqd.s
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f188401w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L5c
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig r4 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams r8 = new com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType r12 = com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType.TRADING
            r8.<init>(r3, r12)
            grl.k9 r12 = grl.k9.Trading
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r2 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r2 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r9 = com.google.android.gms.internal.mlkit_vision_face.a.h(r12, r2, r12)
            r7 = 0
            com.revolut.retail.core.navigation.DummyCommand r5 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = 0
            c1l.e r12 = r10.f87822r
            ufm.b r11 = r12.b(r5, r4, r11)
            r0.f188401w = r3
            java.lang.Object r12 = nim.a.b(r11, r0)
            if (r12 != r1) goto L5c
            return r1
        L5c:
            com.revolut.retail.core.navigation.NaviCommand r12 = (com.revolut.retail.core.navigation.NaviCommand) r12
            kotlin.jvm.internal.Intrinsics.h(r12)
            com.revolut.kompot.bridge.navigation.BridgeDestination r11 = zh9.u0.b(r12)
            r10.C1(r11)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e.J2(com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType, gim.c):java.lang.Object");
    }

    public final void K2() {
        kpj.a aVar = new kpj.a(5);
        i iVar = this.f87824t;
        if (h.E2(iVar, aVar)) {
            iVar.e(true);
        } else {
            h.t2(this, this.f87824t, IncomeSorterFlowContract$Step.IncomeSortersList.f87803a, false, null, false, 12);
        }
    }

    public final void L2(l lVar) {
        yji.l.b1(this, X1(lVar), null, null, 7);
    }

    @Override // yki.j
    public final void M0() {
        FlowStep incomeSorterDetails;
        IncomeSorterFlowContract$InputData.InitialScreen initialScreen = this.o.f87778a;
        boolean z = initialScreen instanceof IncomeSorterFlowContract$InputData.InitialScreen.IncomeSorterCreation;
        IncomeSorterFlowContract$InputData.InitialScreen.SelectIncome selectIncome = IncomeSorterFlowContract$InputData.InitialScreen.SelectIncome.f87783a;
        if (!z && !(initialScreen instanceof IncomeSorterFlowContract$InputData.InitialScreen.IncomeSortersList) && !(initialScreen instanceof IncomeSorterFlowContract$InputData.InitialScreen.IncomeSorterExecutionScreen) && !(initialScreen instanceof IncomeSorterFlowContract$InputData.InitialScreen.IncomeSorterDetails)) {
            if (!Intrinsics.f(initialScreen, selectIncome)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new d(this, null), new yi5.b(26));
            return;
        }
        if (z) {
            incomeSorterDetails = new IncomeSorterFlowContract$Step.IncomeSorterDetails(new IncomeSortersDetailsContract$InputData(new IncomeSortersDetailsContract$InputData.Mode.Create(((IncomeSorterFlowContract$InputData.InitialScreen.IncomeSorterCreation) initialScreen).f87779a, IncomeSorterCreationScenario.Default.f87833a)));
        } else if (initialScreen instanceof IncomeSorterFlowContract$InputData.InitialScreen.IncomeSortersList) {
            incomeSorterDetails = IncomeSorterFlowContract$Step.IncomeSortersList.f87803a;
        } else {
            if (Intrinsics.f(initialScreen, selectIncome)) {
                throw new IllegalStateException("SelectIncome should be resolved in onCreateEmpty");
            }
            if (initialScreen instanceof IncomeSorterFlowContract$InputData.InitialScreen.IncomeSorterExecutionScreen) {
                incomeSorterDetails = new IncomeSorterFlowContract$Step.IncomeSorterExecution(((IncomeSorterFlowContract$InputData.InitialScreen.IncomeSorterExecutionScreen) initialScreen).f87781a);
            } else {
                if (!(initialScreen instanceof IncomeSorterFlowContract$InputData.InitialScreen.IncomeSorterDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                incomeSorterDetails = new IncomeSorterFlowContract$Step.IncomeSorterDetails(new IncomeSortersDetailsContract$InputData(new IncomeSortersDetailsContract$InputData.Mode.Update(((IncomeSorterFlowContract$InputData.InitialScreen.IncomeSorterDetails) initialScreen).f87780a)));
            }
        }
        h.t2(this, this.f87824t, incomeSorterDetails, false, null, false, 12);
    }

    @Override // yji.l
    public final n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Continuation continuation = null;
        if (event instanceof kqd.l) {
            kqd.l lVar = (kqd.l) event;
            h.t2(this, this.f87824t, new IncomeSorterFlowContract$Step.IncomeSorterDestinations(lVar.f188387b, lVar.f188388c), true, null, false, 12);
            return null;
        }
        boolean z = event instanceof a.d;
        int i = 2;
        CreateSubaccountFlowProvider$CurrencySelectionMode.FiatOnly fiatOnly = CreateSubaccountFlowProvider$CurrencySelectionMode.FiatOnly.f88976a;
        if (z) {
            CreateSubaccountFlowProvider$CreateSubaccountType[] elements = {new CreateSubaccountFlowProvider$CreateSubaccountType.Personal(fiatOnly), new CreateSubaccountFlowProvider$CreateSubaccountType.Group(fiatOnly)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            h.t2(this, this.f87824t, new IncomeSorterFlowContract$Step.CreateSubaccount(null, kotlin.collections.d.y0(elements), ((a.d) event).f87813b), true, null, false, 12);
            return null;
        }
        if (event instanceof a.c) {
            h.t2(this, this.f87824t, new IncomeSorterFlowContract$Step.CreateSubaccount(null, y0.b(new CreateSubaccountFlowProvider$CreateSubaccountType.Personal(fiatOnly)), ((a.c) event).f87812b), true, null, false, 12);
            return null;
        }
        if (event instanceof j) {
            j jVar = (j) event;
            h.t2(this, this.f87824t, new IncomeSorterFlowContract$Step.CreateSavings(jVar.f188383b, jVar.f188384c), true, null, false, 12);
            return null;
        }
        int i2 = 6;
        if (event instanceof a.C0549a) {
            n2(new t(this, null), new whi.b(i2));
            return null;
        }
        if (event instanceof kqd.i) {
            n2(new kq5.d(this, event, continuation, i), new whi.b(i2));
            return null;
        }
        if (event instanceof a.b) {
            n2(new u(this, null), new whi.b(i2));
            return null;
        }
        if (event instanceof kqd.h) {
            kqd.h hVar = (kqd.h) event;
            h.t2(this, this.f87824t, new IncomeSorterFlowContract$Step.CreateSubaccount(hVar.f188380b, y0.b(new CreateSubaccountFlowProvider$CreateSubaccountType.Joint(fiatOnly)), hVar.f188381c), true, null, false, 12);
            return null;
        }
        if (event instanceof kqd.m) {
            h.t2(this, this.f87824t, new IncomeSorterFlowContract$Step.IncomeSorterDetails(new IncomeSortersDetailsContract$InputData(new IncomeSortersDetailsContract$InputData.Mode.Update(((kqd.m) event).f188389b))), true, null, false, 12);
            return null;
        }
        if (event instanceof g) {
            g gVar = (g) event;
            h.t2(this, this.f87824t, new IncomeSorterFlowContract$Step.SelectIncome(gVar.f188378b, gVar.f188379c), true, null, false, 12);
            return null;
        }
        if (event instanceof k) {
            k kVar = (k) event;
            h.t2(this, this.f87824t, new IncomeSorterFlowContract$Step.CreateTransfer(kVar.f188385b, kVar.f188386c, kVar.d), true, null, false, 12);
            return null;
        }
        if (event instanceof a.e) {
            h.t2(this, this.f87824t, IncomeSorterFlowContract$Step.IncomeSortersList.f87803a, false, null, false, 12);
            return null;
        }
        if (!(event instanceof kqd.n)) {
            return super.o2(event);
        }
        kqd.n nVar = (kqd.n) event;
        h.t2(this, this.f87824t, new IncomeSorterFlowContract$Step.Review(nVar.f188390b, nVar.f188391c, nVar.d, nVar.e, nVar.f, nVar.f188392g, nVar.f188393h), true, null, false, 12);
        return null;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f87824t;
    }
}
