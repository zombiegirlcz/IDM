package kb4;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.add.category.EvidenceCategorySelectionScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EvidenceCategorySelectionScreenContract$InputData f182521a;

    public g(EvidenceCategorySelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f182521a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.financial_evidence_evidence_category_selection_title;
        EvidenceCategorySelectionScreenContract$InputData evidenceCategorySelectionScreenContract$InputData = this.f182521a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(evidenceCategorySelectionScreenContract$InputData.f67688a.f308879a), null, 12);
        ArrayList<xu3.a> arrayList = evidenceCategorySelectionScreenContract$InputData.f67688a.f308880b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (xu3.a aVar : arrayList) {
            ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model(aVar.f308873a, new dc(aVar.f308875c.d()), new TextLocalisedClause(R$string.financial_evidence_evidence_category_selection_cell_title, u.c(aVar.f308873a), null, 12), new TextLocalisedClause(R$string.financial_evidence_evidence_category_selection_cell_description, u.c(aVar.f308874b), null, 12), null, aVar, null, false, false, false, 976);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
        }
        return new e(textLocalisedClause, arrayList2);
    }
}
