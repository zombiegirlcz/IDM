package j1e;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.stock_lending.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import i1e.j;
import ip0.zj;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements j {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a() {
        List listC = u.c(new FullScreenStateDelegate.Model("ID_TRANSACTIONS_STATE_ID", new TextLocalisedClause(R$string.wealth_stock_lending_details_transactions_error, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), false, null, null, false, 0, 0, 32708));
        b(listC);
        return listC;
    }

    public static void b(List list) {
        yp0.b.k(list, R$attr.uikit_dp0, 0, 0, 0, 30);
    }
}
