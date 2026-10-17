package uge;

import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import com.revolut.feature.add.new_product.api.declaration.AddNewProductDestination;
import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface d {
    static AddNewProductDestination a(d dVar, TabAccountsMode mode, qf1.c cVar, ZoomTarget zoomTarget, int i) {
        if ((i & 1) != 0) {
            mode = TabAccountsMode.Home.f89466a;
        }
        if ((i & 2) != 0) {
            cVar = null;
        }
        if ((i & 4) != 0) {
            zoomTarget = null;
        }
        ((e) dVar).getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (cVar == null) {
            if (Intrinsics.f(mode, TabAccountsMode.Credit.f89462a)) {
                cVar = qf1.c.BORROW;
            } else {
                if (!Intrinsics.f(mode, TabAccountsMode.Home.f89466a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = null;
            }
        }
        return new AddNewProductDestination(cVar, zoomTarget != null ? com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, zoomTarget, new HomeOverlayConfig(true)) : null);
    }
}
