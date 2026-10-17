package p94;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.type_selector.DebtTypeSelectorControllerContract$InputData;
import com.revolut.feature.credit.core.R$string;
import dx4.a1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DebtTypeSelectorControllerContract$InputData f234275a;

    public h(DebtTypeSelectorControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f234275a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.credit_application_outstanding_debts_v3_debt_types_screen_title;
        DebtTypeSelectorControllerContract$InputData debtTypeSelectorControllerContract$InputData = this.f234275a;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(i, u.c(debtTypeSelectorControllerContract$InputData.f67524a.f210303a), null, 12), null, null, null, false, 30);
        ArrayList<my3.b> arrayList = debtTypeSelectorControllerContract$InputData.f67524a.f210304b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (my3.b bVar : arrayList) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_outstanding_debts_v3_debt_types_item_title, u.c(bVar.f210302c), null, 12);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_outstanding_debts_v3_debt_types_item_subtitle, u.c(bVar.d), null, 12);
            a1 a1Var = bVar.f210301b;
            arrayList2.add(new RowDelegate.Model("debt_type_item", a1Var != null ? new RowDelegate.Model.MainImage.Image40(a1Var.d(), null, null, false, null, false, 60) : null, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, bVar.e, null, 0, 0, 0, 0, 532676568));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new f(arrayList2, aVar);
    }
}
