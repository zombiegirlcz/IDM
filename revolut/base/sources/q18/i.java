package q18;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class i {
    public final List a(boolean z) {
        return z ? u.c(new IconNavBarMenuItem("NAV_BAR_MENU_ACTION_WATCHLIST", new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.feed_section_insights_empty_action_add_to_watchlist, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)) : f0.f322471a;
    }
}
