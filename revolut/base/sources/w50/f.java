package w50;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.revolut.chat_core.R$id;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, a60.e.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/chat_core/databinding/ScreenChatTranscriptPeriodCalendarBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.chatTranscriptPeriodCalendar_button;
        LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
        if (largeActionButton != null) {
            i = R$id.chatTranscriptPeriodCalendar_calendar;
            CalendarPickerRangeView calendarPickerRangeView = (CalendarPickerRangeView) ViewBindings.findChildViewById(p0, i);
            if (calendarPickerRangeView != null) {
                i = R$id.chatTranscriptPeriodCalendar_navBar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    return new a60.e(largeActionButton, calendarPickerRangeView, navBarWithToolbar, (ControllerContainerCoordinatorLayout) p0);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
