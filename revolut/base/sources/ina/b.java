package ina;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.profile.impl.ui.documents_redesigned.YearlyStatementsRequest;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.StatementsFormat;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import uyd.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zxd.c f162700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fna.i f162701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ij0.a f162702n;
    public final vyd.a o;

    public b(zxd.c statementsInteractor, fna.i itemsFactory, ij0.a coreNetworkConfiguration, vyd.a dialogModelConfigurationFactory) {
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        this.f162700l = statementsInteractor;
        this.f162701m = itemsFactory;
        this.f162702n = coreNetworkConfiguration;
        this.o = dialogModelConfigurationFactory;
    }

    @Override // ina.k
    public final void Z2(RowDelegate.Model item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj2 = item.u;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.documents_redesigned.YearlyStatementsRequest");
        YearlyStatementsRequest yearlyStatementsRequest = (YearlyStatementsRequest) obj2;
        int i = yearlyStatementsRequest.f81411b;
        String str = yearlyStatementsRequest.f81410a;
        ryd.w wVar = (ryd.w) this.f162700l;
        uyd.v vVar = wVar.f258357a;
        StatementsFormat format = StatementsFormat.PDF;
        h0 h0Var = (h0) vVar;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(format, "format");
        w4l.f fVar = h0Var.f284200s;
        if (str == null) {
            str = null;
        }
        yji.n.l2(this, byd.g.a(byd.g.b(rd0.e.b(o70.a.f(wVar.c(wVar.l(fVar.f(new uyd.c(str, i, format), false), 2)))), q2(), this.o)), null, new a(this, null), 3);
    }

    @Override // ina.k
    public final Flow c3(DocumentsPage documentsPage) {
        DocumentsPage.AnnualAverage documentsPage2 = (DocumentsPage.AnnualAverage) documentsPage;
        Intrinsics.checkNotNullParameter(documentsPage2, "documentsPage");
        String str = documentsPage2.f81296a;
        w4l.f fVar = ((h0) ((ryd.w) this.f162700l).f258357a).f284201t;
        if (str == null) {
            str = null;
        }
        return nim.a.v(rd0.e.b(fVar.f(new uyd.d(str), true)), new ijg.c(this, documentsPage2, 15));
    }

    @Override // ina.k
    public final Object h3(DocumentsPage documentsPage, ge7.f fVar) {
        return new TextLocalisedClause(R$string.statement_annual_statement_title, null, null, 14);
    }
}
