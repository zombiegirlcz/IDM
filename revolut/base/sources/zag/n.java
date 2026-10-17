package zag;

import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.feature.travel.hotels.api.R$string;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        vim.e eVarB;
        LocalDate localDate;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        vim.e eVar = domainState.f320688b;
        LocalDate localDate2 = domainState.d;
        Date dateA = h9g.b.a((LocalDate) eVar.f289621a);
        Date dateA2 = h9g.b.a((LocalDate) eVar.f289622b);
        Intrinsics.checkNotNullExpressionValue(dateA2, "toDate$default(...)");
        vim.e eVarB2 = vim.i.b(dateA, dateA2);
        vim.d dVar = domainState.f320689c;
        Clause textLocalisedClause = null;
        if (dVar != null) {
            Date dateA3 = h9g.b.a((LocalDate) dVar.getStart());
            Date dateA4 = h9g.b.a((LocalDate) dVar.b());
            Intrinsics.checkNotNullExpressionValue(dateA4, "toDate$default(...)");
            eVarB = vim.i.b(dateA3, dateA4);
        } else {
            eVarB = null;
        }
        Date dateA5 = h9g.b.a(localDate2);
        Date dateA6 = h9g.b.a((LocalDate) domainState.f320688b.f289622b);
        Date dateA7 = h9g.b.a(localDate2);
        Intrinsics.checkNotNullExpressionValue(dateA7, "toDate$default(...)");
        rei.g gVar = (rei.g) domainState.f320687a.getContent();
        boolean z = false;
        if (gVar != null) {
            rei.e eVar2 = gVar.e;
            if (dVar != null && (localDate = (LocalDate) dVar.getStart()) != null && !localDate.equals((LocalDate) dVar.b()) && (!Intrinsics.f(eVar2.f253602a, dVar.getStart()) || !Intrinsics.f(eVar2.f253603b, dVar.b()))) {
                z = true;
            }
        }
        boolean z3 = z;
        if (dVar != null) {
            LocalDate localDate3 = (LocalDate) dVar.getStart();
            LocalDate localDate4 = (LocalDate) dVar.b();
            textLocalisedClause = (localDate4 == null || Intrinsics.f(localDate3, localDate4)) ? new TextLocalisedClause(R$string.hotels_calendar_picker_header_one_day_selected_subtitle, null, null, 14) : new TimeRangeClause(oc.c.F(localDate3), oc.c.F(localDate4), ZoneId.systemDefault(), null, 8);
        }
        return new k(eVarB2, eVarB, dateA5, dateA6, dateA7, z3, textLocalisedClause);
    }
}
