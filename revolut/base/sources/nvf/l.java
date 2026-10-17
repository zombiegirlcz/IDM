package nvf;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transport.api.R$string;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsChevronDelegate.Model a() {
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("GET_HELP_ITEM_ID", new TextLocalisedClause(R$string.transport_ticket_details_help_get_help_title, null, null, 14), f2.INTERNAL, 0, null, null, 2040);
        yp0.b.l(model, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        return model;
    }
}
