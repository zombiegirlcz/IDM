package wqi;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.retail.common.ui.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import mx0.d;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static ActionsView.Item a(String id10, e4 state, WealthAction.Theme theme) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.tab_header_action_theme_customisation, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.tab_header_action_theme_customisation, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_palette, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        return new ActionsView.Item(id10, d.CONTEXTUAL, false, state, textLocalisedClause2, textLocalisedClause, resourceImage, null, null, null, false, null, null, theme, null, 24452);
    }
}
