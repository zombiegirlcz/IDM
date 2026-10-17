package vyh;

import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.R$plurals;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.feature_crypto_order_flow.impl.exchange.bottom_sheet.balance_breakdown.BalanceBreakdownBottomSheetContract$ClickAction$OpenOrdersInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f293326a;

    public e(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f293326a = inputData;
    }

    public static CellDetailsDelegate.Model a(int i, dj0.d dVar, String str) {
        return new CellDetailsDelegate.Model(str, new TextLocalisedClause(i, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        dj0.d dVar;
        dj0.d dVar2;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CellDetailsDelegate.Model modelA = null;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cryptobuysell_market_order_balance_breakdown_title, null, null, 14);
        a aVar = this.f293326a;
        StakingPocket stakingPocket = aVar.f293323b;
        dj0.d dVar3 = aVar.f293322a;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        if (stakingPocket != null) {
            StakingProduct stakingProduct = stakingPocket.f88082b;
            boolean z = stakingProduct.e;
            xi0.b bVar = stakingProduct.d;
            textLocalisedClause = z ? new TextLocalisedClause(com.revolut.feature_exchange.api.R$string.fx_orders_market_order_balance_breakdown_lockup_description, v.k(new CurrencyClause(bVar, ticker, null, 4), new TextLocalisedQuantityClause(R$plurals.staking_unstake_lockup_days, Integer.valueOf(stakingProduct.f88087b.f88062c), (List) null, (Style) null, 28)), null, 12) : new TextLocalisedClause(R$string.cryptobuysell_market_order_balance_breakdown_description, ehe.n.x(bVar, ticker, null, 4), null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.cryptobuysell_market_order_balance_breakdown_open_orders_description, ehe.n.x(dVar3.f115083b, ticker, null, 4), null, 12);
        }
        lw0.a aVar2 = new lw0.a(textLocalisedClause2, textLocalisedClause, null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        CellDetailsDelegate.Model modelA2 = a(R$string.cryptobuysell_market_order_balance_breakdown_available, dVar3, "AVAILABLE_BALANCE_LIST_ITEM_ID");
        dj0.d dVar4 = aVar.f293324c;
        CellDetailsDelegate.Model model = dVar4.f115082a != 0 ? new CellDetailsDelegate.Model("OPEN_ORDERS_LIST_ITEM_ID", new TextLocalisedClause(R$string.cryptobuysell_market_order_balance_breakdown_open_orders, null, null, 14), new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true, 0, null, BalanceBreakdownBottomSheetContract$ClickAction$OpenOrdersInfo.f96739a, null, null, 0, null, false, null, 0, 0, 0, 0, 1048008) : null;
        CellDetailsDelegate.Model modelA3 = (stakingPocket == null || (dVar2 = stakingPocket.f88083c) == null) ? null : a(R$string.cryptobuysell_market_order_balance_breakdown_earning, dVar2, "EARNING_BALANCE_LIST_ITEM_ID");
        if (stakingPocket != null) {
            if (!stakingPocket.f88082b.e) {
                stakingPocket = null;
            }
            if (stakingPocket != null && (dVar = stakingPocket.e) != null) {
                modelA = a(R$string.cryptobuysell_market_order_balance_breakdown_locked, dVar, "LOCKED_BALANCE_LIST_ITEM_ID");
            }
        }
        CellDetailsDelegate.Model[] elements = {modelA2, model, modelA3, modelA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new cii.b(eVar, listL, aVar2);
    }
}
