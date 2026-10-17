package ke4;

import aw0.t0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.loan_selector.LoanSelectorControllerContract$InputData;
import com.revolut.feature.credit.core.R$string;
import dx4.a1;
import ip0.qd0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanSelectorControllerContract$InputData f182998a;

    public r(LoanSelectorControllerContract$InputData inputData, q74.b creditNavigationIconMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditNavigationIconMapper, "creditNavigationIconMapper");
        this.f182998a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        CellDetailsDelegate.Model model;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LoanSelectorControllerContract$InputData loanSelectorControllerContract$InputData = this.f182998a;
        ResourceImage resourceImageA = q74.b.a(loanSelectorControllerContract$InputData.f68022a);
        int i = R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_loan_selector_title;
        xy3.g gVar = loanSelectorControllerContract$InputData.f68023b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(gVar.f309572b), null, 12);
        String str = gVar.f309573c;
        TextLocalisedClause textLocalisedClause2 = str != null ? new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_loan_selector_second_description, u.c(str), null, 12) : null;
        aim.e eVarB = u.b();
        ArrayList<xy3.f> arrayList = gVar.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (xy3.f fVar : arrayList) {
            boolean zContains = domainState.f182988a.contains(fVar);
            String strQ = j6.a.q("selectable-item-", fVar.f309568a);
            String str2 = fVar.f309568a;
            String strQ2 = j6.a.q("selectable-inner-item-", str2);
            TextLocalisedClause textLocalisedClause3 = textLocalisedClause2;
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_loan_selector_loan_title, u.c(fVar.f309570c), null, 12);
            ResourceImage resourceImage = resourceImageA;
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_loan_selector_loan_description, u.c(fVar.d), null, 12);
            a1 a1Var = fVar.f309569b;
            arrayList2.add(new SelectableDelegate.Model(strQ, new RowDelegate.Model(strQ2, a1Var != null ? new RowDelegate.Model.MainImage.Image40(a1Var.d(), null, null, false, null, false, 62) : null, textLocalisedClause4, null, 0, textLocalisedClause5, null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), zContains ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, new AnalyticsContext(zw4.a.a(str2)), fVar, null, false, 32376));
            textLocalisedClause2 = textLocalisedClause3;
            resourceImageA = resourceImage;
        }
        TextLocalisedClause textLocalisedClause6 = textLocalisedClause2;
        ResourceImage resourceImage2 = resourceImageA;
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList2);
        String str3 = gVar.e;
        if (str3 != null) {
            List list = domainState.f182988a;
            t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_loan_selector_total_to_refinance_label, u.c(str3), null, 12), (Image) null, 0, false, 30);
            int i2 = R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_loan_selector_total_to_refinance_value;
            dj0.d.Companion.getClass();
            dj0.d dVar = dj0.d.e;
            dj0.d dVarO = dVar;
            int i3 = 0;
            for (Object obj2 : list) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    v.s();
                    throw null;
                }
                dVarO = i3 == 0 ? ((xy3.f) obj2).e : pyd.c.O(dVarO, ((xy3.f) obj2).e);
                i3 = i5;
            }
            model = new CellDetailsDelegate.Model("total-to-refinance-cell", t0Var, new TextLocalisedClause(i2, u.c(new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            model = null;
        }
        n14.e.b(eVarB, model);
        return new o(u.a(eVarB), resourceImage2, textLocalisedClause, textLocalisedClause6, (gVar.f && domainState.f182988a.isEmpty()) ? false : true, new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_loan_selector_button, u.c(gVar.f309574g), null, 12));
    }
}
