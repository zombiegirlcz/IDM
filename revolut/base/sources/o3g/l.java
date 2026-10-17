package o3g;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import java.util.Date;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements p {
    @Override // jki.p
    public final m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        vim.e eVar = domainState.f221807a;
        List list = domainState.f;
        Date date = ((DateTime) eVar.f289621a).toDate();
        Date date2 = ((DateTime) domainState.f221807a.f289622b).toDate();
        Intrinsics.checkNotNullExpressionValue(date2, "toDate(...)");
        vim.e eVarB = vim.i.b(date, date2);
        Date date3 = domainState.f221808b.toDate();
        Intrinsics.checkNotNullExpressionValue(date3, "toDate(...)");
        Date date4 = domainState.f221809c.toDate();
        Intrinsics.checkNotNullExpressionValue(date4, "toDate(...)");
        Date date5 = domainState.d.toDate();
        Intrinsics.checkNotNullExpressionValue(date5, "toDate(...)");
        TravelExperienceDatesSelection travelExperienceDatesSelection = domainState.e;
        List list2 = list;
        return new j(new d(eVarB, date3, date4, date5, travelExperienceDatesSelection != null ? a1g.f.e(travelExperienceDatesSelection) : null, domainState.f), list2 == null || list2.isEmpty() || !list2.isEmpty(), Intrinsics.f(travelExperienceDatesSelection, TravelExperienceDatesSelection.NoDatesSelection.f92906a) ? f0.f322471a : u.c(new TextNavBarMenuItem("MENU_ITEM_ID_CLEAR", new TextLocalisedClause(R$string.experiences_common_clear, null, null, 14), null, null, 12)));
    }
}
