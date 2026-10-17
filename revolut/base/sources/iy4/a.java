package iy4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.cd;
import com.revolut.core.ui_kit.delegates.id;
import com.revolut.core.ui_kit.delegates.ld;
import com.revolut.core.ui_kit.delegates.pd;
import com.revolut.core.ui_kit.delegates.xc;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreenContract$InputData$Legacy;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import d67.e;
import d67.g;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final FullScreenPromptScreenContract$InputData$Legacy a(Clause title, Clause description, AnalyticsContext analyticsContext, CdnImage image, ResourceImage resourceImage, xc buttonsStyle, LargeActionButton.ButtonStyle.DefaultFilledButton primaryButtonStyle, LargeActionButton.ButtonStyle.DefaultFilledButton secondaryButtonStyle, cd descriptionStyle, Clause clause, Clause clause2, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "primaryButtonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        Intrinsics.checkNotNullParameter(descriptionStyle, "descriptionStyle");
        e eVar = g.Companion;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f;
        companion.getClass();
        AnalyticsProduct.Companion.a(k9Var);
        k9 k9Var2 = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return e.a(eVar, title, description, null, image, resourceImage, buttonsStyle, primaryButtonStyle, secondaryButtonStyle, descriptionStyle, clause, clause2, z, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var), new AnalyticsProduct.Retail(k9Var2), analyticsContext, true, 10485760);
    }

    public static final PromptMarketingScreenContract$InputData c(Clause title, Clause description, Media image, ResourceImage resourceImage, Parcelable parcelable, pd widgetTheme, ld descriptionStyle, PromptMarketingContentDelegate.Model.Button button, PromptMarketingContentDelegate.Model.Button button2, id buttonStyle, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        PromptMarketingContentDelegate.Model.BackgroundType.Default backgroundType = PromptMarketingContentDelegate.Model.BackgroundType.Default.f53100a;
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        Intrinsics.checkNotNullParameter(widgetTheme, "widgetTheme");
        Intrinsics.checkNotNullParameter(descriptionStyle, "descriptionStyle");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        PromptMarketingContentDelegate.Model.Footer footer = clause != null ? new PromptMarketingContentDelegate.Model.Footer(clause) : null;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new PromptMarketingScreenContract$InputData(title, description, image, backgroundType, widgetTheme, resourceImage, descriptionStyle, button, button2, buttonStyle, footer, parcelable, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), clause2, 32768);
    }

    public static /* synthetic */ PromptMarketingScreenContract$InputData d(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, Image image, ResourceImage resourceImage, AnalyticsContext analyticsContext, pd pdVar, PromptMarketingContentDelegate.Model.Button button, PromptMarketingContentDelegate.Model.Button button2, TextLocalisedClause textLocalisedClause3, TextLocalisedClause textLocalisedClause4, int i) {
        TextLocalisedClause textLocalisedClause5;
        TextLocalisedClause textLocalisedClause6;
        TextLocalisedClause textLocalisedClause7;
        Image image2;
        ResourceImage resourceImage2;
        AnalyticsContext analyticsContext2;
        PromptMarketingContentDelegate.Model.Button button3;
        pd pdVar2 = (i & 64) != 0 ? pd.REGULAR : pdVar;
        ld ldVar = ld.PRIMARY;
        PromptMarketingContentDelegate.Model.Button button4 = (i & 512) != 0 ? null : button2;
        id idVar = id.VERTICAL;
        TextLocalisedClause textLocalisedClause8 = (i & 2048) != 0 ? null : textLocalisedClause3;
        if ((i & 4096) != 0) {
            textLocalisedClause5 = null;
            textLocalisedClause7 = textLocalisedClause2;
            image2 = image;
            resourceImage2 = resourceImage;
            analyticsContext2 = analyticsContext;
            button3 = button;
            textLocalisedClause6 = textLocalisedClause;
        } else {
            textLocalisedClause5 = textLocalisedClause4;
            textLocalisedClause6 = textLocalisedClause;
            textLocalisedClause7 = textLocalisedClause2;
            image2 = image;
            resourceImage2 = resourceImage;
            analyticsContext2 = analyticsContext;
            button3 = button;
        }
        return c(textLocalisedClause6, textLocalisedClause7, image2, resourceImage2, analyticsContext2, pdVar2, ldVar, button3, button4, idVar, textLocalisedClause8, textLocalisedClause5);
    }
}
