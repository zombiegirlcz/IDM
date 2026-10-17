package cld;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.slot_manager.impl.R$string;
import ip0.qr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        cld.a domainState = (cld.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.cx_feedback_feedback_bottom_sheet_header_why, null, null, 14), null, null, null, false, 30);
        InputTextDelegate.Model model = new InputTextDelegate.Model("INPUT_LIST_ID", new TextClause(domainState.f24971a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.cx_feedback_feedback_bottom_sheet_nps_placeholder, null, null, 14), false, null, false, null, null, null, null, null, null, false, 280, null, false, false, false, false, null, 0, null, qr.f166041a, false, true, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -620789772, 65527);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.cx_feedback_feedback_bottom_sheet_nps_submit, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, d0.F0(domainState.f24971a).toString().length() > 0, null, null, 988), null, null, 55), u.c(model), aVar);
    }
}
