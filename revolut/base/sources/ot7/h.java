package ot7;

import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.insurance_credit.impl.data.model.ContentItem;
import com.revolut.feature.insurance_credit.impl.data.model.PlanHeaderItem;
import com.revolut.feature.insurance_credit.impl.data.model.RowItem;
import com.revolut.feature.insurance_credit.impl.data.model.RowNoteItem;
import com.revolut.feature.insurance_credit.impl.data.model.action.ShowCoverageDetailsAction;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_bottom_sheet.CoverageBottomSheetControllerContract$InputData;
import com.youTransactor.uCube.rpc.Constants;
import dx4.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l9.l;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoverageBottomSheetControllerContract$InputData f229569a;

    public h(CoverageBottomSheetControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f229569a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        qv0.o model;
        Custom.Color.Solid solid;
        Custom custom;
        int i;
        ResourceImage resourceImage;
        Integer numValueOf;
        int i2;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i3 = R$string.credit_loan_insurance_downgrade_options_title;
        CoverageBottomSheetControllerContract$InputData coverageBottomSheetControllerContract$InputData = this.f229569a;
        lw0.a aVar = new lw0.a(l.s(i3, coverageBottomSheetControllerContract$InputData.f75824b.f75785a), null, null, null, false, 30);
        ShowCoverageDetailsAction.BottomSheetContent bottomSheetContent = coverageBottomSheetControllerContract$InputData.f75824b;
        Iterable iterable = bottomSheetContent.f75786b;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Iterable<ContentItem> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(w.t(iterable2, 10));
        for (ContentItem contentItem : iterable2) {
            if (contentItem instanceof PlanHeaderItem) {
                PlanHeaderItem planHeaderItem = (PlanHeaderItem) contentItem;
                model = new RowDelegate.Model(planHeaderItem.f75744a, null, l.s(R$string.credit_loan_insurance_downgrade_options_item_plan_header_title, planHeaderItem.f75745b), null, 0, l.s(R$string.credit_loan_insurance_downgrade_options_item_plan_header_description, planHeaderItem.f75746c), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, new AnalyticsContext(zw4.a.a(planHeaderItem.f75744a)), 0, 0, 0, 0, 528480218);
            } else if (contentItem instanceof RowNoteItem) {
                RowNoteItem rowNoteItem = (RowNoteItem) contentItem;
                String str = rowNoteItem.f75749a;
                int i5 = R$string.credit_loan_insurance_downgrade_options_item_row_note_title;
                List listC = u.c(rowNoteItem.f75750b);
                os7.c cVar = rowNoteItem.d;
                os7.b bVar = rowNoteItem.e;
                if (cVar == null && bVar == null) {
                    custom = null;
                } else {
                    boolean z = cVar == os7.c.CROSSED;
                    if (bVar != null) {
                        int i6 = g.f229568a[bVar.ordinal()];
                        if (i6 == 1) {
                            i = R$attr.uikit_colorGreyTone20;
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = R$attr.uikit_colorGreyTone50;
                        }
                        solid = new Custom.Color.Solid(i);
                    } else {
                        solid = null;
                    }
                    custom = new Custom(solid, z, false, Constants.TAG_FC_SPEED_MODE);
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i5, listC, custom, 8);
                a1 a1Var = rowNoteItem.f75751c;
                if (a1Var != null) {
                    int iC = a1Var.c();
                    os7.b bVar2 = rowNoteItem.f;
                    if (bVar2 != null) {
                        int i21 = g.f229568a[bVar2.ordinal()];
                        if (i21 == 1) {
                            i2 = R$attr.uikit_colorGreyTone20;
                        } else {
                            if (i21 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i2 = R$attr.uikit_colorGreyTone50;
                        }
                        numValueOf = Integer.valueOf(i2);
                    } else {
                        numValueOf = null;
                    }
                    resourceImage = new ResourceImage(iC, (Integer) null, (Integer) null, numValueOf, (List) null, (ImageTransformations) null, (Clause) null, 246);
                } else {
                    resourceImage = null;
                }
                model = new CellDetailsStandaloneNoteDelegate.Model(str, null, textLocalisedClause, null, resourceImage, false, new AnalyticsContext(zw4.a.a(rowNoteItem.f75749a)), 0, 0, 1962);
            } else {
                if (!(contentItem instanceof RowItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                RowItem rowItem = (RowItem) contentItem;
                model = new CellDetailsNoteDelegate.Model(rowItem.f75747a, l.s(R$string.credit_loan_insurance_downgrade_options_item_row_title, rowItem.f75748b), null, null, null, false, null, null, null, null, new AnalyticsContext(zw4.a.a(rowItem.f75747a)), 0, 126964);
            }
            arrayList.add(model);
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        String str2 = bottomSheetContent.f75787c;
        return new e(arrayList, aVar, str2 != null ? new aw0.e(false, null, null, new n6(l.s(R$string.credit_loan_insurance_downgrade_options_button_title, str2), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55) : null);
    }
}
