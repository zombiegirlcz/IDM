package um2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.TwoViewsSwitcherView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.feature.backgroundpicker.impl.R$id;
import com.revolut.kompot.view.ControllerContainerLinearLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.q implements Function1 {
    public static final u f = new u();

    public u() {
        super(1, mm2.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/backgroundpicker/impl/databinding/ScreenThemeCustomisationV2Binding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.themeCustomisation_actionFooter;
        ActionFooterView actionFooterView = (ActionFooterView) ViewBindings.findChildViewById(p0, i);
        if (actionFooterView != null) {
            i = R$id.themeCustomisation_bottomSection;
            TwoViewsSwitcherView twoViewsSwitcherView = (TwoViewsSwitcherView) ViewBindings.findChildViewById(p0, i);
            if (twoViewsSwitcherView != null) {
                i = R$id.themeCustomisation_chatsRecyclerView;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(p0, i);
                if (recyclerView != null) {
                    i = R$id.themeCustomisation_disclaimer;
                    FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(p0, i);
                    if (footerTextView != null) {
                        i = R$id.themeCustomisation_navBar;
                        BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
                        if (basicNavBar != null) {
                            i = R$id.themeCustomisation_previewSwitcherView;
                            TwoViewsSwitcherView twoViewsSwitcherView2 = (TwoViewsSwitcherView) ViewBindings.findChildViewById(p0, i);
                            if (twoViewsSwitcherView2 != null) {
                                i = R$id.themeCustomisation_wallpapersRecyclerView;
                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(p0, i);
                                if (recyclerView2 != null) {
                                    return new mm2.b((ControllerContainerLinearLayout) p0, actionFooterView, twoViewsSwitcherView, recyclerView, footerTextView, basicNavBar, twoViewsSwitcherView2, recyclerView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
