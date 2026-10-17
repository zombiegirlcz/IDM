package pt9;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.groups.api.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        pt9.a domainState = (pt9.a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputTextDelegate.Model model = new InputTextDelegate.Model("ID_NAME_INPUT", new TextClause(domainState.f239632b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.payments_groups_customisation_name_input_title, null, null, 14), null, null, null, null, true, 25, false, false, 0, true, 0, false, true, true, m72.b.u(25), false, false, 0, false, false, null, 922697720, 131071);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new c(u.c(model), !d0.W(domainState.f239632b));
    }
}
