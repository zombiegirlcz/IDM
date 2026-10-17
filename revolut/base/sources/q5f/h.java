package q5f;

import com.revolut.feature.trading.managed_portfolios.impl.domain.investor_update.model.InvestorUpdate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static z5f.h a(q5f.f r20) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q5f.h.a(q5f.f):z5f.h");
    }

    public static ArrayList b(List dtos) {
        Intrinsics.checkNotNullParameter(dtos, "dtos");
        List<g> list = dtos;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (g gVar : list) {
            String id10 = gVar.getId();
            LocalDate localDate = LocalDate.parse(gVar.getReportingDate());
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            arrayList.add(new InvestorUpdate(id10, localDate));
        }
        return arrayList;
    }
}
