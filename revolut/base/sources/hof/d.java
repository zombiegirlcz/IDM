package hof;

import aw0.k7;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tga.k;
import thf.m;
import tof.a3;
import tof.o3;
import tof.p0;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wnf.b f154281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f154282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0i.b f154283c;
    public final kgm.c d;
    public final k e;
    public final ang.f f;

    public d(wnf.b commonMapper, m transactionTextResourcesMapper, b recurringPaymentItemsMapper, w0i.b transparentPricingFeatureStateChecker, kgm.c orderQuoteFeeAndLimitsInteractor, k upgradeEntryPointItemProvider, ang.f userInteractor, l4i.a amountConverter, e settlementDelayMapper) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(recurringPaymentItemsMapper, "recurringPaymentItemsMapper");
        Intrinsics.checkNotNullParameter(transparentPricingFeatureStateChecker, "transparentPricingFeatureStateChecker");
        Intrinsics.checkNotNullParameter(orderQuoteFeeAndLimitsInteractor, "orderQuoteFeeAndLimitsInteractor");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemProvider, "upgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(settlementDelayMapper, "settlementDelayMapper");
        this.f154281a = commonMapper;
        this.f154282b = transactionTextResourcesMapper;
        this.f154283c = transparentPricingFeatureStateChecker;
        this.d = orderQuoteFeeAndLimitsInteractor;
        this.e = upgradeEntryPointItemProvider;
        this.f = userInteractor;
    }

    public static dj0.d a(dj0.d dVar, dj0.d dVar2) {
        return (!Intrinsics.f(dVar.f115083b, dVar2.f115083b) || dVar2.f115082a == 0) ? dVar : pyd.c.H(dVar, dVar2);
    }

    public static dj0.d b(a3 a3Var) {
        dj0.d dVar;
        o3 o3Var = a3Var.J;
        if (o3Var == null || (dVar = o3Var.f272965a) == null) {
            throw new IllegalStateException("counterParty cannot be null in EXCHANGE transaction");
        }
        return dVar;
    }

    public static CellDetailsDelegate.Model d(a3 a3Var) {
        boolean zS = k71.k.s(a3Var);
        p0 p0Var = a3Var.z;
        boolean z = zS || k71.k.u(a3Var);
        dj0.d dVarB = (p0Var == p0.SELL && k71.k.y(a3Var)) ? b(a3Var) : (p0Var == p0.BUY && k71.k.x(a3Var)) ? a3Var.k : null;
        if (dVarB != null) {
            return new CellDetailsDelegate.Model("ID_EXTRAS_CRYPTO_COMMODITY_BOUGHT", new TextLocalisedClause(R.string.transaction_bought, null, null, 14), new MoneyClause(a(dVarB, a3Var.f272599l), new MoneyClause.Format.Defaults(z ? k7.NEVER : k7.ALWAYS, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        return null;
    }

    public static CellDetailsDelegate.Model e(a3 a3Var) {
        boolean zS = k71.k.s(a3Var);
        p0 p0Var = a3Var.z;
        boolean z = zS || k71.k.u(a3Var);
        dj0.d dVarB = (p0Var == p0.BUY && k71.k.y(a3Var)) ? a3Var.k : (p0Var == p0.SELL && k71.k.x(a3Var)) ? b(a3Var) : null;
        if (dVarB != null) {
            return new CellDetailsDelegate.Model("ID_EXTRAS_CRYPTO_COMMODITY_PROCEEDS", new TextLocalisedClause(z ? R$string.transactionUI_amount : R$string.transactionUI_proceeds, null, null, 14), new MoneyClause(a(dVarB, a3Var.f272599l), new MoneyClause.Format.Defaults(z ? k7.NEVER : k7.ALWAYS, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        return null;
    }

    public static CellDetailsDelegate.Model g(a3 a3Var) {
        boolean zS = k71.k.s(a3Var);
        p0 p0Var = a3Var.z;
        boolean z = zS || k71.k.u(a3Var);
        dj0.d dVarB = (p0Var == p0.BUY && k71.k.y(a3Var)) ? b(a3Var) : (p0Var == p0.SELL && k71.k.x(a3Var)) ? a3Var.k : null;
        if (dVarB != null) {
            return new CellDetailsDelegate.Model("ID_EXTRAS_CRYPTO_COMMODITY_SOLD", new TextLocalisedClause(R.string.transaction_sold, null, null, 14), new MoneyClause(a(dVarB, a3Var.f272599l), new MoneyClause.Format.Defaults(z ? k7.NEVER : k7.ALWAYS, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        return null;
    }

    public static CellDetailsDelegate.Model h(a3 a3Var) {
        boolean zS = k71.k.s(a3Var);
        p0 p0Var = a3Var.z;
        boolean z = zS || k71.k.u(a3Var);
        dj0.d dVarB = (p0Var == p0.SELL && k71.k.y(a3Var)) ? a3Var.k : (p0Var == p0.BUY && k71.k.x(a3Var)) ? b(a3Var) : null;
        if (dVarB != null) {
            return new CellDetailsDelegate.Model("ID_EXTRAS_CRYPTO_COMMODITY_SPENT", new TextLocalisedClause(z ? R$string.transactionUI_amount : R.string.transaction_spent, null, null, 14), new MoneyClause(a(dVarB, a3Var.f272599l), new MoneyClause.Format.Defaults(z ? k7.NEVER : k7.ALWAYS, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qv0.i c(tof.a3 r30, dj0.d r31, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r32) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hof.d.c(tof.a3, dj0.d, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown):qv0.i");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.CellDetailsDelegate.Model f(tof.a3 r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hof.d.f(tof.a3, boolean):com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model");
    }
}
