package o75;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new h(u.c(new PromptMarketingContentDelegate.Model("ITEM_ID_REFINANCED_PROMPT", new TextLocalisedClause(R$string.loan_refinancing_credit_settle_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.loan_refinancing_credit_settle_confirmation_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(R$drawable.uikit_icn_24_refinancing, null, null, 6), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.loan_refinancing_credit_settle_confirmation_primary_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.loan_refinancing_credit_settle_confirmation_secondary_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, (String) null, 54), null, null, null, null, null, null, null, null, null, null, 2095536)));
    }
}
