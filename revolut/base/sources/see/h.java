package see;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.cards_core.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f0 f0Var = f0.f322471a;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.delivery_details_cancel_order_dialog_title, null, null, 14), null, null, null, false, 30);
        m6 m6Var = n6.Companion;
        return new cii.b(new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.delivery_details_cancel_order_dialog_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.delivery_details_cancel_order_dialog_reject, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121), f0Var, aVar);
    }
}
