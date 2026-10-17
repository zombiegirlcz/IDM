package dec;

import aw0.o9;
import aw0.wa;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.shared.R$string;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static MoneyClause a(dj0.d balance, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e assetType) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        return new MoneyClause(balance, new MoneyClause.Format.Defaults(null, assetType == com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.CRYPTO ? ScaleMode.CryptoHoldingFormat.f51439a : null, false, false, 13), null, o9.SENSITIVE, 4);
    }

    public static Image b(PaymentMethod.Pocket pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        switch (t.f113376a[pocket.f84380h.ordinal()]) {
            case 1:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_wallet, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorAccent, 8.0f, null, null, 48);
            case 2:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_credit_card, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorTeal, 8.0f, null, null, 48);
            case 3:
                return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_vault, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorTerracotta, 8.0f, null, null, 48);
            case 4:
            case 5:
            case 6:
                return new CurrencyImage(pocket.i.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static Clause c(r rVar, PaymentMethod.Pocket pocket, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        String str = pocket.k;
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f fVar = pocket.f84380h;
        xi0.b bVar = pocket.i.f115083b;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        if (str != null && z && pocket.f == com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.BUSINESS) {
            return new CompositeClause(zhm.v.k(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause((Integer) null), new CurrencyClause(bVar, ticker, null, 4)), null, null, null, 10);
        }
        if (str != null) {
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 124);
        }
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f fVar2 = com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.SAVINGS;
        return (fVar == fVar2 && com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.a(pocket).f84388c) ? new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_method_mmf, null, null, 14) : fVar == fVar2 ? new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_method_savings, null, null, 14) : fVar == com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.CREDIT ? new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_method_credit_card, null, null, 14) : (pocket.f84379g == com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e.CRYPTO || z) ? new CurrencyClause(bVar, ticker, null) : new CurrencyClause(bVar, CurrencyClause.Format.DisplayName.f57755a, null);
    }

    public static TextLocalisedClause e(PaymentMethod.Pocket.PocketDetails.Savings.EarningRates.Rate rate) {
        PercentageClause percentageClause = new PercentageClause(rate.f84391a, new PercentageClause.Format.Custom(2, 6, null, wa.SHOW_ALL_ZEROES, null), (Custom) null, 4);
        String lowerCase = rate.f84392b.toLowerCase(Locale.ROOT);
        return new TextLocalisedClause(t61.a.p(lowerCase, "toLowerCase(...)", "revolut_pay.payment_method.savings.", lowerCase), zhm.u.c(percentageClause), (Clause) yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(percentageClause, new TextClause(rate.f84392b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126))), false, 20);
    }

    public final Clause d(PaymentMethod.Pocket pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        if (pocket.f == com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.BUSINESS) {
            return c(this, pocket, true, 4);
        }
        if (pocket.b()) {
            return new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_method_title_pro, zhm.u.c(c(this, pocket, true, 4)), null, 12);
        }
        com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j jVar = pocket.f;
        return jVar == com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.PERSONAL_JOINT ? new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_method_title_joint, zhm.u.c(c(this, pocket, true, 4)), null, 12) : (jVar == com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.j.PERSONAL && pocket.f84380h == com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.ACCOUNTS) ? new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_method_title_personal, zhm.u.c(c(this, pocket, true, 4)), null, 12) : c(this, pocket, false, 4);
    }
}
