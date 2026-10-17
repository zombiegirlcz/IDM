package vv2;

import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card.view_pin.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.change_pin_pin_selection_show_new_pin, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_eye_show, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        int i = R$attr.uikit_dp16;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("SHOW_NEW_PIN_ITEM_LIST_ID", defaultFilledButton, resourceImage, textLocalisedClause, false, null, null, R$attr.uikit_dp24, R$attr.uikit_dp8, i, i, 496);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.change_pin_pin_selection_show_old_pin, null, null, 14);
        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_eye_show, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        int i2 = R$attr.uikit_dp16;
        int i3 = R$attr.uikit_dp8;
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("SHOW_PREVIOUS_PIN_ITEM_LIST_ID", defaultFilledButton, resourceImage2, textLocalisedClause2, false, null, null, i3, i3, i2, i2, 496);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.change_pin_pin_selection_not_now, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        int i5 = R$attr.uikit_dp16;
        return new e(v.k(model, model2, new LargeActionButtonDelegate.Model("NOT_NOW_ITEM_LIST_ID", defaultFilledButton2, null, textLocalisedClause3, false, null, null, R$attr.uikit_dp8, R$attr.uikit_dp24, i5, i5, 496)));
    }
}
