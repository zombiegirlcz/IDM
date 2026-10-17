package qk4;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.credit.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import ip0.c20;
import ip0.y10;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        sa saVar;
        qk4.a domainState = (qk4.a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        sa saVar2 = new sa("id_revolut_account", (Clause) new TextLocalisedClause(R$string.autopay_select_repayment_revolut_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.autopay_select_repayment_revolut_description, null, null, 14), u.c(new ActionsView.Item("id_revolut_account_select", null, false, null, null, new TextLocalisedClause(R.string.common_action_select, null, null, 14), null, null, null, null, false, null, null, null, null, 32670)), false, (c20) null, (y10) null, (Object) null, 240);
        yp0.b.l(saVar2, 0, 0, 0, 0, null, false, 63);
        if (domainState.f246961a) {
            saVar = new sa("id_external_account", (Clause) new TextLocalisedClause(R$string.autopay_select_repayment_another_account_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.credit_loan_autopay_type_selection_external_wallet_subtitle, null, null, 14), u.c(new ActionsView.Item("id_external_account", null, false, null, null, new TextLocalisedClause(R.string.common_action_select, null, null, 14), null, null, null, null, false, null, null, null, null, 32670)), false, (c20) null, (y10) null, (Object) null, 240);
            yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        } else {
            sa saVar3 = new sa("id_dummy_index", (Clause) new TextLocalisedClause(R$string.autopay_select_repayment_another_account_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.autopay_select_repayment_another_account_description, null, null, 14), (List) null, false, (c20) null, (y10) null, (Object) null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
            yp0.b.l(saVar3, 0, 0, 0, 0, null, false, 63);
            saVar = saVar3;
        }
        return new d(v.k(saVar2, saVar));
    }
}
