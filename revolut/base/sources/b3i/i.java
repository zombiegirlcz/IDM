package b3i;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import ip0.yt;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f12039b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1i.a f12040a;

    static {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        wi0.b bVar = wi0.b.f297776t;
        aVar.getClass();
        f12039b = v.k(bVar, wi0.b.I2);
    }

    public i(s1i.a exchangeRisksItemMapper, a exchangeFeeClauseMapper) {
        Intrinsics.checkNotNullParameter(exchangeRisksItemMapper, "exchangeRisksItemMapper");
        Intrinsics.checkNotNullParameter(exchangeFeeClauseMapper, "exchangeFeeClauseMapper");
        this.f12040a = exchangeRisksItemMapper;
    }

    public static ListCellDelegate.Model a(i iVar, int i, int i2, int i3) {
        f0 f0Var = f0.f322471a;
        iVar.getClass();
        return new ListCellDelegate.Model("RISKS_ITEM_ID_PREFIX_" + i2, new j8(new ResourceImage(i3, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, f0Var, null, 12), false, null, null, 0, 0, 0, 0, 4064);
    }

    public static CellDetailsDelegate.Model b(c3i.b summary) {
        int i;
        Intrinsics.checkNotNullParameter(summary, "summary");
        int i2 = h.f12037b[summary.e.ordinal()];
        if (i2 == 1) {
            i = R$string.fx_orders_summary_amount;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.fx_orders_summary_estimated_amount;
        }
        return new CellDetailsDelegate.Model("AMOUNT", new TextLocalisedClause(i, null, null, 14), new MoneyClause(summary.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model c(c3i.b summary) {
        int i;
        Intrinsics.checkNotNullParameter(summary, "summary");
        wd6.e eVar = summary.f20946b;
        c3i.a aVar = summary.f20948g;
        int i2 = h.d[eVar.ordinal()];
        if (i2 == 1) {
            int i3 = h.f12037b[aVar.ordinal()];
            if (i3 == 1) {
                i = R$string.fx_orders_summary_cost;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.fx_orders_summary_estimated_cost;
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = h.f12037b[aVar.ordinal()];
            if (i5 == 1) {
                i = R$string.fx_orders_summary_credit;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.fx_orders_summary_estimated_credit;
            }
        }
        return new CellDetailsDelegate.Model("COUNTER_AMOUNT", new TextLocalisedClause(i, null, null, 14), new MoneyClause(summary.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model d() {
        return new CellDetailsDelegate.Model("EXPIRE", new TextLocalisedClause(R$string.fx_orders_summary_expire_by, null, null, 14), new TextLocalisedClause(R$string.fx_orders_summary_never, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model e(c3i.b summary) {
        int i;
        Intrinsics.checkNotNullParameter(summary, "summary");
        wd6.h hVar = summary.f20945a;
        BigDecimal bigDecimal = hVar == wd6.h.MARKET ? BigDecimal.ZERO : new BigDecimal(String.valueOf(summary.f20947c));
        BigDecimal bigDecimal2 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
        int i2 = h.f12036a[hVar.ordinal()];
        if (i2 == 1) {
            i = R$string.fx_orders_settings_stop_price;
        } else if (i2 == 2) {
            i = R$string.fx_orders_settings_limit_price;
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(hVar + " not supported");
            }
            i = R$string.rates_transaction_breakdown_rate;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        Intrinsics.h(bigDecimal2);
        return new CellDetailsDelegate.Model("LIMIT", textLocalisedClause, new RateClause(bigDecimal2, summary.f.f115083b, new RateClause.Format.ExchangeRate(true), null), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static AssetClause f(Amount amount) {
        AssetClauseType crypto;
        BigDecimal bigDecimal = amount.f104717a;
        Asset asset = amount.f104718b;
        int i = h.f12038c[asset.f104719a.ordinal()];
        if (i == 1) {
            crypto = new AssetClauseType.Crypto(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else if (i == 2) {
            crypto = new AssetClauseType.Commodity(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        } else {
            if (i != 3) {
                if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("can't map " + asset.f104719a + " amount").toString());
            }
            crypto = new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15));
        }
        return new AssetClause(bigDecimal, crypto, asset.f104720b, null, null, 24);
    }
}
