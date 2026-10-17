package acf;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading_add_ons.impl.R$string;
import java.util.List;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements a {
    public final List a() {
        return u.c(new FullScreenStateDelegate.Model("ADD_ONS_ERROR_STATE_ID", new TextLocalisedClause(R$string.price_plan_add_ons_add_on_error, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(R$string.price_plan_add_ons_add_on_try_again, null, null, 14), false, null, null, false, 0, 0, 32724));
    }
}
