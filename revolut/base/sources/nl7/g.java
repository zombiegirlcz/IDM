package nl7;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f217062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f217063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CalendarPickerRangeView f217064c;
    public final NavBarWithToolbar d;

    public g(LargeActionButton largeActionButton, CalendarPickerRangeView calendarPickerRangeView, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f217062a = controllerContainerCoordinatorLayout;
        this.f217063b = largeActionButton;
        this.f217064c = calendarPickerRangeView;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f217062a;
    }
}
