package f5g;

import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.core.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    public static List a(boolean z) {
        if (!z) {
            return f0.f322471a;
        }
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("TRAVEL_FLIGHTS_BOOKINGS_PAST_OR_CANCELLED", new TextLocalisedClause(R$string.travel_tab_bookings_button_past_and_cancelled, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new j((List) iii.c.f(domainState.f132316a, new f0d.k(this, 28), new l(this, 0), new et6.a(this, 14)));
    }
}
