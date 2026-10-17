package si5;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.i;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.feature.crypto.onboarding.impl.R$string;
import java.util.List;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements bi5.b {
    public static List a(ec5.c cVar) {
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("ONBOARDING_BANNER_LIST_ID", new TextLocalisedClause(R$string.crypto_onboarding_banner_action_required_title, null, null, 14), new TextLocalisedClause(R$string.crypto_onboarding_banner_action_required_description, null, null, 14), new m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D231", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6), null, new i(14, new TextLocalisedClause(R$string.crypto_onboarding_banner_action_required_button, null, null, 14), null, false), null, new bi5.c(cVar), null, false, 8016);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }
}
