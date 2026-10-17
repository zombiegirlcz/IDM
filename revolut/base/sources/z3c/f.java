package z3c;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolut_shop.api.R$string;
import d3c.f0;
import ip0.zj;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class f {
    public f(kpj.b shopContentGuard) {
        Intrinsics.checkNotNullParameter(shopContentGuard, "shopContentGuard");
    }

    public final Object a(f0 paymentFeatureStatus, Function1 onFailure, Function0 onSuccess) {
        Intrinsics.checkNotNullParameter(paymentFeatureStatus, "paymentFeatureStatus");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        int i = e.f319243a[paymentFeatureStatus.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            Intrinsics.checkNotNullParameter(onFailure, "onFailure");
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            return onSuccess.invoke();
        }
        if (i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("NO_ACCESS_ITEM_LIST_ID", new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_kym_unavailable_title, null, null, 14), new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_kym_unavailable_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return onFailure.invoke(u.c(model));
    }
}
