package k88;

import aw0.e;
import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.junior.accounts.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements n {
    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.home_total_wealth_category_youth_info_tooltip_title, null, null, 14), new TextLocalisedClause(R$string.home_total_wealth_category_youth_info_tooltip_body, null, null, 14), null, null, false, 28);
        return new cii.b(new e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.home_total_wealth_info_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), f0.f322471a, aVar);
    }
}
