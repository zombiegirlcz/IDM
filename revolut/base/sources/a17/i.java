package a17;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import jki.j;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f(u.c(new PromptMarketingContentDelegate.Model("ID_VAT_PROMO", new TextLocalisedClause(R$string.freelancer_vat_prompt_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_vat_prompt_caption, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D169", null, null, null, 30), null), PromptMarketingContentDelegate.Model.BackgroundType.Dialog.f53101a, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.freelancer_vat_prompt_action_add_vat_number, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.freelancer_vat_prompt_action_not_vat_registered, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, (String) null, 54), null, null, null, null, null, null, null, null, null, null, 2095520)));
    }
}
