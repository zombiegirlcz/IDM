package ug4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.cd;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.delegates.xc;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreenContract$InputData$Legacy;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static PromptMarketingScreenContract$InputData a(Clause title, Clause description, Media image, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, ResourceImage resourceImage, ld ldVar, PromptMarketingContentDelegate.Model.Button button, PromptMarketingContentDelegate.Model.Button button2, TextLocalisedClause textLocalisedClause, int i) {
        ResourceImage closeButtonImage = (i & 16) != 0 ? new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : resourceImage;
        pd widgetTheme = pd.REGULAR;
        ld descriptionStyle = (i & 128) != 0 ? ld.PRIMARY : ldVar;
        PromptMarketingContentDelegate.Model.Button button3 = (i & 512) != 0 ? null : button2;
        id buttonStyle = id.VERTICAL;
        TextLocalisedClause textLocalisedClause2 = (i & 4096) != 0 ? null : textLocalisedClause;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        Intrinsics.checkNotNullParameter(closeButtonImage, "closeButtonImage");
        PromptMarketingContentDelegate.Model.BackgroundType.Default backgroundType = PromptMarketingContentDelegate.Model.BackgroundType.Default.f53100a;
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        Intrinsics.checkNotNullParameter(widgetTheme, "widgetTheme");
        Intrinsics.checkNotNullParameter(descriptionStyle, "descriptionStyle");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        return iy4.a.c(title, description, image, closeButtonImage, new AnalyticsContext(v7.m(pluginConfiguration, AnalyticsContext.INSTANCE)), widgetTheme, descriptionStyle, button, button3, buttonStyle, null, textLocalisedClause2);
    }

    public static FullScreenPromptScreenContract$InputData$Legacy b(Clause title, Clause description, CreditApplicationPluginFlowContract$Configuration pluginConfiguration, boolean z, CdnImage image, Clause clause, Clause clause2, int i) {
        boolean z3 = (i & 32) != 0 ? true : z;
        Clause clause3 = (i & 256) != 0 ? null : clause2;
        LargeActionButton.ButtonStyle.DefaultFilledButton primaryButtonStyle = LargeActionButton.ButtonStyle.f58725a;
        LargeActionButton.ButtonStyle.DefaultFilledButton secondaryButtonStyle = LargeActionButton.ButtonStyle.f58726b;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "primaryButtonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        return iy4.a.a(title, description, new AnalyticsContext(v7.m(pluginConfiguration, AnalyticsContext.INSTANCE)), image, z3 ? new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, xc.VERTICAL, primaryButtonStyle, secondaryButtonStyle, cd.PRIMARY, clause, clause3, true);
    }
}
