package s92;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.multibanco.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listC = u.c(new InputTextDelegate.Model("INPUT_ID", new TextClause(domainState.f261091b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.via_verde_payment_reference_input_placeholder, null, null, 14), new TextClause("###########", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true, new TextLocalisedClause(R$string.via_verde_payment_reference_input_footer, null, new Click(30, (Integer) null, (Object) null, "INPUT_HELPER_ID", false), 10), null, null, null, null, null, false, null, null, false, false, 2, 0, null, false, true, null, true, null, false, false, false, null, null, R$attr.uikit_dp8, -606077088, 57343));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        int i = m.f261100a[domainState.f261090a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.via_verde_activate_identifier_header_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.via_verde_replace_identifier_header_title, null, null, 14);
        }
        return new i(textLocalisedClause, listC, domainState.f261092c);
    }
}
