package iig;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.miles.api.R$string;
import ip0.ck0;
import ip0.yj0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final List a() {
        TextDelegate.Model model = new TextDelegate.Model("RECOMMENDED_FLIGHT_DISCLAIMER_ID", new TextLocalisedClause(R$string.miles_recommended_flights_disclaimer, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036);
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp0;
        int i3 = R$attr.uikit_dp16;
        yp0.b.p(model, i, i2, i3, i3);
        return u.c(model);
    }
}
