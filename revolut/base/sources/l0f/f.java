package l0f;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.topup_screen.impl.R$string;
import ip0.ck0;
import ip0.yj0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputDisclosureDelegate.Model model = new InputDisclosureDelegate.Model("EXCHANGED_AMOUNT_WITHIN_THRESHOLD", new TextLocalisedClause(R$string.topup_india_declaration_lesser_tcs_amount, null, null, 14), null, null, null, 1012);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        InputDisclosureDelegate.Model model2 = new InputDisclosureDelegate.Model("EXCHANGED_AMOUNT_MORE_THAN_THRESHOLD", new TextLocalisedClause(R$string.topup_india_declaration_more_tcs_amount, null, null, 14), null, null, null, 1012);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new e(v.k(model, model2, new TextDelegate.Model("DISCLAIMER_LIST_ID", new TextLocalisedClause(R$string.topup_india_declaration_footer, null, null, 14), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036)));
    }
}
