package a60;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerCoordinatorLayout f1516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f1517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CalendarPickerRangeView f1518c;
    public final NavBarWithToolbar d;

    public e(LargeActionButton largeActionButton, CalendarPickerRangeView calendarPickerRangeView, NavBarWithToolbar navBarWithToolbar, ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout) {
        this.f1516a = controllerContainerCoordinatorLayout;
        this.f1517b = largeActionButton;
        this.f1518c = calendarPickerRangeView;
        this.d = navBarWithToolbar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f1516a;
    }
}
