package v5c;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolut_x_promo.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements n {

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
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.retail_revolut_x_in_app_install_prompt_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.retail_revolut_x_in_app_install_prompt_description, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        UrlVideo urlVideo = new UrlVideo("https://assets.revolut.com/mobile/revolut_x/installer/background.mp4", (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, LDSFile.EF_DG4_TAG);
        sh5.c cVar = domainState.f286191a;
        return new e(u.c(new PromptMarketingContentDelegate.Model("PROMPT_ID", textLocalisedClause, textLocalisedClause2, new PromptMarketingContentDelegate.Model.Content.FullScreenMediaContent(urlVideo, cVar != null ? cVar.f263435a : null, null, 4), null, pd.BLACK, resourceImage, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.retail_revolut_x_in_app_install_prompt_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), null, null, null, null, null, null, null, null, null, null, null, 2096528)));
    }
}
