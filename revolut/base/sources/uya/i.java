package uya;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ad;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        uya.a domainState = (uya.a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str = domainState.f284120c;
        return new c(u.c(new PromptContentDelegate.Model("PROMPT_LIST_ID", new TextClause(domainState.f284118a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(domainState.f284119b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str != null ? new TextLocalisedClause(R$string.referrals_invite_campaign_terms_and_conditions_link, null, new Click(28, (Integer) null, (Object) str, "TERMS_CLICK_ITEM_ID", false), 10) : null, new ad(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D012", null, null, null, 30), true), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, false, null, null, null, null, null, null, null, null, null, 536862144)));
    }
}
