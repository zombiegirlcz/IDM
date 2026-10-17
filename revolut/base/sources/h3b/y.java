package h3b;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.wealth.resources.R$string;

/* JADX INFO: loaded from: classes6.dex */
public final class y {
    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("balances-section-title", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_margin_cfds_cash_balance_title_balances, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }
}
