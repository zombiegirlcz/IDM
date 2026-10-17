package hbh;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements h1h.d, f1h.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1h.e f150747a;

    public m(f1h.e investTransactionsCommonMapper) {
        Intrinsics.checkNotNullParameter(investTransactionsCommonMapper, "investTransactionsCommonMapper");
        this.f150747a = investTransactionsCommonMapper;
    }

    public static List c(boolean z) {
        ArrayList arrayList;
        if (z) {
            arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(nb0.b(pb0.Companion, a0.d.n("INVEST_TRANSACTIONS_WIDGET_LOADING_", i), false, 0, false, 30));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }

    @Override // f1h.e
    public final RowDelegate.Model a(InvestTransaction transaction, q1h.b options, Object obj2) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(options, "options");
        return this.f150747a.a(transaction, options, obj2);
    }

    public final List b(h1h.g gVar, InvestTransactionsListContract$Disclaimers investTransactionsListContract$Disclaimers) {
        e0h.a aVar = gVar.f148577b;
        InvestTransactionsFilter investTransactionsFilter = gVar.f148576a;
        List list = aVar.f121715a;
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        boolean z = false;
        int i = 3;
        boolean z3 = list.size() > 3;
        List<InvestTransaction> listV0 = d0.V0(list, 3);
        ArrayList arrayList = new ArrayList();
        for (InvestTransaction investTransaction : listV0) {
            RowDelegate.Model modelA = a(investTransaction, new q1h.b(q1h.a.DATETIME), new f1h.d(investTransaction, investTransactionsFilter, false));
            if (modelA != null) {
                arrayList.add(modelA);
            }
        }
        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("INVEST_TRANSACTIONS_WIDGET_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_invest_transactions_widget_header_title, null, null, 14), (Image) null, (Clause) (z3 ? new TextLocalisedClause(R$string.wealth_invest_transactions_widget_button_see_all, null, null, 14) : null), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(z, z, z3, i), false, false, (Object) new h1h.e(investTransactionsFilter, investTransactionsListContract$Disclaimers), (Parcelable) null, 0, 0, 0, 0, 64426), null, 0, 0, 126);
    }
}
