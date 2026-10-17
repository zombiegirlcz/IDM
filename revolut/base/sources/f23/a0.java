package f23;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.cards_core.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List list;
        int i;
        r domainState = (r) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f131406c;
        List list2 = domainState.f131404a;
        if (z) {
            list = zhm.f0.f322471a;
        } else {
            List<SelectedTab> list3 = list2;
            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
            for (SelectedTab selectedTab : list3) {
                String f70838b = selectedTab.getF70838b();
                boolean z3 = domainState.f131407g;
                switch (z.f131425a[selectedTab.ordinal()]) {
                    case 1:
                        i = R$string.card_order_tab_credit_title;
                        break;
                    case 2:
                        i = z3 ? R$string.card_order_tab_prepaid_title : R$string.card_order_tab_personal_title;
                        break;
                    case 3:
                        i = R$string.card_order_tab_pay_later_title;
                        break;
                    case 4:
                        i = R$string.card_order_tab_pro_rebranding_professional_title;
                        break;
                    case 5:
                        i = R$string.card_order_tab_joint_title;
                        break;
                    case 6:
                        i = R$string.card_order_tab_junior_title;
                        break;
                    case 7:
                        i = R$string.card_order_tab_crypto_title;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList.add(new com.revolut.core.ui_kit.views.q(f70838b, new com.revolut.core.ui_kit.views.t(new TextLocalisedClause(i, null, null, 14)), true, 2));
            }
            list = arrayList;
        }
        return new t(domainState.d, domainState.e, domainState.f131405b, domainState.f, list, list2.size() <= 1, domainState.f131406c);
    }
}
