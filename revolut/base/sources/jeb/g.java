package jeb;

import cli.j;
import cli.n;
import cli.o;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import vim.i;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        Date dateD;
        Date dateD2;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f173249b;
        LocalDate localDate = domainState.f173248a;
        List listC = list;
        if (listC.isEmpty()) {
            listC = u.c(localDate);
        }
        List list2 = listC;
        LocalDate localDate2 = (LocalDate) d0.u0(list2);
        if (localDate2 == null || (dateD = ebm.a.D(localDate2)) == null) {
            dateD = ebm.a.D(localDate);
        }
        Date date = dateD;
        LocalDate localDate3 = (LocalDate) d0.p0(list2);
        if (localDate3 == null || (dateD2 = ebm.a.D(localDate3)) == null) {
            dateD2 = ebm.a.D(localDate);
        }
        Date date2 = dateD2;
        Date dateD3 = ebm.a.D(localDate);
        vim.e eVarB = i.b(date, date2);
        vim.e eVarB2 = i.b(dateD3, dateD3);
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        Date dateD4 = ebm.a.D(localDateNow);
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(new DateTime(ebm.a.D((LocalDate) it8.next())));
        }
        return new c(eVarB, eVarB2, date, date2, dateD4, arrayList);
    }
}
