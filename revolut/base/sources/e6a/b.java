package e6a;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.List;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(Throwable th10) {
        FullScreenStateDelegate.Model model;
        if (tj0.a.a(th10)) {
            model = new FullScreenStateDelegate.Model("LIST_ID_NO_CONNECTION_ERROR_ITEM", new TextLocalisedClause(R$string.common_offline_state_title, null, null, 14), new TextLocalisedClause(R$string.common_offline_state_description, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_communication, null, null, 6)), new l6(12, new TextLocalisedClause(R$string.common_offline_state_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1984);
        } else {
            model = new FullScreenStateDelegate.Model("LIST_ID_ERROR_ITEM_LIST_ID", new TextLocalisedClause(com.revolut.feature.payments_migration.impl.R$string.payments_migration_move_subscriptions_loading_error_title, null, null, 14), null, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), new l6(12, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1988);
        }
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }
}
