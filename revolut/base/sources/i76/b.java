package i76;

import aw0.k7;
import aw0.o9;
import aw0.p9;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final AssetClause a(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "<this>");
        BigDecimal bigDecimal = amount.f104717a;
        Asset asset = amount.f104718b;
        xi0.b bVar = asset.f104721c;
        p9 signShowingPolicy = p9.NEVER;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        return new AssetClause(bigDecimal, new AssetClauseType.Stock(new NumberClause.Format.FixedDigitsAfterDot(bVar.b(), 6, signShowingPolicy, null, null)), cp5.d.J(asset.f104721c), null, o9.SENSITIVE, 8);
    }

    public static final MoneyClause b(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "<this>");
        return new MoneyClause(a.a.L(amount), new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), o9.SENSITIVE);
    }
}
