package com.revolut.core.ui_kit.views.calendar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.internal.delegates.gridselector.GridHeaderDelegate;
import com.revolut.core.ui_kit.internal.delegates.gridselector.GridSelectorDelegate;
import com.revolut.core.ui_kit.internal.views.gridselector.GridSelectorView;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import efm.r;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o31.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import pgk.f;
import pva.c;
import px0.a;
import te0.w;
import tq0.k;
import vim.d;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ]\u0010\u0015\u001a\u00020\u00142\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/revolut/core/ui_kit/views/calendar/CalendarPickerRangeView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lvim/d;", "Ljava/util/Date;", "calendarDatesRange", "selectedDatesRange", "selectableDatesStart", "selectableDatesEnd", "currentDate", "", "Lorg/joda/time/DateTime;", "availableDates", "", "setCalendarData", "(Lvim/d;Lvim/d;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;)V", "Ltq0/k;", "h", "Lkotlin/Lazy;", "getHeaderItem", "()Ltq0/k;", "headerItem", "Landroidx/recyclerview/widget/RecyclerView;", "k", "Le8/q;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/revolut/core/ui_kit/internal/views/gridselector/GridSelectorView;", "l", "getWeekdayHeader", "()Lcom/revolut/core/ui_kit/internal/views/gridselector/GridSelectorView;", "weekdayHeader", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CalendarPickerRangeView extends LinearLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GridSelectorDelegate f59028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Custom f59029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Custom f59030c;
    public final Custom d;
    public final Custom e;
    public final Custom f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f59031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f59032h;
    public final DateTime i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DateTime f59033j;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final q recyclerView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final q weekdayHeader;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarPickerRangeView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static DateTime d(Date date) {
        return new DateTime(date.getTime()).withTimeAtStartOfDay();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final k getHeaderItem() {
        return (k) this.f59032h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.f();
    }

    private final GridSelectorView getWeekdayHeader() {
        return (GridSelectorView) this.weekdayHeader.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCalendarData$default(CalendarPickerRangeView calendarPickerRangeView, d dVar, d dVar2, Date date, Date date2, Date date3, List list, int i, Object obj2) {
        if ((i & 4) != 0) {
            date = null;
        }
        if ((i & 8) != 0) {
            date2 = null;
        }
        if ((i & 32) != 0) {
            list = null;
        }
        calendarPickerRangeView.setCalendarData(dVar, dVar2, date, date2, date3, list);
    }

    public final r b() {
        r map = this.f59028a.p().filter(new c(1, new a(0))).map(new c(2, new a(1)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void c() {
        getRecyclerView().scrollToPosition(this.f59031g.f319395l.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022f  */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v41, types: [tq0.d] */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Comparable, org.joda.time.DateTime, org.joda.time.base.AbstractInstant] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [aw0.ka] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r36v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [vim.e] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setCalendarData(@org.jetbrains.annotations.NotNull vim.d r36, vim.d r37, java.util.Date r38, java.util.Date r39, @org.jetbrains.annotations.NotNull java.util.Date r40, java.util.List<org.joda.time.DateTime> r41) {
        /*
            Method dump skipped, instruction units count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView.setCalendarData(vim.d, vim.d, java.util.Date, java.util.Date, java.util.Date, java.util.List):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalendarPickerRangeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarPickerRangeView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        GridSelectorDelegate gridSelectorDelegate = new GridSelectorDelegate();
        this.f59028a = gridSelectorDelegate;
        GridHeaderDelegate gridHeaderDelegate = new GridHeaderDelegate();
        this.f59029b = new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254);
        this.f59030c = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        this.d = new Custom(Integer.valueOf(R$attr.uikit_colorTransparent), false, null, false, null, 254);
        this.e = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254);
        this.f = new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254);
        j jVar = new j(new koi.c(v.k(gridSelectorDelegate, gridHeaderDelegate)), false, 14);
        this.f59031g = jVar;
        this.f59032h = w.y0(new f(this, 27));
        DateTime dateTimeWithMinimumValue = new DateTime(0L).dayOfWeek().withMinimumValue();
        Intrinsics.checkNotNullExpressionValue(dateTimeWithMinimumValue, "withMinimumValue(...)");
        this.i = dateTimeWithMinimumValue;
        DateTime dateTimeWithMaximumValue = dateTimeWithMinimumValue.dayOfWeek().withMaximumValue();
        Intrinsics.checkNotNullExpressionValue(dateTimeWithMaximumValue, "withMaximumValue(...)");
        this.f59033j = dateTimeWithMaximumValue;
        this.recyclerView = kli.a.J(R$id.calendarPickerRange_recyclerView, this);
        this.weekdayHeader = kli.a.J(R$id.calendarPickerRange_weekdayHeader, this);
        View.inflate(context, R$layout.internal_view_calendar_picker_range, this);
        setOrientation(1);
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setTag(R$id.internal_scroller_view_tag, Unit.f186387a);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new b());
        int[] CalendarPickerRangeView = R$styleable.CalendarPickerRangeView;
        Intrinsics.checkNotNullExpressionValue(CalendarPickerRangeView, "CalendarPickerRangeView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CalendarPickerRangeView, i, 0);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CalendarPickerRangeView_uikit_calendarBottomPadding, 0));
        recyclerView.setClipToPadding(false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ CalendarPickerRangeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
