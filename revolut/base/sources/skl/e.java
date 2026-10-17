package skl;

import aw0.f;
import aw0.g;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.sso.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_polling_screen_logout_popup_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_polling_screen_logout_popup_description, null, null, 14), null, null, false, 28);
        return new cii.b(new g(new n6(new TextLocalisedClause(R$string.revolut_sso_common_actions_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.revolut_sso_access_recovery_manual_review_polling_screen_logout_popup_logout_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (f) null, 25), f0.f322471a, aVar);
    }
}
