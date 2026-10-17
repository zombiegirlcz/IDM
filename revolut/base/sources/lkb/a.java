package lkb;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.savings.api.R$string;
import java.util.List;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import qib.g;
import qv0.c;
import qv0.k;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final C1116a Companion = new C1116a();

    /* JADX INFO: renamed from: lkb.a$a, reason: collision with other inner class name */
    public static final class C1116a {
        private C1116a() {
        }
    }

    public static RowDelegate.Model a(int i, TextLocalisedClause textLocalisedClause, String str, RowDelegate.Model.c cVar, Object obj2, boolean z) {
        RowDelegate.Model model = new RowDelegate.Model("FOOTER_ITEM_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), textLocalisedClause, null, 0, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, 0, cVar, z, null, null, null, null, null, null, null, null, obj2, c.C1364c.f249512a, null, null, null, null, 0, 0, 0, 0, null, -12586024, 15);
        int i2 = R$attr.uikit_dp8;
        yp0.b.l(model, 0, 0, i2, i2, null, false, 51);
        model.R0(k.Single);
        return model;
    }

    public static RowDelegate.Model b(int i, g gVar) {
        int i2 = R$string.savings_challenge_widget_action_title_missed;
        dj0.d dVar = gVar.f246687c;
        if (dVar != null) {
            return a(i, new TextLocalisedClause(i2, u.c(new MoneyClause(dVar, new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12)), null, 12), gVar.f246685a, new pf(new TextLocalisedClause(R$string.savings_challenge_widget_action_cta_missed, null, null, 14), null, h4.ACCENT, false, null, null, 506), new sib.b(sib.a.CATCH_UP), false);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
