package fhi;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature_workflow_reminder_impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b extends q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, ygi.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature_workflow_reminder_impl/databinding/ScreenWorkflowTimerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
        int i = R$id.navBarBottomSheet_NavBar;
        NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) ViewBindings.findChildViewById(p0, i);
        if (navBarBottomSheet != null) {
            i = R$id.navBarBottomSheet_RecyclerView;
            if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.twinHorizontalButton;
                TwinHorizontalButton twinHorizontalButton = (TwinHorizontalButton) ViewBindings.findChildViewById(p0, i);
                if (twinHorizontalButton != null) {
                    return new ygi.a(controllerContainerCoordinatorLayout, navBarBottomSheet, twinHorizontalButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
