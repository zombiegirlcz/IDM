package xbe;

import a9e.i;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import efm.r;
import ip0.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import qua.p;
import qua.u;
import rua.c;
import rua.d;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends abe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f304064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final abe.b f304065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f304066c;
    public final e d;

    public b(a9e.b commonSubscriptionMapper, abe.b paymentFromItemMapper, i tempTransactionsMapper, e dateProvider) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(paymentFromItemMapper, "paymentFromItemMapper");
        Intrinsics.checkNotNullParameter(tempTransactionsMapper, "tempTransactionsMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f304064a = commonSubscriptionMapper;
        this.f304065b = paymentFromItemMapper;
        this.f304066c = tempTransactionsMapper;
        this.d = dateProvider;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        Boolean boolValueOf;
        List list;
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        p pVar = model.f304061a;
        boolean zI = u.i(pVar, ((f) this.d).g());
        List list2 = pVar.Z;
        ActionsView.Item itemM = null;
        if (!zI) {
            return null;
        }
        if (list2 != null) {
            boolValueOf = Boolean.valueOf(list2.size() == 1 && list2.contains(fva.a.CHANGE_DESCRIPTION));
        } else {
            boolValueOf = null;
        }
        boolean zJ = pd.b.j(boolValueOf);
        d dVar = pVar.D;
        a9e.b bVar = this.f304064a;
        if (dVar != null && (list = list2) != null && !list.isEmpty() && !zJ) {
            itemM = ((i9e.f) bVar).m();
        }
        i9e.f fVar = (i9e.f) bVar;
        ActionsView.Item[] elements = {itemM, fVar.x(), fVar.k()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return fVar.c(kotlin.collections.d.L(elements));
    }

    @Override // abe.a
    public final List b(Object obj2) {
        Data data;
        Map map;
        c cVar;
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        p pVar = model.f304061a;
        Data data2 = model.f304062b;
        q qVar = model.f304063c;
        boolean zI = u.i(pVar, ((f) this.d).g());
        d dVar = pVar.D;
        ibd.e eVar = pVar.f249314a;
        p pVar2 = model.f304061a;
        List list = pVar2.Z;
        boolean zJ = pd.b.j(list != null ? Boolean.valueOf(list.contains(fva.a.CHANGE_DESCRIPTION)) : null);
        aim.e eVarB = zhm.u.b();
        a9e.b bVar = this.f304064a;
        if (!zI) {
            sa saVarZ = ((i9e.f) bVar).z((dVar == null || (cVar = dVar.f257508a) == null) ? null : cVar.displayName());
            yp0.b.l(saVarZ, 0, 0, 0, 0, null, false, 63);
            eVarB.add(saVarZ);
        }
        i9e.f fVar = (i9e.f) bVar;
        qv0.i[] elements = {fVar.r(pVar, false), (eVar.e == null || ofm.q.H(pVar)) ? null : fVar.F(eVar.e), ofm.q.y(pVar) ? fVar.v(eVar.f, pVar) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        if (dVar != null && (map = dVar.f257509b) != null) {
            ArrayList arrayListA = ((mae.u) this.f304066c).a(map);
            if (arrayListA != null) {
                yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
            } else {
                arrayListA = null;
            }
            if (arrayListA != null) {
                eVarB.addAll(arrayListA);
            }
        }
        qv0.i iVarA = this.f304065b.a(pVar2, qVar);
        yp0.b.l(iVarA, 0, 0, 0, 0, null, false, 63);
        eVarB.add(iVarA);
        if (zJ) {
            qv0.i iVarO = fVar.o(pVar);
            yp0.b.l(iVarO, 0, 0, 0, 0, null, false, 63);
            eVarB.add(iVarO);
        } else {
            CellDetailsNoteDelegate.Model modelW = fVar.w(pVar.f249325m);
            if (modelW != null) {
                yp0.b.l(modelW, 0, 0, 0, 0, null, false, 63);
            } else {
                modelW = null;
            }
            n14.e.b(eVarB, modelW);
        }
        try {
            Object content = data2.getContent();
            data = new Data(content != null ? ((hce.d) content).f150888a : null, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        hce.d dVar2 = (hce.d) data2.getContent();
        List listD = fVar.d(data, qVar, dVar2 != null ? dVar2.f150889b : null);
        if (listD != null) {
            eVarB.addAll(listD);
        }
        CellDetailsChevronDelegate.Model modelS = fVar.s();
        yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
        eVarB.add(modelS);
        eVarB.add(new IconDelegate.Model("LOGO_FOOTER_LIST_ID", te2.a.f270025b, null, null, null, null, null, null, 972));
        return zhm.u.a(eVarB);
    }

    @Override // abe.a
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        hce.b bVar = subscriptionContent.f150886a;
        return w.h(new a(bVar.f150883a, bVar.f150884b, bVar.f150885c));
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        String strDisplayName;
        c cVar;
        c cVar2;
        String strDisplayName2;
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        p pVarC = zae.c.c(subscriptionContent);
        hce.b bVar = subscriptionContent.f150886a;
        p pVar = bVar.f150883a;
        boolean zI = u.i(pVarC, ((f) this.d).g());
        dj0.d dVarB = zae.c.b(subscriptionContent);
        i9e.f fVar = (i9e.f) this.f304064a;
        MoneyClause moneyClauseU = fVar.u(dVarB, zI);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        d dVar = bVar.f150883a.D;
        Clause textLocalisedClause = (dVar == null || (cVar2 = dVar.f257508a) == null || (strDisplayName2 = cVar2.displayName()) == null) ? new TextLocalisedClause(R$string.recurring_payments_form_transfer, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10) : new TextClause(strDisplayName2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.subscriptions_list_section_scheduled_transfers_title, null, null, 14);
        LayeredImage layeredImageG = fVar.g(!zI);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        d dVar2 = pVar.D;
        if (dVar2 == null || (cVar = dVar2.f257508a) == null || (strDisplayName = cVar.displayName()) == null) {
            Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
            strDisplayName = pVar.f249325m;
        }
        return w.h(new hce.a(moneyClauseU, textLocalisedClause, textLocalisedClause2, new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, strDisplayName, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), layeredImageG, (Serializable) null, 96));
    }
}
