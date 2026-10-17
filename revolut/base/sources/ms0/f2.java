package ms0;

import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.revolut.core.ui_kit.internal.views.MonthYearPickerView;
import com.revolut.core.ui_kit.internal.views.timepicker.TimePickerView;
import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class f2 implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f208249b;

    public /* synthetic */ f2(ViewGroup viewGroup, int i) {
        this.f208248a = i;
        this.f208249b = viewGroup;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        switch (this.f208248a) {
            case 0:
                MonthYearPickerView monthYearPickerView = (MonthYearPickerView) this.f208249b;
                YearMonth yearMonthWithMonth = monthYearPickerView.d.withMonth(i2 + 1);
                Intrinsics.checkNotNullExpressionValue(yearMonthWithMonth, "withMonth(...)");
                monthYearPickerView.d = yearMonthWithMonth;
                monthYearPickerView.f56283c.invoke(yearMonthWithMonth);
                break;
            case 1:
                MonthYearPickerView monthYearPickerView2 = (MonthYearPickerView) this.f208249b;
                int year = monthYearPickerView2.f56284g.getYear() + i2;
                int monthValue = year == monthYearPickerView2.f56284g.getYear() ? monthYearPickerView2.f56284g.getMonthValue() : 1;
                int monthValue2 = year == monthYearPickerView2.f56285h.getYear() ? monthYearPickerView2.f56285h.getMonthValue() : 12;
                int iG = kotlin.ranges.f.g(monthYearPickerView2.d.getMonthValue(), monthValue, monthValue2);
                monthYearPickerView2.a(iG, new IntRange(monthValue, monthValue2, 1));
                YearMonth yearMonthOf = YearMonth.of(year, iG);
                Intrinsics.checkNotNullExpressionValue(yearMonthOf, "of(...)");
                monthYearPickerView2.d = yearMonthOf;
                monthYearPickerView2.f56283c.invoke(yearMonthOf);
                break;
            default:
                TimePickerView.f0((TimePickerView) this.f208249b);
                break;
        }
    }
}
