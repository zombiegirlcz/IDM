package u2i;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import d9.e1;
import ip0.yt;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements t {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f276665c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wwd.d f276666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1i.a f276667b;

    static {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        wi0.b bVar = wi0.b.f297776t;
        aVar.getClass();
        f276665c = zhm.v.k(bVar, wi0.b.I2);
    }

    public b0(f2i.a recurringOrderDateFormatter, wwd.d tiersRateItemMapper, s1i.a exchangeRisksitemMapper) {
        Intrinsics.checkNotNullParameter(recurringOrderDateFormatter, "recurringOrderDateFormatter");
        Intrinsics.checkNotNullParameter(tiersRateItemMapper, "tiersRateItemMapper");
        Intrinsics.checkNotNullParameter(exchangeRisksitemMapper, "exchangeRisksitemMapper");
        this.f276666a = tiersRateItemMapper;
        this.f276667b = exchangeRisksitemMapper;
    }

    public static int a(wd6.h hVar, wd6.e eVar) {
        wd6.h hVar2 = wd6.h.LIMIT;
        if (hVar == hVar2 && eVar == wd6.e.BUY) {
            return R$string.fx_orders_summary_limit_buy;
        }
        if (hVar == hVar2 && eVar == wd6.e.SELL) {
            return R$string.fx_orders_summary_limit_sell;
        }
        wd6.h hVar3 = wd6.h.STOP;
        if (hVar == hVar3 && eVar == wd6.e.BUY) {
            return R$string.fx_orders_summary_stop_buy;
        }
        if (hVar == hVar3 && eVar == wd6.e.SELL) {
            return R$string.fx_orders_summary_stop_sell;
        }
        wd6.h hVar4 = wd6.h.MARKET;
        if (hVar == hVar4 && eVar == wd6.e.BUY) {
            return R$string.market_order_confirmation_header_buy_title;
        }
        if (hVar == hVar4 && eVar == wd6.e.SELL) {
            return R$string.market_order_confirmation_header_sell_title;
        }
        throw new IllegalArgumentException(" details for " + hVar + " and " + eVar + " is not supported");
    }

    public static ListCellDelegate.Model b(b0 b0Var, int i, int i2, int i3) {
        f0 f0Var = f0.f322471a;
        b0Var.getClass();
        return new ListCellDelegate.Model("RISKS_ITEM_ID_PREFIX_" + i2, new j8(new ResourceImage(i3, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yt.TOP), new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, f0Var, null, 12), false, null, null, 0, 0, 0, 0, 4064);
    }

    public static AssetClause d(Amount amount) {
        AssetClauseType crypto;
        BigDecimal bigDecimal = amount.f104717a;
        Asset asset = amount.f104718b;
        int i = a0.f276662a[asset.f104719a.ordinal()];
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

    public final qv0.i c(ChargeBreakdown fee2, Object parcel) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        List list = fee2.f104723b;
        Amount amount = fee2.f104722a;
        return list.isEmpty() ? new CellDetailsDelegate.Model("FEE_BREAKDOWN_ITEM_LIST_ID", new TextLocalisedClause(R$string.market_order_confirmation_fee_title, null, null, 14), new TextLocalisedClause(R.string.transaction_no_fees, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760) : e1.I(amount.f104717a) ? new CellDetailsDelegate.Model("FEE_BREAKDOWN_ITEM_LIST_ID", new TextLocalisedClause(R$string.market_order_confirmation_fee_title, null, null, 14), d(amount), 0, null, null, null, null, null, false, 0, 0, 32760) : new CellDetailsActionDelegate.Model("FEE_BREAKDOWN_ITEM_LIST_ID", new TextLocalisedClause(R$string.market_order_confirmation_fee_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), d(amount), null, false, false, null, null, parcel, 0, 0, 0, 0, 4192228);
    }
}
