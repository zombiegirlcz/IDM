package w85;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.navigation.LoanExternalFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.statements.LoanStatementsListScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import jki.p;
import koi.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import v2e.h0;
import y45.k;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LoanStatementsListScreenContract$InputData f295588p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f295589q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f295590r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LoanStatementsListScreenContract$InputData inputData, k loanStatementDocumentInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loanStatementDocumentInteractor, "loanStatementDocumentInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f295588p = inputData;
        this.f295589q = loanStatementDocumentInteractor;
        this.f295590r = new d(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, new h0(this.f295589q.b(this.f295588p.f70614a, w4l.i.f294643c), 29), null, null, new w50.g(this, (Continuation) null, 7), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f295590r;
    }

    public final void y2(String str) {
        C1(new BridgeDestination(new FeatureCommand(new LoanExternalFeatureConfig.LoanPdfView(new TextLocalisedClause(R$string.loan_management_statement_title, null, null, 14), str, true))));
    }

    public final void z2(j item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Object f = ((qv0.p) item).getF();
        if (f instanceof y85.a) {
            y2(((y85.a) f).f311629a);
        }
        String f53150a = item.getF53150a();
        if (Intrinsics.f(f53150a, "ERROR_STATE_ID")) {
            l2(new w76.a(this, null, 1), new yi5.b(26));
        } else if (Intrinsics.f(f53150a, "GENERATE_DOCUMENT")) {
            y2(this.f295589q.a(this.f295588p.f70614a));
        }
    }
}
