package uug;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.account_closure.impl.R$string;
import ip0.w60;
import ip0.x60;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        Object x60Var;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        kel.b bVar = domainState.f283232a;
        if (bVar != null) {
            x60Var = new PromptMarketingContentDelegate.Model("ACCOUNT_CLOSURE_NEGATIVE_BALANCE_PROMPT_ID", new TextLocalisedClause(R$string.trading_account_closure_negative_balance_screen_title, null, null, 14), new TextLocalisedClause(R$string.trading_account_closure_negative_balance_screen_message_format, u.c(new MoneyClause(bVar.f183149b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new PromptMarketingContentDelegate.Model.Content.BackgroundMediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D043", null, null, null, 30)), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.trading_account_closure_negative_balance_screen_confirm_button_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.trading_account_closure_negative_balance_screen_cancel_button_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, 2095536);
        } else {
            x60Var = new x60("ACCOUNT_CLOSURE_NEGATIVE_BALANCE_LOADING_PROMPT_ID", w60.BACKGROUND_ASSET, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        }
        return new i(u.c(x60Var));
    }
}
