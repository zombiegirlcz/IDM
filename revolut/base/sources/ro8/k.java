package ro8;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.junior_settings.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CONFIRM_ACTION", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.junior_login_details_phone_remove_dialog_button_confirm, null, null, 14), false, "LOADING_CONFIRM_ACTION", null, null, null, 936);
        yp0.b.r(model, R$attr.uikit_dp24, 0, 0, 0, 14);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_CANCEL_ACTION", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.junior_login_details_phone_remove_dialog_button_cancel, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        return new h(v.k(model, model2), new g(new TextLocalisedClause(R$string.junior_login_details_phone_remove_dialog_title, null, null, 14), new TextLocalisedClause(R$string.junior_login_details_phone_remove_dialog_subtitle, u.c(domainState.f255934b), null, 12)));
    }
}
