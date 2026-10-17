package rqc;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.salary_switch.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.salary_switch_br_status_cancel_sheet_title, null, null, 14), new TextLocalisedClause(R$string.salary_switch_br_status_cancel_sheet_description, null, null, 14), null, null, false, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CANCEL_SALARY_SWITCH_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.salary_switch_br_status_cancel_sheet_action_cancel, null, null, 14), false, "CANCEL_SALARY_SWITCH_REQUEST_LOADING_TAG", null, null, null, 936);
        yp0.b.r(model, R$attr.uikit_dp16, 0, 0, 0, 14);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("GO_BACK_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.salary_switch_br_status_cancel_sheet_action_go_back, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        return new g(v.k(model, model2), aVar);
    }
}
