package rb9;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.bd;
import com.revolut.core.ui_kit.internal.views.ProgressAnimation;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.onboarding.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.signup_risk_check_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.signup_risk_check_subtitle, null, null, 14);
        int i = R$attr.uikit_colorBlue;
        return new e(u.c(new PromptContentDelegate.Model("RISK_CHECK_PROMPT_ID", textLocalisedClause, textLocalisedClause2, null, new bd(new ProgressStyle(100, 100, i, i, R$attr.uikit_colorTransparent, 8.0f, 8.0f, new ProgressAnimation(domainState.f252997a, true), 512), null, null), null, null, null, false, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 536870856)));
    }
}
