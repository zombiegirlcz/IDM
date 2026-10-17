package pu1;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements n {

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
        return new e(u.c(new PromptContentDelegate.Model("REMEDIATION_PENDING_PROMPT_ID", new TextLocalisedClause(R$string.blik_registration_remediation_pending_prompt_title, null, null, 14), new TextLocalisedClause(R$string.blik_registration_remediation_pending_prompt_subtitle, null, null, 14), null, new ad(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D299", null, null, null, 30), false), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 536870344)));
    }
}
