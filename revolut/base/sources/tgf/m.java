package tgf;

import android.os.Parcelable;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import ip0.iq;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        iq iqVar;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        List<TransactionsListFilterType.SelectableFilterSection> list = domainState.f271175a;
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (TransactionsListFilterType.SelectableFilterSection selectableFilterSection : list) {
            List list2 = selectableFilterSection.f92016a;
            Clause clause = selectableFilterSection.f92017b;
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(w.t(list3, i));
            int i2 = 0;
            for (Object obj2 : list3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                TransactionsListFilterType.TransactionFilterItem transactionFilterItem = (TransactionsListFilterType.TransactionFilterItem) obj2;
                String str = clause + "_" + i2;
                Clause clause2 = transactionFilterItem.f92020b;
                boolean z = transactionFilterItem.f92019a;
                int i5 = n.f271180a[selectableFilterSection.f92018c.ordinal()];
                if (i5 == 1) {
                    iqVar = iq.CHECK_BUTTON;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iqVar = iq.RADIO_BUTTON;
                }
                arrayList2.add(new InputChecklistDelegate.Model(str, clause2, z, false, null, iqVar, null, null, new f(transactionFilterItem, selectableFilterSection), null, 0, 0, 0, 523992));
                i2 = i3;
            }
            arrayList.add(Boolean.valueOf(eVarB.addAll(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("KEY_SECTION_" + clause, (Image) null, selectableFilterSection.f92017b, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126))));
            i = 10;
        }
        return new k(u.a(eVarB), u.c(new TextNavBarMenuItem("KEY_RESET", new TextLocalisedClause(R$string.transactionUI_activity_filters_screen_reset_action, null, null, 14), null, null, 12)), new TextLocalisedClause(R$string.transactionUI_activity_filters_screen_apply_button, null, null, 14));
    }
}
