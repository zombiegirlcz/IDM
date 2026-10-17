package b5e;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.structured_note.details.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.q implements Function1 {
    public static final e f = new e();

    public e() {
        super(1, m4e.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/structured_note/details/impl/databinding/FlowNoteDetailsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.flowNoteDetails_buySellPanel;
        TwinHorizontalButton twinHorizontalButton = (TwinHorizontalButton) ViewBindings.findChildViewById(p0, i);
        if (twinHorizontalButton != null) {
            i = R$id.flowNoteDetails_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.flowNoteDetails_tabs;
                Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
                if (tabs != null) {
                    i = R$id.flowNoteDetails_viewPager;
                    if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new m4e.a((ControllerContainerCoordinatorLayout) p0, twinHorizontalButton, navBarWithToolbar, tabs);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
