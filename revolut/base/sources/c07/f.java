package c07;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.freelancer.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new d(u.c(new PromptMarketingContentDelegate.Model("LIST_ID_ITEM_FULL_SCREEN_IMAGE", new TextLocalisedClause(R$string.freelancer_account_closure_account_actions_confirmation_dialog_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_account_closure_account_actions_confirmation_dialog_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", null, null, null, 30), null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097072)), new c(new TextLocalisedClause(R$string.freelancer_account_closure_account_actions_confirmation_dialog_action_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a), new c(new TextLocalisedClause(R$string.freelancer_account_closure_account_actions_confirmation_dialog_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b));
    }
}
