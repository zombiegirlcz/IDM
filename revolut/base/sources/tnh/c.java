package tnh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$TransferAccount;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kpj.f;
import n2l.h;
import n2l.j;
import n2l.l;
import nmc.d;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f272451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f272452b;

    public c(d roboPortfolioUiMapper, f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f272451a = roboPortfolioUiMapper;
        this.f272452b = wealthAccountHeaderUiMapper;
    }

    public static j d(WealthTransferPickerControllerContract$TransferAccount wealthTransferPickerControllerContract$TransferAccount) {
        if (wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.Margin) {
            return n2l.a.f211583a;
        }
        if (wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.Robo) {
            return h.f211590a;
        }
        if (wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.Securities) {
            return l.a(((WealthTransferPickerControllerContract$TransferAccount.Securities) wealthTransferPickerControllerContract$TransferAccount).f96079c);
        }
        if (wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount) {
            return l.a(((WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount) wealthTransferPickerControllerContract$TransferAccount).f96082c);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final RowDelegate.Model.MainImage.Image40 a(WealthTransferPickerControllerContract$TransferAccount wealthTransferPickerControllerContract$TransferAccount) {
        int iG;
        if (wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.Margin) {
            iG = R$drawable.uikit_icn_24_cfd;
        } else if (wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.Robo) {
            iG = R$drawable.uikit_icn_24_rates;
        } else {
            boolean z = wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.Securities;
            f fVar = this.f272452b;
            if (!z && !(wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount)) {
                throw new NoWhenBranchMatchedException();
            }
            iG = fVar.g(d(wealthTransferPickerControllerContract$TransferAccount));
        }
        return new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(iG, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60);
    }

    public final Clause b(WealthTransferPickerControllerContract$TransferAccount wealthTransferPickerControllerContract$TransferAccount, iih.b bVar) {
        if (wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.Margin) {
            return new TextLocalisedClause(R$string.wealth_trading_orders_account_selector_cfd_subtitle, null, null, 14);
        }
        if (wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.Robo) {
            return this.f272451a.c(((WealthTransferPickerControllerContract$TransferAccount.Robo) wealthTransferPickerControllerContract$TransferAccount).f96074a);
        }
        if (wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.Securities) {
            int i = b.f272449a[((WealthTransferPickerControllerContract$TransferAccount.Securities) wealthTransferPickerControllerContract$TransferAccount).f96079c.f95239b.ordinal()];
            if (i == 1) {
                return new TextLocalisedClause(com.revolut.feature.wealth.ui.impl.R$string.wealth_invest_product_chooser_product_item_subtitle_gia, null, null, 14);
            }
            if (i == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount)) {
            throw new NoWhenBranchMatchedException();
        }
        WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount = ((WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount) wealthTransferPickerControllerContract$TransferAccount).f96082c;
        if ((taxAdvantageWealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) || (taxAdvantageWealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea)) {
            return f.f(this.f272452b, d(wealthTransferPickerControllerContract$TransferAccount));
        }
        if (!(taxAdvantageWealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa)) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = b.f272450b[bVar.ordinal()];
        if (i2 == 1) {
            return new TextLocalisedClause(R$string.wealth_trading_account_selector_jisa_subtitle, null, null, 14);
        }
        if (i2 == 2) {
            return new TextLocalisedClause(R$string.wealth_trading_account_selector_jisa_disabled_subtitle, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TextLocalisedClause c(WealthTransferPickerControllerContract$TransferAccount wealthTransferPickerControllerContract$TransferAccount) {
        boolean z = wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.Margin;
        f fVar = this.f272452b;
        if (z || (wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.Robo) || (wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.Securities)) {
            return fVar.h(d(wealthTransferPickerControllerContract$TransferAccount), wealthTransferPickerControllerContract$TransferAccount.getD().f105106a, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254));
        }
        if (!(wealthTransferPickerControllerContract$TransferAccount instanceof WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount)) {
            throw new NoWhenBranchMatchedException();
        }
        WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount taxAdvantageAccount = (WealthTransferPickerControllerContract$TransferAccount.TaxAdvantageAccount) wealthTransferPickerControllerContract$TransferAccount;
        WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount = taxAdvantageAccount.f96082c;
        if ((taxAdvantageWealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) || (taxAdvantageWealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea)) {
            return fVar.h(d(wealthTransferPickerControllerContract$TransferAccount), taxAdvantageAccount.d.f105106a, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254));
        }
        if (taxAdvantageWealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa) {
            return new TextLocalisedClause(R$string.wealth_trading_account_selector_jisa_title, u.c(taxAdvantageWealthAccount.getF().f105176b), new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 8);
        }
        throw new NoWhenBranchMatchedException();
    }
}
