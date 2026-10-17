package pbe;

import a9e.b;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.SubscriptionDetailsScreenContract$Configuration;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import hce.c;
import ip0.y10;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kp0.m;
import l80.e;
import l80.f;
import ox2.d;
import p4a.g;
import qua.o;
import qua.p;
import qua.u;
import qv0.i;
import te0.w;
import w4l.h;
import zhm.a0;
import zhm.f0;
import zhm.v;
import zm3.j;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends abe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f234674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f234675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vb8.b f234676c;
    public final hj8.a d;
    public final SubscriptionDetailsScreenContract$Configuration e;

    public a(e dateProvider, b commonSubscriptionMapper, vb8.b juniorAllowanceRecurringPaymentUiMapper, hj8.a juniorProfileInteractor, SubscriptionDetailsScreenContract$Configuration configuration) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(juniorAllowanceRecurringPaymentUiMapper, "juniorAllowanceRecurringPaymentUiMapper");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f234674a = dateProvider;
        this.f234675b = commonSubscriptionMapper;
        this.f234676c = juniorAllowanceRecurringPaymentUiMapper;
        this.d = juniorProfileInteractor;
        this.e = configuration;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        cbe.a model = (cbe.a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (!u.i(model.f22781a, ((f) this.f234674a).g()) || this.e.f89240b != f9e.b.REGULAR) {
            return null;
        }
        i9e.f fVar = (i9e.f) this.f234675b;
        return fVar.c(v.k(fVar.m(), fVar.x()));
    }

    @Override // abe.a
    public final List b(Object obj2) {
        String str;
        cbe.a model = (cbe.a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        p pVar = model.f22781a;
        Data data = model.f22782b;
        q qVar = model.f22783c;
        f fVar = (f) this.f234674a;
        boolean zI = u.i(pVar, fVar.g());
        String str2 = pVar.f249325m;
        ibd.e eVar = pVar.f249314a;
        f9e.b bVar = this.e.f89240b;
        f9e.b bVar2 = f9e.b.JUNIOR_ALLOWANCE_EXTERNAL;
        b bVar3 = this.f234675b;
        if (bVar == bVar2) {
            ArrayList arrayList = new ArrayList();
            aim.e eVarB = zhm.u.b();
            eVarB.addAll(e(pVar));
            if (zI && ofm.q.z(pVar, fVar.g())) {
                CellDetailsDelegate.Model modelV = ((i9e.f) bVar3).v(eVar.f, pVar);
                if (modelV != null) {
                    eVarB.add(modelV);
                }
            }
            aim.e eVarA = zhm.u.a(eVarB);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            a0.x(eVarA, arrayList);
            o oVar = pVar.M;
            if (oVar != null && (str = oVar.f249313b) != null) {
                TextClause endText = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                ((i9e.f) bVar3).getClass();
                Intrinsics.checkNotNullParameter(endText, "endText");
                CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ID_PAYMENT_SOURCE", new TextLocalisedClause(R$string.recurring_payment_details_payment_from_title, null, null, 14), endText, 0, null, null, null, null, null, false, 0, 0, 32760);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                arrayList.add(model2);
            }
            return arrayList;
        }
        if (zI) {
            ArrayList arrayList2 = new ArrayList();
            aim.e eVarB2 = zhm.u.b();
            eVarB2.addAll(e(pVar));
            if (ofm.q.z(pVar, fVar.g())) {
                CellDetailsDelegate.Model modelV2 = ((i9e.f) bVar3).v(eVar.f, pVar);
                if (modelV2 != null) {
                    eVarB2.add(modelV2);
                }
            }
            aim.e eVarA2 = zhm.u.a(eVarB2);
            yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
            a0.x(eVarA2, arrayList2);
            a0.x(g(pVar), arrayList2);
            List listL = v.l(((i9e.f) bVar3).w(str2));
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            a0.x(listL, arrayList2);
            a0.x(i(data, qVar), arrayList2);
            a0.x(f(), arrayList2);
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        vua.a aVar = pVar.f249330s;
        String juniorFullName = aVar != null ? aVar.a() : null;
        if (juniorFullName == null) {
            juniorFullName = "";
        }
        Intrinsics.checkNotNullParameter("ID_PAUSED_WARNING", "listId");
        Intrinsics.checkNotNullParameter("ID_ACTIVATE_ACTION", "activateActionListId");
        Intrinsics.checkNotNullParameter(juniorFullName, "juniorFullName");
        sa saVar = new sa("ID_PAUSED_WARNING", (Clause) new TextLocalisedClause(com.revolut.feature.junior_allowance.impl.R$string.junior_allowance_details_paused_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.junior_allowance.impl.R$string.junior_allowance_details_paused_subtitle, zhm.u.c(juniorFullName), null, 12), zhm.u.c(new ActionsView.Item("ID_ACTIVATE_ACTION", null, false, null, null, new TextLocalisedClause(com.revolut.feature.junior_allowance.impl.R$string.junior_allowance_details_paused_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_play, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, null, null, 32670)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4032);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        arrayList3.add(saVar);
        List listE = e(pVar);
        yp0.b.k(listE, 0, 0, 0, 0, 31);
        a0.x(listE, arrayList3);
        a0.x(g(pVar), arrayList3);
        List listL2 = v.l(((i9e.f) bVar3).w(str2));
        yp0.b.k(listL2, 0, 0, 0, 0, 31);
        a0.x(listL2, arrayList3);
        a0.x(i(data, qVar), arrayList3);
        a0.x(f(), arrayList3);
        return arrayList3;
    }

    @Override // abe.a
    public final r c(c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p pVarC = zae.c.c(subscriptionContent);
        hce.b bVar = subscriptionContent.f150886a;
        return w.h(new cbe.a(pVarC, bVar.f150884b, bVar.f150885c));
    }

    @Override // abe.a
    public final r d(c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        String str = zae.c.c(subscriptionContent).f249318c;
        if (str == null || d0.W(str)) {
            return w.h(h(subscriptionContent, null));
        }
        return rd0.e.c(mo3.a.f(hj8.a.a(this.d, str, h.f294642c), new m(this, subscriptionContent, 23), new d(this, subscriptionContent, 8), new g(28)), kotlin.coroutines.g.f186406a);
    }

    public final List e(p pVar) {
        b bVar = this.f234675b;
        i iVarR = ((i9e.f) bVar).r(pVar, false);
        ibd.e eVar = pVar.f249314a;
        i[] elements = {iVarR, (eVar.e == null || ofm.q.H(pVar)) ? null : ((i9e.f) bVar).F(eVar.e)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public final List f() {
        i9e.f fVar = (i9e.f) this.f234675b;
        CellDetailsChevronDelegate.Model modelS = fVar.s();
        yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
        CellDetailsChevronDelegate.Model modelL = fVar.l(R.string.common_action_delete);
        yp0.b.l(modelL, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
        return v.k(modelS, modelL);
    }

    public final List g(p pVar) {
        String str;
        i9e.f fVar = (i9e.f) this.f234675b;
        CellDetailsDelegate.Model modelA = fVar.A(pVar);
        vua.a aVar = pVar.f249330s;
        CellDetailsDelegate.Model[] elements = {modelA, (aVar == null || (str = aVar.e) == null) ? null : fVar.J(str)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    public final hce.a h(c cVar, j jVar) {
        p pVarC = zae.c.c(cVar);
        boolean zI = u.i(pVarC, ((f) this.f234674a).g());
        Integer numValueOf = jVar != null ? Integer.valueOf(R$attr.uikit_colorAccent) : null;
        dj0.d dVarB = zae.c.b(cVar);
        i9e.f fVar = (i9e.f) this.f234675b;
        MoneyClause moneyClauseU = fVar.u(dVarB, zI);
        String str = pVarC.k;
        if (str == null) {
            str = "";
        }
        return new hce.a(moneyClauseU, new TextClause(str, (Style) null, numValueOf, false, (o9) null, (List) null, 122), (Clause) null, this.f234676c.a(pVarC), fVar.g(!zI), jVar, 32);
    }

    public final List i(Data data, q qVar) {
        Data data2;
        try {
            Object content = data.getContent();
            data2 = new Data(content != null ? ((hce.d) content).f150888a : null, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            data2 = new Data(null, th10, data.getLoading());
        }
        hce.d dVar = (hce.d) data.getContent();
        List listD = ((i9e.f) this.f234675b).d(data2, qVar, dVar != null ? dVar.f150889b : null);
        return listD == null ? f0.f322471a : listD;
    }
}
