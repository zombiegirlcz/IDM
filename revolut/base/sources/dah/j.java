package dah;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import d7j.o0;
import d7j.p0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import z0h.q1;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f112538a;

    public j(q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f112538a = wealthDisclaimersMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (i.f112537a[domainState.f112533a.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.invest_disclaimer_revolut_suggestion_disclosure_title, null, null, 14);
        Data data = domainState.f112534b;
        lw0.a aVar = new lw0.a(textLocalisedClause, data != null ? (Clause) iii.c.f(data, new p0(29), new o0(15), new cf1.h(this, 26)) : null, null, null, false, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("wealth-disclaimers-got-it-list-id", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), false, null, null, h.f112536a, null, 744);
        int i = R$attr.uikit_dp24;
        yp0.b.l(model, i, i, 0, 0, null, false, 60);
        return new cii.b(null, u.c(model), aVar);
    }
}
