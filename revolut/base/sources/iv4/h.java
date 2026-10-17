package iv4;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.card.impl.ui.statement.details.accrued_interest.dialog.CreditCardAccruedInterestsBottomSheetControllerContract$InputData;
import com.revolut.feature.credit.core.R$string;
import is2.t;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sv4.k;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardAccruedInterestsBottomSheetControllerContract$InputData f168719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f168720b;

    public h(CreditCardAccruedInterestsBottomSheetControllerContract$InputData inputData, k statementTransactionsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(statementTransactionsMapper, "statementTransactionsMapper");
        this.f168719a = inputData;
        this.f168720b = statementTransactionsMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        eVarB.addAll((List) iii.c.f(domainState.f168714a, new t(this, 18), new iui.b(6), new igh.o(this, 16)));
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("id_credit_card_accrued_interest_dialog_action", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.l(model, R$attr.uikit_dp16, 0, 0, 0, null, false, 62);
        eVarB.add(model);
        return new f(u.a(eVarB));
    }
}
