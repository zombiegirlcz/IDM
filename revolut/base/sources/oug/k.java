package oug;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.account_closure.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_account_closure_feedback_screen_how_improve_format, u.c(domainState.f229871a.f94871b), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_common_submit, null, null, 14);
        String str = domainState.f229872b;
        boolean z = true ^ (str == null || d0.W(str));
        InputTextDelegate.Model model = new InputTextDelegate.Model("FEATURES_FEEDBACK_REASON_COMMENT", str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(R$string.trading_account_closure_feedback_screen_comment_input_placeholder, null, null, 14), null, null, null, null, false, null, false, false, 0, false, 5, false, false, true, null, false, false, 0, false, false, null, -1124073480, 131071);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new i(textLocalisedClause, textLocalisedClause2, u.c(model), z);
    }
}
