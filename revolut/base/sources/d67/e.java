package d67;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.cd;
import com.revolut.core.ui_kit.delegates.xc;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreenContract$InputData$Legacy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f111454a = new e();

    private e() {
    }

    public static FullScreenPromptScreenContract$InputData$Legacy a(e eVar, Clause title, Clause description, TextLocalisedClause textLocalisedClause, Media image, ResourceImage resourceImage, xc xcVar, LargeActionButton.ButtonStyle buttonStyle, LargeActionButton.ButtonStyle buttonStyle2, cd cdVar, Clause clause, Clause clause2, boolean z, AnalyticsProduct.Retail retail, AnalyticsProduct.Retail retail2, AnalyticsContext analyticsContext, boolean z3, int i) {
        TextLocalisedClause textLocalisedClause2 = (i & 8) != 0 ? null : textLocalisedClause;
        xc buttonsStyle = (i & 64) != 0 ? xc.VERTICAL : xcVar;
        LargeActionButton.ButtonStyle primaryButtonStyle = (i & 128) != 0 ? LargeActionButton.ButtonStyle.f58725a : buttonStyle;
        LargeActionButton.ButtonStyle secondaryButtonStyle = (i & 256) != 0 ? LargeActionButton.ButtonStyle.f58726b : buttonStyle2;
        cd descriptionStyle = (i & 512) != 0 ? cd.PRIMARY : cdVar;
        Clause clause3 = (i & 2048) != 0 ? null : clause2;
        boolean z4 = (i & 16384) == 0;
        boolean z6 = (32768 & i) != 0 ? false : z;
        AnalyticsProduct.Retail retail3 = (131072 & i) != 0 ? null : retail;
        AnalyticsProduct.Retail retail4 = (262144 & i) != 0 ? null : retail2;
        AnalyticsContext analyticsContext2 = (524288 & i) != 0 ? null : analyticsContext;
        boolean z11 = (i & 4194304) != 0 ? false : z3;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
        Intrinsics.checkNotNullParameter(primaryButtonStyle, "primaryButtonStyle");
        Intrinsics.checkNotNullParameter(secondaryButtonStyle, "secondaryButtonStyle");
        Intrinsics.checkNotNullParameter(descriptionStyle, "descriptionStyle");
        PromptContentDelegate.Model.BackgroundType.Default backgroundType = PromptContentDelegate.Model.BackgroundType.Default.f53073a;
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        return new FullScreenPromptScreenContract$InputData$Legacy(title, description, null, textLocalisedClause2, image, resourceImage, buttonsStyle, primaryButtonStyle, secondaryButtonStyle, descriptionStyle, clause, clause3, null, null, z4, z6, false, retail3, retail4, analyticsContext2, null, null, z11, backgroundType);
    }
}
