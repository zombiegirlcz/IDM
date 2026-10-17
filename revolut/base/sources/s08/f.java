package s08;

import akl.s;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature.insurance_pet.impl.ui.profile.document.PetPolicyDocumentContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ms0.h4;
import ozc.z;
import rp0.t;
import rp0.y;
import te0.w;
import yhm.r;
import zhm.v;
import zw7.c1;
import zw7.d0;
import zw7.r0;
import zw7.s0;
import zw7.z0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f258882b;

    public /* synthetic */ f(p pVar, int i) {
        this.f258881a = i;
        this.f258882b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        RowDelegate.Model model;
        switch (this.f258881a) {
            case 0:
                SmallActionButtonDelegate.Model button = (SmallActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(button, "button");
                if (!Intrinsics.f(button.f53337a, "SEE_ALL_DOCS_ACTION_BUTTON_ID")) {
                    pfm.m mVar = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return mVar;
                }
                f08.d dVar = this.f258882b.f258894l;
                Object obj3 = button.f53342j;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.Policy.Available");
                r0 policy = (r0) obj3;
                f08.j jVar = (f08.j) dVar;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(policy, "policy");
                ln.a aVar = jVar.f131019b;
                k08.d.Companion.getClass();
                return aVar.a(new ActivityNavigateCommand(k08.a.f179977b, new PetPolicyDocumentContract$Configuration(policy.f325839a), null, null, 0, null, null, null, null, false, 1020));
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((f08.j) this.f258882b.f258894l).a();
            case 2:
                LargeActionButtonDelegate.Model button2 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(button2, "button");
                if (Intrinsics.f(button2.f52613a, "INFO_DIALOG_LARGE_BUTTON_LIST_ID")) {
                    return ((opi.b) this.f258882b.o).O();
                }
                pfm.m mVar2 = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                return mVar2;
            case 3:
                RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                if (!Intrinsics.f(model2.f53228a, "PRODUCT_SUMMARY_ROW_LIST_ID")) {
                    pfm.m mVar3 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                    return mVar3;
                }
                f08.d dVar2 = this.f258882b.f258894l;
                Object obj4 = model2.u;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Pdf");
                PolicyDocument.Pdf document = (PolicyDocument.Pdf) obj4;
                f08.j jVar2 = (f08.j) dVar2;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(document, "document");
                return ey7.d.a(document, jVar2.e, jVar2.f131019b);
            case 4:
                p pVar = this.f258882b;
                g08.k kVar = pVar.f258898q;
                CellDetailsActionDelegate.Model cell = (CellDetailsActionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(cell, "cell");
                String str = cell.f51781a;
                Object obj5 = cell.f51787l;
                if (a0.H(str, "RESTRICTION_ITEM_LIST_ID_PREFIX_", false)) {
                    Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.PolicyRestriction");
                    zw7.k kVar2 = ((c1) obj5).d;
                    if (kVar2 != null) {
                        kVar.getClass();
                        return pVar.Q(new y(g08.k.a(), new t(new TextClause(kVar2.f325805a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(kVar2.f325806b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 28), rp0.l.WINDOW, null, null, null, 1016));
                    }
                } else {
                    if (str.equals("POLICY_PLAN_TYPE_CELL_ID")) {
                        kVar.getClass();
                        return pVar.Q(new y(g08.k.a(), new t(new TextLocalisedClause(R$string.pets_plan_detail_cells_plan_type_details_name, null, null, 14), new TextLocalisedClause(R$string.pets_plan_detail_cells_plan_type_details_value_no_args, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, 1016));
                    }
                    if (str.equals("POLICY_COVERED_UNTIL_CELL_ID")) {
                        kVar.getClass();
                        return pVar.Q(new y(g08.k.a(), new t(new TextLocalisedClause(R$string.pets_policy_detail_cells_covered_until_details_name, null, null, 14), new TextLocalisedClause(R$string.pets_policy_detail_cells_covered_until_details_value_no_args, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, 1016));
                    }
                    if (str.equals("POLICY_NUMBER_CELL_ID")) {
                        u08.a aVar2 = pVar.f258897p;
                        Intrinsics.i(obj5, "null cannot be cast to non-null type kotlin.String");
                        return aVar2.a((String) obj5);
                    }
                }
                return pfm.m.f235744a;
            case 5:
                RowDelegate.Model model3 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model3, "model");
                boolean zH = a0.H(model3.f53228a, "COVERAGE_ITEM_LIST_ID_PREFIX_", false);
                pfm.m mVar4 = pfm.m.f235744a;
                if (!zH) {
                    Intrinsics.checkNotNullExpressionValue(mVar4, "complete(...)");
                    return mVar4;
                }
                Object obj6 = model3.u;
                Intrinsics.i(obj6, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.api.model.PolicyCoverage");
                zw7.k kVar3 = ((z0) obj6).f325866c;
                if (kVar3 == null) {
                    return mVar4;
                }
                p pVar2 = this.f258882b;
                pVar2.f258898q.getClass();
                return pVar2.Q(new y(g08.k.a(), new t(new TextClause(kVar3.f325805a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(kVar3.f325806b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 28), rp0.l.WINDOW, null, null, null, 1016));
            case 6:
                String menu = (String) obj2;
                Intrinsics.checkNotNullParameter(menu, "menu");
                if (Intrinsics.f(menu, "NAV_MENU_ITEM_FAQ_ID")) {
                    return ((f08.j) this.f258882b.f258894l).b();
                }
                pfm.m mVar5 = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar5, "complete(...)");
                return mVar5;
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                d0 d0Var = (d0) pair.f186385a;
                od0.i iVar = (od0.i) pair.f186386b;
                f08.a aVar3 = this.f258882b.f258895m;
                s0 s0Var = d0Var.o;
                Intrinsics.checkNotNullParameter(s0Var, "<this>");
                r0 policy2 = (r0) s0Var;
                f08.h hVar = (f08.h) aVar3;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(policy2, "policy");
                od0.h hVar2 = od0.i.Companion;
                Iterator it9 = policy2.k.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (((zw7.m) next).f325814a == zw7.n.IPID) {
                        }
                    } else {
                        next = null;
                    }
                }
                zw7.m mVar6 = (zw7.m) next;
                PolicyDocument.Pdf pdf2 = mVar6 != null ? new PolicyDocument.Pdf(new TextLocalisedClause(R$string.pets_plan_detail_cells_product_summary_title, null, null, 14), hVar.k3(mVar6), mVar6.f325815b == zw7.o.RELATIVE, zw7.n.IPID) : null;
                hVar2.getClass();
                return new r(d0Var, iVar, od0.h.a(pdf2));
            case 8:
                s0 s0Var2 = ((d0) ((r) obj2).f314201a).o;
                Intrinsics.checkNotNullParameter(s0Var2, "<this>");
                p pVar3 = this.f258882b;
                ypi.i iVar2 = pVar3.k;
                iVar2.setVisible(true);
                iVar2.setEnabled(true);
                iVar2.v(LargeActionButton.ButtonStyle.f58725a);
                iVar2.f(new TextLocalisedClause(R$string.pets_plan_detail_actions_get_help_title, null, null, 14));
                qfm.r0 r0VarD = w.D(iVar2.s(), new rsl.p(pVar3, (r0) s0Var2, 23));
                s sVar = pVar3.i;
                pfm.a aVar4 = new pfm.a(r0VarD, new ly7.g(15, new ry7.j(new BreadcrumbException(), 13)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
                ofm.h hVarW = aVar4.w(new n1i.b(15, sVar), new z(28, o.f258892a));
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                w.j0(pVar3.f239031a, hVarW);
                return Unit.f186387a;
            default:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                d0 d0Var2 = (d0) rVar.f314201a;
                od0.i userCountry = (od0.i) rVar.f314202b;
                od0.i document2 = (od0.i) rVar.f314203c;
                g08.k kVar4 = this.f258882b.f258898q;
                s0 s0Var3 = d0Var2.o;
                Intrinsics.checkNotNullParameter(s0Var3, "<this>");
                r0 policy3 = (r0) s0Var3;
                kVar4.getClass();
                Intrinsics.checkNotNullParameter(policy3, "policy");
                Intrinsics.checkNotNullParameter(userCountry, "userCountry");
                Intrinsics.checkNotNullParameter(document2, "document");
                kotlin.jvm.internal.s0 s0Var4 = new kotlin.jvm.internal.s0(8);
                SmallActionButtonDelegate.Model model4 = new SmallActionButtonDelegate.Model("SEE_ALL_DOCS_ACTION_BUTTON_ID", h4.SEMIACCENT, new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, new TextLocalisedClause(R$string.pets_plan_detail_actions_documents_title, null, null, 14), null, null, policy3, null, 0, 0, 0, 0, 32216);
                yp0.b.r(model4, 0, R$attr.uikit_dp16, 0, 0, 13);
                s0Var4.a(model4);
                s0Var4.a(new ListSubheaderDelegate.Model("POLICY_SUMMARY_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.pets_plan_detail_sections_summary_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                CellDetailsActionDelegate.Model model5 = new CellDetailsActionDelegate.Model("POLICY_NUMBER_CELL_ID", new TextLocalisedClause(R$string.pets_policy_detail_cells_policy_number_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(policy3.f325840b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, false, null, null, policy3.f325840b, 0, 0, 0, 0, 4192228);
                CellDetailsDelegate.Model model6 = userCountry.d() ? new CellDetailsDelegate.Model("POLICY_REGION_CELL_ID", new TextLocalisedClause(R$string.pets_plan_detail_cells_region_title, null, null, 14), new TextClause((String) userCountry.c(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760) : null;
                CellDetailsActionDelegate.Model model7 = new CellDetailsActionDelegate.Model("POLICY_PLAN_TYPE_CELL_ID", new TextLocalisedClause(R$string.pets_plan_detail_cells_plan_type_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(policy3.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_policy_detail_cells_start_date_title, null, null, 14);
                long jB = jli.b.b(policy3.e);
                TimeClause.Format.INSTANCE.getClass();
                TimeClause.Format.DateMedium dateMedium = TimeClause.Format.f57959a;
                Object[] elements = {model5, model6, model7, new CellDetailsDelegate.Model("POLICY_START_DATE_CELL_ID", textLocalisedClause, new TimeClause(jB, dateMedium, null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsActionDelegate.Model("POLICY_COVERED_UNTIL_CELL_ID", new TextLocalisedClause(R$string.pets_policy_detail_cells_covered_until_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TimeClause(jli.b.b(policy3.f), dateMedium, null, null, 12), null, false, false, null, null, null, 0, 0, 0, 0, 4194276)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                s0Var4.b((koi.j[]) listL.toArray(new koi.j[0]));
                if (document2.d()) {
                    RowDelegate.Model model8 = new RowDelegate.Model("PRODUCT_SUMMARY_ROW_LIST_ID", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, Float.valueOf(40.0f), null, 32), null, null, new TextLocalisedClause(R$string.pets_plan_detail_cells_product_summary_title, null, null, 14), new TextLocalisedClause(R$string.pets_plan_detail_cells_product_summary_subtitle, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, false, null, RowDelegate.Model.b.c.f53268a, null, null, null, document2.c(), null, 0, 0, 0, 0, 1056925548);
                    yp0.b.l(model8, 0, 0, 0, 0, null, false, 63);
                    model = model8;
                } else {
                    model = null;
                }
                s0Var4.a(model);
                s0Var4.a(new ListSubheaderDelegate.Model("COVERAGE_LIMITS_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.pets_plan_detail_sections_coverage_and_limits_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                ArrayList arrayList = policy3.f325847n;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                int i = 0;
                for (Object obj7 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    z0 z0Var = (z0) obj7;
                    arrayList2.add(new RowDelegate.Model(a0.d.n("COVERAGE_ITEM_LIST_ID_PREFIX_", i), yx7.m.a(z0Var.f325864a), null, null, new TextClause(z0Var.f325865b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, 0, z0Var.f325866c != null ? new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true) : null, false, false, null, null, null, null, null, z0Var, null, 0, 0, 0, 0, 1056958444));
                    i = i2;
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                s0Var4.b((koi.j[]) arrayList2.toArray(new koi.j[0]));
                ArrayList arrayList3 = policy3.o;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                int i3 = 0;
                for (Object obj8 : arrayList3) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        v.s();
                        throw null;
                    }
                    c1 c1Var = (c1) obj8;
                    arrayList4.add(c1Var.d != null ? new CellDetailsActionDelegate.Model(a0.d.n("RESTRICTION_ITEM_LIST_ID_PREFIX_", i3), new TextClause(c1Var.f325761a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), g08.k.b(c1Var), null, false, false, null, null, c1Var, 0, 0, 0, 0, 4192228) : new CellDetailsDelegate.Model(a0.d.n("RESTRICTION_ITEM_LIST_ID_PREFIX_", i3), new TextClause(c1Var.f325761a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), g08.k.b(c1Var), 0, c1Var, null, null, null, null, false, 0, 0, 32744));
                    i3 = i5;
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                s0Var4.b((koi.j[]) arrayList4.toArray(new koi.j[0]));
                TextDelegate.Model modelA = yx7.t.a();
                int i6 = R$attr.uikit_dp0;
                yp0.b.p(modelA, i6, R$attr.uikit_dp72, i6, i6);
                s0Var4.a(modelA);
                ArrayList arrayList5 = s0Var4.f186433a;
                return v.m(arrayList5.toArray(new koi.j[arrayList5.size()]));
        }
    }
}
