package q4g;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.flights.api.R$string;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static List a(int i, String str, boolean z) {
        String listId = (i & 2) != 0 ? "ERROR_STATE_ID" : str;
        Intrinsics.checkNotNullParameter(listId, "listId");
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model(listId, new TextLocalisedClause(R$string.travel_flights_checkout_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.travel_flights_checkout_error_generic_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, z ? new TextLocalisedClause(R$string.travel_flights_checkout_error_generic_action_try_again, null, null, 14) : null, false, null, null, false, 0, 0, 31168);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }
}
