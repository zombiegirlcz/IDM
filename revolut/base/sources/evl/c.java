package evl;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.Beneficiary;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kpj.f;
import n2l.d;
import n2l.e;
import n2l.g;
import n2l.i;
import n2l.j;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f129978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f129979b;

    public c(dcd.b savingsInterestRateFormatter, f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f129978a = savingsInterestRateFormatter;
        this.f129979b = wealthAccountHeaderUiMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.models.MoneyClause b(com.revolut.feature.trading_orders.common.models.SourcePocket r10) {
        /*
            dj0.d r0 = r10.getF91792b()
            r1 = 0
            if (r0 == 0) goto L3d
            dj0.d r2 = dj0.d.e
            boolean r2 = r0.f(r2)
            if (r2 == 0) goto L27
            xi0.b r2 = r0.f115083b
            com.revolut.feature.trading_orders.common.models.SourcePocket$Balance r10 = r10.getE()
            if (r10 == 0) goto L1e
            com.revolut.feature.trading_orders.common.models.SourcePocket$Balance$MoneyBalance r10 = (com.revolut.feature.trading_orders.common.models.SourcePocket.Balance.MoneyBalance) r10
            dj0.d r10 = r10.f91775a
            xi0.b r10 = r10.f115083b
            goto L1f
        L1e:
            r10 = r1
        L1f:
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r2, r10)
            if (r10 != 0) goto L27
            r3 = r0
            goto L28
        L27:
            r3 = r1
        L28:
            if (r3 == 0) goto L3d
            com.revolut.core.ui_kit.models.MoneyClause r2 = new com.revolut.core.ui_kit.models.MoneyClause
            com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults r4 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults
            r8 = 0
            r9 = 15
            r5 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r7 = 12
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: evl.c.b(com.revolut.feature.trading_orders.common.models.SourcePocket):com.revolut.core.ui_kit.models.MoneyClause");
    }

    public final TextLocalisedClause a(SourcePocket sourcePocket, TradingLegalEntityInformation tradingLegalEntityInformation, Custom custom) {
        Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        TextLocalisedClause textLocalisedClauseD = d(sourcePocket, tradingLegalEntityInformation, custom);
        boolean z = sourcePocket instanceof SourcePocket.Holding;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        if (z) {
            return new TextLocalisedClause(R$string.wealth_trading_pocket_picker_pocket_qualified_name, v.k(textLocalisedClauseD, new CurrencyClause(((SourcePocket.Holding) sourcePocket).getF91784h(), ticker, custom)), custom, 8);
        }
        if (sourcePocket instanceof SourcePocket.InvestAccountCombinedBuyingPower) {
            return new TextLocalisedClause(R$string.wealth_trading_pocket_picker_pocket_qualified_name_combined, u.c(textLocalisedClauseD), custom, 8);
        }
        if (sourcePocket instanceof SourcePocket.Pocket) {
            return new TextLocalisedClause(R$string.wealth_trading_pocket_picker_pocket_qualified_name, v.k(textLocalisedClauseD, new CurrencyClause(((SourcePocket.Pocket) sourcePocket).getF91784h(), ticker, custom)), custom, 8);
        }
        if ((sourcePocket instanceof SourcePocket.VaultWrapper) || (sourcePocket instanceof SourcePocket.Savings)) {
            return new TextLocalisedClause(R$string.wealth_trading_pocket_picker_pocket_qualified_name, v.k(textLocalisedClauseD, e(sourcePocket, custom)), custom, 8);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Image c(SourcePocket sourcePocket) {
        Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
        if (sourcePocket instanceof SourcePocket.Holding) {
            return new CurrencyImage(((SourcePocket.Holding) sourcePocket).getF91784h().f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (sourcePocket instanceof SourcePocket.Pocket) {
            return new CurrencyImage(((SourcePocket.Pocket) sourcePocket).getF91784h().f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        }
        if (sourcePocket instanceof SourcePocket.VaultWrapper) {
            return fpg.a.a();
        }
        if (sourcePocket instanceof SourcePocket.Savings) {
            return ((SourcePocket.Savings) sourcePocket).f91788a.f86461b;
        }
        if (sourcePocket instanceof SourcePocket.InvestAccountCombinedBuyingPower) {
            return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cash, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 16.0f, Float.valueOf(24.0f), null, 32);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TextLocalisedClause d(SourcePocket sourcePocket, TradingLegalEntityInformation tradingLegalEntityInformation, Style style) {
        j cVar;
        Beneficiary f;
        Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        int i = b.f129977a[sourcePocket.getF91793c().ordinal()];
        String str = null;
        f fVar = this.f129979b;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return new TextLocalisedClause(R$string.wealth_trading_pocket_picker_section_personal, null, style, 10);
            case 6:
            case 7:
                return fVar.h(i.f211591a, tradingLegalEntityInformation.f105106a, style);
            case 8:
                return fVar.h(e.f211587a, tradingLegalEntityInformation.f105106a, style);
            case 9:
                return fVar.h(d.f211586a, tradingLegalEntityInformation.f105106a, style);
            case 10:
                SourcePocket.Holding holding = sourcePocket instanceof SourcePocket.Holding ? (SourcePocket.Holding) sourcePocket : null;
                TradingAccount tradingAccount = holding != null ? holding.f91777b : null;
                if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Personal) {
                    cVar = g.f211589a;
                } else {
                    if (tradingAccount != null && (f = tradingAccount.getF()) != null) {
                        str = f.f105176b;
                    }
                    cVar = new n2l.c(str);
                }
                return fVar.h(cVar, tradingLegalEntityInformation.f105106a, style);
            case 11:
                return fVar.h(n2l.f.f211588a, tradingLegalEntityInformation.f105106a, style);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Clause e(SourcePocket sourcePocket, Style style) {
        Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
        if (sourcePocket instanceof SourcePocket.Holding) {
            return new CurrencyClause(((SourcePocket.Holding) sourcePocket).getF91784h(), null, style, 2);
        }
        if (sourcePocket instanceof SourcePocket.Pocket) {
            return new CurrencyClause(((SourcePocket.Pocket) sourcePocket).getF91784h(), null, style, 2);
        }
        if (sourcePocket instanceof SourcePocket.VaultWrapper) {
            return new TextClause(((SourcePocket.VaultWrapper) sourcePocket).f91791a.f234885h.f234859a, style, (Integer) null, false, (o9) null, (List) null, 124);
        }
        if (sourcePocket instanceof SourcePocket.Savings) {
            return new TextClause(((SourcePocket.Savings) sourcePocket).f91788a.f86460a.f234885h.f234859a, style, (Integer) null, false, (o9) null, (List) null, 124);
        }
        if (sourcePocket instanceof SourcePocket.InvestAccountCombinedBuyingPower) {
            return ((SourcePocket.InvestAccountCombinedBuyingPower) sourcePocket).d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
