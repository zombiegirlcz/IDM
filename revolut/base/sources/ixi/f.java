package ixi;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import svi.h;
import svi.i;
import te0.w;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f169569a = w.y0(new iw4.b(7));

    private f() {
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    public static CompositeClause a(h hVar) {
        ?? r92 = f169569a;
        Object value = r92.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        String strPrint = ((DateTimeFormatter) value).print(hVar.f265914a);
        Intrinsics.checkNotNullExpressionValue(strPrint, "print(...)");
        TextClause textClause = new TextClause(strPrint, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Object value2 = r92.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        String strPrint2 = ((DateTimeFormatter) value2).print(hVar.f265915b);
        Intrinsics.checkNotNullExpressionValue(strPrint2, "print(...)");
        return new CompositeClause(v.k(textClause, new TextClause(strPrint2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause("-", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static Clause b(List list, c missingDayTextStyle) {
        Intrinsics.checkNotNullParameter(missingDayTextStyle, "missingDayTextStyle");
        if (list == null || list.isEmpty()) {
            int i = e.f169568a[missingDayTextStyle.ordinal()];
            if (i == 1) {
                return new TextLocalisedClause(R$string.airport_lounges_lounge_details_opening_hours_value_closed, null, null, 14);
            }
            if (i == 2) {
                return new TextLocalisedClause(R$string.airport_lounges_lounge_details_opening_hours_value_closed_lowercase, null, null, 14);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (list.size() == 1) {
            return a((h) d0.b0(list));
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((h) it8.next()));
        }
        return new CompositeClause(arrayList, new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static Clause c(i iVar, c missingDayTextStyle) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(missingDayTextStyle, "missingDayTextStyle");
        return b((List) iVar.f265920a.get(Integer.valueOf(new DateTime().toLocalDate().getDayOfWeek())), missingDayTextStyle);
    }

    public static boolean d(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Collection collectionValues = iVar.f265920a.values();
        return collectionValues.size() >= 7 && d0.i1(collectionValues).size() == 1;
    }
}
