package pt4;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f239601c;
        xp3.d dVar = domainState.f239600b;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new b(arrayList, (dVar == null || dVar == domainState.f239599a) ? false : true);
            }
            xp3.d dVar2 = (xp3.d) it8.next();
            String str = "credit-limit-increase-preference-" + dVar2;
            qd0 qd0Var = dVar2 == dVar ? qd0.SELECTED : qd0.UNSELECTED;
            vd0 vd0Var = vd0.RADIO;
            String str2 = "credit-limit-increase-preference-" + dVar2 + "-row";
            int i2 = i.f239612a[dVar2.ordinal()];
            if (i2 == 1) {
                i = R$string.credit_card_limit_increase_preferences_option_automatic;
            } else if (i2 == 2) {
                i = R$string.credit_card_limit_increase_preferences_option_send_offers;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.credit_card_limit_increase_preferences_option_not_offer;
            }
            arrayList.add(new SelectableDelegate.Model(str, new RowDelegate.Model(str2, null, new TextLocalisedClause(i, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, dVar2, null, 0, 0, 0, 0, 532674554), qd0Var, SelectableDelegate.b.C0424b.f53319a, vd0Var, true, null, null, null, false, 32704));
        }
    }
}
