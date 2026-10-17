package z0c;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.rev_points.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import wxb.n;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/rev_points/impl/databinding/ScreenRevPointsTrophyRoomHighlightsSharingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.revPointsTrophyRoomHighlightsSharingScreen_actions;
        ActionsView actionsView = (ActionsView) ViewBindings.findChildViewById(p0, i);
        if (actionsView != null) {
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i2 = R$id.revPointsTrophyRoomHighlightsSharingScreen_navBar;
            BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i2);
            if (basicNavBar != null) {
                i2 = R$id.revPointsTrophyRoomHighlightsSharingScreen_recyclerView;
                AsyncDiffRecyclerView asyncDiffRecyclerView = (AsyncDiffRecyclerView) ViewBindings.findChildViewById(p0, i2);
                if (asyncDiffRecyclerView != null) {
                    return new n(controllerContainerCoordinatorLayout, actionsView, basicNavBar, asyncDiffRecyclerView);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
