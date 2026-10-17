package pof;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import djb.q;
import efm.d0;
import ffk.t;
import k71.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mjf.l0;
import mjf.w;
import org.jetbrains.annotations.NotNull;
import pnh.a0;
import r10.r;
import rnf.s;
import thf.m;
import tof.a3;
import wsg.n;
import ynf.l;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends ori.a implements a {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f237987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f237988c;
    public final ifm.b d;
    public final mhf.a e;
    public final zxd.c f;

    static {
        new TransactionContext(new Priority.HIGH("Transaction details screen"), null, 2);
    }

    public j(b state, com.revolut.domain.interactors.transactions.a transactionsInteractor, eqj.g transactionAnalyticsInteractor, n walletInteractor, cl3.a contactsInteractor, k61.a transferInteractor, d3j.b beneficiaryInteractor, xua.a recurringPaymentInteractor, w transactionOwnerNameProvider, u71.a splitBillRepository, vv9.c moneyRequestInteractor, o71.a beneficiaryRepository, w39.b locationInteractor, ang.f userInteractor, t pricingPlanInteractor, ifm.b flowDisposable, c61.a groupsDataProvider, g6e.d subaccountInteractor, m transactionTextResourcesMapper, mhf.a accountNotificationsInteractor, zxd.c statementsInteractor, fal.b suspiciousTransactionInteractor, r securityDelayItemProvider, yig.a trustedMerchantsRepository, eli.j twoFaErrorHandler, toa.a notificationSettingsInteractor, wif.a userFeaturesChecker, xoj.a featuresInteractor, gte.a featureToggleInteractor, k7i.i suspiciousTransactionBannerFactory, uhf.a limitExceededBannerProvider, l0 warrantInteractor, l warrantWidgetMapper, nhf.a unitedWalletInteractor, ppg.a customisedVaultInteractor, q savingsTransactionsInteractor, al4.m creditCardInstalmentInteractor, fm4.a creditCardInstalmentModelProvider, al4.e debitToInstalmentInteractor, bd3.a cashbackInteractor, a31.a donationsAvailabilityInteractor, eub.a revPointsAvailabilityInteractor, vo1.c billsFeatureChecker, vnf.a helpItemsProvider, bej.m esimStatementsInteractor, com.google.firebase.messaging.t actionDelegateFactory, cw9.d paymentsProductFeatureChecker, co9.b paymentCounterpartyInteractor, wnf.b commonTransactionContentMapper, xqe.b teenProfileInteractor, wsg.b newWalletInteractor, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionAnalyticsInteractor, "transactionAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(transactionOwnerNameProvider, "transactionOwnerNameProvider");
        Intrinsics.checkNotNullParameter(splitBillRepository, "splitBillRepository");
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        Intrinsics.checkNotNullParameter(groupsDataProvider, "groupsDataProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(accountNotificationsInteractor, "accountNotificationsInteractor");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(suspiciousTransactionInteractor, "suspiciousTransactionInteractor");
        Intrinsics.checkNotNullParameter(securityDelayItemProvider, "securityDelayItemProvider");
        Intrinsics.checkNotNullParameter(trustedMerchantsRepository, "trustedMerchantsRepository");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(suspiciousTransactionBannerFactory, "suspiciousTransactionBannerFactory");
        Intrinsics.checkNotNullParameter(limitExceededBannerProvider, "limitExceededBannerProvider");
        Intrinsics.checkNotNullParameter(warrantInteractor, "warrantInteractor");
        Intrinsics.checkNotNullParameter(warrantWidgetMapper, "warrantWidgetMapper");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(customisedVaultInteractor, "customisedVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsTransactionsInteractor, "savingsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentModelProvider, "creditCardInstalmentModelProvider");
        Intrinsics.checkNotNullParameter(debitToInstalmentInteractor, "debitToInstalmentInteractor");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(billsFeatureChecker, "billsFeatureChecker");
        Intrinsics.checkNotNullParameter(helpItemsProvider, "helpItemsProvider");
        Intrinsics.checkNotNullParameter(esimStatementsInteractor, "esimStatementsInteractor");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        Intrinsics.checkNotNullParameter(commonTransactionContentMapper, "commonTransactionContentMapper");
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        Intrinsics.checkNotNullParameter(newWalletInteractor, "newWalletInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f237987b = state;
        this.f237988c = transactionsInteractor;
        this.d = flowDisposable;
        this.e = accountNotificationsInteractor;
        this.f = statementsInteractor;
        Intrinsics.checkNotNullExpressionValue(ihm.b.e(new q21.a()), "createDefault(...)");
        Intrinsics.checkNotNullExpressionValue(ihm.b.e(new q21.a()), "createDefault(...)");
        new ne0.d();
        final int i = 0;
        Function0 single = new Function0(this) { // from class: pof.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f237984b;

            {
                this.f237984b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        j jVar = this.f237984b;
                        b bVar = jVar.f237987b;
                        a3 a3Var = (a3) te0.w.O(((c) bVar).x0());
                        if (a3Var != null) {
                            String strName = a3Var.e.name();
                            c cVar = (c) bVar;
                            if (cVar.f237977h.getValue(cVar, c.f237973m[6]).get() == s.CRYPTO || !k.x0(a3Var)) {
                                strName = null;
                            }
                            d0 d0VarFirstOrError = m70.a.g(((ryd.w) jVar.f).k(a3Var.f272581b, a3Var.f272624y.f273143a, strName), null, new pj9.m(29), 1).firstOrError();
                            if (d0VarFirstOrError != null) {
                                return d0VarFirstOrError;
                            }
                        }
                        ufm.c cVarL = d0.l(new IllegalStateException());
                        Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                        return cVarL;
                    default:
                        j jVar2 = this.f237984b;
                        a3 a3Var2 = (a3) te0.w.O(((c) jVar2.f237987b).x0());
                        if (a3Var2 != null) {
                            d0 d0VarFirstOrError2 = m70.a.g(((ryd.w) jVar2.f).j(a3Var2.f272581b), null, new e(0), 1).firstOrError();
                            if (d0VarFirstOrError2 != null) {
                                return d0VarFirstOrError2;
                            }
                        }
                        ufm.c cVarL2 = d0.l(new IllegalStateException());
                        Intrinsics.checkNotNullExpressionValue(cVarL2, "error(...)");
                        return cVarL2;
                }
            }
        };
        Intrinsics.checkNotNullParameter(single, "single");
        actionDelegateFactory.g(new ac1.b(18, single));
        final int i2 = 1;
        Function0 single2 = new Function0(this) { // from class: pof.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f237984b;

            {
                this.f237984b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        j jVar = this.f237984b;
                        b bVar = jVar.f237987b;
                        a3 a3Var = (a3) te0.w.O(((c) bVar).x0());
                        if (a3Var != null) {
                            String strName = a3Var.e.name();
                            c cVar = (c) bVar;
                            if (cVar.f237977h.getValue(cVar, c.f237973m[6]).get() == s.CRYPTO || !k.x0(a3Var)) {
                                strName = null;
                            }
                            d0 d0VarFirstOrError = m70.a.g(((ryd.w) jVar.f).k(a3Var.f272581b, a3Var.f272624y.f273143a, strName), null, new pj9.m(29), 1).firstOrError();
                            if (d0VarFirstOrError != null) {
                                return d0VarFirstOrError;
                            }
                        }
                        ufm.c cVarL = d0.l(new IllegalStateException());
                        Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                        return cVarL;
                    default:
                        j jVar2 = this.f237984b;
                        a3 a3Var2 = (a3) te0.w.O(((c) jVar2.f237987b).x0());
                        if (a3Var2 != null) {
                            d0 d0VarFirstOrError2 = m70.a.g(((ryd.w) jVar2.f).j(a3Var2.f272581b), null, new e(0), 1).firstOrError();
                            if (d0VarFirstOrError2 != null) {
                                return d0VarFirstOrError2;
                            }
                        }
                        ufm.c cVarL2 = d0.l(new IllegalStateException());
                        Intrinsics.checkNotNullExpressionValue(cVarL2, "error(...)");
                        return cVarL2;
                }
            }
        };
        Intrinsics.checkNotNullParameter(single2, "single");
        actionDelegateFactory.g(new ac1.b(18, single2));
        actionDelegateFactory.f(new a0(this, 17));
    }

    @Override // ori.a, nri.a
    public final void i3() {
        c cVar = (c) this.f237987b;
        d0 d0VarFirstOrError = cVar.f237977h.getValue(cVar, c.f237973m[6]).c(te0.s.f270018a).firstOrError();
        po9.w wVar = new po9.w(3, new d(this, 1));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, wVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        pfm.a aVar2 = new pfm.a(aVar, new os2.g(new pjg.k(new BreadcrumbException(), 11)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new lhi.b(20, i.f237986a), h.f237985a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.d, hVarW);
    }
}
