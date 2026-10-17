package n5i;

import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements l5i.h, s5i.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5i.k f212606a;

    public n(s5i.k helper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f212606a = helper;
    }

    public static AssetClause b(Amount amount) {
        AssetClauseType money;
        BigDecimal bigDecimal = amount.f104717a;
        Asset asset = amount.f104718b;
        int i = m.d[asset.f104719a.ordinal()];
        if (i == 1) {
            money = new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else {
            if (i != 2) {
                if (i != 3 && i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("can't map " + asset.f104719a + " amount").toString());
            }
            money = new AssetClauseType.Stock(0);
        }
        return new AssetClause(bigDecimal, money, asset.f104720b, null, null, 24);
    }

    @Override // s5i.h
    public final qv0.i e(OrderQuote orderQuote, Function1 parcel, Function1 cellTitle, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f212606a.e(orderQuote, parcel, cellTitle, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x039f  */
    @Override // d4i.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List j(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r68, d4i.h r69, com.revolut.feature_market_data_api.models.OrderQuoteExtraData r70) {
        /*
            Method dump skipped, instruction units count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n5i.n.j(com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, d4i.h, com.revolut.feature_market_data_api.models.OrderQuoteExtraData):java.util.List");
    }

    @Override // l5i.h
    public final TextLocalisedClause n(OrderQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        return new TextLocalisedClause(R$string.market_data_exchange_breakdown_title, null, null, 14);
    }

    @Override // s5i.h
    public final qv0.i o(OrderQuote orderQuote, boolean z, Function1 parcel, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f212606a.o(orderQuote, z, parcel, cellTitle);
    }
}
