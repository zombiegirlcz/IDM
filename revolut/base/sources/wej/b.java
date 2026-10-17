package wej;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f296799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TwinVerticalButton f296800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f296801c;
    public final Tabs d;
    public final ViewPager2 e;

    public b(ControllerContainerConstraintLayout controllerContainerConstraintLayout, TwinVerticalButton twinVerticalButton, NavBarWithToolbar navBarWithToolbar, Tabs tabs, ViewPager2 viewPager2) {
        this.f296799a = controllerContainerConstraintLayout;
        this.f296800b = twinVerticalButton;
        this.f296801c = navBarWithToolbar;
        this.d = tabs;
        this.e = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f296799a;
    }
}
