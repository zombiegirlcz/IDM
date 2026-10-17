package ahf;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.feature.orders.ui.api.OrdersWidgetContract$Config;
import com.revolut.feature.orders.ui.api.OrdersWidgetContract$FilterQuery;
import com.revolut.feature.payments.api.PaymentsToggles$ShowAutoTopUpsOnScheduledPayments;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$ScheduledPaymentsPremiumSubscriptionsHubEntryPoint;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.retail.feature.impl.analytics_cycle.R$string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import skm.p0;
import vkm.j2;
import vkm.v1;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends oki.h implements m {

    @NotNull
    public static final p Companion = new p();
    public final dtj.a A;
    public final ypf.b B;
    public final jla.h C;
    public final v5a.c D;
    public final v67.b E;
    public final h30.q F;
    public final qm1.h G;
    public final mkd.d H;
    public final d9e.a I;
    public final a61.a J;
    public final bgc.e K;
    public final nhf.a L;
    public final cji.d M;
    public final cli.y N;
    public final g9e.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yd9.k f5103p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final be9.f f5104q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f5105r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f5106s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f5107t;
    public final ScheduledPaymentsInputData u;
    public final dhf.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ang.f f5108w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f5109x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c8i.x f5110y;
    public final chf.c z;

    public z(g9e.a subscriptionsListPresentationModel, yd9.k fxOrdersPresentationModel, be9.f ordersFilterProvider, c0 naviCommandProvider, j60.a bottomExpandableDialog, b dialogProvider, ScheduledPaymentsInputData inputData, dhf.d filterProvider, ang.f userInteractor, gte.a featureToggleInteractor, c8i.x moveMoneyFeatureChecker, chf.c incomeSorterContentProvider, dtj.a incomeSorterQueryFilter, ypf.b scheduleAvailabilityInteractor, jla.h productCatalogueInteractor, v5a.c paymentsMigrationInteractor, v67.b giroFeatureChecker, h30.q autoTopUpPaymentInteractor, qm1.h boletoFinderSearchErrorDialogProvider, mkd.d slotManagerFeedControllerModelExtension, d9e.a raisedSubscriptionsExtension, a61.a pricingPlanPartnerSubscriptionsInteractor, bgc.e rewardsInteractor, nhf.a unitedWalletInteractor, e0 stateMapper) {
        Intrinsics.checkNotNullParameter(subscriptionsListPresentationModel, "subscriptionsListPresentationModel");
        Intrinsics.checkNotNullParameter(fxOrdersPresentationModel, "fxOrdersPresentationModel");
        Intrinsics.checkNotNullParameter(ordersFilterProvider, "ordersFilterProvider");
        Intrinsics.checkNotNullParameter(naviCommandProvider, "naviCommandProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(filterProvider, "filterProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyFeatureChecker, "moveMoneyFeatureChecker");
        Intrinsics.checkNotNullParameter(incomeSorterContentProvider, "incomeSorterContentProvider");
        Intrinsics.checkNotNullParameter(incomeSorterQueryFilter, "incomeSorterQueryFilter");
        Intrinsics.checkNotNullParameter(scheduleAvailabilityInteractor, "scheduleAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(paymentsMigrationInteractor, "paymentsMigrationInteractor");
        Intrinsics.checkNotNullParameter(giroFeatureChecker, "giroFeatureChecker");
        Intrinsics.checkNotNullParameter(autoTopUpPaymentInteractor, "autoTopUpPaymentInteractor");
        Intrinsics.checkNotNullParameter(boletoFinderSearchErrorDialogProvider, "boletoFinderSearchErrorDialogProvider");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(raisedSubscriptionsExtension, "raisedSubscriptionsExtension");
        Intrinsics.checkNotNullParameter(pricingPlanPartnerSubscriptionsInteractor, "pricingPlanPartnerSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = subscriptionsListPresentationModel;
        this.f5103p = fxOrdersPresentationModel;
        this.f5104q = ordersFilterProvider;
        this.f5105r = naviCommandProvider;
        this.f5106s = bottomExpandableDialog;
        this.f5107t = dialogProvider;
        this.u = inputData;
        this.v = filterProvider;
        this.f5108w = userInteractor;
        this.f5109x = featureToggleInteractor;
        this.f5110y = moveMoneyFeatureChecker;
        this.z = incomeSorterContentProvider;
        this.A = incomeSorterQueryFilter;
        this.B = scheduleAvailabilityInteractor;
        this.C = productCatalogueInteractor;
        this.D = paymentsMigrationInteractor;
        this.E = giroFeatureChecker;
        this.F = autoTopUpPaymentInteractor;
        this.G = boletoFinderSearchErrorDialogProvider;
        this.H = slotManagerFeedControllerModelExtension;
        this.I = raisedSubscriptionsExtension;
        this.J = pricingPlanPartnerSubscriptionsInteractor;
        this.K = rewardsInteractor;
        this.L = unitedWalletInteractor;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        this.M = new cji.d("");
        Data data = new Data(null, null, true, 3, null);
        f0 f0Var = f0.f322471a;
        OrdersWidgetContract$Config ordersWidgetContract$Config = new OrdersWidgetContract$Config(wd9.d.FX, new OrdersWidgetContract$Config.Style.HeaderUnboxed(false), -1, OrdersWidgetContract$FilterQuery.EMPTY.f78614a);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        k71.q.Companion.getClass();
        this.N = mra.d.b(this, new l(data, f0Var, ordersWidgetContract$Config, "", false, chf.f.f24216a, null, f0Var, 0, 0, k71.p.a()), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(ahf.z r19, boolean r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ahf.z.I2(ahf.z, boolean, gim.c):java.lang.Object");
    }

    public static final String J2(z zVar, Object obj2) {
        if (!(obj2 instanceof lgf.a)) {
            return obj2 == null ? "type=null" : "type=".concat(obj2.getClass().getSimpleName());
        }
        lgf.a aVar = (lgf.a) obj2;
        String f60502a = aVar.f195110a.getF60502a();
        AutoTopUpState autoTopUpState = aVar.f195111b;
        String str = autoTopUpState.f60423c;
        Boolean boolValueOf = Boolean.valueOf(autoTopUpState.f60421a);
        StringBuilder sbM = v0.a.m("type=AutoTopUpPayment, methodId=", f60502a, ", topupId=", str, ", enabled=");
        sbM.append(boolValueOf);
        return sbM.toString();
    }

    @Override // yji.l
    public final void I1() {
        if (this.f226127l) {
            return;
        }
        ScheduledPaymentsInputData.InitialAction initialAction = this.u.f91973c;
        if (initialAction instanceof ScheduledPaymentsInputData.InitialAction.ShowSuccessShotDialog) {
            X1(new mii.k("INITIAL_TOAST_ID", ((ScheduledPaymentsInputData.InitialAction.ShowSuccessShotDialog) initialAction).f91976a, null, null, null, 28));
            return;
        }
        if (initialAction instanceof ScheduledPaymentsInputData.InitialAction.ShowConfirmationShotDialog) {
            ScheduledPaymentsInputData.InitialAction.ShowConfirmationShotDialog showConfirmationShotDialog = (ScheduledPaymentsInputData.InitialAction.ShowConfirmationShotDialog) initialAction;
            X1(new mii.f("INITIAL_TOAST_ID", showConfirmationShotDialog.f91974a, null, showConfirmationShotDialog.f91975b, null, null, LDSFile.EF_DG12_TAG));
        } else {
            if (initialAction != null) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit = Unit.f186387a;
        }
    }

    public final ArrayList K2(String str, List list) {
        zsc.m.Companion.getClass();
        zsc.k kVarA = this.v.a(zsc.l.a(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (kVarA.a((RecurringPaymentWithExtra) obj2)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final List L2(String str, List list) {
        if (kotlin.text.d0.W(str)) {
            return list;
        }
        OrdersWidgetContract$FilterQuery.Simple filterQuery = new OrdersWidgetContract$FilterQuery.Simple(str);
        be9.f fVar = this.f5104q;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(filterQuery, "filterQuery");
        zsc.m.Companion.getClass();
        zsc.m mVarA = zsc.l.a(str);
        be9.g gVar = new be9.g(mVarA);
        f01.c cVar = fVar.f14725a;
        be9.h hVar = new be9.h(new zsc.k(zhm.v.k(gVar, new be9.h(mVarA, cVar, 1), new be9.h(mVarA, cVar, 0))), new zsc.k(zhm.v.k(new be9.a(mVarA), new be9.c(mVarA, cVar), new be9.b(mVarA, cVar))));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (hVar.a((wd9.c) obj2)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final chf.g M2(chf.g gVar, String query) {
        if (gVar.equals(chf.f.f24216a)) {
            return gVar;
        }
        if (!(gVar instanceof chf.e)) {
            throw new NoWhenBranchMatchedException();
        }
        chf.e eVar = (chf.e) gVar;
        List list = eVar.f24213a;
        ArrayList incomeSorters = new ArrayList();
        for (Object obj2 : list) {
            dtj.a aVar = this.A;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(query, "query");
            if (query.length() != 0) {
                zsc.m.Companion.getClass();
                zsc.m query2 = zsc.l.a(query);
                f01.c uiKitResources = aVar.f117456a;
                zsc.s stringFilterFactory = aVar.f117457b;
                Intrinsics.checkNotNullParameter(query2, "query");
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                Intrinsics.checkNotNullParameter(stringFilterFactory, "stringFilterFactory");
                zsc.d dVarA = stringFilterFactory.a(query2);
                List value = zhm.v.k(new TextLocalisedClause(R$string.analytics_income_sorter_scheduled_payments_cell_description, null, null, 14), new TextLocalisedClause(R$string.analytics_income_sorter_filter_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.spending_analytics.api.R$string.analytics_income_sorter_scheduled_payments_title, null, null, 14));
                Intrinsics.checkNotNullParameter(value, "value");
                List list2 = value;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        if (dVarA.a(uiKitResources.b((Clause) it8.next()).toString())) {
                        }
                    }
                }
            }
            incomeSorters.add(obj2);
        }
        k71.q transactionsExtraData = eVar.f24214b;
        List rates = eVar.f24215c;
        Intrinsics.checkNotNullParameter(incomeSorters, "incomeSorters");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(rates, "rates");
        return new chf.e(incomeSorters, rates, transactionsExtraData);
    }

    public final b9e.c N2(b9e.c cVar, String str) {
        if (kotlin.text.d0.W(str)) {
            return cVar;
        }
        b9e.e eVar = cVar.f13735b;
        return b9e.c.a(cVar, new b9e.e(K2(str, eVar.f13737a), K2(str, eVar.f13738b), K2(str, eVar.f13739c), K2(str, eVar.d), K2(str, eVar.e), K2(str, eVar.f), K2(str, eVar.f13740g), K2(str, eVar.f13741h), K2(str, eVar.i), K2(str, eVar.f13742j), K2(str, eVar.k), K2(str, eVar.f13743l), K2(str, eVar.f13744m), K2(str, eVar.f13745n), K2(str, eVar.o)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ahf.t
            if (r0 == 0) goto L13
            r0 = r5
            ahf.t r0 = (ahf.t) r0
            int r1 = r0.f5096w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5096w = r1
            goto L18
        L13:
            ahf.t r0 = new ahf.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f5096w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f5096w = r3
            c8i.x r5 = r4.f5110y
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$FiatAccountsAll r2 = com.revolut.shared.feature.move_money.api.navigation.StartUpPocket.FiatAccountsAll.f104847a
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            w5i.f r0 = w5i.f.f295276a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ahf.z.O2(gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow flowA;
        efm.r rVarE;
        kce.q qVar = (kce.q) this.o;
        qVar.getClass();
        qua.w recurringPaymentWalletFilter = qua.w.f249340a;
        Intrinsics.checkNotNullParameter(recurringPaymentWalletFilter, "recurringPaymentWalletFilter");
        efm.r rVarI = qVar.i(recurringPaymentWalletFilter, false, null, null, true, true);
        wsg.n nVar = qVar.d;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        efm.r rVarX = nVar.x(personal).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        pcd.h filter = new pcd.h(0);
        Intrinsics.checkNotNullParameter(filter, "filter");
        efm.r rVarF = qVar.f(rVarI, rVarX, ((ypg.p) qVar.f).f(w4l.h.f294642c, filter));
        efm.r rVarB = this.f5103p.b(((l) ((j2) this.N.f22677a).getValue()).f5084c);
        efm.r rVarC = this.M.c();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        efm.r rVarDoOnNext = te0.w.y(rVarC, 300L).doOnNext(new aed.f(new o(this, 1), 26));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        chf.c cVar = this.z;
        Continuation continuation = null;
        if (((etj.o) cVar.f24208a).i()) {
            flowA = nim.a.A(xam.a.h(new chf.b(cVar, continuation, 1), rd0.e.b(cVar.f24210c.X(personal, w4l.j.f294644c))), new cge.g(11));
        } else {
            flowA = new go.g(zi0.c.P(chf.f.f24216a, false, null, 3), 2);
        }
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r rVarC2 = rd0.e.c(flowA, gVar);
        RecurringPaymentAccount recurringPaymentAccount = this.u.f91971a;
        h30.q qVar2 = this.F;
        qVar2.getClass();
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
        boolean zC = ((jte.d) ((gte.a) qVar2.f148941b)).c(PaymentsToggles$ShowAutoTopUpsOnScheduledPayments.f79164c);
        od0.i iVar = od0.i.f224256b;
        if (zC) {
            efm.r rVarR = nz8.d.r(p0.f264003c, new k0g.b(qVar2, recurringPaymentAccount, continuation, 24));
            od0.i.Companion.getClass();
            rVarE = ue0.e.E(rVarR, iVar);
        } else {
            od0.i.Companion.getClass();
            rVarE = efm.r.just(iVar);
            Intrinsics.checkNotNullExpressionValue(rVarE, "just(...)");
        }
        efm.r map = te0.w.p(rVarF, rVarB, rVarDoOnNext, rVarC2, rVarE, rd0.e.c(new v1(new ad4.c(this, continuation, 13)), gVar)).map(new aed.f(new o(this, 0), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        yji.l.b1(this, vkm.q.q(rd0.e.b(map)), null, new u(this, continuation, 3), 3);
        n2(new r(this, continuation, 0), new whi.b(6));
        if (((jte.d) this.f5109x).c(TransactionListApi$Toggles$ScheduledPaymentsPremiumSubscriptionsHubEntryPoint.f91963c)) {
            yji.l.b1(this, rd0.e.b(bgc.e.c(this.K, null, 3)), null, new u(this, continuation, 0), 3);
            yji.l.b1(this, a61.a.S(this.J), null, new u(this, continuation, 1), 3);
        }
        yji.l.b1(this, rd0.e.b(((njf.j) this.L).f()), null, new u(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.N;
    }
}
