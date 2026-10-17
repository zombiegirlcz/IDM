package a1g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.experiences.api.R$plurals;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import vim.i;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f {
    public static final DateTime a(TravelExperienceDatesSelection travelExperienceDatesSelection) {
        Intrinsics.checkNotNullParameter(travelExperienceDatesSelection, "<this>");
        if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.SingleDateSelection) {
            return ((TravelExperienceDatesSelection.SingleDateSelection) travelExperienceDatesSelection).f92909a.withTimeAtStartOfDay();
        }
        if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.RangeDateSelection) {
            return ((TravelExperienceDatesSelection.RangeDateSelection) travelExperienceDatesSelection).f92908b.withTimeAtStartOfDay();
        }
        if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.NoDatesSelection) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final DateTime b(TravelExperienceDatesSelection travelExperienceDatesSelection) {
        Intrinsics.checkNotNullParameter(travelExperienceDatesSelection, "<this>");
        if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.SingleDateSelection) {
            return ((TravelExperienceDatesSelection.SingleDateSelection) travelExperienceDatesSelection).f92909a.withTimeAtStartOfDay();
        }
        if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.RangeDateSelection) {
            return ((TravelExperienceDatesSelection.RangeDateSelection) travelExperienceDatesSelection).f92907a.withTimeAtStartOfDay();
        }
        if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.NoDatesSelection) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TimeRangeClause c(TravelExperienceDatesSelection travelExperienceDatesSelection) {
        Intrinsics.checkNotNullParameter(travelExperienceDatesSelection, "<this>");
        vim.e eVarE = e(travelExperienceDatesSelection);
        if (eVarE != null) {
            return new TimeRangeClause(((Date) eVarE.f289621a).getTime(), ((Date) eVarE.f289622b).getTime(), null, null, 12);
        }
        return null;
    }

    public static final Clause d(TravelExperienceDatesSelection travelExperienceDatesSelection) {
        Intrinsics.checkNotNullParameter(travelExperienceDatesSelection, "<this>");
        if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.NoDatesSelection) {
            return new TextLocalisedClause(R$string.experiences_home_date_picker_placeholder, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        }
        TimeRangeClause timeRangeClauseC = c(travelExperienceDatesSelection);
        return timeRangeClauseC == null ? d(TravelExperienceDatesSelection.NoDatesSelection.f92906a) : timeRangeClauseC;
    }

    public static final vim.e e(TravelExperienceDatesSelection travelExperienceDatesSelection) {
        Intrinsics.checkNotNullParameter(travelExperienceDatesSelection, "<this>");
        if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.SingleDateSelection) {
            DateTime dateTime = ((TravelExperienceDatesSelection.SingleDateSelection) travelExperienceDatesSelection).f92909a;
            Date date = dateTime.toDate();
            Date date2 = dateTime.toDate();
            Intrinsics.checkNotNullExpressionValue(date2, "toDate(...)");
            return i.b(date, date2);
        }
        if (!(travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.RangeDateSelection)) {
            if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.NoDatesSelection) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        TravelExperienceDatesSelection.RangeDateSelection rangeDateSelection = (TravelExperienceDatesSelection.RangeDateSelection) travelExperienceDatesSelection;
        Date date3 = rangeDateSelection.f92907a.toDate();
        Date date4 = rangeDateSelection.f92908b.toDate();
        Intrinsics.checkNotNullExpressionValue(date4, "toDate(...)");
        return i.b(date3, date4);
    }

    public static final String f(TravelExperienceDatesSelection travelExperienceDatesSelection) {
        Intrinsics.checkNotNullParameter(travelExperienceDatesSelection, "<this>");
        if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.SingleDateSelection) {
            String string = ((TravelExperienceDatesSelection.SingleDateSelection) travelExperienceDatesSelection).f92909a.toString("yyyy-MM-dd");
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        if (!(travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.RangeDateSelection)) {
            if (travelExperienceDatesSelection instanceof TravelExperienceDatesSelection.NoDatesSelection) {
                throw new IllegalStateException("Cannot provide formatted date from NoSelection type");
            }
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb6 = new StringBuilder();
        TravelExperienceDatesSelection.RangeDateSelection rangeDateSelection = (TravelExperienceDatesSelection.RangeDateSelection) travelExperienceDatesSelection;
        sb6.append(rangeDateSelection.f92907a.toString("yyyy-MM-dd"));
        sb6.append("-");
        sb6.append(rangeDateSelection.f92908b.toString("yyyy-MM-dd"));
        return sb6.toString();
    }

    public static final int g(TravelExperienceVisitorsSelection travelExperienceVisitorsSelection) {
        Intrinsics.checkNotNullParameter(travelExperienceVisitorsSelection, "<this>");
        Iterator it8 = travelExperienceVisitorsSelection.f92916a.entrySet().iterator();
        int iIntValue = 0;
        while (it8.hasNext()) {
            iIntValue += ((Number) ((Map.Entry) it8.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    public static final TextLocalisedQuantityClause h(TravelExperienceVisitorsSelection travelExperienceVisitorsSelection) {
        Intrinsics.checkNotNullParameter(travelExperienceVisitorsSelection, "<this>");
        return new TextLocalisedQuantityClause(R$plurals.experiences_choose_option_section_activity_details_booking_visitors, Integer.valueOf(g(travelExperienceVisitorsSelection)), u.c(Integer.valueOf(g(travelExperienceVisitorsSelection))), (Style) null, 24);
    }
}
