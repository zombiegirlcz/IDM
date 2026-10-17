package op0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.CalendarRowLoadingDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 extends com.revolut.core.ui_kit.delegates.widgets.m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CalendarRowDelegate f227155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f227156t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        CalendarRowDelegate calendarRowDelegate = new CalendarRowDelegate();
        this.f227155s = calendarRowDelegate;
        I();
        efm.r rVarHide = calendarRowDelegate.f.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        rVarHide.subscribe(new x(1, new ok7.c(this, 18)));
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.m
    public final List H() {
        return zhm.v.k(this.f227155s, new CalendarRowLoadingDelegate());
    }
}
