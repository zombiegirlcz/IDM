package k5i;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import cp5.d;
import d9.e1;
import f8l.e;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f181510a;

    public c(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f181510a = countryInteractor;
    }

    public final CompositeClause a(OrderQuote quote, boolean z) {
        Pair pair;
        TextClause textClause;
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(quote, "quote");
        BigDecimal bigDecimal = z ? quote.f104757j.f104792a : quote.f104757j.f104793b;
        f8l.b bVar = quote.f104753b;
        e eVar = quote.k;
        Amount amount = quote.f104754c;
        Amount amount2 = quote.e;
        int i = b.f181508a[bVar.ordinal()];
        if (i == 1) {
            pair = new Pair(a.a.L(amount).f115083b, a.a.L(amount2).f115083b);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(a.a.L(amount2).f115083b, a.a.L(amount).f115083b);
        }
        xi0.b bVar2 = (xi0.b) pair.f186385a;
        xi0.b bVar3 = (xi0.b) pair.f186386b;
        ImageClause imageClause = null;
        Style custom = (d.y(bVar2) && (eVar == e.LIMIT || eVar == e.STOP)) ? null : ((o8b.c) this.f181510a).g() ? new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254) : new Click(30, (Integer) null, (Object) null, "CurrentRateDescriptionClickId", false);
        if (bigDecimal.abs().compareTo(BigDecimal.valueOf(0.5d)) >= 0 || !e1.D(bigDecimal)) {
            textClause = new TextClause("%s = %s", (Style) null, (Integer) null, false, (o9) null, v.k(new MoneyClause(new dj0.d(d.k(bVar2), bVar2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), new RateClause(bigDecimal, bVar3, new RateClause.Format.Default(bVar2, true), null)), 94);
        } else {
            MoneyClause moneyClause = new MoneyClause(new dj0.d(d.k(bVar3), bVar3), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
            BigDecimal bigDecimalDivide = BigDecimal.ONE.divide(bigDecimal, bigDecimal.scale(), RoundingMode.HALF_DOWN);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            textClause = new TextClause("%s = %s", (Style) null, (Integer) null, false, (o9) null, v.k(moneyClause, new RateClause(bigDecimalDivide, bVar2, new RateClause.Format.Default(bVar3, true), null)), 94);
        }
        int i2 = b.f181509b[eVar.ordinal()];
        if (i2 == 1) {
            imageClause = new ImageClause(e1.x(quote) ? R$drawable.uikit_icn_24_info_outline : R$drawable.uikit_icn_24_arrow_rates, ImageClauseTint.TextColor.f57790a, fValueOf, fValueOf, 16);
        } else if (i2 != 2 && i2 != 3 && i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Clause[] elements = {imageClause, textClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.t(t0.f186434a);
        return new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), custom, null, 8);
    }
}
