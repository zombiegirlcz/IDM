package qb4;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.evidence_holder_selection.EvidenceHolderSelectionScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xu3.l;
import xu3.m;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EvidenceHolderSelectionScreenContract$InputData f244116a;

    public i(EvidenceHolderSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f244116a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        Image imageD;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.financial_evidence_evidence_holder_selection_title;
        EvidenceHolderSelectionScreenContract$InputData evidenceHolderSelectionScreenContract$InputData = this.f244116a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(evidenceHolderSelectionScreenContract$InputData.f67711a.f308927a), null, 12);
        m mVar = evidenceHolderSelectionScreenContract$InputData.f67711a;
        String str = mVar.f308928b;
        TextLocalisedClause textLocalisedClause2 = str != null ? new TextLocalisedClause(R$string.financial_evidence_evidence_holder_selection_description, u.c(str), null, 12) : null;
        ArrayList<l> arrayList = mVar.f308929c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (l lVar : arrayList) {
            String strName = lVar.f308921c.name();
            xu3.k kVar = lVar.d;
            if (kVar instanceof xu3.i) {
                imageD = com.revolut.core.ui_kit_core.displayers.image.models.b.c(((xu3.i) kVar).f308907a, null, null, null, 30);
            } else {
                if (!(kVar instanceof xu3.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                imageD = ((xu3.j) kVar).f308911a.d();
            }
            ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model(strName, new dc(imageD), new TextLocalisedClause(R$string.financial_evidence_evidence_holder_selection_cell_title, u.c(lVar.f308919a), null, 12), new TextLocalisedClause(R$string.financial_evidence_evidence_holder_selection_cell_description, u.c(lVar.f308920b), null, 12), null, lVar.f308921c, null, false, false, false, 976);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
        }
        return new g(textLocalisedClause, textLocalisedClause2, arrayList2);
    }
}
