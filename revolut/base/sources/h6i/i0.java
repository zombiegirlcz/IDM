package h6i;

import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p6i.j f149677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f149678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p6i.a f149679c;
    public final jla.h d;

    public i0(p6i.j savingsTopUpLimitChecker, gte.a featureToggleInteractor, p6i.a investTopUpLimitChecker, jla.h productCatalogueInteractor, i6i.a creditCardLimitChecker) {
        Intrinsics.checkNotNullParameter(savingsTopUpLimitChecker, "savingsTopUpLimitChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(investTopUpLimitChecker, "investTopUpLimitChecker");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(creditCardLimitChecker, "creditCardLimitChecker");
        this.f149677a = savingsTopUpLimitChecker;
        this.f149678b = featureToggleInteractor;
        this.f149679c = investTopUpLimitChecker;
        this.d = productCatalogueInteractor;
    }

    public static AssetClause a(Amount amount) {
        if (amount != null) {
            return new AssetClause(amount.f104717a, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), amount.f104718b.f104720b, null, null, 24);
        }
        return null;
    }

    public static Long b(f8l.d dVar, xi0.b bVar) {
        BigDecimal bigDecimal;
        Amount f104748c;
        Asset asset;
        BigInteger bigIntegerUnscaledValue;
        String str = bVar.f306286a;
        if (Intrinsics.f(str, dVar.getF104747b().f104718b.f104720b)) {
            bigDecimal = dVar.getF104747b().f104717a;
        } else {
            Amount f104748c2 = dVar.getF104748c();
            bigDecimal = (!Intrinsics.f(str, (f104748c2 == null || (asset = f104748c2.f104718b) == null) ? null : asset.f104720b) || (f104748c = dVar.getF104748c()) == null) ? null : f104748c.f104717a;
        }
        if (bigDecimal == null || (bigIntegerUnscaledValue = bigDecimal.unscaledValue()) == null) {
            return null;
        }
        return Long.valueOf(bigIntegerUnscaledValue.longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h6i.f0 r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.i0.c(h6i.f0, gim.c):java.lang.Object");
    }
}
