package s12;

import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n3;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.apm.core.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements a12.o {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a12.k f259045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.g f259046b;

    public i(a12.k moneyRequestsMapper, thf.g transactionsItemMapper) {
        Intrinsics.checkNotNullParameter(moneyRequestsMapper, "moneyRequestsMapper");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        this.f259045a = moneyRequestsMapper;
        this.f259046b = transactionsItemMapper;
    }

    public final List a(a12.m info) {
        ArrayList arrayListQ;
        List list;
        Intrinsics.checkNotNullParameter(info, "info");
        List list2 = info.f477a;
        whf.p pVar = info.f478b;
        if (list2.isEmpty()) {
            List list3 = pVar != null ? pVar.f297646a : null;
            if (list3 == null || list3.isEmpty()) {
                return f0.f322471a;
            }
        }
        int size = list2.size();
        int size2 = (pVar == null || (list = pVar.f297646a) == null) ? 0 : list.size();
        int i = 3 - size;
        List listV0 = d0.V0(list2, 3);
        ArrayList arrayList = new ArrayList(w.t(listV0, 10));
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            arrayList.add(((g) this.f259045a).a((MoneyRequest) it8.next()));
        }
        if (i <= 0 || pVar == null) {
            arrayListQ = null;
        } else {
            whf.p pVarA = whf.p.a(d0.V0(pVar.f297646a, i), pVar);
            arrayListQ = ((anf.k) this.f259046b).q(pVarA.f297646a, pVarA.f297647b, new thf.f(false, 3));
        }
        aim.e eVarB = u.b();
        eVarB.addAll(arrayList);
        if (arrayListQ != null) {
            eVarB.addAll(arrayListQ);
        }
        return u.c(RowsWidgetDelegate.Model.Companion.a(RowsWidgetDelegate.Model.INSTANCE, "ApmAreaTransactionsMapper_header", new TextLocalisedClause(R$string.apm_area_transactions_title, null, null, 14), u.a(eVarB), true, size + size2 > 3 ? new n3(new TextLocalisedClause(R$string.apm_area_transactions_see_all, null, null, 14), null) : null, 96));
    }
}
