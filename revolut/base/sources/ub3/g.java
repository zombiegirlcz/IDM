package ub3;

import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cash_topup.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f278738a;

    public g(m unitSystemHelper) {
        Intrinsics.checkNotNullParameter(unitSystemHelper, "unitSystemHelper");
        this.f278738a = unitSystemHelper;
    }

    public final TextLocalisedClause a(float f) {
        n nVar = (n) this.f278738a;
        nVar.getClass();
        String country = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String upperCase = country.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        int i = f.f278737a[(Intrinsics.f(upperCase, "US") ? l.IMPERIAL : l.METRIC).ordinal()];
        if (i == 1) {
            if (f < 1000.0f) {
                return new TextLocalisedClause(R.string.common_distance_meters, u.c(Integer.valueOf((int) f)), null, 12);
            }
            nVar.getClass();
            return new TextLocalisedClause(R.string.common_distance_km, u.c(new NumberClause(new BigDecimal(String.valueOf(f / 1000.0f)), new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null), null, null, 12)), null, 12);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = R$string.topup_cash_distance_miles;
        nVar.getClass();
        return new TextLocalisedClause(i2, u.c(new NumberClause(new BigDecimal(String.valueOf(f / 1609.34f)), new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null), null, null, 12)), null, 12);
    }
}
