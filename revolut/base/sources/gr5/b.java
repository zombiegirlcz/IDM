package gr5;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static List a(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_overview_search_not_found_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_overview_search_not_found_subtitle, u.c(query), null, 12);
        if (query.length() <= 0) {
            textLocalisedClause2 = null;
        }
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("CRYPTO_SEND_WALLETS_EMPTY_SEARCH_RESULTS_ID", textLocalisedClause, textLocalisedClause2, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, zj.REGULAR, false, null, null, null, 1856);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }
}
