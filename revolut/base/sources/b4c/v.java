package b4c;

import android.app.Activity;
import android.os.Parcelable;
import android.view.View;
import aw0.o9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.hj;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolut_shop.api.R$string;
import d3c.m0;
import ip0.eo0;
import ip0.po0;
import ip0.ps;
import ip0.qs;
import ip0.xk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yp0.c0;
import zhm.a0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12286a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12288c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f12289g;

    public /* synthetic */ v(x xVar, TextLocalisedClause textLocalisedClause, k kVar, List list, m0 m0Var, boolean z) {
        this.f12288c = xVar;
        this.d = textLocalisedClause;
        this.e = kVar;
        this.f = list;
        this.f12289g = m0Var;
        this.f12287b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        ?? arrayList;
        Throwable th10;
        ArrayList arrayList2;
        int i;
        VoucherSmallTileDelegate.Model model;
        qs qsVar;
        int i2 = this.f12286a;
        int i3 = 14;
        Object obj2 = this.f12289g;
        Object obj3 = this.f;
        boolean z = this.f12287b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f12288c;
        switch (i2) {
            case 0:
                x xVar = (x) obj6;
                TextLocalisedClause textLocalisedClause = (TextLocalisedClause) obj5;
                k kVar = (k) obj4;
                m0 m0Var = (m0) obj2;
                aim.e eVarB = zhm.u.b();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj7 : (List) obj3) {
                    d3c.q qVar = ((d3c.p) obj7).e;
                    Object arrayList3 = linkedHashMap.get(qVar);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(qVar, arrayList3);
                    }
                    ((List) arrayList3).add(obj7);
                }
                List<d3c.p> list = (List) linkedHashMap.get(d3c.q.PRODUCT);
                if (list != null) {
                    arrayList = new ArrayList();
                    for (d3c.p pVar : list) {
                        UrlImage urlImageA = z3c.g.a(pVar, true);
                        if (urlImageA == null) {
                            qsVar = null;
                        } else {
                            String strQ = j6.a.q("PRODUCT_LIST_ID_", pVar.f111054c);
                            ps psVar = new ps(urlImageA);
                            TextClause textClause = new TextClause(pVar.f111054c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            d3c.x xVar2 = (d3c.x) d0.d0(pVar.f);
                            qsVar = new qs(strQ, psVar, null, zhm.v.l(x.a(pVar)), textClause, xVar2 != null ? z3c.i.a(xVar2, m0Var, true) : null, null, null, pVar, 1988);
                        }
                        if (qsVar != null) {
                            arrayList.add(qsVar);
                        }
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = f0.f322471a;
                }
                List<d3c.p> list2 = (List) linkedHashMap.get(d3c.q.ACCESSORY);
                boolean z3 = false;
                int i5 = 2;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (d3c.p pVar2 : list2) {
                        UrlImage urlImageA2 = z3c.g.a(pVar2, z3);
                        if (urlImageA2 == null) {
                            i = i5;
                            model = null;
                        } else {
                            String strQ2 = j6.a.q("ACCESSORY_LIST_ID_", pVar2.f111054c);
                            zi ziVar = new zi(urlImageA2);
                            TextClause textClause2 = new TextClause(pVar2.f111054c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            hj hjVar = new hj(i5);
                            d3c.x xVar3 = (d3c.x) d0.d0(pVar2.f);
                            CompositeClause compositeClauseA = xVar3 != null ? z3c.i.a(xVar3, m0Var, z3) : null;
                            TagViewData tagViewDataA = x.a(pVar2);
                            i = i5;
                            VoucherSmallTileDelegate.Model model2 = new VoucherSmallTileDelegate.Model(strQ2, ziVar, textClause2, hjVar, null, compositeClauseA, null, null, null, tagViewDataA != null ? new po0(tagViewDataA) : null, null, true, new eo0(new aw0.d0(335, 340)), null, pVar2, 236496);
                            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                            model = model2;
                        }
                        if (model != null) {
                            arrayList4.add(model);
                        }
                        i5 = i;
                        z3 = false;
                    }
                    th10 = null;
                    arrayList2 = arrayList4;
                } else {
                    th10 = null;
                    arrayList2 = null;
                }
                int i6 = i5;
                List list3 = arrayList2;
                if (arrayList2 == null) {
                    list3 = f0.f322471a;
                }
                List list4 = list3;
                if (!((Collection) arrayList).isEmpty()) {
                    eVarB.add(x.b());
                    Iterable iterable = (Iterable) arrayList;
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(iterable, 10));
                    int i21 = 0;
                    for (Object obj8 : iterable) {
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            zhm.v.s();
                            throw th10;
                        }
                        qs qsVar2 = (qs) obj8;
                        yp0.b.l(qsVar2, i21 == 0 ? R$attr.uikit_dp0 : R$attr.uikit_dp4, i21 == zhm.v.j(arrayList) ? R$attr.uikit_dp0 : R$attr.uikit_dp4, 0, 0, null, false, 60);
                        arrayList5.add(qsVar2);
                        i21 = i22;
                    }
                    eVarB.addAll(arrayList5);
                }
                if (!list4.isEmpty()) {
                    ?? r4 = th10;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_home_accessories_subtitle, r4, r4, 14);
                    int i32 = R$attr.uikit_dp12;
                    eVarB.add(new ListSubheaderDelegate.Model("SUBHEADER_ACCESSORIES_LIST_ID", (Image) null, (Clause) textLocalisedClause2, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, i32, i32, 0, 0, 53242));
                    eVarB.add(new xk("ACCESSORIES_GRID_LIST_ID", list4, Integer.valueOf(i6), null, null, R$attr.uikit_dp0, 0, 0, 0, 65400));
                }
                List listC = (List) ue0.e.M(zhm.u.a(eVarB));
                if (listC == null) {
                    FullScreenStateDelegate.Model model3 = new FullScreenStateDelegate.Model("EMPTY_PRODUCTS_LIST_ID", new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_home_empty_title, null, null, 14), new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_home_empty_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D166", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32752);
                    yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                    listC = zhm.u.c(model3);
                }
                List listA = z3c.d.a(kVar.f12265a);
                aim.e eVarB2 = zhm.u.b();
                if (z) {
                    eVarB2.add(new ActionsView.Item("CARD_READER_SETTINGS_ITEM_ID", null, false, null, null, new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_home_reader_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_card_reader, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670));
                }
                eVarB2.add(new ActionsView.Item("ORDER_HISTORY_ITEM_ID", null, false, null, null, new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_purchase_history_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_receipt, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670));
                Unit unit = Unit.f186387a;
                aim.e eVarA = zhm.u.a(eVarB2);
                aim.e eVarB3 = zhm.u.b();
                a0.x(xVar.f12291b.a(kVar.d), eVarB3);
                a0.x(listC, eVarB3);
                return new o(textLocalisedClause, listA, eVarA, zhm.u.a(eVarB3));
            default:
                kye.e eVar = (kye.e) obj6;
                Activity activity = (Activity) obj5;
                View view = (View) obj4;
                os2.g gVar = (os2.g) obj3;
                hli.a aVar = (hli.a) obj2;
                Intrinsics.checkNotNullParameter(activity, "activity");
                int i33 = R$id.internal_activity_wave_effect;
                yp0.d0 d0Var = yp0.d0.f315718a;
                c0 c0VarA = yp0.d0.a(activity);
                Object objA = c0VarA.a(i33);
                if (objA == null) {
                    objA = new xp0.b();
                    c0VarA.b(i33, objA);
                }
                xp0.b bVar = (xp0.b) objA;
                oii.b onWhenViewReadyToBind = new oii.b(gVar, 1);
                oa2.b onEnd = new oa2.b(aVar, eVar, i3);
                xp0.g parameters = xp0.g.DEFAULT;
                xp0.a startDelayVariant = z ? xp0.a.AFTER_TRANSITION : xp0.a.DEFAULT;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(onWhenViewReadyToBind, "onWhenViewReadyToBind");
                Intrinsics.checkNotNullParameter(onEnd, "onEnd");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(startDelayVariant, "startDelayVariant");
                bVar.a(view, new js0.b(new xge.h(onWhenViewReadyToBind, 7)), new js0.b(new xge.h(onEnd, 8)), parameters, startDelayVariant);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ v(kye.e eVar, Activity activity, View view, boolean z, os2.g gVar, hli.a aVar) {
        this.f12288c = eVar;
        this.d = activity;
        this.e = view;
        this.f12287b = z;
        this.f = gVar;
        this.f12289g = aVar;
    }
}
