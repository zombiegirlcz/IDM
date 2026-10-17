package s5g;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.flights.api.R$string;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a() {
        return new TextLocalisedClause(R$string.travel_flights_checkout_terms_disclosure, v.k(new TextLocalisedClause(R$string.travel_flights_checkout_terms_revolut_flights, null, null, 14), new TextLocalisedClause(R$string.travel_flights_checkout_terms_revpoints, null, new Click(30, (Integer) null, (Object) null, "FLIGHTS_CHECKOUT_REVPOINTS_TERMS", false), 10), new TextLocalisedClause(R$string.travel_flights_checkout_terms_privacy_notice, null, null, 14)), null, 12);
    }

    public static TextLocalisedClause b(int i, String str) {
        return new TextLocalisedClause(i, null, str != null ? new Click(28, (Integer) null, (Object) str, "FLIGHTS_CHECKOUT_TERMS_URL", false) : null, 10);
    }
}
