package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.youTransactor.uCube.rpc.Constants;
import grl.b4;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ms0.f2;
import or0.u;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/MonthYearPickerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "year", "", "setYearPicker", "(I)V", "Ljava/time/YearMonth;", "current", "min", "max", "setModel", "(Ljava/time/YearMonth;Ljava/time/YearMonth;Ljava/time/YearMonth;)V", "Lkotlin/Function1;", "listener", "setOnCurrentDateChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MonthYearPickerView extends LinearLayout {

    @NotNull
    private static final a Companion = new a();
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickerView f56281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PickerView f56282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1 f56283c;
    public YearMonth d;
    public final YearMonth e;
    public final YearMonth f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public YearMonth f56284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public YearMonth f56285h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f56286j;

    public static final class a {
        private a() {
        }

        public static final ArrayList a(a aVar, int i, int i2) {
            aVar.getClass();
            IntRange intRange = new IntRange(i, i2, 1);
            ArrayList arrayList = new ArrayList(w.t(intRange, 10));
            vim.f it8 = intRange.iterator();
            while (it8.f289625c) {
                arrayList.add(new TextClause(String.valueOf(it8.nextInt()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            }
            return arrayList;
        }

        public static void b(PickerView pickerView, ArrayList arrayList, int i, IntRange intRange) {
            int i2 = intRange.f186448a;
            int i3 = intRange.f186449b;
            if (i > i3 || i2 > i) {
                throw new IllegalStateException("Check failed.");
            }
            pickerView.setDisplayedValues(null);
            pickerView.setMinValue(0);
            pickerView.setMaxValue(0);
            pickerView.setMaxValue(i3);
            pickerView.setMinValue(i2);
            List<Clause> listSubList = arrayList.subList(i2, i3 + 1);
            ArrayList arrayList2 = new ArrayList(w.t(listSubList, 10));
            for (Clause clause : listSubList) {
                ty0.c cVarB0 = u.k(pickerView).b0();
                Context context = pickerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                arrayList2.add(ty0.c.a(cVarB0, clause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString());
            }
            pickerView.setDisplayedValues((String[]) arrayList2.toArray(new String[0]));
            pickerView.setValue(i);
            pickerView.setWrapSelectorWheel(false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MonthYearPickerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setYearPicker(int year) {
        a aVar = Companion;
        ArrayList arrayList = this.f56286j;
        int year2 = year - this.f56284g.getYear();
        IntRange intRangeI = v.i(arrayList);
        aVar.getClass();
        a.b(this.f56282b, arrayList, year2, intRangeI);
    }

    public final void a(int i, IntRange intRange) {
        int i2 = intRange.f186448a - 1;
        int i3 = intRange.f186449b - 1;
        a aVar = Companion;
        IntRange intRange2 = new IntRange(i2, i3, 1);
        aVar.getClass();
        a.b(this.f56281a, this.i, i - 1, intRange2);
    }

    public final void b() {
        this.f56286j = a.a(Companion, this.f56284g.getYear(), this.f56285h.getYear());
        a(this.d.getMonthValue(), new IntRange(this.d.getYear() == this.f56284g.getYear() ? this.f56284g.getMonthValue() : 1, this.d.getYear() == this.f56285h.getYear() ? this.f56285h.getMonthValue() : 12, 1));
        setYearPicker(this.d.getYear());
    }

    public final void setModel(@NotNull YearMonth current, YearMonth min, YearMonth max) {
        boolean z;
        boolean z3;
        Intrinsics.checkNotNullParameter(current, "current");
        if (min == null) {
            min = this.e;
        }
        boolean z4 = true;
        if (Intrinsics.f(this.f56284g, min)) {
            z = false;
        } else {
            this.f56284g = min;
            z = true;
        }
        if (max == null) {
            max = this.f;
        }
        if (Intrinsics.f(this.f56285h, max)) {
            z3 = false;
        } else {
            this.f56285h = max;
            z3 = true;
        }
        if (Intrinsics.f(this.d, current)) {
            z4 = false;
        } else {
            this.d = current;
        }
        if (this.f56284g.compareTo(this.f56285h) > 0) {
            throw new IllegalStateException(("Check " + this.f56284g + " <= " + this.f56285h + " has failed").toString());
        }
        YearMonth yearMonth = this.f56284g;
        YearMonth yearMonth2 = this.f56285h;
        YearMonth yearMonth3 = this.d;
        if (yearMonth3.compareTo(yearMonth) >= 0 && yearMonth3.compareTo(yearMonth2) <= 0) {
            if (z || z3 || z4) {
                b();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Check " + this.d + " in " + vim.i.b(this.f56284g, this.f56285h) + " has failed").toString());
    }

    public final void setOnCurrentDateChangedListener(@NotNull Function1<? super YearMonth, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f56283c = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MonthYearPickerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonthYearPickerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56283c = new mqg.b(15);
        YearMonth yearMonthNow = YearMonth.now();
        Intrinsics.checkNotNullExpressionValue(yearMonthNow, "now(...)");
        this.d = yearMonthNow;
        YearMonth yearMonthWithMonth = yearMonthNow.minusYears(100L).withMonth(1);
        Intrinsics.checkNotNullExpressionValue(yearMonthWithMonth, "withMonth(...)");
        this.e = yearMonthWithMonth;
        YearMonth yearMonthWithMonth2 = this.d.plusYears(100L).withMonth(12);
        Intrinsics.checkNotNullExpressionValue(yearMonthWithMonth2, "withMonth(...)");
        this.f = yearMonthWithMonth2;
        this.f56284g = yearMonthWithMonth;
        this.f56285h = yearMonthWithMonth2;
        Companion.getClass();
        IntRange intRange = new IntRange(1, 12, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            LocalDate localDateAtDay = YearMonth.of(b4.EXPIRED_OR_INVALID_KEY_VALUE, it8.nextInt()).atDay(1);
            Intrinsics.checkNotNullExpressionValue(localDateAtDay, "atDay(...)");
            arrayList.add(new TimeClause(oc.c.F(localDateAtDay), new TimeClause.Format.Month(ka.FULL), null, null, 12));
        }
        this.i = arrayList;
        this.f56286j = a.a(Companion, this.f56284g.getYear(), this.f56285h.getYear());
        View.inflate(context, R$layout.internal_view_month_year_picker, this);
        View viewFindViewById = findViewById(R$id.monthYearPicker_month);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        PickerView pickerView = (PickerView) viewFindViewById;
        this.f56281a = pickerView;
        View viewFindViewById2 = findViewById(R$id.monthYearPicker_year);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        PickerView pickerView2 = (PickerView) viewFindViewById2;
        this.f56282b = pickerView2;
        pickerView.setOnValueChangedListener(new f2(this, 0));
        pickerView2.setOnValueChangedListener(new f2(this, 1));
        b();
    }

    public /* synthetic */ MonthYearPickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
