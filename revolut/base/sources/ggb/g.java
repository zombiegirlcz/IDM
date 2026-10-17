package ggb;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.salary_account.impl.promotion_inactive.PromotionInactivePromptControllerContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PromotionInactivePromptControllerContract$InputData f143604a;

    public g(PromotionInactivePromptControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f143604a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PromotionInactivePromptControllerContract$InputData promotionInactivePromptControllerContract$InputData = this.f143604a;
        return new d(u.c(new PromptMarketingContentDelegate.Model("PROMPT_LIST_ID", promotionInactivePromptControllerContract$InputData.f82986a, promotionInactivePromptControllerContract$InputData.f82987b, new PromptMarketingContentDelegate.Model.Content.MediaContent(new GlyphImage(R$drawable.uikit_icn_24_broken_heart, null, null, 6), null), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button(promotionInactivePromptControllerContract$InputData.f82988c, (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58725a, false, (String) null, 54), null, null, null, null, null, null, null, null, null, null, null, 2096560)));
    }
}
