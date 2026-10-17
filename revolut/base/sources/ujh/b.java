package ujh;

import bih.f;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.wealth.ui.impl.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f280624a = v.k(new c(1, R$string.wealth_invest_home_portfolio_show_up_to_option_one), new c(2, R$string.wealth_invest_home_portfolio_show_up_to_option_two), new c(3, R$string.wealth_invest_home_portfolio_show_up_to_option_three), new c(5, R$string.wealth_invest_home_portfolio_show_up_to_option_five), new c(10, R$string.wealth_invest_home_portfolio_show_up_to_option_ten));

    public static final class a {
        private a() {
        }
    }

    public static PopupMenuItem.Cell a(String str, int i, String str2, n4l.b bVar, n4l.b bVar2) {
        return PopupMenuItem.Companion.a(PopupMenuItem.INSTANCE, str, new TextLocalisedClause(i, null, null, 14), bVar.equals(bVar2), null, new f(str2, bVar), null, null, 232);
    }
}
