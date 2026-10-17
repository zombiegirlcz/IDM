package bo6;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.model.account_linking.AccountLinkingExpirationOption;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {
    @Override // cli.n
    public final o c(j jVar) {
        Clause textClause;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = domainState.f17290a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            AccountLinkingExpirationOption accountLinkingExpirationOption = (AccountLinkingExpirationOption) obj2;
            if (accountLinkingExpirationOption instanceof AccountLinkingExpirationOption.DateOption) {
                textClause = new TimeClause(((AccountLinkingExpirationOption.DateOption) accountLinkingExpirationOption).f72477b, new TimeClause.Format.DateMedium(0), null, null, 12);
            } else {
                if (!(accountLinkingExpirationOption instanceof AccountLinkingExpirationOption.OneTimeOption)) {
                    throw new NoWhenBranchMatchedException();
                }
                textClause = new TextClause(((AccountLinkingExpirationOption.OneTimeOption) accountLinkingExpirationOption).f72479b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            arrayList2.add(new SelectableDelegate.Model(a0.d.n("expiration_option_", i), new RowDelegate.Model(a0.d.n("expiration_option_", i), null, new TextClause(accountLinkingExpirationOption.getF72478a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874), i == domainState.f17291b ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, Integer.valueOf(i), null, false, 32488));
            i = i2;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList2, new lw0.a(new TextLocalisedClause(R$string.external_institutions_account_linking_review_authorisation_authorisation_ends, null, null, 14), null, null, null, false, 30));
    }
}
