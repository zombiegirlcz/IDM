package od3;

import com.google.common.collect.ImmutableMap;
import com.revolut.data.model.Data;
import com.revolut.feature.cashback.api.models.CashbackBySources;
import com.revolut.feature.cashback.api.models.CashbackSource;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class s0 extends jki.g implements g0 {

    @NotNull
    public static final i0 Companion = new i0();
    public final p9g.g A;
    public final fk3.a B;
    public final l C;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CashbackProductScreenContract$InputData f224298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bd3.a f224299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f224300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nd3.d f224301s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t0 f224302t;
    public final y0 u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map f224303w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final nd3.j f224304x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qpg.b f224305y;
    public final al4.q z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(jki.p stateMapper, CashbackProductScreenContract$InputData inputData, bd3.a cashbackInteractor, a statusViewConfigurationFactory, nd3.d cashbackTransactionsFilterProvider, t0 changeCurrencyBottomDialogProvider, y0 planCashbackTotalBottomDialogProvider, j60.a bottomExpandableDialogControllerExtension, ImmutableMap productDataProviders, nd3.j cashbackUpgradeNavigationDelegate, qpg.b euShieldControllerModelExtension, al4.q creditCardProductInteractor, p9g.g staysFeatureEntryPointCommandFactory, fk3.a configInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(statusViewConfigurationFactory, "statusViewConfigurationFactory");
        Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(changeCurrencyBottomDialogProvider, "changeCurrencyBottomDialogProvider");
        Intrinsics.checkNotNullParameter(planCashbackTotalBottomDialogProvider, "planCashbackTotalBottomDialogProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(productDataProviders, "productDataProviders");
        Intrinsics.checkNotNullParameter(cashbackUpgradeNavigationDelegate, "cashbackUpgradeNavigationDelegate");
        Intrinsics.checkNotNullParameter(euShieldControllerModelExtension, "euShieldControllerModelExtension");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(staysFeatureEntryPointCommandFactory, "staysFeatureEntryPointCommandFactory");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        this.f224298p = inputData;
        this.f224299q = cashbackInteractor;
        this.f224300r = statusViewConfigurationFactory;
        this.f224301s = cashbackTransactionsFilterProvider;
        this.f224302t = changeCurrencyBottomDialogProvider;
        this.u = planCashbackTotalBottomDialogProvider;
        this.v = bottomExpandableDialogControllerExtension;
        this.f224303w = productDataProviders;
        this.f224304x = cashbackUpgradeNavigationDelegate;
        this.f224305y = euShieldControllerModelExtension;
        this.z = creditCardProductInteractor;
        this.A = staysFeatureEntryPointCommandFactory;
        this.B = configInteractor;
        this.C = new l(inputData.f65720a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f65721b, A2(inputData.f65720a).a());
    }

    public static final dj0.d y2(s0 s0Var, CashbackBySources cashbackBySources) {
        Object next;
        dj0.d dVar;
        CashbackProductScreenContract$InputData cashbackProductScreenContract$InputData = s0Var.f224298p;
        ArrayList arrayList = cashbackBySources.f65686b;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((CashbackSource) next).f65689b == cashbackProductScreenContract$InputData.f65720a) {
                break;
            }
        }
        CashbackSource cashbackSource = (CashbackSource) next;
        if (cashbackSource != null && (dVar = cashbackSource.f65688a) != null) {
            return dVar;
        }
        throw new IllegalStateException("Can't find cashbackSourceType " + cashbackProductScreenContract$InputData.f65720a + ". Available types: " + arrayList);
    }

    public static final boolean z2(s0 s0Var, CashbackBySources cashbackBySources) {
        Object next;
        CashbackProductScreenContract$InputData cashbackProductScreenContract$InputData = s0Var.f224298p;
        ArrayList arrayList = cashbackBySources.f65686b;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((CashbackSource) next).f65689b == cashbackProductScreenContract$InputData.f65720a) {
                break;
            }
        }
        CashbackSource cashbackSource = (CashbackSource) next;
        if (cashbackSource != null) {
            return cashbackSource.f65690c;
        }
        throw new IllegalStateException("Can't find cashbackSourceType " + cashbackProductScreenContract$InputData.f65720a + ". Available types: " + arrayList);
    }

    public final pd3.a A2(uc3.d dVar) {
        pd3.a aVar = (pd3.a) this.f224303w.get(dVar);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("No ProductDataProvider found for cashback type " + dVar + ". Please make sure you provided it in CashbackProductScreenModule");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.q(A2(this.f224298p.f65720a).b()), null, null, new j0(this, continuation, 0), 3);
        yji.l.a1(this, rd0.e.b(this.f224299q.e()), null, null, new j0(this, continuation, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.C;
    }
}
