package n5i;

import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements l5i.h, s5i.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5i.k f212590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f212591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aoa.k f212592c;

    public d(s5i.k helper, gte.a featureToggleInteractor, aoa.k exchangeTitleProvider) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(exchangeTitleProvider, "exchangeTitleProvider");
        this.f212590a = helper;
        this.f212591b = featureToggleInteractor;
        this.f212592c = exchangeTitleProvider;
    }

    public static AssetClause b(Amount amount) throws Throwable {
        AssetClauseType money;
        BigDecimal bigDecimal = amount.f104717a;
        Asset asset = amount.f104718b;
        int i = c.f212589b[asset.f104719a.ordinal()];
        if (i == 1) {
            money = new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else if (i == 2) {
            money = new AssetClauseType.Commodity(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else if (i == 3) {
            money = new AssetClauseType.Crypto(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else if (i == 4) {
            money = new AssetClauseType.Stock(0);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal bigDecimal2 = amount.f104717a;
            f8l.c cVar = asset.f104719a;
            String str = asset.f104720b;
            String str2 = asset.f104721c.f306286a;
            StringBuilder sb6 = new StringBuilder("Undefined asset type for amount value=");
            sb6.append(bigDecimal2);
            sb6.append(", assetType=");
            sb6.append(cVar);
            sb6.append(", assetSymbol=");
            hx7.e.n(new IllegalStateException(a0.d.u(sb6, str, ", assetRefCode=", str2)));
            money = new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        }
        return new AssetClause(bigDecimal, money, asset.f104720b, null, null, 24);
    }

    @Override // s5i.h
    public final qv0.i e(OrderQuote orderQuote, Function1 parcel, Function1 cellTitle, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f212590a.e(orderQuote, parcel, cellTitle, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    @Override // d4i.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List j(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r43, d4i.h r44, com.revolut.feature_market_data_api.models.OrderQuoteExtraData r45) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5i.d.j(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, d4i.h, com.revolut.feature_market_data_api.models.OrderQuoteExtraData):java.util.List");
    }

    @Override // l5i.h
    public final TextLocalisedClause n(OrderQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        return this.f212592c.a(quote);
    }

    @Override // s5i.h
    public final qv0.i o(OrderQuote orderQuote, boolean z, Function1 parcel, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f212590a.o(orderQuote, z, parcel, cellTitle);
    }
}
