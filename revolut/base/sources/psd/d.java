package psd;

import amd.t;
import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.derivatives.models.DerivativesBalance;
import d9.e1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();
    public static final BigDecimal d = new BigDecimal("100");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k18.c f239473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o76.d f239474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppk.f f239475c;

    public d(k18.c derivativesBalanceInteractor, o76.d derivativesEnabledStateChecker, ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(derivativesBalanceInteractor, "derivativesBalanceInteractor");
        Intrinsics.checkNotNullParameter(derivativesEnabledStateChecker, "derivativesEnabledStateChecker");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f239473a = derivativesBalanceInteractor;
        this.f239474b = derivativesEnabledStateChecker;
        this.f239475c = ratesInteractor;
    }

    public static c a(DerivativesBalance derivativesBalance, String str, dj0.d dVar) {
        CompositeClause compositeClauseM = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_home_widgets_split_futures_section_title, null, null, 14);
        MoneyClause moneyClause = new MoneyClause(derivativesBalance.f71907p, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        MoneyClause moneyClause2 = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        BigDecimal bigDecimal = derivativesBalance.k;
        if (e1.G(bigDecimal) || e1.C(bigDecimal)) {
            BigDecimal bigDecimal2 = derivativesBalance.e;
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            BigDecimal bigDecimalMultiply = bigDecimal.divide(bigDecimal2, 8, roundingMode).multiply(d);
            Intrinsics.h(bigDecimalMultiply);
            boolean zG = e1.G(bigDecimalMultiply);
            int i = zG ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative;
            compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new ImageClause(zG ? R$drawable.uikit_icn_10_stocks_topup : R$drawable.uikit_icn_10_stocks_withdraw, Integer.valueOf(i), (Float) null, (Float) null, 28), new TextClause(bigDecimalMultiply.setScale(2, roundingMode).abs() + "%", (Style) null, Integer.valueOf(i), false, (o9) null, (List) null, 122)));
        }
        return new c(new amd.f(textLocalisedClause, moneyClause, moneyClause2, compositeClauseM, LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_cfd, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, new t(str), 160), dVar);
    }
}
