package omh;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klh.c f226853a;

    public g(klh.c commoditiesUIMapper) {
        Intrinsics.checkNotNullParameter(commoditiesUIMapper, "commoditiesUIMapper");
        this.f226853a = commoditiesUIMapper;
    }

    public static ListSubheaderDelegate.Model a(Integer num) {
        Clause clauseW = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_discovery_all_commodities, null, null, 14);
        if (num != null) {
            clauseW = yoj.b.w(new DotDividerClause((Integer) null), new NumberClause(num.intValue(), (NumberClause.Format.Compact) null, (Custom) null, 6));
        }
        return new ListSubheaderDelegate.Model("subheader-all-commodities", (Image) null, yoj.b.w(textLocalisedClause, clauseW), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65466);
    }
}
