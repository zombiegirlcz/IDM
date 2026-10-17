package mx0;

import com.revolut.core.ui_kit.views.InputDualTextView;
import com.revolut.core.ui_kit.views.InputTravelAirportSearchItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class t7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputTravelAirportSearchItemView f210016b;

    public /* synthetic */ t7(InputTravelAirportSearchItemView inputTravelAirportSearchItemView, int i) {
        this.f210015a = i;
        this.f210016b = inputTravelAirportSearchItemView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f210015a;
        InputTravelAirportSearchItemView inputTravelAirportSearchItemView = this.f210016b;
        switch (i) {
            case 0:
                inputTravelAirportSearchItemView.f58666c.onNext(((CharSequence) obj2).toString());
                break;
            case 1:
                inputTravelAirportSearchItemView.d.onNext(((CharSequence) obj2).toString());
                break;
            default:
                int i2 = InputTravelAirportSearchItemView.f;
                inputTravelAirportSearchItemView.f58664a.setMode(new InputDualTextView.b.a(((Boolean) obj2).booleanValue() ? com.revolut.core.ui_kit.views.l.VISIBLE_DISABLED : com.revolut.core.ui_kit.views.l.VISIBLE_ENABLED));
                break;
        }
        return Unit.f186387a;
    }
}
