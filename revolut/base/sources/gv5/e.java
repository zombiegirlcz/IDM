package gv5;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.y;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static y a(CryptoInvestmentsSortingType selectedSortingType) {
        Intrinsics.checkNotNullParameter(selectedSortingType, "selectedSortingType");
        List listK = v.k(hv5.b.a(new CryptoInvestmentsSortingType.TotalValue(0), selectedSortingType), hv5.b.a(new CryptoInvestmentsSortingType.Performance(0), selectedSortingType), hv5.b.a(new CryptoInvestmentsSortingType.MarketCap(0), selectedSortingType), hv5.b.a(new CryptoInvestmentsSortingType.Alphabetical(0), selectedSortingType));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("SORTING_BOTTOM_DIALOG_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_apply, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, R$attr.uikit_dp24, 0, 0, 0, 14);
        return new y(d0.E0(u.c(model), listK), new rp0.t(new TextLocalisedClause(R$string.crypto_investments_sort_by_title, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016);
    }
}
