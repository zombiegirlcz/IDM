package vmb;

import android.os.Parcelable;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import plb.h;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f290553a;

    static {
        new PercentageClause.Format.Custom(2, 14, null, null, null);
    }

    public g(h interestRateListItemsMapper) {
        Intrinsics.checkNotNullParameter(interestRateListItemsMapper, "interestRateListItemsMapper");
        this.f290553a = interestRateListItemsMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        SavingsProduct savingsProduct = domainState.f290551a;
        aim.e eVarB2 = u.b();
        TextClause textClause = new TextClause(savingsProduct.f86621h.e.f86643b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        pa paVar = pa.NORMAL;
        eVarB2.add(new PlainTextDelegate.Model("TIRED_LIMITS_INTEREST_RATE_DESCRIPTION_ID", (Clause) null, (Clause) textClause, (v5) null, (UrlImage) null, false, paVar, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002));
        eVarB2.addAll(this.f290553a.a(savingsProduct.f86621h, savingsProduct.f86618b));
        eVarB.addAll(yp0.b.g(u.a(eVarB2), new ListSubheaderDelegate.Model("TIRED_LIMITS_INTEREST_RATE_SUB_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.savings_high_balance_rate_tiered_interest_rates_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        SavingsProduct savingsProduct2 = domainState.f290551a;
        int i = R$string.savings_high_balance_rate_how_we_calculate_interest_description_new;
        xi0.b bVar = savingsProduct2.f86618b;
        xi0.b bVar2 = savingsProduct2.f86618b;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        CurrencyClause currencyClause = new CurrencyClause(bVar, ticker, null, 4);
        Long l2 = ((SavingsProduct.InterestRate.RateTier) d0.b0(savingsProduct2.f86621h.f86644a)).f86653b;
        if (l2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        eVarB.addAll(yp0.b.g(u.c(new PlainTextDelegate.Model("TIRED_LIMITS_CALCULATION_DESCRIPTION_ID", (Clause) null, (Clause) new TextLocalisedClause(i, v.k(currencyClause, new MoneyClause(new dj0.d(l2.longValue(), bVar2), new MoneyClause.Format.Defaults(null, null, false, true, 7), null, null, 12), new CurrencyClause(bVar2, ticker, null, 4), new TextClause(savingsProduct2.f86627q, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (v5) null, (UrlImage) null, false, paVar, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65002)), new ListSubheaderDelegate.Model("TIRED_LIMITS_CALCULATION_SUB_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.savings_high_balance_rate_how_we_calculate_interest_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        return new d(u.a(eVarB));
    }
}
