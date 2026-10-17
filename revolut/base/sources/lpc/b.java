package lpc;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import ip0.ak0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements t1h.d {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // t1h.d
    public final List a(t1h.b disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_withdraw_disclaimer, v.k(3, 4), null, 12);
        int i = R$string.wealth_robo_withdraw_subtitle_learn_more;
        c cVar = c.f198967a;
        CompositeClause compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause, new TextLocalisedClause(i, null, new Click(28, (Integer) null, (Object) cVar, "ROBO_LEARN_MORE_CLICK_ID", false), 10)));
        ak0 ak0Var = new ak0(null, null, 3);
        int i2 = R$attr.uikit_dp0;
        return u.c(new TextDelegate.Model("ROBO_WITHDRAW_DISCLAIMER", compositeClauseM, false, ak0Var, cVar, null, i2, i2, 0, 0, 1620));
    }
}
