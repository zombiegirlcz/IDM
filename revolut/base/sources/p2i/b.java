package p2i;

import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature_exchange.impl.ui.exchange_v2.recurring_order_settings.RecurringOrderSettingsActivityV2;
import java.util.List;
import kotlin.jvm.functions.Function0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecurringOrderSettingsActivityV2 f232234b;

    public /* synthetic */ b(RecurringOrderSettingsActivityV2 recurringOrderSettingsActivityV2, int i) {
        this.f232233a = i;
        this.f232234b = recurringOrderSettingsActivityV2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f232233a;
        RecurringOrderSettingsActivityV2 recurringOrderSettingsActivityV2 = this.f232234b;
        switch (i) {
            case 0:
                return (List) recurringOrderSettingsActivityV2.A0.getValue();
            case 1:
                int i2 = RecurringOrderSettingsActivityV2.B0;
                return new z4l.j(7, v.k((InputTextDelegate) recurringOrderSettingsActivityV2.u0.getValue(), new PlainTextDelegate()), false);
            default:
                int i3 = RecurringOrderSettingsActivityV2.B0;
                return v.k((DatePickerDelegate) recurringOrderSettingsActivityV2.f96960v0.getValue(), (SingleChoiceDelegate) recurringOrderSettingsActivityV2.f96961w0.getValue(), (LargeActionButtonDelegate) recurringOrderSettingsActivityV2.f96962x0.getValue(), (RowDelegate) recurringOrderSettingsActivityV2.y0.getValue());
        }
    }
}
