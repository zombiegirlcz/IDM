package eaj;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.crypto.navigation.api.R$string;
import java.util.List;
import jki.i;
import jki.j;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new e(u.c(new PromptContentDelegate.Model("PROMPT_ITEM_ID", new TextLocalisedClause(R$string.crypto_visibility_prompt_title, null, null, 14), new TextLocalisedClause(R$string.crypto_visibility_prompt_subtitle, null, null, 14), null, new ad(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D128", null, null, null, 30), false), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, new TextLocalisedClause(R$string.crypto_visibility_prompt_action_primary, null, null, 14), new TextLocalisedClause(R$string.crypto_visibility_prompt_action_secondary, null, null, 14), null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 536869320)));
    }
}
