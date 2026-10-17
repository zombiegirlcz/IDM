package oe4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.single_selection.SingleSelectionControllerContract$InputData;
import com.revolut.feature.credit.core.R$string;
import dx4.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SingleSelectionControllerContract$InputData f224535a;

    public r(SingleSelectionControllerContract$InputData inputData, q74.b creditNavigationIconMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditNavigationIconMapper, "creditNavigationIconMapper");
        this.f224535a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        qv0.o model;
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SingleSelectionControllerContract$InputData singleSelectionControllerContract$InputData = this.f224535a;
        ResourceImage resourceImageA = q74.b.a(singleSelectionControllerContract$InputData.f68026a);
        int i = R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_single_selection_title;
        xy3.r rVar = singleSelectionControllerContract$InputData.f68027b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(rVar.f309593b), null, 12);
        String str = rVar.f309594c;
        TextLocalisedClause textLocalisedClause2 = str != null ? new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_single_selection_description, u.c(str), null, 12) : null;
        String str2 = rVar.d;
        TextLocalisedClause textLocalisedClause3 = str2 != null ? new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_single_selection_second_description, prk.o.v(0, 30, null, null, str2), null, 12) : null;
        ArrayList<xy3.q> arrayList = rVar.e;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (xy3.q qVar : arrayList) {
            if (qVar instanceof xy3.o) {
                xy3.o oVar = (xy3.o) qVar;
                String str3 = oVar.f309587a;
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_single_selection_items_cell_title, u.c(oVar.f309589c), null, 12);
                String str4 = oVar.d;
                TextLocalisedClause textLocalisedClause5 = str4 != null ? new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_single_selection_items_cell_description, u.c(str4), null, 12) : null;
                a1 a1Var = oVar.f309588b;
                model = new RowDelegate.Model(str3, a1Var != null ? new RowDelegate.Model.MainImage.Image40(a1Var.d(), null, null, false, null, false, 62) : null, textLocalisedClause4, null, 0, textLocalisedClause5, null, null, 0, new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, null, null, null, null, null, null, null, new AnalyticsContext(zw4.a.a(oVar.f309587a)), 0, 0, 0, 0, 528479192);
            } else {
                if (!(qVar instanceof xy3.p)) {
                    throw new NoWhenBranchMatchedException();
                }
                xy3.p pVar = (xy3.p) qVar;
                model = new InputDisclosureDelegate.Model(pVar.f309590a, new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_single_selection_items_disclosure_title, u.c(pVar.f309591b), null, 12), null, null, new AnalyticsContext(zw4.a.a(pVar.f309590a)), 988);
            }
            arrayList2.add(model);
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new p(arrayList2, resourceImageA, textLocalisedClause, textLocalisedClause2, textLocalisedClause3);
    }
}
