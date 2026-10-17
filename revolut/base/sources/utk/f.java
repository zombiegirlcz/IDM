package utk;

import akg.n;
import b9.w2;
import ffk.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kwg.l;
import qij.s;
import qmc.h;
import qtb.o;
import qz9.u;
import r0e.i;
import stj.k;
import te0.w;
import tx0.z4;
import tzg.m;
import vkm.q;
import vw4.j;
import x5f.r;
import y66.p;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f283121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f283122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f283123c;

    public f(xdk.a enablePocketDialogMapper, z71.a revolutBankAccountsRepository, wsg.b newWalletsInteractor) {
        Intrinsics.checkNotNullParameter(enablePocketDialogMapper, "enablePocketDialogMapper");
        Intrinsics.checkNotNullParameter(revolutBankAccountsRepository, "revolutBankAccountsRepository");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        this.f283121a = enablePocketDialogMapper;
        this.f283122b = revolutBankAccountsRepository;
        this.f283123c = newWalletsInteractor;
    }

    public static eel.c g(pdh.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        switch (r.f302976a[cVar.ordinal()]) {
            case 1:
                return eel.c.ONE_DAY;
            case 2:
                return eel.c.ONE_WEEK;
            case 3:
                return eel.c.ONE_MONTH;
            case 4:
                return eel.c.SIX_MONTHS;
            case 5:
                return eel.c.ONE_YEAR;
            case 6:
                return eel.c.FIVE_YEAR;
            case 7:
                return eel.c.YEAR_TO_DATE;
            case 8:
                return eel.c.TEN_YEARS;
            case 9:
                return eel.c.ALL;
            case 10:
                throw new IllegalArgumentException("Unsupported time span");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public Flow a(String templateId, String str, pdh.c selectedTab) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        return xam.a.h(new a9h.c(11, this, templateId, selectedTab, str, (Continuation) null), ((h) this.f283123c).e(templateId, w4l.h.f294642c));
    }

    public Flow b(String portfolioId, pdh.c selectedTab) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        eel.c cVarG = g(selectedTab);
        return xam.a.h(new z4(this, portfolioId, cVarG, null, 8), glc.a.a((h) this.f283123c, portfolioId));
    }

    public efm.r c() {
        kge.d dVar = (kge.d) this.f283121a;
        n nVarP = dVar.p();
        g gVar = g.f186406a;
        efm.r rVarC = rd0.e.c(nVarP, gVar);
        efm.r rVarC2 = rd0.e.c(nim.a.v(dVar.q(new u(9)), new i(10)), gVar);
        efm.r rVarH = w.h(Boolean.valueOf(((o8b.c) ((n8b.a) this.f283122b)).g()));
        Boolean bool = Boolean.FALSE;
        efm.r map = w.n(rVarC, rVarC2, ue0.e.E(rVarH, bool), ue0.e.E(rd0.e.c(((rfb.b) this.f283123c).b(rfb.d.f253751a), gVar), bool)).map(new vx9.w(new j(16), 7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public v0b.b d() {
        efm.r rVarW = nim.a.w(((y69.d) ((r69.a) this.f283121a)).d(), new p(2));
        h0 h0Var = h0.f322473a;
        return ta6.a.h(rd0.e.b(ue0.e.E(m70.a.g(ue0.e.p(rVarW, h0Var), null, new y65.n(4), 1), Boolean.FALSE)), new t4j.c(((uvl.c) this.f283122b).v(), 4), q.q(rd0.e.e(new s(((k) this.f283123c).a(), 13), h0Var, new o(3, 26, (Continuation) null))), new g0c.k(4, 1, null));
    }

    public t38.e e() {
        int i = 24;
        return new t38.e(mo3.a.g(((vgc.e) ((bgc.d) this.f283121a)).b(w4l.h.f294642c), null, null, 3), i, mo3.a.g(rd0.e.b(xua.a.a((xua.a) this.f283122b, null, 3)), null, null, 3), new sne.e(this, (Continuation) null, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(hha.d r6, hha.d r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof wik.l
            if (r0 == 0) goto L13
            r0 = r8
            wik.l r0 = (wik.l) r0
            int r1 = r0.f297922w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f297922w = r1
            goto L18
        L13:
            wik.l r0 = new wik.l
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f297922w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r8)
            goto Lb5
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r8)
            int r8 = r7.f152294m
            int r6 = r6.f152294m
            if (r8 <= r6) goto L3c
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L3c:
            java.lang.Object r6 = r5.f283122b
            egk.d r6 = (egk.d) r6
            java.lang.String r8 = r7.f152287a
            wik.n r6 = (wik.n) r6
            java.lang.String r2 = "planId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            gte.a r2 = r6.f297925a
            com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles$BenefitsToLoseRedesignedBenefits r4 = com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles.BenefitsToLoseRedesignedBenefits.f102627c
            jte.d r2 = (jte.d) r2
            boolean r2 = r2.c(r4)
            if (r2 == 0) goto L65
            efm.r r6 = egk.d.a(r6, r8)
            wgk.f r8 = new wgk.f
            r2 = 12
            r8.<init>(r2)
            efm.r r6 = nim.a.w(r6, r8)
            goto L82
        L65:
            pfk.x r6 = r6.f297926b
            w4l.f r6 = r6.d
            od0.h r2 = od0.i.Companion
            r2.getClass()
            od0.i r8 = od0.h.a(r8)
            r2 = 0
            efm.r r6 = r6.f(r8, r2)
            wgk.f r8 = new wgk.f
            r2 = 13
            r8.<init>(r2)
            efm.r r6 = nim.a.w(r6, r8)
        L82:
            wdb.b r8 = new wdb.b
            r2 = 26
            r8.<init>(r5, r2)
            efm.r r6 = pd.b.r(r6, r8)
            wg2.g r8 = new wg2.g
            r2 = 7
            r8.<init>(r5, r7, r2)
            efm.r r6 = pd.b.r(r6, r8)
            r7 = 3
            r8 = 0
            efm.r r6 = m70.a.g(r6, r8, r8, r7)
            zhm.f0 r7 = zhm.f0.f322471a
            efm.r r6 = ue0.e.E(r6, r7)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r7 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.f297922w = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto Lb5
            return r1
        Lb5:
            java.util.List r8 = (java.util.List) r8
            boolean r6 = r8.isEmpty()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: utk.f.f(hha.d, hha.d, gim.c):java.lang.Object");
    }

    public f(c12.f extension, z80.b phoneToolsProvider, zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f283121a = extension;
        this.f283122b = phoneToolsProvider;
        this.f283123c = regexMatcher;
    }

    public f(r69.a inboxInteractor, uvl.c securityHubNotificationsInteractor, k rewardsHubNotificationsInteractor) {
        Intrinsics.checkNotNullParameter(inboxInteractor, "inboxInteractor");
        Intrinsics.checkNotNullParameter(securityHubNotificationsInteractor, "securityHubNotificationsInteractor");
        Intrinsics.checkNotNullParameter(rewardsHubNotificationsInteractor, "rewardsHubNotificationsInteractor");
        this.f283121a = inboxInteractor;
        this.f283122b = securityHubNotificationsInteractor;
        this.f283123c = rewardsHubNotificationsInteractor;
    }

    public f(v60.e serverErrorsProvider, sf0.h serverErrorParser, fb9.b userUnder18ErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(userUnder18ErrorParser, "userUnder18ErrorParser");
        this.f283121a = serverErrorsProvider;
        this.f283122b = serverErrorParser;
        this.f283123c = userUnder18ErrorParser;
    }

    public f(kge.d apmHomeActionsProvider, n8b.a countryInteractor, rfb.b salaryAccountFeatureChecker) {
        Intrinsics.checkNotNullParameter(apmHomeActionsProvider, "apmHomeActionsProvider");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(salaryAccountFeatureChecker, "salaryAccountFeatureChecker");
        this.f283121a = apmHomeActionsProvider;
        this.f283122b = countryInteractor;
        this.f283123c = salaryAccountFeatureChecker;
    }

    public f(bgc.d rentAndBillsInteractor, xua.a recurringPaymentInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(rentAndBillsInteractor, "rentAndBillsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f283121a = rentAndBillsInteractor;
        this.f283122b = recurringPaymentInteractor;
        this.f283123c = dateProvider;
    }

    public f(t pricingPlanInteractor, egk.d pricingPlansBenefitsInteractor, l93.f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansBenefitsInteractor, "pricingPlansBenefitsInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f283121a = pricingPlanInteractor;
        this.f283122b = pricingPlansBenefitsInteractor;
        this.f283123c = revolutCardsInteractor;
    }

    public f(ybl.b instrumentTickerInteractor, qrk.c stockInsightsInteractor, zhl.k instrumentHistoricalPricesInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stockInsightsInteractor, "stockInsightsInteractor");
        Intrinsics.checkNotNullParameter(instrumentHistoricalPricesInteractor, "instrumentHistoricalPricesInteractor");
        this.f283121a = instrumentTickerInteractor;
        this.f283122b = stockInsightsInteractor;
        this.f283123c = instrumentHistoricalPricesInteractor;
    }

    public f(vfg.p assetListSourceProvider, w2 widgetProvider, gnh.b configProvider, m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(assetListSourceProvider, "assetListSourceProvider");
        Intrinsics.checkNotNullParameter(widgetProvider, "widgetProvider");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f283121a = assetListSourceProvider;
        this.f283122b = widgetProvider;
        this.f283123c = wealthAccountsInteractor;
    }

    public f(emc.e templatesInteractor, l complexAnalyticsInteractor, h roboPortfolioInfoProvider) {
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsInteractor, "complexAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        this.f283121a = templatesInteractor;
        this.f283122b = complexAnalyticsInteractor;
        this.f283123c = roboPortfolioInfoProvider;
    }
}
