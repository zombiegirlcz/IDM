package nn3;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LabeledVerticalScrollView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.NestedScrollCoordinatorView;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.contacts_chooser.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.q implements Function1 {
    public static final n f = new n();

    public n() {
        super(1, hn3.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/contacts_chooser/impl/databinding/ScreenChooseContactsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.contactsChooser_continueButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.contactsChooser_continueTwinButton;
            TwinVerticalButton twinVerticalButton = (TwinVerticalButton) ViewBindings.findChildViewById(p0, i);
            if (twinVerticalButton != null) {
                i = R$id.contactsChooser_coordinatorLayout;
                if (((NestedScrollCoordinatorView) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.contactsChooser_labeledRecyclerViewScroller;
                    LabeledVerticalScrollView labeledVerticalScrollView = (LabeledVerticalScrollView) ViewBindings.findChildViewById(p0, i);
                    if (labeledVerticalScrollView != null) {
                        i = R$id.contactsChooser_navBar;
                        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                        if (navBarWithToolbar != null) {
                            i = R$id.contactsChooser_recyclerView;
                            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                            if (screenContentRecyclerView != null) {
                                return new hn3.a((ControllerContainerConstraintLayout) p0, largeActionButton, twinVerticalButton, labeledVerticalScrollView, navBarWithToolbar, screenContentRecyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
