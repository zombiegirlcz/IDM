package os2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.blue_prompt.BluePromptBackgroundType;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.blue_prompt.modal.ModalBluePromptActivity;
import com.revolut.feature.blue_prompt.modal.ModalBluePromptContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f229219a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExplicitActivityDestination f229220b = new ExplicitActivityDestination(ModalBluePromptActivity.class);

    private b() {
    }

    public static ActivityNavigateCommand a(b bVar, TextLocalisedClause title, Clause description, BluePromptContent.MediaContent content, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, NaviCommand naviCommand, CompositeCommand compositeCommand, int i) {
        TextLocalisedClause textLocalisedClause3 = (i & 64) != 0 ? null : textLocalisedClause2;
        CompositeCommand compositeCommand2 = (i & 256) != 0 ? null : compositeCommand;
        LargeActionButton.ButtonStyle.DefaultFilledButton primaryActionStyle = LargeActionButton.ButtonStyle.f58725a;
        LargeActionButton.ButtonStyle.DefaultFilledButton secondaryActionStyle = LargeActionButton.ButtonStyle.f58726b;
        ks2.e buttonsStyle = ks2.e.VERTICAL;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
        FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(content, "content");
        BluePromptBackgroundType.Dialog background = BluePromptBackgroundType.Dialog.f64279a;
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(primaryActionStyle, "primaryActionStyle");
        Intrinsics.checkNotNullParameter(secondaryActionStyle, "secondaryActionStyle");
        Intrinsics.checkNotNullParameter(buttonsStyle, "buttonsStyle");
        return new ActivityNavigateCommand(f229220b, new ModalBluePromptContract$Configuration(null, title, description, content, background, resourceImage, null, buttonsStyle, null, null, textLocalisedClause, textLocalisedClause3, naviCommand, compositeCommand2, primaryActionStyle, secondaryActionStyle, null, null, null, finishCommand), null, null, 0, null, null, null, null, false, 1020);
    }
}
