package od3;

import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cashback.impl.R$string;
import ip0.nf0;
import ip0.of0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(uc3.c cashbackLimit) {
        Intrinsics.checkNotNullParameter(cashbackLimit, "cashbackLimit");
        if (!(cashbackLimit instanceof uc3.b)) {
            return zhm.f0.f322471a;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cashback_product_plan_limit_title, null, null, 14);
        uc3.b bVar = (uc3.b) cashbackLimit;
        dj0.d dVar = bVar.f278975a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cashback_details_progression, zhm.v.k(new MoneyClause(bVar.f278976b, new MoneyClause.Format.Defaults(null, null, false, true, 7), null, null, 12), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, true, 7), null, null, 12)), null, 12);
        long millis = bVar.f278977c.getMillis();
        TimeClause.Format.INSTANCE.getClass();
        VaultsProgressDelegate.Model model = new VaultsProgressDelegate.Model("ID_LIMIT_PROGRESS_BAR", textLocalisedClause, null, null, textLocalisedClause2, new TextLocalisedClause(R$string.cashback_details_limit_reset_on, zhm.u.c(new TimeClause(millis, TimeClause.Format.f57959a, null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), null, null, false, (int) ((r9.f115082a / dVar.f115082a) * 100.0f), null, false, null, null, 8384348);
        yp0.b.l(model, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        return zhm.u.c(model);
    }

    public static List b() {
        nf0 nf0Var = new nf0("ID_LIMIT_PROGRESS_BAR", of0.ACCENT);
        yp0.b.l(nf0Var, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        return zhm.u.c(nf0Var);
    }
}
