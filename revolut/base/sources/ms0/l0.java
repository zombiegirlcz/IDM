package ms0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import aw0.ka;
import aw0.o9;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.internal.views.MonthYearPickerView;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.gridselector.GridHeaderView;
import com.revolut.core.ui_kit.internal.views.gridselector.GridSelectorView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import fq0.a;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l0 extends ConstraintLayout {

    @NotNull
    private static final a Companion = new a();
    public static final /* synthetic */ int E = 0;
    public Clause A;
    public Clause B;
    public String C;
    public String D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Custom f208315b;
    public final Custom f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Custom f208316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Custom f208317h;
    public final Custom i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f208318j;
    public final GridHeaderView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final GridSelectorView f208319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MonthYearPickerView f208320m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SmallActionButton f208321n;
    public final ihm.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m0 f208322p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public YearMonth f208323q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LocalDate f208324r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LocalDate f208325s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LocalDate f208326t;
    public boolean u;
    public DatePickerDelegate.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f208327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Map f208328x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f208329y;
    public List z;

    public static final class a {
        private a() {
        }

        public static final void a(a aVar, View view, int i) {
            aVar.getClass();
            view.animate().cancel();
            view.setAlpha(i == 0 ? 0.0f : 1.0f);
            view.setVisibility(0);
            view.animate().alpha(i != 0 ? 0.0f : 1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).withEndAction(new com.google.android.material.sidesheet.b(view, i, 6)).start();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void f0(LocalDate localDate, LocalDate localDate2, ArrayList arrayList) {
        int iNextIndex;
        Iterator it8 = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            iNextIndex = -1;
            if (!it8.hasNext()) {
                i2 = -1;
                break;
            }
            Object obj2 = ((tq0.a) it8.next()).i;
            LocalDate localDate3 = obj2 instanceof LocalDate ? (LocalDate) obj2 : null;
            if (localDate3 != null && localDate3.compareTo((ChronoLocalDate) localDate) >= 0) {
                break;
            } else {
                i2++;
            }
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object obj3 = ((tq0.a) listIterator.previous()).i;
            LocalDate localDate4 = obj3 instanceof LocalDate ? (LocalDate) obj3 : null;
            if (localDate4 != null && localDate4.compareTo((ChronoLocalDate) localDate2) <= 0) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (i2 < 0 || iNextIndex < 0) {
            return;
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (i2 > iNextIndex) {
            throw new IllegalArgumentException(" start index should be less or equal to end index");
        }
        for (Object obj4 : arrayList) {
            int i3 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            ((tq0.a) obj4).f = i == i2 ? tq0.d.START : i == iNextIndex ? tq0.d.END : (i2 > i || i > iNextIndex) ? null : tq0.d.MID;
            i = i3;
        }
    }

    public final void g0() {
        m0 m0Var;
        int i = n0.f208335a[this.f208322p.ordinal()];
        if (i == 1) {
            m0Var = m0.MONTH_YEAR_PICKER;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m0Var = m0.SELECTOR;
        }
        this.f208322p = m0Var;
        h0();
        m0 m0Var2 = this.f208322p;
        m0 m0Var3 = m0.MONTH_YEAR_PICKER;
        this.f208321n.setVisibility(m0Var2 == m0Var3 ? 0 : 8);
        this.k.setDropdownOpen(this.f208322p == m0Var3, true);
        a aVar = Companion;
        a.a(aVar, this.f208319l, this.f208322p == m0.SELECTOR ? 0 : 4);
        a.a(aVar, this.f208320m, this.f208322p != m0Var3 ? 8 : 0);
    }

    public final void h0() {
        i0();
        int i = n0.f208335a[this.f208322p.ordinal()];
        if (i == 1) {
            j0();
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        YearMonth yearMonth = this.f208323q;
        LocalDate localDate = this.f208324r;
        YearMonth yearMonthFrom = localDate != null ? YearMonth.from(localDate) : null;
        LocalDate localDate2 = this.f208325s;
        this.f208320m.setModel(yearMonth, yearMonthFrom, localDate2 != null ? YearMonth.from(localDate2) : null);
    }

    public final void i0() {
        TimeClause.Format.MonthAndYear monthAndYear = new TimeClause.Format.MonthAndYear((ka) null, 3);
        boolean z = true;
        LocalDate localDateAtDay = this.f208323q.atDay(1);
        Intrinsics.checkNotNullExpressionValue(localDateAtDay, "atDay(...)");
        TimeClause timeClause = new TimeClause(oc.c.F(localDateAtDay), monthAndYear, null, null, 12);
        GridHeaderView gridHeaderView = this.k;
        gridHeaderView.setTitle(timeClause);
        gridHeaderView.setDropdownVisible(this.u);
        gridHeaderView.setNavigatePrevContentDescription(this.A);
        gridHeaderView.setNavigateNextContentDescription(this.B);
        gridHeaderView.setNavigatePrevE2ETestsCustomId(this.C);
        gridHeaderView.setNavigateNextE2ETestsCustomId(this.D);
        int i = n0.f208335a[this.f208322p.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gridHeaderView.setNavigateToPrevEnabled(false);
            gridHeaderView.setNavigateToNextEnabled(false);
            return;
        }
        boolean z3 = this.f208324r == null || YearMonth.from(this.f208323q).compareTo(YearMonth.from(this.f208324r)) > 0;
        if (this.f208325s != null && YearMonth.from(this.f208323q).compareTo(YearMonth.from(this.f208325s)) >= 0) {
            z = false;
        }
        gridHeaderView.setNavigateToPrevEnabled(z3);
        gridHeaderView.setNavigateToNextEnabled(z);
    }

    public final void j0() {
        boolean z;
        fq0.a cVar;
        fq0.a aVar;
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDate = this.f208326t;
        YearMonth yearMonth = this.f208323q;
        LocalDate localDate2 = this.f208324r;
        fq0.a dVar = a.C0802a.f137163a;
        fq0.a eVar = localDate2 != null ? new fq0.e(localDate2) : dVar;
        LocalDate localDate3 = this.f208325s;
        if (localDate3 != null) {
            dVar = new fq0.d(localDate3);
        }
        List listK = zhm.v.k(eVar, dVar);
        List<DatePickerDelegate.a> list = this.z;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (DatePickerDelegate.a aVar2 : list) {
            if (Intrinsics.f(aVar2, DatePickerDelegate.a.C0402a.f52177a)) {
                aVar = a.b.f137164a;
            } else {
                if (aVar2 instanceof com.revolut.core.ui_kit.delegates.d5) {
                    cVar = new fq0.b(((com.revolut.core.ui_kit.delegates.d5) aVar2).f54011a);
                } else {
                    if (!(aVar2 instanceof com.revolut.core.ui_kit.delegates.e5)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = new fq0.c(((com.revolut.core.ui_kit.delegates.e5) aVar2).f54087a);
                }
                aVar = cVar;
            }
            arrayList.add(aVar);
        }
        ArrayList<fq0.a> filters = zhm.d0.E0(arrayList, listK);
        Intrinsics.checkNotNullParameter(filters, "filters");
        List<LocalDate> listJ = nkm.y.J(nkm.t.g(yearMonth.atDay(1).with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)), new a15.l(17, yearMonth.atEndOfMonth().with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)))));
        ArrayList arrayList2 = new ArrayList(zhm.w.t(listJ, 10));
        for (LocalDate date : listJ) {
            boolean z3 = this.f208329y && this.f208328x.get(date) == null;
            Intrinsics.checkNotNullParameter(date, "date");
            while (true) {
                for (fq0.a aVar3 : filters) {
                    z = z && aVar3.a(date);
                }
            }
            boolean z4 = z && !z3;
            DatePickerDelegate.b bVar = this.v;
            boolean z6 = this.f208327w && (date.equals(localDate) || ((bVar instanceof com.revolut.core.ui_kit.delegates.f5) && Intrinsics.f(((com.revolut.core.ui_kit.delegates.f5) bVar).f54143a, date)));
            Custom custom = z6 ? this.f : date.equals(localDateNow) ? this.f208315b : !z4 ? this.f208317h : (!z4 || date.getMonth() == yearMonth.getMonth()) ? this.f208316g : this.i;
            String string = date.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList2.add(new tq0.a(string, new TextClause(String.valueOf(date.getDayOfMonth()), (Style) custom, (Integer) null, false, (o9) null, (List) null, 124), null, z6, z4, date.equals(localDateNow), (vf0.h) this.f208328x.get(date), date, 36));
        }
        DatePickerDelegate.b bVar2 = this.v;
        if (bVar2 instanceof DatePickerDelegate.b.a) {
            LocalDate localDate4 = this.f208326t;
            if (localDate4 == null) {
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    ((tq0.a) it8.next()).f = null;
                }
            } else if (localDate4.getDayOfWeek().getValue() >= 1) {
                LocalDate localDateWith = localDate4.with(TemporalAdjusters.previousOrSame(DayOfWeek.of(1)));
                LocalDate localDateMinusDays = localDateWith.plusWeeks(1L).minusDays(1L);
                Intrinsics.checkNotNullExpressionValue(localDateMinusDays, "minusDays(...)");
                f0(localDateWith, localDateMinusDays, arrayList2);
            } else {
                LocalDate localDateWith2 = localDate4.with(TemporalAdjusters.nextOrSame(DayOfWeek.of(1)));
                LocalDate localDateMinusWeeks = localDateWith2.minusWeeks(1L);
                Intrinsics.h(localDateMinusWeeks);
                LocalDate localDateMinusDays2 = localDateWith2.minusDays(1L);
                Intrinsics.checkNotNullExpressionValue(localDateMinusDays2, "minusDays(...)");
                f0(localDateMinusWeeks, localDateMinusDays2, arrayList2);
            }
        } else if (bVar2 instanceof com.revolut.core.ui_kit.delegates.f5) {
            LocalDate localDate5 = this.f208326t;
            if (localDate5 != null) {
                LocalDate localDate6 = ((com.revolut.core.ui_kit.delegates.f5) bVar2).f54143a;
                if (localDate5.compareTo((ChronoLocalDate) localDate6) < 0) {
                    f0(localDate5, localDate6, arrayList2);
                }
            }
        } else if (bVar2 != null) {
            throw new NoWhenBranchMatchedException();
        }
        this.f208319l.setModel(new tq0.k(7, 504, null, "SELECTOR_VIEW_ID", zhm.d0.E0(arrayList2, this.f208318j)));
    }

    public final void setModel(@NotNull YearMonth presentedMonth, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, DatePickerDelegate.b bVar, boolean z, @NotNull Map<LocalDate, vf0.h> dots, boolean z3, @NotNull List<? extends DatePickerDelegate.a> filters, boolean z4, Clause clause, Clause clause2, String str, String str2) {
        boolean z6;
        boolean z11;
        boolean z12;
        boolean z29;
        boolean z31;
        boolean z41;
        boolean z49;
        boolean z54;
        boolean z74;
        boolean z83;
        boolean z89;
        boolean z96;
        boolean z100;
        Intrinsics.checkNotNullParameter(presentedMonth, "presentedMonth");
        Intrinsics.checkNotNullParameter(dots, "dots");
        Intrinsics.checkNotNullParameter(filters, "filters");
        boolean z101 = true;
        if (Intrinsics.f(this.f208323q, presentedMonth)) {
            z6 = false;
        } else {
            this.f208323q = presentedMonth;
            z6 = true;
        }
        if (Intrinsics.f(this.f208324r, localDate)) {
            z11 = false;
        } else {
            this.f208324r = localDate;
            z11 = true;
        }
        if (Intrinsics.f(this.f208325s, localDate2)) {
            z12 = false;
        } else {
            this.f208325s = localDate2;
            z12 = true;
        }
        if (Intrinsics.f(this.f208326t, localDate3)) {
            z29 = false;
        } else {
            this.f208326t = localDate3;
            z29 = true;
        }
        if (Intrinsics.f(this.v, bVar)) {
            z31 = false;
        } else {
            this.v = bVar;
            z31 = true;
        }
        if (this.f208327w == z) {
            z41 = false;
        } else {
            this.f208327w = z;
            z41 = true;
        }
        if (Intrinsics.f(this.f208328x, dots)) {
            z49 = false;
        } else {
            this.f208328x = dots;
            z49 = true;
        }
        if (this.f208329y == z3) {
            z54 = false;
        } else {
            this.f208329y = z3;
            z54 = true;
        }
        if (Intrinsics.f(this.z, filters)) {
            z74 = false;
        } else {
            this.z = filters;
            z74 = true;
        }
        if (this.u == z4) {
            z83 = false;
        } else {
            this.u = z4;
            z83 = true;
        }
        boolean z102 = z6;
        if (Intrinsics.f(this.A, clause)) {
            z89 = false;
        } else {
            this.A = clause;
            z89 = true;
        }
        if (Intrinsics.f(this.B, clause2)) {
            z96 = false;
        } else {
            this.B = clause2;
            z96 = true;
        }
        if (Intrinsics.f(this.C, str)) {
            z100 = false;
        } else {
            this.C = str;
            z100 = true;
        }
        if (Intrinsics.f(this.D, str2)) {
            z101 = false;
        } else {
            this.D = str2;
        }
        if (z83 && !z4 && this.f208322p == m0.MONTH_YEAR_PICKER) {
            g0();
            return;
        }
        if (z102 || z11 || z12 || z29 || z31 || z41 || z49 || z54 || z74 || z83 || z89 || z96 || z100 || z101) {
            h0();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f208315b = new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254);
        this.f = new Custom(Integer.valueOf(R$attr.uikit_colorBackground), false, null, false, null, 254);
        this.f208316g = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        this.f208317h = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone20), false, null, false, null, 254);
        this.i = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
        IntRange intRange = new IntRange(1, 7, 1);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            LocalDate localDateWith = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.of(it8.nextInt())));
            Intrinsics.checkNotNullExpressionValue(localDateWith, "with(...)");
            long jF = oc.c.F(localDateWith);
            arrayList.add(new tq0.a(p.a.m(jF, "DAY_OF_WEEK"), new TimeClause(jF, TimeClause.Format.ShortDayOfWeek.f57976b, this.f208316g, null, 8), tq0.b.TITLE, false, false, false, null, null, DefaultFrameSampler.DESIRED_FRAME_WIDTH));
        }
        this.f208318j = arrayList;
        this.o = v0.a.d("create(...)");
        this.f208322p = m0.SELECTOR;
        YearMonth yearMonthNow = YearMonth.now();
        Intrinsics.checkNotNullExpressionValue(yearMonthNow, "now(...)");
        this.f208323q = yearMonthNow;
        this.f208327w = true;
        this.f208328x = zhm.r0.g();
        this.z = zhm.f0.f322471a;
        View.inflate(context, R$layout.internal_view_date_picker, this);
        View viewFindViewById = findViewById(R$id.datePicker_header);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        GridHeaderView gridHeaderView = (GridHeaderView) viewFindViewById;
        this.k = gridHeaderView;
        View viewFindViewById2 = findViewById(R$id.datePicker_selector);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        GridSelectorView gridSelectorView = (GridSelectorView) viewFindViewById2;
        this.f208319l = gridSelectorView;
        View viewFindViewById3 = findViewById(R$id.datePicker_monthYearPicker);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        MonthYearPickerView monthYearPickerView = (MonthYearPickerView) viewFindViewById3;
        this.f208320m = monthYearPickerView;
        View viewFindViewById4 = findViewById(R$id.datePicker_doneButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        SmallActionButton smallActionButton = (SmallActionButton) viewFindViewById4;
        this.f208321n = smallActionButton;
        smallActionButton.setText(new TextLocalisedClause(R$string.uikit_common_action_done, null, null, 14));
        smallActionButton.k(j4.f208300a);
        efm.r.merge(gridHeaderView.f57198g, smallActionButton.f56386h).filter(new mlk.b0(new i0(this, 1), 29)).subscribe(new j0(new i0(this, 4), 0));
        gridHeaderView.f.subscribe(new j0(new i0(this, 5), 1));
        gridHeaderView.f57197b.subscribe(new mlk.b0(new i0(this, 0), 25));
        gridSelectorView.f57204a.p().map(new mlk.b0(new mqg.b(13), 26)).subscribe(new mlk.b0(new i0(this, 2), 28));
        monthYearPickerView.setOnCurrentDateChangedListener(new i0(this, 3));
        h0();
    }

    public /* synthetic */ l0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
