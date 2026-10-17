package w02;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.apm.core.ui.api.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f293620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f293621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f293622c;
    public final NavBarWithAvatar d;
    public final LargeActionButton e;
    public final LargeActionButton f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LargeActionButton f293623g;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, LargeActionButton largeActionButton, FooterTextView footerTextView, NavBarWithAvatar navBarWithAvatar, LargeActionButton largeActionButton2, LargeActionButton largeActionButton3, LargeActionButton largeActionButton4) {
        this.f293620a = controllerContainerConstraintLayout;
        this.f293621b = largeActionButton;
        this.f293622c = footerTextView;
        this.d = navBarWithAvatar;
        this.e = largeActionButton2;
        this.f = largeActionButton3;
        this.f293623g = largeActionButton4;
    }

    public static b a(View view) {
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) view;
        int i = R$id.transferScreenAmount_draftButton;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            i = R$id.transferScreenAmount_footerContainer;
            if (((LegacyButtonContainerConstraintLayout) ViewBindings.findChildViewById(view, i)) != null) {
                i = R$id.transferScreenAmount_footerView;
                FooterTextView footerTextView = (FooterTextView) ViewBindings.findChildViewById(view, i);
                if (footerTextView != null) {
                    i = R$id.transferScreenAmount_navigationBar;
                    NavBarWithAvatar navBarWithAvatar = (NavBarWithAvatar) ViewBindings.findChildViewById(view, i);
                    if (navBarWithAvatar != null) {
                        i = R$id.transferScreenAmount_recyclerView;
                        if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(view, i)) != null) {
                            i = R$id.transferScreenAmount_scheduleButton;
                            LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(view, i);
                            if (largeActionButton2 != null) {
                                i = R$id.transferScreenAmount_settingsButton;
                                LargeActionButton largeActionButton3 = (LargeActionButton) ViewBindings.findChildViewById(view, i);
                                if (largeActionButton3 != null) {
                                    i = R$id.transferScreenAmount_submitButton;
                                    LargeActionButton largeActionButton4 = (LargeActionButton) ViewBindings.findChildViewById(view, i);
                                    if (largeActionButton4 != null) {
                                        return new b(controllerContainerConstraintLayout, largeActionButton, footerTextView, navBarWithAvatar, largeActionButton2, largeActionButton3, largeActionButton4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f293620a;
    }
}
