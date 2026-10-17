package b5f;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.impl.R$string;
import com.revolut.feature.trading.impl.ui.holdings.information.section.info.HoldingsInformationSectionInfoControllerContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements n {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HoldingsInformationSectionInfoControllerContract$InputData f12519a;

    public g(HoldingsInformationSectionInfoControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f12519a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        List listK;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        x4f.a aVar = this.f12519a.f91224a;
        int[] iArr = f.f12518a;
        int i = iArr[aVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_bank_balances_header_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_brokerage_holdings_header_title, null, null, 14);
        }
        int i2 = iArr[aVar.ordinal()];
        if (i2 == 1) {
            ListCellDelegate.Model model = new ListCellDelegate.Model("BANK_BALANCES_TOTAL_CASH_ITEM", new j8(new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.wealth_trading_bank_balances_section_total_cash_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_bank_balances_section_total_cash_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4080);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            ListCellDelegate.Model model2 = new ListCellDelegate.Model("BANK_BALANCES_RESERVED_ITEM", new j8(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.wealth_trading_bank_balances_section_reserved_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_bank_balances_section_reserved_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4080);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            ListCellDelegate.Model model3 = new ListCellDelegate.Model("BANK_BALANCES_WITHDRAW_ITEM", new j8(new ResourceImage(R$drawable.uikit_icn_24_arrow_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.wealth_trading_bank_balances_section_available_to_withdraw_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_bank_balances_section_available_to_withdraw_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4080);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            listK = v.k(model, model2, model3);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ListCellDelegate.Model model4 = new ListCellDelegate.Model("BROKERAGE_HOLDINGS_CREDITS_DEBITS_ITEM", new j8(new ResourceImage(R$drawable.uikit_icn_24_credit_part, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.wealth_trading_brokerage_holdings_section_net_credits_debits_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_brokerage_holdings_section_net_credits_debits_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4080);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            ListCellDelegate.Model model5 = new ListCellDelegate.Model("BROKERAGE_HOLDINGS_SECURITIES_ITEM", new j8(new ResourceImage(R$drawable.uikit_icn_24_wealth, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.wealth_trading_brokerage_holdings_section_brokerage_securities_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_brokerage_holdings_section_brokerage_securities_subtitle, null, null, 14), false, null, null, 0, 0, 0, 0, 4080);
            yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
            listK = v.k(model4, model5);
        }
        return new c(textLocalisedClause, listK);
    }
}
