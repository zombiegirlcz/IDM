package qgf;

import aw0.e4;
import aw0.ka;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.transaction_list.impl.ui.list.flow.TransactionListFlowContract$InputData;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f245827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionListFlowContract$InputData f245828b;

    public y(l80.e dateProvider, TransactionListFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f245827a = dateProvider;
        this.f245828b = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e4 e4Var;
        boolean z;
        List list;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int iJ = ((l80.f) this.f245827a).j();
        Clause clause = domainState.f;
        TransactionsListFilterType.ConfigurableFilter configurableFilter = domainState.d;
        boolean z3 = domainState.f245801c;
        Clause clause2 = domainState.f245802g;
        TransactionListFlowContract$InputData transactionListFlowContract$InputData = this.f245828b;
        l lVar = new l(clause, clause2, transactionListFlowContract$InputData.f91903c, transactionListFlowContract$InputData.d, domainState.f245803h);
        int i = 0;
        int i2 = 1;
        boolean z4 = (transactionListFlowContract$InputData.d && z3) ? false : true;
        List list2 = domainState.f245799a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            YearMonth yearMonth = (YearMonth) it8.next();
            LocalDate localDateAtDay = yearMonth.atDay(i2);
            Intrinsics.checkNotNullExpressionValue(localDateAtDay, "atDay(...)");
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            int i3 = i2;
            Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
            TimeClause timeClause = new TimeClause(ebm.a.O(localDateAtDay, zoneIdSystemDefault), yearMonth.getYear() == iJ ? new TimeClause.Format.Month(i) : new TimeClause.Format.MonthAndYear((ka) null, 3), null, ZoneId.systemDefault(), 4);
            String string = yearMonth.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            arrayList.add(new com.revolut.core.ui_kit.views.q(string, new com.revolut.core.ui_kit.views.t(timeClause), 58));
            i2 = i3;
            i = 0;
        }
        int i5 = i2;
        YearMonth yearMonth2 = domainState.f245800b;
        String string2 = yearMonth2 != null ? yearMonth2.toString() : null;
        if (z3) {
            e4Var = e4.GONE;
        } else {
            TransactionsListFilterType.ConfigurableFilter.SelectableFilters selectableFilters = configurableFilter instanceof TransactionsListFilterType.ConfigurableFilter.SelectableFilters ? (TransactionsListFilterType.ConfigurableFilter.SelectableFilters) configurableFilter : null;
            if (selectableFilters != null && (list = selectableFilters.f92014a) != null && (!list.isEmpty() ? 1 : 0) == i5) {
                e4Var = e4.ACTIVE;
            } else if (configurableFilter instanceof TransactionsListFilterType.ConfigurableFilter.AccountFilters) {
                e4 e4Var2 = domainState.e ? e4.ACTIVE : null;
                if (e4Var2 != null) {
                    z = z4;
                    e4Var = e4Var2;
                    return new m(lVar, z, arrayList, string2, e4Var);
                }
                e4Var = e4.INACTIVE;
            } else {
                e4Var = e4.GONE;
            }
        }
        z = z4;
        return new m(lVar, z, arrayList, string2, e4Var);
    }
}
