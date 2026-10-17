package y12;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f310277a;
        return new h(u.c(new InputTextDelegate.Model("USER_INPUT_ITEM_ID", str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, new TextLocalisedClause(R$string.apm_alias_ownership_claim_details_input_title, null, null, 14), new TextLocalisedClause(R$string.apm_alias_ownership_claim_details_input_footer, null, null, 14), null, null, false, 500, false, false, 0, false, 0, false, false, false, null, false, false, 0, false, false, null, -16810124, 131071)));
    }
}
