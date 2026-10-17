package q2d;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static IconNavBarMenuItem a() {
        return new IconNavBarMenuItem("SHARED_FAVOURITES_PRICE_ALERTS_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_bell_add_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.shared_alerts_accessibility_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
