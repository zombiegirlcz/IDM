package bdh;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final List a() {
        List listC = u.c(new CellDetailsChevronDelegate.Model("GET_HELP_LIST_ID", new TextLocalisedClause(R$string.wealth_robo_common_get_help, null, null, 14), f2.INTERNAL, 0, f.f14604a, null, 2024));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
