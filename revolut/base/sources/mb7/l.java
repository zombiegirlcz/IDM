package mb7;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.hidden_accounts.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = new RowDelegate.Model("SECRET_ACCOUNTS_UNHIDE_LIST_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_lock, null, null, 6), null, null, false, null, false, 62), new TextLocalisedClause(R$string.hidden_accounts_cell_secret_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.hidden_accounts_cell_secret_subtitle, null, null, 14), null, null, 0, new pf(new TextLocalisedClause(R$string.hidden_accounts_cell_secret_action_unhide, null, null, 14), null, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listC = u.c(model);
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        eVarB.add(new IconNavBarMenuItem("INFO_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.secret_accounts_header_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        if (domainState.f204173a) {
            eVarB.add(new IconNavBarMenuItem("HIDE_ACCOUNT_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.secret_accounts_screen_list_empty_state_action, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        }
        return new j(u.a(eVarB), listC);
    }
}
