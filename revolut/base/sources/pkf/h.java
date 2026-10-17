package pkf;

import aw0.k7;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.o3;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends yji.n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vlf.b f237056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final thf.m f237057n;
    public final kye.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0i.a f237058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l4i.a f237059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ylg.b f237060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f237061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final elf.x f237062t;

    public h(klf.h0 commonDataSource, vlf.b commonUiMapper, thf.m transactionTextResourcesMapper, kye.e transactionFeeBreakdownInteractor, o0i.a transparentPricingFeatureStateChecker, l4i.a amountConverter, ylg.b userInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, elf.x chargesClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionFeeBreakdownInteractor, "transactionFeeBreakdownInteractor");
        Intrinsics.checkNotNullParameter(transparentPricingFeatureStateChecker, "transparentPricingFeatureStateChecker");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(chargesClickHandler, "chargesClickHandler");
        this.f237055l = commonDataSource;
        this.f237056m = commonUiMapper;
        this.f237057n = transactionTextResourcesMapper;
        this.o = transactionFeeBreakdownInteractor;
        this.f237058p = transparentPricingFeatureStateChecker;
        this.f237059q = amountConverter;
        this.f237060r = userInteractor;
        this.f237061s = transactionsInteractor;
        this.f237062t = chargesClickHandler;
    }

    public static dj0.d Z2(dj0.d dVar, dj0.d dVar2) {
        xi0.b bVar = dVar.f115083b;
        xi0.b bVar2 = dVar2.f115083b;
        long j2 = dVar2.f115082a;
        return (!Intrinsics.f(bVar, bVar2) || j2 == 0) ? dVar : new dj0.d(dVar.f115082a - j2, bVar);
    }

    public static dj0.d b3(a3 a3Var) {
        dj0.d dVar;
        o3 o3Var = a3Var.J;
        if (o3Var == null || (dVar = o3Var.f272965a) == null) {
            throw new IllegalStateException("counterParty cannot be null in EXCHANGE transaction");
        }
        return dVar;
    }

    public static CellDetailsDelegate.Model d3(a3 a3Var, boolean z) {
        dj0.d dVarB3 = (a3Var.z == tof.p0.SELL && k71.k.y(a3Var)) ? b3(a3Var) : (a3Var.z == tof.p0.BUY && k71.k.x(a3Var)) ? a3Var.k : null;
        if (dVarB3 == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("ID_EXTRAS_CRYPTO_COMMODITY_BOUGHT", new TextLocalisedClause(R.string.transaction_bought, null, null, 14), new MoneyClause(Z2(dVarB3, a3Var.f272599l), new MoneyClause.Format.Defaults(z ? k7.NEVER : k7.ALWAYS, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model e3(a3 a3Var, boolean z) {
        dj0.d dVarB3 = (a3Var.z == tof.p0.BUY && k71.k.y(a3Var)) ? a3Var.k : (a3Var.z == tof.p0.SELL && k71.k.x(a3Var)) ? b3(a3Var) : null;
        if (dVarB3 == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("ID_EXTRAS_CRYPTO_COMMODITY_PROCEEDS", new TextLocalisedClause(z ? R$string.transactionUI_amount : R$string.transactionUI_proceeds, null, null, 14), new MoneyClause(Z2(dVarB3, a3Var.f272599l), new MoneyClause.Format.Defaults(z ? k7.NEVER : k7.ALWAYS, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model g3(a3 a3Var, boolean z) {
        dj0.d dVarB3 = (a3Var.z == tof.p0.BUY && k71.k.y(a3Var)) ? b3(a3Var) : (a3Var.z == tof.p0.SELL && k71.k.x(a3Var)) ? a3Var.k : null;
        if (dVarB3 == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("ID_EXTRAS_CRYPTO_COMMODITY_SOLD", new TextLocalisedClause(R.string.transaction_sold, null, null, 14), new MoneyClause(Z2(dVarB3, a3Var.f272599l), new MoneyClause.Format.Defaults(z ? k7.NEVER : k7.ALWAYS, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model h3(a3 a3Var, boolean z) {
        dj0.d dVarB3 = (a3Var.z == tof.p0.SELL && k71.k.y(a3Var)) ? a3Var.k : (a3Var.z == tof.p0.BUY && k71.k.x(a3Var)) ? b3(a3Var) : null;
        if (dVarB3 == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("ID_EXTRAS_CRYPTO_COMMODITY_SPENT", new TextLocalisedClause(z ? R$string.transactionUI_amount : R.string.transaction_spent, null, null, 14), new MoneyClause(Z2(dVarB3, a3Var.f272599l), new MoneyClause.Format.Defaults(z ? k7.NEVER : k7.ALWAYS, null, false, false, 14), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qv0.i c3(tof.a3 r31, dj0.d r32, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown r33) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.h.c3(tof.a3, dj0.d, com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown):qv0.i");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.CellDetailsDelegate.Model f3(tof.a3 r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.h.f3(tof.a3, boolean):com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model");
    }
}
