package ycg;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.feature.travel.hotels.api.R$string;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        vim.e eVarB;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        vim.d dVar = domainState.f312613a;
        LocalDate localDate = domainState.f312615c;
        Date dateA = h9g.b.a((LocalDate) dVar.getStart());
        Date dateA2 = h9g.b.a((LocalDate) dVar.b());
        Intrinsics.checkNotNullExpressionValue(dateA2, "toDate$default(...)");
        vim.e eVarB2 = vim.i.b(dateA, dateA2);
        vim.d dVar2 = domainState.f312614b;
        if (dVar2 != null) {
            Date dateA3 = h9g.b.a((LocalDate) dVar2.getStart());
            Date dateA4 = h9g.b.a((LocalDate) dVar2.b());
            Intrinsics.checkNotNullExpressionValue(dateA4, "toDate$default(...)");
            eVarB = vim.i.b(dateA3, dateA4);
        } else {
            eVarB = null;
        }
        Date dateA5 = h9g.b.a(localDate);
        LocalDate localDatePlusYears = localDate.plusYears(2L);
        Intrinsics.checkNotNullExpressionValue(localDatePlusYears, "plusYears(...)");
        Date dateA6 = h9g.b.a(localDatePlusYears);
        Date dateA7 = h9g.b.a(domainState.d);
        Intrinsics.checkNotNullExpressionValue(dateA7, "toDate$default(...)");
        boolean z = false;
        if (dVar2 != null && !((LocalDate) dVar2.getStart()).isEqual((ChronoLocalDate) dVar2.b())) {
            z = true;
        }
        return new h(eVarB2, eVarB, dateA5, dateA6, dateA7, z, dVar2 != null ? ((LocalDate) dVar2.getStart()).isEqual((ChronoLocalDate) dVar2.b()) ? new TextLocalisedClause(R$string.hotels_calendar_picker_header_one_day_selected_subtitle, null, null, 14) : new TimeRangeClause(oc.c.F((LocalDate) dVar2.getStart()), oc.c.F((LocalDate) dVar2.b()), ZoneId.systemDefault(), null, 8) : null);
    }
}
