package i8e;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subaccount.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f159517b;
        TextClause textClause = new TextClause(domainState.f159516a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.bill_accounts_details_name_edit_title, null, null, 14);
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        TextClause textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        InputTextDelegate.Model model = new InputTextDelegate.Model("ITEM_ID_TEXT_INPUT_FIELD", textClause, textLocalisedClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textClause2, null, null, true, 40, false, true, 0, true, 0, true, false, true, m72.b.u(40), false, false, 0, false, false, null, 855195504, 131071);
        int i = R$attr.uikit_dp16;
        yp0.b.l(model, i, i, i, i, null, false, 48);
        return new d(u.c(model), z);
    }
}
