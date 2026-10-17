package com.revolut.core.ui_kit.internal.views.timepicker;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.ma;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.TimePickerDelegate;
import com.revolut.core.ui_kit.internal.views.PickerView;
import dv0.a;
import dv0.b;
import dv0.c;
import dv0.d;
import dv0.f;
import e8.q;
import ip0.cl0;
import java.time.LocalTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ms0.f2;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0002\u001d-B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010+\u001a\u00020%2\u0006\u0010&\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/timepicker/TimePickerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljava/time/LocalTime;", "time", "", "setTime", "(Ljava/time/LocalTime;)V", "setTimeFormatForCurrentLocale", "()V", "Lcom/revolut/core/ui_kit/internal/views/PickerView;", "b", "Le8/q;", "getStartPickerView", "()Lcom/revolut/core/ui_kit/internal/views/PickerView;", "startPickerView", "f", "getMiddlePickerView", "middlePickerView", "g", "getEndPickerView", "endPickerView", "Ldv0/f;", "h", "Ldv0/f;", "getOnTimeChangedListener", "()Ldv0/f;", "setOnTimeChangedListener", "(Ldv0/f;)V", "onTimeChangedListener", "Law0/ma;", "value", "getTimeFormat", "()Law0/ma;", "setTimeFormat", "(Law0/ma;)V", "timeFormat", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TimePickerView extends ConstraintLayout {
    public static final List k = d0.d1(new IntRange(1, 12, 1));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List f57655l = d0.d1(new IntRange(0, 23, 1));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final List f57656m = d0.d1(new IntRange(0, 59, 1));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f57657n = v.k("PM", "AM");
    public static final LocalTime o = LocalTime.of(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q startPickerView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q middlePickerView;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q endPickerView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public f onTimeChangedListener;
    public LocalTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ma f57661j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimePickerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void f0(TimePickerView timePickerView) {
        Object dVar;
        LocalTime newTime;
        a aVar;
        int visibility = timePickerView.getMiddlePickerView().getVisibility();
        List list = f57656m;
        if (visibility == 0) {
            int iIntValue = ((Number) k.get(timePickerView.getStartPickerView().getValue())).intValue();
            int iIntValue2 = ((Number) list.get(timePickerView.getMiddlePickerView().getValue())).intValue();
            String str = (String) f57657n.get(timePickerView.getEndPickerView().getValue());
            if (Intrinsics.f(str, "AM")) {
                aVar = a.AM;
            } else {
                if (!Intrinsics.f(str, "PM")) {
                    throw new RuntimeException(j6.a.q("Wrong day period label: ", str));
                }
                aVar = a.PM;
            }
            dVar = new c(iIntValue, iIntValue2, aVar);
        } else {
            dVar = new d(((Number) f57655l.get(timePickerView.getStartPickerView().getValue())).intValue(), ((Number) list.get(timePickerView.getEndPickerView().getValue())).intValue());
        }
        f fVar = timePickerView.onTimeChangedListener;
        if (fVar != null) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            if (dVar instanceof d) {
                d dVar2 = (d) dVar;
                newTime = LocalTime.of(dVar2.f118017a, dVar2.f118018b);
                Intrinsics.checkNotNullExpressionValue(newTime, "of(...)");
            } else {
                if (!(dVar instanceof c)) {
                    throw new NoWhenBranchMatchedException();
                }
                c cVar = (c) dVar;
                int i = 12;
                a aVar2 = cVar.f118016c;
                int i2 = cVar.f118014a;
                if (i2 == 12) {
                    int i3 = b.f118013b[aVar2.ordinal()];
                    if (i3 == 1) {
                        i = 0;
                    } else if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    int i5 = b.f118013b[aVar2.ordinal()];
                    if (i5 == 1) {
                        i = i2;
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = i2 + 12;
                    }
                }
                newTime = LocalTime.of(i, cVar.f118015b);
                Intrinsics.checkNotNullExpressionValue(newTime, "of(...)");
            }
            timePickerView.i = newTime;
            abf.c cVar2 = (abf.c) fVar;
            TimePickerDelegate timePickerDelegate = (TimePickerDelegate) cVar2.f2949b;
            cl0 cl0Var = (cl0) cVar2.f2950c;
            Intrinsics.checkNotNullParameter(newTime, "newTime");
            timePickerDelegate.f53554c.onNext(new Pair(cl0Var, newTime));
        }
    }

    private final PickerView getEndPickerView() {
        return (PickerView) this.endPickerView.f();
    }

    private final PickerView getMiddlePickerView() {
        return (PickerView) this.middlePickerView.f();
    }

    private final PickerView getStartPickerView() {
        return (PickerView) this.startPickerView.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0(dv0.e r13) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.timepicker.TimePickerView.g0(dv0.e):void");
    }

    public final f getOnTimeChangedListener() {
        return this.onTimeChangedListener;
    }

    @NotNull
    /* JADX INFO: renamed from: getTimeFormat, reason: from getter */
    public final ma getF57661j() {
        return this.f57661j;
    }

    public final void setOnTimeChangedListener(f fVar) {
        this.onTimeChangedListener = fVar;
    }

    public final void setTime(LocalTime time) {
        if (time == null) {
            LocalTime DEFAULT_TIME_VALUE = o;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_TIME_VALUE, "DEFAULT_TIME_VALUE");
            time = DEFAULT_TIME_VALUE;
        }
        this.i = time;
        g0(cp5.d.b0(time, getF57661j()));
    }

    public final void setTimeFormat(@NotNull ma value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f57661j = value;
        g0(cp5.d.b0(this.i, getF57661j()));
    }

    public final void setTimeFormatForCurrentLocale() {
        setTimeFormat(DateFormat.is24HourFormat(getContext()) ? ma.TIME_24H : ma.TIME_12H);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimePickerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.startPickerView = kli.a.J(R$id.timePicker_startPicker, this);
        this.middlePickerView = kli.a.J(R$id.timePicker_middlePicker, this);
        this.endPickerView = kli.a.J(R$id.timePicker_endPicker, this);
        LocalTime DEFAULT_TIME_VALUE = o;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_TIME_VALUE, "DEFAULT_TIME_VALUE");
        this.i = DEFAULT_TIME_VALUE;
        this.f57661j = ma.TIME_24H;
        View.inflate(context, R$layout.internal_view_time_picker, this);
        f2 f2Var = new f2(this, 2);
        getStartPickerView().setOnValueChangedListener(f2Var);
        getMiddlePickerView().setOnValueChangedListener(f2Var);
        getEndPickerView().setOnValueChangedListener(f2Var);
    }

    public /* synthetic */ TimePickerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
