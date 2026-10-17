package c9g;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.hotels.impl.R$id;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f22400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f22401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CalendarPickerRangeView f22402c;
    public final NavBarWithToolbar d;

    public i(LargeActionButton largeActionButton, CalendarPickerRangeView calendarPickerRangeView, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f22400a = controllerContainerCoordinatorLayout;
        this.f22401b = largeActionButton;
        this.f22402c = calendarPickerRangeView;
        this.d = navBarWithToolbar;
    }

    public static i a(View view) {
        int i = R$id.travelHotelsDatesPickerScreen_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(view, i);
        if (largeActionButton != null) {
            i = R$id.travelHotelsDatesPickerScreen_calendarPickerRangeView;
            CalendarPickerRangeView calendarPickerRangeView = (CalendarPickerRangeView) ViewBindings.findChildViewById(view, i);
            if (calendarPickerRangeView != null) {
                ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) view;
                int i2 = R$id.travelHotelsDatesPickerScreen_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(view, i2);
                if (navBarWithToolbar != null) {
                    return new i(largeActionButton, calendarPickerRangeView, navBarWithToolbar, controllerContainerCoordinatorLayout);
                }
                i = i2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f22400a;
    }
}
