package toh;

import au.c0;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.feature.payments.api.PaymentsToggles$ScanBill;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import cxe.u;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lcd.p;
import lcd.q;
import pcd.j;
import pcd.r;
import pfm.t;
import rnb.w;
import smd.s;
import vdl.i0;
import ybh.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements cr6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f273214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f273215b;

    public /* synthetic */ d() {
        this.f273214a = new ArrayList();
        this.f273215b = new ArrayList();
    }

    public static dj0.d b(dj0.d dVar, List list, xi0.b bVar) {
        Object next;
        xi0.b bVar2 = dVar.f115083b;
        if (Intrinsics.f(bVar2, bVar)) {
            return dVar;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            n9l.a aVar = (n9l.a) next;
            if (Intrinsics.f(aVar.f213661a, bVar2) && Intrinsics.f(aVar.f213662b, bVar)) {
                break;
            }
        }
        n9l.a aVar2 = (n9l.a) next;
        if (aVar2 == null) {
            return null;
        }
        return pyd.c.K(dVar, aVar2.f213663c, bVar);
    }

    public static boolean d(SavingsAccountDetails account, od0.i tradingOnboardingStatus) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(tradingOnboardingStatus, "tradingOnboardingStatus");
        SavingsProductData savingsProductData = account.f86462c;
        int i = r.f234880a[account.f86460a.f234883c.ordinal()];
        if (i == 1 || i == 2) {
            return false;
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (savingsProductData != null) {
            jjb.b bVar = jjb.c.Companion;
            cfl.b bVar2 = (cfl.b) tradingOnboardingStatus.f224257a;
            bVar.getClass();
            if (jjb.b.a(savingsProductData, bVar2) != jjb.c.NORMAL) {
                return false;
            }
        }
        return true;
    }

    public static u g(d dVar, q accountTypeFilter, int i) {
        pcd.j kVar;
        if ((i & 1) != 0) {
            accountTypeFilter = lcd.n.f193865a;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(accountTypeFilter, "accountTypeFilter");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        w wVar = (w) dVar.f273214a;
        Intrinsics.checkNotNullParameter(accountTypeFilter, "<this>");
        if (accountTypeFilter instanceof lcd.n) {
            kVar = j.d.f234867a;
        } else if (accountTypeFilter instanceof lcd.m) {
            kVar = j.c.f234866a;
        } else if (accountTypeFilter instanceof p) {
            kVar = new pcd.l(((p) accountTypeFilter).f193867a);
        } else if (accountTypeFilter instanceof lcd.o) {
            kVar = new pcd.k(((lcd.o) accountTypeFilter).f193866a);
        } else if (accountTypeFilter.equals(lcd.k.f193862a)) {
            kVar = j.a.f234864a;
        } else {
            if (!accountTypeFilter.equals(lcd.l.f193863a)) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = j.b.f234865a;
        }
        Continuation continuation = null;
        return nim.a.A(rd0.e.e(xam.a.h(new c0(dVar, accountTypeFilter, continuation, 27), nim.a.v(wVar.d(new pcd.e(kVar)), new xif.c(15))), h0.f322473a, new x18.c(3, 12, continuation)), new xif.c(14));
    }

    public ufm.i a() {
        ufm.c cVar = new ufm.c(new aua.b((aua.f) this.f273214a, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        ufm.n nVarI0 = te0.w.i0(cVar);
        ak7.g gVar = new ak7.g("Failed to get APP_RATING_SHOWN_DATE", 17);
        int i = 1;
        ufm.f fVar = new ufm.f(nVarI0, new aua.a(gVar, i), i);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnError(...)");
        ufm.i iVar = new ufm.i(fVar, new ypg.l(new yo7.p(this, 24), 26), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r6, java.lang.String r7, k4l.e0 r8, bfl.g r9, gim.c r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof w2b.g
            if (r0 == 0) goto L13
            r0 = r10
            w2b.g r0 = (w2b.g) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            w2b.g r0 = new w2b.g
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f294018x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            int r6 = r0.f294017w
            bfl.g r9 = r0.v
            java.lang.String r7 = r0.u
            yhm.o.b(r10)
            goto L62
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r10)
            java.lang.Integer r8 = r8.o
            if (r8 == 0) goto Lb2
            int r8 = r8.intValue()
            java.lang.Object r10 = r5.f273215b
            ybl.d r10 = (ybl.d) r10
            w4l.h r2 = w4l.h.f294642c
            ael.y r10 = (ael.y) r10
            vkm.d r6 = r10.e(r6, r2)
            r10 = 3
            jhi.b r6 = mo3.a.g(r6, r4, r4, r10)
            r0.u = r7
            r0.v = r9
            r0.f294017w = r8
            r0.z = r3
            java.lang.Object r10 = vkm.q.x(r6, r0)
            if (r10 != r1) goto L61
            return r1
        L61:
            r6 = r8
        L62:
            wel.e r10 = (wel.e) r10
            java.util.ArrayList r8 = r10.e
            r0 = 0
            if (r8 == 0) goto L71
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L71
            r1 = r0
            goto L8f
        L71:
            java.util.Iterator r8 = r8.iterator()
            r1 = r0
        L76:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r8.next()
            kel.g r2 = (kel.g) r2
            boolean r2 = r2 instanceof kel.n
            if (r2 == 0) goto L76
            int r1 = r1 + 1
            if (r1 < 0) goto L8b
            goto L76
        L8b:
            zhm.v.r()
            throw r4
        L8f:
            if (r1 >= r6) goto L94
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L94:
            java.lang.Object r6 = r5.f273214a
            o7.b r6 = (o7.b) r6
            com.revolut.feature.retail.cfd.impl.screens.order.utils.CfdOpenPositionsDelegate$OpenPositions r6 = r6.i(r10, r7)
            java.math.BigDecimal r7 = java.math.BigDecimal.ZERO
            java.lang.String r8 = "ZERO"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            a4b.g r6 = a4b.h.a(r6, r9, r7)
            a4b.g r7 = a4b.g.OPEN_POSITION
            if (r6 != r7) goto Lac
            goto Lad
        Lac:
            r3 = r0
        Lad:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        Lb2:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: toh.d.c(java.lang.String, java.lang.String, k4l.e0, bfl.g, gim.c):java.lang.Object");
    }

    public t e() {
        aua.f fVar = (aua.f) this.f273214a;
        long jMillis = ((Clock) this.f273215b).millis();
        pfm.h hVar = new pfm.h(new aua.d(fVar, jMillis, 1), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        t tVarM = te0.w.g0(hVar).m(new aua.a(new ak7.g(p.a.m(jMillis, "Failed to set APP_RATING_SHOWN_DATE="), 17), 5));
        Intrinsics.checkNotNullExpressionValue(tVarM, "doOnError(...)");
        return tVarM;
    }

    public Flow f(List portfolioIds, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(portfolioIds, "portfolioIds");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        return portfolioIds.isEmpty() ? zi0.c.i(f0.f322471a) : boh.f.e(i0.a((i0) this.f273214a, portfolioIds), new x52.a(this, targetCurrency, 9));
    }

    public boolean h() {
        if (((SplitBillInputData) this.f273215b).f79198b.size() == 1) {
            return ((jte.d) ((gte.a) this.f273214a)).c(PaymentsToggles$ScanBill.f79163c);
        }
        return false;
    }

    public d(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f273214a = languageProvider;
        this.f273215b = yhm.j.b(new tyl.a(this, 10));
    }

    public d(gte.a featureToggleInteractor, SplitBillInputData inputData) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f273214a = featureToggleInteractor;
        this.f273215b = inputData;
    }

    public d(zq.a wealthMarginAvailabilityInteractor, j6h.c giaMarginCommandProvider) {
        Intrinsics.checkNotNullParameter(wealthMarginAvailabilityInteractor, "wealthMarginAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(giaMarginCommandProvider, "giaMarginCommandProvider");
        this.f273214a = wealthMarginAvailabilityInteractor;
        this.f273215b = giaMarginCommandProvider;
    }

    public d(d3j.b beneficiaryInteractor, lra.d cardOwnersInteractor) {
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(cardOwnersInteractor, "cardOwnersInteractor");
        this.f273214a = beneficiaryInteractor;
        this.f273215b = cardOwnersInteractor;
    }

    public d(eub.a revPointsAvailabilityInteractor, nyb.k revPointsInteractor) {
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        this.f273214a = revPointsAvailabilityInteractor;
        this.f273215b = revPointsInteractor;
    }

    public d(kbb.c screenerMetricsProvider, jt0.b statsGroupMetricsProvider) {
        Intrinsics.checkNotNullParameter(screenerMetricsProvider, "screenerMetricsProvider");
        Intrinsics.checkNotNullParameter(statsGroupMetricsProvider, "statsGroupMetricsProvider");
        this.f273214a = screenerMetricsProvider;
        this.f273215b = statsGroupMetricsProvider;
    }

    public d(ln.a navigationCommandsDispatcher, qpk.b rateDetailsFeatureConfigProvider) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(rateDetailsFeatureConfigProvider, "rateDetailsFeatureConfigProvider");
        this.f273214a = navigationCommandsDispatcher;
        this.f273215b = rateDetailsFeatureConfigProvider;
    }

    public d(x8h.k displayCurrencyInteractor, s displayCurrencyConvertionInteractor) {
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyConvertionInteractor, "displayCurrencyConvertionInteractor");
        this.f273214a = displayCurrencyInteractor;
        this.f273215b = displayCurrencyConvertionInteractor;
    }

    public d(o7.b cfdOpenPositionsDelegate, a4b.h cfdOrderPositionsOutcomeProvider, ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(cfdOpenPositionsDelegate, "cfdOpenPositionsDelegate");
        Intrinsics.checkNotNullParameter(cfdOrderPositionsOutcomeProvider, "cfdOrderPositionsOutcomeProvider");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f273214a = cfdOpenPositionsDelegate;
        this.f273215b = portfolioInteractor;
    }

    public d(t1j.b portfolioRecurringOrdersInteractor, qmc.h roboPortfolioInfoProvider) {
        Intrinsics.checkNotNullParameter(portfolioRecurringOrdersInteractor, "portfolioRecurringOrdersInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        this.f273214a = portfolioRecurringOrdersInteractor;
        this.f273215b = roboPortfolioInfoProvider;
    }

    public d(aua.f ratingRepository, Clock clock) {
        Intrinsics.checkNotNullParameter(ratingRepository, "ratingRepository");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f273214a = ratingRepository;
        this.f273215b = clock;
    }

    public d(i0 repository, ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f273214a = repository;
        this.f273215b = ratesInteractor;
    }

    public d(vo6.b faqDataProvider, wf0.f repository) {
        Intrinsics.checkNotNullParameter(faqDataProvider, "faqDataProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f273214a = faqDataProvider;
        this.f273215b = repository;
    }

    public d(w savingsVaultInteractor, ijb.a savingsProductInteractor) {
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        this.f273214a = savingsVaultInteractor;
        this.f273215b = savingsProductInteractor;
    }

    public d(ika.f fVar, us6.q qVar) {
        this.f273214a = fVar;
        this.f273215b = qVar;
        e4m.b.b(new ufh.e(this, 26));
    }

    public d(usb.s contributionSelectionWidgetMapper, ozg.a compositeAddMoneyDependenciesApi, d0 validationMapper) {
        Intrinsics.checkNotNullParameter(contributionSelectionWidgetMapper, "contributionSelectionWidgetMapper");
        Intrinsics.checkNotNullParameter(compositeAddMoneyDependenciesApi, "compositeAddMoneyDependenciesApi");
        Intrinsics.checkNotNullParameter(validationMapper, "validationMapper");
        this.f273214a = contributionSelectionWidgetMapper;
        this.f273215b = compositeAddMoneyDependenciesApi;
    }

    public d(String paymentCode, QrCodeImage image) {
        Intrinsics.checkNotNullParameter(paymentCode, "paymentCode");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f273214a = paymentCode;
        this.f273215b = image;
    }
}
