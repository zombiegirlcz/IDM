package a5i;

import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static AssetClauseType a(f8l.c assetType) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        int i = a.f1410a[assetType.ordinal()];
        if (i == 1) {
            return new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, ScaleMode.TradingPrecise.f51443a, false, false, 5));
        }
        if (i == 2) {
            return new AssetClauseType.Stock(0);
        }
        if (i == 3) {
            return new AssetClauseType.Commodity(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        }
        if (i == 4) {
            return new AssetClauseType.Crypto(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        }
        if (i == 5) {
            return new AssetClauseType.Money(new MoneyClause.Format.Asset(0));
        }
        throw new NoWhenBranchMatchedException();
    }
}
