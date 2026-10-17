package xz7;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_pet.impl.R$plurals;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import ip0.ak0;
import ip0.iq;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.text.a0;
import tsk.t;
import uz7.p;
import uz7.q;
import uz7.r;
import zh9.u0;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;
import zw7.h0;
import zw7.h1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f309870b;

    public /* synthetic */ e(m mVar, int i) {
        this.f309869a = i;
        this.f309870b = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        Object next;
        Clause textLocalisedClause;
        switch (this.f309869a) {
            case 0:
                uz7.b bVar = this.f309870b.f309880l;
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                String str = model.f53228a;
                Object obj4 = model.u;
                if (!a0.H(str, "PLAN_REMOTE_DOCUMENT_ROW_ID_PREFIX_", false)) {
                    if (!a0.H(model.f53228a, "PLAN_LOCAL_DOCUMENT_ROW_ID_PREFIX", false)) {
                        return pfm.m.f235744a;
                    }
                    Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument");
                    return ((q) bVar).b((PolicyDocument) obj4);
                }
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Pdf");
                PolicyDocument.Pdf document = (PolicyDocument.Pdf) obj4;
                q qVar = (q) bVar;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(document, "document");
                return ey7.d.a(document, qVar.f284616b, qVar.f284615a);
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((q) this.f309870b.f309880l).a();
            case 2:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                m mVar = this.f309870b;
                uz7.a aVar = mVar.f309881m;
                String quoteId = ((p) aVar).n3();
                if (quoteId == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ((p) aVar).d.getClass();
                pfm.m mVar2 = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                pfm.a aVarV = ue0.e.v(mVar2);
                t tVar = mVar.f309884q;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(quoteId, "quoteId");
                pfm.a aVarE = aVarV.e(((mm.d) tVar.f274170b).c0(new e08.d(quoteId)));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 3:
                ty0.a clickData = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (!Intrinsics.f(clickData.f275445a, "FOOTER_ITEM_GENERAL_INFO_LIST_ID")) {
                    pfm.m mVar3 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                    return mVar3;
                }
                uz7.b bVar2 = this.f309870b.f309880l;
                Object obj5 = clickData.d;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.ExternalLink");
                PolicyDocument.ExternalLink document2 = (PolicyDocument.ExternalLink) obj5;
                q qVar2 = (q) bVar2;
                qVar2.getClass();
                Intrinsics.checkNotNullParameter(document2, "document");
                return qVar2.f284615a.a(u0.f(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(document2.f76268b, WebViewScreenTitleSource.Html.f98166a, document2.f76269c)), null, true)));
            case 4:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                Iterator it10 = items.iterator();
                while (true) {
                    obj3 = null;
                    if (it10.hasNext()) {
                        Object next2 = it10.next();
                        String f52222a = ((koi.j) next2).getF52222a();
                        koi.j jVar = this.f309870b.f309883p.f318042a;
                        if (jVar == null) {
                            Intrinsics.r("lastItem");
                            throw null;
                        }
                        if (Intrinsics.f(f52222a, jVar.getF52222a())) {
                            obj3 = next2;
                        }
                    }
                }
                return Boolean.valueOf(obj3 != null);
            case 5:
                ((iqi.b) this.f309870b.k).R(!((Boolean) obj2).booleanValue(), true);
                return Unit.f186387a;
            case 6:
                Intrinsics.checkNotNullParameter((InputChecklistDelegate.Model) obj2, "model");
                this.f309870b.f309885r.onNext(new Data(Boolean.valueOf(!r1.f52521c), null, false, 6, null));
                return Unit.f186387a;
            default:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                List list = (List) hVar.f288433a;
                h0 h0Var = (h0) hVar.f288434b;
                PolicyDocument policyDocument = (PolicyDocument) hVar.f288435c;
                boolean zBooleanValue = ((Boolean) hVar.d).booleanValue();
                m mVar4 = this.f309870b;
                iqi.h hVar2 = mVar4.k;
                uz7.a aVar2 = mVar4.f309881m;
                ((iqi.b) hVar2).Z(zBooleanValue);
                Iterator it11 = h0Var.e.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        next = it11.next();
                        if (Intrinsics.f(((h1) next).f325791a, ((p) aVar2).n3())) {
                        }
                    } else {
                        next = null;
                    }
                }
                if (next == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                h1 h1Var = (h1) next;
                Date date = (Date) ((r) ((p) aVar2).e).f284618b.i0().get();
                yz7.a aVar3 = mVar4.f309883p;
                yz7.b model2 = new yz7.b(date, h1Var, list, policyDocument, zBooleanValue);
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                s0 s0Var = new s0(5);
                int i = R$string.pets_confirm_purchase_sections_review_start_date;
                long time = date.getTime();
                TimeClause.Format.INSTANCE.getClass();
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, u.c(new TimeClause(time, TimeClause.Format.f57959a, null, null, 12)), null, 12);
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                RowDelegate.Model.b.c cVar = RowDelegate.Model.b.c.f53268a;
                RowDelegate.Model model3 = new RowDelegate.Model("PLAN_SUMMARY_START_DATE", resourceImage, null, null, textLocalisedClause2, null, null, null, 0, null, false, false, null, cVar, null, null, null, null, null, 0, 0, 0, 0, 1073704940);
                zw7.l lVar = h1Var.e;
                String str2 = h1Var.f325792b;
                if (lVar != null) {
                    int i2 = lVar.f325812b;
                    textLocalisedClause = new TextLocalisedQuantityClause(new ResourceId.IntResourceId(R$plurals.pets_confirm_purchase_sections_review_coverage_promotion_price_plural), Integer.valueOf(i2), v.k(Integer.valueOf(i2), lVar.f325811a, str2), (Custom) null, 24);
                } else {
                    textLocalisedClause = new TextLocalisedClause(R$string.pets_confirm_purchase_sections_review_coverage_price, u.c(str2), null, 12);
                }
                List listK = v.k(model3, new RowDelegate.Model("PLAN_SUMMARY_COST", new ResourceImage(R$drawable.uikit_icn_24_time_and_money, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, textLocalisedClause, new TextLocalisedClause(R$string.pets_confirm_purchase_sections_review_coverage_price_subtitle, null, null, 14), null, null, 0, null, false, false, null, cVar, null, null, null, null, null, 0, 0, 0, 0, 1073704812), new RowDelegate.Model("PLAN_SUMMARY_COPAY_EXCESS", new ResourceImage(R$drawable.uikit_icn_24_cash, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(R$string.pets_confirm_purchase_sections_review_copay_excess, v.k(h1Var.f325793c, h1Var.d), null, 12), null, null, null, 0, null, false, false, null, cVar, null, null, null, null, null, 0, 0, 0, 0, 1073704940));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                s0Var.b((koi.j[]) listK.toArray(new koi.j[0]));
                s0Var.a(new ListSubheaderDelegate.Model("PLAN_DOCUMENTS_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.pets_confirm_purchase_documents_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                s0 s0Var2 = new s0(2);
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list2) {
                    if (obj6 instanceof PolicyDocument.Pdf) {
                        arrayList.add(obj6);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                int i3 = 0;
                for (Object obj7 : arrayList) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList2.add(yz7.a.a("PLAN_REMOTE_DOCUMENT_ROW_ID_PREFIX_" + i3, (PolicyDocument.Pdf) obj7));
                    i3 = i5;
                }
                s0Var2.b((qv0.i[]) arrayList2.toArray(new qv0.i[0]));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj8 : list2) {
                    if (obj8 instanceof PolicyDocument.Text) {
                        arrayList3.add(obj8);
                    }
                }
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                int i6 = 0;
                for (Object obj9 : arrayList3) {
                    int i21 = i6 + 1;
                    if (i6 < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList4.add(yz7.a.a("PLAN_LOCAL_DOCUMENT_ROW_ID_PREFIX" + i6, (PolicyDocument.Text) obj9));
                    i6 = i21;
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj10 : list2) {
                    if (obj10 instanceof PolicyDocument.Custom) {
                        arrayList5.add(obj10);
                    }
                }
                ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                int i22 = 0;
                for (Object obj11 : arrayList5) {
                    int i32 = i22 + 1;
                    if (i22 < 0) {
                        v.s();
                        throw null;
                    }
                    arrayList6.add(yz7.a.a("PLAN_LOCAL_DOCUMENT_ROW_ID_PREFIX" + i22, (PolicyDocument.Custom) obj11));
                    i22 = i32;
                }
                s0Var2.b((qv0.i[]) d0.E0(arrayList6, arrayList4).toArray(new qv0.i[0]));
                ArrayList arrayList7 = s0Var2.f186433a;
                List listK2 = v.k(arrayList7.toArray(new qv0.i[arrayList7.size()]));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                s0Var.b((koi.j[]) listK2.toArray(new koi.j[0]));
                InputChecklistDelegate.Model model4 = new InputChecklistDelegate.Model("PLAN_MEDICAL_CONDITIONS_CHECKBOX_ID", new TextLocalisedClause(R$string.pets_confirm_purchase_checkbox_conditions_title, null, null, 14), model2.e, false, null, iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524248);
                yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                s0Var.a(model4);
                TextDelegate.Model model5 = new TextDelegate.Model("FOOTER_ITEM_LIST_ID", new TextLocalisedClause(R$string.pets_confirm_purchase_footer_caption_v2, u.c(new TextLocalisedClause(R$string.pets_confirm_purchase_documents_general_info, null, new Click(28, (Integer) null, (Object) model2.d, "FOOTER_ITEM_GENERAL_INFO_LIST_ID", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
                yp0.b.r(model5, 0, R$attr.uikit_dp72, 0, 0, 13);
                s0Var.a(model5);
                ArrayList arrayList8 = s0Var.f186433a;
                List listK3 = v.k(arrayList8.toArray(new koi.j[arrayList8.size()]));
                aVar3.f318042a = (koi.j) d0.m0(listK3);
                return listK3;
        }
    }
}
