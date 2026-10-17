package c4g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f21259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f21260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CalendarPickerRangeView f21261c;
    public final NavBarWithToolbar d;

    public e(LargeActionButton largeActionButton, CalendarPickerRangeView calendarPickerRangeView, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f21259a = controllerContainerCoordinatorLayout;
        this.f21260b = largeActionButton;
        this.f21261c = calendarPickerRangeView;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f21259a;
    }
}
