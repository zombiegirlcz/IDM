package o32;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import m12.h;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, h.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenQrDetailsContainerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.qrDetailsContainer_circleActionButtonsBar;
        CircleActionButtonsBarView circleActionButtonsBarView = (CircleActionButtonsBarView) ViewBindings.findChildViewById(p0, i);
        if (circleActionButtonsBarView != null) {
            i = R$id.qrDetailsContainer_container;
            if (((ControllerContainerFrameLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.qrDetailsContainer_navBar;
                NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithAvatar != null) {
                    return new h((ControllerContainerCoordinatorLayout) p0, circleActionButtonsBarView, navBarWithAvatar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
