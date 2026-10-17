package d3i;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.SmartTileExchangeLoadingDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.smart_tile.ExchangeAmountOverflowException;
import d9.e1;
import ip0.gg0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    @NotNull
    private static final y Companion = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigDecimal f111207c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1i.b f111208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nwh.b f111209b;

    static {
        BigDecimal bigDecimalPow = BigDecimal.TEN.pow(9);
        Intrinsics.checkNotNullExpressionValue(bigDecimalPow, "pow(...)");
        f111207c = bigDecimalPow;
    }

    public z(q1i.b exchangeOrderMapper, nwh.b chartDataMapper) {
        Intrinsics.checkNotNullParameter(exchangeOrderMapper, "exchangeOrderMapper");
        Intrinsics.checkNotNullParameter(chartDataMapper, "chartDataMapper");
        this.f111208a = exchangeOrderMapper;
        this.f111209b = chartDataMapper;
    }

    public static Clause a(BigDecimal bigDecimal, xi0.b bVar, boolean z) {
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        if (z && bigDecimal.compareTo(f111207c) >= 0) {
            BigDecimal scale = bigDecimal.setScale(cp5.d.p(bVar), RoundingMode.HALF_UP);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            return new CompositeClause(zhm.v.k(new AssetClause(scale, new AssetClauseType.Money(new MoneyClause.Format.Shorts(true, 45)), bVar.f306286a, null, null, 24), new CurrencyClause(bVar, ticker, null, 4)), sx4.g.e(1), null, null, 12);
        }
        if (bigDecimal.compareTo(BigDecimal.ONE) >= 0) {
            BigDecimal scale2 = bigDecimal.setScale(cp5.d.p(bVar), RoundingMode.HALF_UP);
            Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
            if (cp5.d.z(bVar)) {
                scale2 = e1.R(scale2);
            }
            return new AssetClause(scale2, new AssetClauseType.Money(new MoneyClause.Format.Asset(0)), bVar.f306286a, null, null, 24);
        }
        BigDecimal scale3 = bigDecimal.setScale(8, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(scale3, "setScale(...)");
        if (cp5.d.z(bVar)) {
            scale3 = e1.R(scale3);
        }
        BigDecimal bigDecimal2 = scale3;
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        if (bigDecimal2.compareTo(bigDecimal3) > 0) {
            return new AssetClause(bigDecimal2, new AssetClauseType.Money(new MoneyClause.Format.Asset(0)), bVar.f306286a, null, null, 24);
        }
        Clause[] elements = {bigDecimal.compareTo(bigDecimal3) > 0 ? new TextClause("~", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new MoneyClause(new dj0.d(0L, new xi0.b(4, bVar.f306286a, 2)), new MoneyClause.Format.Defaults(null, null, true, false, 3), null, null, 12), sx4.g.e(1), new CurrencyClause(bVar, ticker, null, 4)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
    }

    public static void b(BigDecimal bigDecimal, xi0.b bVar) {
        int iP = cp5.d.p(bVar);
        try {
            bigDecimal.setScale(iP, RoundingMode.HALF_UP).multiply(BigDecimal.TEN.pow(iP)).longValueExact();
        } catch (ArithmeticException unused) {
            throw new ExchangeAmountOverflowException();
        }
    }

    public static koi.j d() {
        SmartTileExchangeLoadingDelegate.Model model = new SmartTileExchangeLoadingDelegate.Model(new o97.y(o97.r.SMART_TILES, null, null, 62));
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final gg0 c(ExchangeOrderDraft exchangeOrderDraft, r1i.h hVar, int i, String str, AnimationRequest animationRequest) {
        xi0.b bVar = r1i.d.g(exchangeOrderDraft, hVar).f96897a;
        CurrencyClause currencyClause = new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4);
        String strF = this.f111208a.f(exchangeOrderDraft, hVar);
        String str2 = bVar.f306286a;
        return new gg0(bVar, currencyClause, strF, str, new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) null, 14), exchangeOrderDraft.f96882g == hVar ? animationRequest : null, i, new AnalyticsContext(v0.a.b(str2, AnalyticsContext.INSTANCE)));
    }
}
