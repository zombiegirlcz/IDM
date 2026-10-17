package c2j;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.retail.feature.balance.picker.api.R$string;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingWithDisclaimer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pcd.g0;
import pcd.s;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements n {
    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList<SavingWithDisclaimer> arrayList = domainState.f20818a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (SavingWithDisclaimer savingWithDisclaimer : arrayList) {
            SavingsAccountDetails savingsAccountDetails = savingWithDisclaimer.f99517a;
            s sVar = savingsAccountDetails.f86460a;
            String str = sVar.f234881a;
            g0 g0Var = sVar.f234885h;
            arrayList2.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(savingsAccountDetails.f86461b, null, null, false, null, false, 60), new TextClause(g0Var.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(g0Var.f234861c, kii.e.u(sVar, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, savingWithDisclaimer, null, 0, 0, 0, 0, 532675576));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList2, new lw0.a(new TextLocalisedClause(R$string.picker_investment_select_account_sheet_title, null, null, 14), null, null, null, false, 30));
    }
}
