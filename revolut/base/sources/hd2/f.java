package hd2;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PeriodClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.services.ideal.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e(u.c(new PromptContentDelegate.Model("AUTH_SUCCESS_PROMPT_ID", new TextLocalisedClause(R$string.ideal_auth_success_title, null, null, 14), new TextLocalisedClause(R$string.ideal_auth_success_subtitle, null, null, 14), null, new ad(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D151A", null, null, null, 30), false), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.ideal_auth_success_counter, u.c(new PeriodClause(new PeriodClause.PeriodComponents(0, 0, 0, 0, 0, domainState.f151379a, 31), null)), null, 12), null, false, new TextLocalisedClause(R$string.ideal_auth_success_action, null, null, 14), null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 536870280)));
    }
}
