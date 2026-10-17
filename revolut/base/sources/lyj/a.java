package lyj;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.views.LabeledVerticalScrollView;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f200843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LabeledVerticalScrollView f200844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f200845c;
    public final Tabs d;
    public final ViewPager2 e;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, LabeledVerticalScrollView labeledVerticalScrollView, NavBarWithToolbar navBarWithToolbar, Tabs tabs, ViewPager2 viewPager2) {
        this.f200843a = controllerContainerCoordinatorLayout;
        this.f200844b = labeledVerticalScrollView;
        this.f200845c = navBarWithToolbar;
        this.d = tabs;
        this.e = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f200843a;
    }
}
