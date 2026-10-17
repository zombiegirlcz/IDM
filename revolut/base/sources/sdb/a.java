package sdb;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f261844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CalendarPickerRangeView f261845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithToolbar f261846c;

    public a(ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout, CalendarPickerRangeView calendarPickerRangeView, NavBarWithToolbar navBarWithToolbar) {
        this.f261844a = controllerContainerCoordinatorLayout;
        this.f261845b = calendarPickerRangeView;
        this.f261846c = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f261844a;
    }
}
