package xu4;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_rev_points_locked_title, null, null, 14);
        int i = R$attr.uikit_colorForeground;
        lw0.a aVar = new lw0.a(textLocalisedClause, null, new lw0.b(new ResourceImage(R$drawable.uikit_icn_24_lock_closed, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, new ImageTransformations(null, null, null, null, null, 48, 48, 31), (Clause) null, 182), null), null, false, 26);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_rev_points_locked_action, null, null, 14);
        RowDelegate.Model model = new RowDelegate.Model("ID_REV_POINTS_LOCKED_ITEM", new ResourceImage(R$drawable.uikit_icn_24_revpoints, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_rev_points_locked_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_rev_points_locked_description, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676);
        yp0.b.l(model, R$attr.uikit_dp0, R$attr.uikit_dp8, 0, 0, null, false, 60);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ID_OVERDUE_MONEY_ITEM", new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_amount, null, null, 14), new MoneyClause(domainState.f308956a, new MoneyClause.Format.Shorts(false, 63), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        yp0.b.l(model2, R$attr.uikit_dp8, R$attr.uikit_dp0, 0, 0, null, false, 60);
        return new f(textLocalisedClause2, v.k(model, model2), aVar);
    }
}
