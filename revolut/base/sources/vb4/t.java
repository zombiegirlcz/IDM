package vb4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.transactions.RevolutTransactionsSelectionScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import uk2.w;
import xu3.y;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutTransactionsSelectionScreenContract$InputData f287421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.n f287422b;

    public t(RevolutTransactionsSelectionScreenContract$InputData inputData, whf.n transactionsListMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        this.f287421a = inputData;
        this.f287422b = transactionsListMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Set set;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.financial_evidence_revolut_transaction_selection_title;
        RevolutTransactionsSelectionScreenContract$InputData revolutTransactionsSelectionScreenContract$InputData = this.f287421a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, zhm.u.c(revolutTransactionsSelectionScreenContract$InputData.f67752a.f308951a), null, 12);
        y yVar = revolutTransactionsSelectionScreenContract$InputData.f67752a;
        String str = yVar.f308952b;
        TextLocalisedClause textLocalisedClause2 = str != null ? new TextLocalisedClause(R$string.financial_evidence_revolut_transaction_selection_description, zhm.u.c(str), null, 12) : null;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.financial_evidence_revolut_transaction_selection_search, zhm.u.c(yVar.f308953c), null, 12);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.financial_evidence_revolut_transaction_selection_action, zhm.u.c(yVar.d), null, 12);
        f fVar = (f) domainState.f287405a.getContent();
        return new n((List) iii.c.f(domainState.f287405a, new v80.a(17), new v78.d(9), new w(this, 22)), textLocalisedClause, textLocalisedClause2, textLocalisedClause3, textLocalisedClause4, (fVar == null || (set = fVar.f287403b) == null) ? false : !set.isEmpty());
    }
}
