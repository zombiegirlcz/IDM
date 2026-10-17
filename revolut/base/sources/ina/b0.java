package ina;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.retail.savings.api.documents.navigation.TaxFormsDestination;
import com.revolut.feature.statements.api.navigation.SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fna.i f162703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gnb.b f162704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final elb.b f162705n;

    public b0(fna.i itemsFactory, gnb.b savingsDocumentsInteractor, elb.b savingsFeatureConfigInteractor) {
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        Intrinsics.checkNotNullParameter(savingsDocumentsInteractor, "savingsDocumentsInteractor");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        this.f162703l = itemsFactory;
        this.f162704m = savingsDocumentsInteractor;
        this.f162705n = savingsFeatureConfigInteractor;
    }

    @Override // ina.k
    public final void Z2(RowDelegate.Model item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f53228a;
        int iHashCode = str.hashCode();
        if (iHashCode == -2071459904) {
            if (str.equals("JOINT_SAVINGS_STATEMENTS_ROW_ID")) {
                i3(DocumentsPage.SavingsDocumentsType.Joint);
            }
        } else if (iHashCode == -1640140971) {
            if (str.equals("SAVINGS_STATEMENTS_ROW_ID")) {
                i3(DocumentsPage.SavingsDocumentsType.Personal);
            }
        } else if (iHashCode == 358015867 && str.equals("TAX_DOCUMENTS_ROW_ID")) {
            A2(TaxFormsDestination.f83145a);
        }
    }

    @Override // ina.k
    public final Flow c3(DocumentsPage documentsPage) {
        DocumentsPage.Savings documentsPage2 = (DocumentsPage.Savings) documentsPage;
        Intrinsics.checkNotNullParameter(documentsPage2, "documentsPage");
        gnb.b bVar = this.f162704m;
        bVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        enb.g gVar = bVar.f144952a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(u0.m(nim.a.A(nim.a.v(gVar.f127800g.b(Unit.f186387a, loadingStrategy), z.f), new im3.e(11)), this.f162705n.a(w4l.j.f294644c)), new ijg.c(documentsPage2, this, 19));
    }

    @Override // ina.k
    public final Object h3(DocumentsPage documentsPage, ge7.f fVar) {
        return vkm.q.x(new g48.r(mo3.a.g(this.f162705n.a(w4l.j.f294644c), null, new ijj.r(22), 1), 13), fVar);
    }

    public final void i3(DocumentsPage.SavingsDocumentsType savingsDocumentsType) {
        List listK;
        int i = y.f162768a[savingsDocumentsType.ordinal()];
        if (i == 1) {
            listK = zhm.v.k(pcd.b.PERSONAL, pcd.b.YOUTH);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listK = zhm.u.c(pcd.b.PERSONAL_JOINT);
        }
        A2(new SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination(listK, 1));
    }
}
