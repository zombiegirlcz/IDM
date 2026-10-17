package j03;

import aw0.h;
import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import j03.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (!Intrinsics.f(domainState, b.a.f169932a)) {
            throw new NoWhenBranchMatchedException();
        }
        f0 f0Var = f0.f322471a;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.card_action_remove_title, null, null, 14), new TextLocalisedClause(R$string.card_alert_terminate_message, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, null, false, 28);
        m6 m6Var = n6.Companion;
        return new cii.b(new h(false, m6.c(m6Var, new TextLocalisedClause(R$string.card_replacement_expectation_actions_terminate_and_order, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121), f0Var, aVar);
    }
}
