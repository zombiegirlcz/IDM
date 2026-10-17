package ina;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.profile.impl.ui.documents_redesigned.YearlyStatementsRequest;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import uyd.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zxd.c f162741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fna.i f162742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ij0.a f162743n;
    public final vyd.a o;

    public q(zxd.c statementsInteractor, fna.i itemsFactory, ij0.a coreNetworkConfiguration, vyd.a dialogModelConfigurationFactory) {
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        this.f162741l = statementsInteractor;
        this.f162742m = itemsFactory;
        this.f162743n = coreNetworkConfiguration;
        this.o = dialogModelConfigurationFactory;
    }

    @Override // ina.k
    public final void Z2(RowDelegate.Model item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj2 = item.u;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.documents_redesigned.YearlyStatementsRequest");
        int i = ((YearlyStatementsRequest) obj2).f81411b;
        ryd.w wVar = (ryd.w) this.f162741l;
        wVar.getClass();
        yji.n.l2(this, byd.g.a(byd.g.b(rd0.e.b(o70.a.f(wVar.n(2, new abf.n(wVar, i, 25)))), q2(), this.o)), null, new p(this, null), 3);
    }

    @Override // ina.k
    public final Flow c3(DocumentsPage documentsPage) {
        DocumentsPage.IncomeTaxStatement documentsPage2 = (DocumentsPage.IncomeTaxStatement) documentsPage;
        Intrinsics.checkNotNullParameter(documentsPage2, "documentsPage");
        h0 h0Var = (h0) ((ryd.w) this.f162741l).f258357a;
        h0Var.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(rd0.e.b(h0Var.F.e(Unit.f186387a, loadingStrategy)), new ii4.b(this, 17));
    }

    @Override // ina.k
    public final Object h3(DocumentsPage documentsPage, ge7.f fVar) {
        return new TextLocalisedClause(R$string.statements_group_income_tax_statement_title, null, null, 14);
    }
}
