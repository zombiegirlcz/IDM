package op0;

import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CalendarListWidgetDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CalendarListWidgetDelegate f227493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CalendarListWidgetDelegate.Model f227494c;

    public /* synthetic */ z(CalendarListWidgetDelegate calendarListWidgetDelegate, CalendarListWidgetDelegate.Model model, int i) {
        this.f227492a = i;
        this.f227493b = calendarListWidgetDelegate;
        this.f227494c = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227492a) {
            case 0:
                CalendarRowDelegate.Model model = (CalendarRowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                CalendarListWidgetDelegate.Model model2 = this.f227494c;
                this.f227493b.r(model2, new com.revolut.core.ui_kit.delegates.widgets.o(model2.e, model));
                break;
            default:
                LargeActionButtonDelegate.Model footerModel = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(footerModel, "footerModel");
                CalendarListWidgetDelegate.Model model3 = this.f227494c;
                this.f227493b.r(model3, new com.revolut.core.ui_kit.delegates.widgets.n(model3.e, footerModel));
                break;
        }
        return Unit.f186387a;
    }
}
