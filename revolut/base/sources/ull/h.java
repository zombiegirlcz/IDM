package ull;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tll.r;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements n {
    public h(r revolutAccountsUiFactory) {
        Intrinsics.checkNotNullParameter(revolutAccountsUiFactory, "revolutAccountsUiFactory");
    }

    @Override // cli.n
    public final o c(j jVar) {
        b bVar;
        Clause textClause;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.revolut_sso_claim_change_multiple_accounts_title, null, null, 14), null, null, null, false, 30);
        List list = domainState.f281050b;
        List list2 = domainState.f281051c;
        List<UserInfoAccount> list3 = list;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        for (UserInfoAccount account : list3) {
            String str = account.f106203a;
            boolean zF = Intrinsics.f(str, domainState.f281049a);
            boolean zContains = list2.contains(account);
            String str2 = "REVOLUT_ACCOUNT_" + str + "_SELECTABLE";
            Intrinsics.checkNotNullParameter(account, "account");
            String strQ = j6.a.q("REVOLUT_ACCOUNT_", str);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(r.b(account), r.e(account), null, false, null, false, 60);
            TextClause textClause2 = new TextClause(account.f106204b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Intrinsics.checkNotNullParameter(account, "account");
            if (zF) {
                bVar = domainState;
                textClause = new CompositeClause(v.k(new TextClause(account.f106205c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause((Integer) null), new TextLocalisedClause(R$string.revolut_sso_revolut_account_this_marker, null, null, 14)), null, null, null, 14);
            } else {
                bVar = domainState;
                textClause = new TextClause(account.f106205c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            arrayList.add(new SelectableDelegate.Model(str2, new RowDelegate.Model(strQ, image40, textClause2, null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, account, null, 0, 0, 0, 0, 532676568), zContains ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.CHECKBOX, false, null, null, null, false, 32744));
            domainState = bVar;
        }
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.revolut_sso_common_actions_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, !list2.isEmpty(), null, null, 988), null, null, 55), arrayList, aVar);
    }
}
