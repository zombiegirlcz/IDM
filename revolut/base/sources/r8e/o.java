package r8e;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.a0;
import pcd.s;
import pcd.x;
import pcd.y;
import pcd.z;
import r7i.r;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model b(do3.n nVar, s sVar, x xVar) {
        Clause moneyClause;
        TextLocalisedClause textLocalisedClause;
        RowDelegate.Model.c bVar;
        String strB = q8e.b.b(xVar);
        a0 a0Var = xVar.f234904b;
        String strQ = j6.a.q("MEMBER_ID", strB);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(q8e.b.a(xVar), null, null, false, null, false, 62);
        Clause clauseD = q8e.b.d(xVar, nVar);
        TextLocalisedClause textLocalisedClauseC = q8e.b.c(xVar, xVar.f234906g.contains(y.WITHDRAW));
        String str = nVar.f116408a;
        boolean z = opg.c.h(str, sVar) && xVar.f234905c != z.ADMIN;
        GroupMemberClickData groupMemberClickData = new GroupMemberClickData(nVar, sVar, xVar);
        String currency = sVar.getCurrency();
        boolean zH = opg.c.h(str, sVar);
        if (a0Var == a0.INVITED && zH) {
            bVar = new pf(new TextLocalisedClause(R$string.subaccount_members_widget_actions_dialog_remind, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, null, false, null, null, 510);
        } else {
            Intrinsics.checkNotNullParameter(xVar, "<this>");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
            switch (q8e.a.f243071a[a0Var.ordinal()]) {
                case 1:
                case 2:
                    long j2 = xVar.f;
                    xi0.b.Companion.getClass();
                    moneyClause = new MoneyClause(new dj0.d(j2, xi0.a.a(currency)), new MoneyClause.Format.Defaults(null, null, false, false, 15), custom, null, 8);
                    bVar = new RowDelegate.Model.c.b(moneyClause, null, null, false, 126);
                    break;
                case 3:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.moneyboxes_details_shared_inactive, null, custom, 10);
                    moneyClause = textLocalisedClause;
                    bVar = new RowDelegate.Model.c.b(moneyClause, null, null, false, 126);
                    break;
                case 4:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.moneyboxes_details_shared_refused, null, custom, 10);
                    moneyClause = textLocalisedClause;
                    bVar = new RowDelegate.Model.c.b(moneyClause, null, null, false, 126);
                    break;
                case 5:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.moneyboxes_details_shared_left, null, custom, 10);
                    moneyClause = textLocalisedClause;
                    bVar = new RowDelegate.Model.c.b(moneyClause, null, null, false, 126);
                    break;
                case 6:
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.moneyboxes_details_shared_removed, null, custom, 10);
                    moneyClause = textLocalisedClause;
                    bVar = new RowDelegate.Model.c.b(moneyClause, null, null, false, 126);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return new RowDelegate.Model(strQ, image40, clauseD, null, 0, textLocalisedClauseC, null, null, 0, bVar, z, null, false, null, null, null, null, null, null, groupMemberClickData, null, 0, 0, 0, 0, 532673496);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new j((List) iii.c.f(t1.t(domainState.f252408a, domainState.f252409b), new r(5), new r6d.h(15), new qk2.h(this, 14)));
    }
}
