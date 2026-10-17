package y3c;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolut_shop.api.R$string;
import com.revolut.feature.revolut_shop.api.domain.model.RevolutShopAccount;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    public static Clause a(RevolutShopAccount revolutShopAccount, Custom custom) {
        String strL;
        if (revolutShopAccount.e) {
            return new TextLocalisedClause(R$string.revolut_shop_flow_checkout_screen_checkout_payment_method_section_pro, null, custom, 10);
        }
        String str = revolutShopAccount.f84199b;
        if (str == null || (strL = m70.a.l(str)) == null) {
            return null;
        }
        return new TextClause(strL, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
    }
}
