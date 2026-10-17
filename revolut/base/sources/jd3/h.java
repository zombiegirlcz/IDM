package jd3;

import android.content.Intent;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.cashback.api.navigation.YourCashbackFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import iz1.p;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import od3.t0;
import ofm.q;
import sfe.m;
import sfe.s;
import tof.a3;
import yji.n;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends pfe.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f172958m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t0 f172959n;
    public final nd3.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x6e.d f172960p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final id3.a f172961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.feature.rev_points.api.navigation.a f172962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bd3.a f172963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fk3.a f172964t;

    public h(j60.a bottomExpandableDialogControllerExtension, t0 changeCurrencyBottomDialogProvider, nd3.d cashbackTransactionsFilterProvider, x6e.d subaccountEventProvider, id3.a cashbackCurrencyEventHandler, com.revolut.feature.rev_points.api.navigation.a revPointsNavigationFactory, bd3.a cashbackInteractor, fk3.a configInteractor) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(changeCurrencyBottomDialogProvider, "changeCurrencyBottomDialogProvider");
        Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(subaccountEventProvider, "subaccountEventProvider");
        Intrinsics.checkNotNullParameter(cashbackCurrencyEventHandler, "cashbackCurrencyEventHandler");
        Intrinsics.checkNotNullParameter(revPointsNavigationFactory, "revPointsNavigationFactory");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        this.f172958m = bottomExpandableDialogControllerExtension;
        this.f172959n = changeCurrencyBottomDialogProvider;
        this.o = cashbackTransactionsFilterProvider;
        this.f172960p = subaccountEventProvider;
        this.f172961q = cashbackCurrencyEventHandler;
        this.f172962r = revPointsNavigationFactory;
        this.f172963s = cashbackInteractor;
        this.f172964t = configInteractor;
    }

    @Override // yji.n
    public final void D2() {
        n.j2(this, rd0.e.b(this.f172960p.f303064a), null, new f(this, null), 3);
    }

    @Override // pfe.a
    public final Set Z2() {
        return y0.b(this.f172961q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v15 */
    @Override // pfe.c
    public final Object b3(s sVar, Continuation continuation) {
        Intent intent;
        String stringExtra;
        if (sVar instanceof m) {
            m mVar = (m) sVar;
            String str = mVar.f262419a;
            Object obj2 = mVar.f262421c;
            int iHashCode = str.hashCode();
            if (iHashCode != 1263947577) {
                if (iHashCode != 1643945447) {
                    if (iHashCode == 1689613475 && str.equals("HOME_ACTION_INFO_ID")) {
                        dj0.d dVar = obj2 instanceof dj0.d ? (dj0.d) obj2 : null;
                        if (dVar == null) {
                            throw new NullPointerException("Payload of action with id ID_DETAILS_ACTION should be Money");
                        }
                        A2(new BridgeDestination(new FeatureCommand(new YourCashbackFeatureConfig.PlanCashbackDetails(dVar))));
                    }
                } else if (str.equals("ID_WITHDRAW_ACTION")) {
                    aVar = obj2 instanceof uc3.a ? (uc3.a) obj2 : 0;
                    if (aVar == 0) {
                        throw new NullPointerException("Payload of action with id ID_WITHDRAW_ACTION should be cashback box");
                    }
                    A2(new YourCashbackFeatureConfig.WithdrawPlanCashbackDestination(aVar));
                }
            } else if (str.equals("ID_CHANGE_CURRENCY_ACTION")) {
                V2(new p(this, mVar, aVar, 25), new yi5.b(29));
            }
        } else if (sVar instanceof sfe.n) {
            Object obj3 = ((sfe.n) sVar).f262423b;
            koi.j jVar = obj3 instanceof koi.j ? (koi.j) obj3 : null;
            if (jVar != null) {
                qv0.p pVar = jVar instanceof qv0.p ? (qv0.p) jVar : null;
                Object f58324n = pVar != null ? pVar.getE() : null;
                if (Intrinsics.f(jVar.getF53634a(), "ID_TRANSACTIONS_SEE_ALL_ITEM")) {
                    V2(new d(this, null), new yi5.b(29));
                } else if (f58324n instanceof a3) {
                    A2(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(q.P((a3) f58324n), null, null, null, 126))));
                }
            } else {
                t tVar = obj3 instanceof t ? (t) obj3 : null;
                if (tVar != null) {
                    ActionWidgetDelegate.Model model = tVar.f54722b;
                    if (Intrinsics.f(model.f51590a, "ID_POCKET_REV_POINTS_BANNER")) {
                        ActionWidgetDelegate.a aVar = tVar.f54721a;
                        if (Intrinsics.f(aVar, ActionWidgetDelegate.a.c.f51609a)) {
                            Object obj4 = model.f51596l;
                            uc3.a aVar2 = obj4 instanceof uc3.a ? (uc3.a) obj4 : null;
                            if (aVar2 == null) {
                                throw new NullPointerException("Withdraw action must contain cashback box in parcel");
                            }
                            V2(new p(this, aVar2, aVar, 26), new yi5.b(29));
                        } else if (Intrinsics.f(aVar, ActionWidgetDelegate.a.d.f51610a)) {
                            V2(new e(this, null), new yi5.b(29));
                        } else if (!Intrinsics.f(aVar, ActionWidgetDelegate.a.C0395a.f51607a) && !(aVar instanceof com.revolut.core.ui_kit.delegates.h) && !Intrinsics.f(aVar, ActionWidgetDelegate.a.b.f51608a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
        } else if (sVar instanceof sfe.i) {
            sfe.i iVar = (sfe.i) sVar;
            if (iVar.f262413b == -1 && iVar.f262412a == 4 && (intent = iVar.f262414c) != null && (stringExtra = intent.getStringExtra("argCurrency")) != null) {
                this.f172961q.Z2(stringExtra);
            }
        }
        return Unit.f186387a;
    }
}
