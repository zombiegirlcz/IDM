package f2i;

import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature_exchange.impl.ui.exchange.recurring_order_settings.RecurringOrderSettingsActivity;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecurringOrderSettingsActivity f131796b;

    public /* synthetic */ c(RecurringOrderSettingsActivity recurringOrderSettingsActivity, int i) {
        this.f131795a = i;
        this.f131796b = recurringOrderSettingsActivity;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f131795a;
        RecurringOrderSettingsActivity recurringOrderSettingsActivity = this.f131796b;
        switch (i) {
            case 0:
                int i2 = RecurringOrderSettingsActivity.A0;
                return new z4l.j(7, zhm.v.k((InputTextDelegate) recurringOrderSettingsActivity.u0.getValue(), new PlainTextDelegate()), false);
            case 1:
                int i3 = RecurringOrderSettingsActivity.A0;
                return zhm.v.k((DatePickerDelegate) recurringOrderSettingsActivity.f96934v0.getValue(), (SingleChoiceDelegate) recurringOrderSettingsActivity.f96935w0.getValue(), (LargeActionButtonDelegate) recurringOrderSettingsActivity.f96936x0.getValue());
            default:
                return (List) recurringOrderSettingsActivity.z0.getValue();
        }
    }
}
