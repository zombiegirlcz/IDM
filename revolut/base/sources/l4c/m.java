package l4c;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolut_shop.api.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsDelegate.Model a(int i) {
        return new CellDetailsDelegate.Model("ORDER_STATUS_LIST_ID", new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_order_section_order_status_title, null, null, 14), new TextLocalisedClause(i, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1032168);
    }
}
