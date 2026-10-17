package com.revolut.feature.workflow.engine.rfi.impl.ui.timeline;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.YearPickerBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.time.MonthPickerBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.time.date_picker.DatePickerBottomSheetController;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static LocalDate b(long j2) {
        return ebm.a.N(new Date(j2));
    }

    public final SimpleViewController a(String title, com.revolut.shared.feature.workflow.engine.api.models.workflow.a datePrecision, Long l2, Long l3, Long l4, Long l5) {
        LocalDate localDateB;
        LocalDate localDateB2;
        YearMonth yearMonthFrom;
        LocalDate localDateB3;
        LocalDate localDateB4;
        LocalDate localDateB5;
        LocalDate localDateB6;
        LocalDate localDateB7;
        LocalDate localDateB8;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(datePrecision, "datePrecision");
        if (l3 != null) {
            l2 = l3;
        }
        if (l2 == null || (localDateB = b(l2.longValue())) == null) {
            localDateB = b(Math.min(l5 != null ? l5.longValue() : Long.MAX_VALUE, Math.max(l4 != null ? l4.longValue() : Long.MIN_VALUE, System.currentTimeMillis())));
        }
        int i = suh.a.f265766a[datePrecision.ordinal()];
        numValueOf = null;
        Integer numValueOf = null;
        yearMonthFrom = null;
        YearMonth yearMonthFrom2 = null;
        if (i == 1) {
            return new DatePickerBottomSheetController(new DatePickerBottomSheetController.InputData(new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (l3 == null || (localDateB2 = b(l3.longValue())) == null) ? localDateB : localDateB2, l4 != null ? b(l4.longValue()) : null, l5 != null ? b(l5.longValue()) : null, 16));
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            TextClause textClause = new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            int year = (l3 == null || (localDateB8 = b(l3.longValue())) == null) ? localDateB.getYear() : localDateB8.getYear();
            Integer numValueOf2 = (l4 == null || (localDateB7 = b(l4.longValue())) == null) ? null : Integer.valueOf(localDateB7.getYear());
            if (l5 != null && (localDateB6 = b(l5.longValue())) != null) {
                numValueOf = Integer.valueOf(localDateB6.getYear());
            }
            return new YearPickerBottomSheetController(new YearPickerBottomSheetController.InputData(textClause, year, numValueOf2, numValueOf));
        }
        TextClause textClause2 = new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (l3 == null || (localDateB5 = b(l3.longValue())) == null || (yearMonthFrom = YearMonth.from(localDateB5)) == null) {
            yearMonthFrom = YearMonth.from(localDateB);
        }
        Intrinsics.h(yearMonthFrom);
        YearMonth yearMonthFrom3 = (l4 == null || (localDateB4 = b(l4.longValue())) == null) ? null : YearMonth.from(localDateB4);
        if (l5 != null && (localDateB3 = b(l5.longValue())) != null) {
            yearMonthFrom2 = YearMonth.from(localDateB3);
        }
        return new MonthPickerBottomSheetController(new MonthPickerBottomSheetController.InputData(textClause2, yearMonthFrom, yearMonthFrom3, yearMonthFrom2));
    }
}
