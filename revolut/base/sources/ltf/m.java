package ltf;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transfer_reasons.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.transfer_reasons_reuse_declaration_title, null, null, 14), new TextLocalisedClause(R$string.transfer_reasons_reuse_declaration_description, v.k(new TextLocalisedClause(R$string.transfer_reasons_reuse_declaration_link, null, new Click(30, (Integer) null, (Object) null, "DECLARATION_LINK_ID", false), 10), new TimeClause(domainState.f199865a.getTime(), new TimeClause.Format.Pretty(q0.ONLY_DATE_FULL_MONTH), null, null, 12)), null, 12), null, null, false, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("REUSE_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.transfer_reasons_reuse_declaration_action_reuse, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, R$attr.uikit_dp16, 0, 0, 0, 14);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("FILL_FROM_SCRATCH_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.transfer_reasons_reuse_declaration_action_fill_from_scratch, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        return new j(v.k(model, model2), aVar);
    }
}
