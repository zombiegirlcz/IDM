package dyf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements b {
    public static u8 a(hxf.a travelBooking) {
        Object timeClause;
        String str;
        Intrinsics.checkNotNullParameter(travelBooking, "travelBooking");
        String strQ = j6.a.q("BOOKING_LIST_ITEM_ID", travelBooking.f156582a);
        TextClause textClause = new TextClause(travelBooking.f156583b, (Style) null, Integer.valueOf(R$attr.uikit_colorWhite), false, (o9) null, (List) null, 122);
        hxf.b bVar = travelBooking.i;
        LocalDate localDate = travelBooking.e;
        TextClause textClause2 = (bVar == null || (str = bVar.d) == null) ? null : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        LocalDate localDate2 = travelBooking.f156586h;
        if (localDate2 != null) {
            LocalDateTime localDateTimeAtStartOfDay = localDate.atStartOfDay();
            Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay, "atStartOfDay(...)");
            long jR = oi0.d.R(localDateTimeAtStartOfDay);
            LocalDateTime localDateTimeAtStartOfDay2 = localDate2.atStartOfDay();
            Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay2, "atStartOfDay(...)");
            timeClause = new TimeRangeClause(jR, oi0.d.R(localDateTimeAtStartOfDay2), null, null, 12);
        } else {
            LocalDateTime localDateTimeAtStartOfDay3 = localDate.atStartOfDay();
            Intrinsics.checkNotNullExpressionValue(localDateTimeAtStartOfDay3, "atStartOfDay(...)");
            timeClause = new TimeClause(oi0.d.R(localDateTimeAtStartOfDay3), new TimeClause.Format.DayAndMonth(0), null, null, 12);
        }
        Object[] elements = {textClause2, timeClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        u8 u8Var = new u8(strQ, textClause, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), new Custom(Integer.valueOf(R$attr.uikit_colorWhite_80), false, null, false, null, 254), null, 8), null, new UrlImage(travelBooking.f156584c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, null, null, null, false, false, false, travelBooking, 65512);
        yp0.b.l(u8Var, 0, 0, 0, 0, null, false, 63);
        return u8Var;
    }

    public final ArrayList b(List travelBookingList) {
        Intrinsics.checkNotNullParameter(travelBookingList, "travelBookingList");
        List list = travelBookingList;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((hxf.a) it8.next()));
        }
        return arrayList;
    }
}
