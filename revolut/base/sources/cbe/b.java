package cbe;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import hce.c;
import ip0.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import k71.q;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import qua.p;
import qua.u;
import qv0.i;
import te0.w;
import zhm.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends abe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f22784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f22785b;

    public b(a9e.b commonSubscriptionMapper, e dateProvider) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f22784a = commonSubscriptionMapper;
        this.f22785b = dateProvider;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        if (!u.i(model.f22781a, ((f) this.f22785b).g())) {
            return null;
        }
        i9e.f fVar = (i9e.f) this.f22784a;
        ActionsView.Item[] elements = {fVar.m(), fVar.x()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return fVar.c(d.L(elements));
    }

    @Override // abe.a
    public final List b(Object obj2) {
        ArrayList arrayList;
        Data data;
        Data data2;
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        p pVar = model.f22781a;
        q qVar = model.f22783c;
        Data data3 = model.f22782b;
        boolean zI = u.i(pVar, ((f) this.f22785b).g());
        String str = pVar.f249325m;
        ibd.e eVar = pVar.f249314a;
        a9e.b bVar = this.f22784a;
        if (zI) {
            arrayList = new ArrayList();
            i9e.f fVar = (i9e.f) bVar;
            i[] elements = {fVar.r(pVar, false), (eVar.e == null || ofm.q.H(pVar)) ? null : fVar.F(eVar.e), ofm.q.y(pVar) ? fVar.v(eVar.f, pVar) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            a0.x(listL, arrayList);
            CellDetailsNoteDelegate.Model modelW = fVar.w(str);
            if (modelW != null) {
                yp0.b.l(modelW, 0, 0, 0, 0, null, false, 63);
                arrayList.add(modelW);
            }
            try {
                Object content = data3.getContent();
                data2 = new Data(content != null ? ((hce.d) content).f150888a : null, data3.getError(), data3.getLoading());
            } catch (Throwable th10) {
                data2 = new Data(null, th10, data3.getLoading());
            }
            hce.d dVar = (hce.d) data3.getContent();
            List listD = fVar.d(data2, qVar, dVar != null ? dVar.f150889b : null);
            if (listD != null) {
                a0.x(listD, arrayList);
            }
            CellDetailsChevronDelegate.Model modelS = fVar.s();
            yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
            arrayList.add(modelS);
            CellDetailsChevronDelegate.Model modelL = fVar.l(R.string.common_action_delete);
            yp0.b.l(modelL, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
            arrayList.add(modelL);
        } else {
            arrayList = new ArrayList();
            vua.a aVar = pVar.f249330s;
            i9e.f fVar2 = (i9e.f) bVar;
            sa saVarZ = fVar2.z(aVar != null ? aVar.a() : null);
            yp0.b.l(saVarZ, 0, 0, 0, 0, null, false, 63);
            arrayList.add(saVarZ);
            i[] elements2 = {fVar2.r(pVar, false), (eVar.e == null || ofm.q.H(pVar)) ? null : fVar2.F(eVar.e)};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            List listL2 = d.L(elements2);
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
            a0.x(listL2, arrayList);
            CellDetailsNoteDelegate.Model modelW2 = fVar2.w(str);
            if (modelW2 != null) {
                yp0.b.l(modelW2, 0, 0, 0, 0, null, false, 63);
                arrayList.add(modelW2);
            }
            try {
                Object content2 = data3.getContent();
                data = new Data(content2 != null ? ((hce.d) content2).f150888a : null, data3.getError(), data3.getLoading());
            } catch (Throwable th11) {
                data = new Data(null, th11, data3.getLoading());
            }
            hce.d dVar2 = (hce.d) data3.getContent();
            List listD2 = fVar2.d(data, qVar, dVar2 != null ? dVar2.f150889b : null);
            if (listD2 != null) {
                a0.x(listD2, arrayList);
            }
            CellDetailsChevronDelegate.Model modelS2 = fVar2.s();
            yp0.b.l(modelS2, 0, 0, 0, 0, null, false, 63);
            arrayList.add(modelS2);
            CellDetailsChevronDelegate.Model modelL2 = fVar2.l(R.string.common_action_delete);
            yp0.b.l(modelL2, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
            arrayList.add(modelL2);
        }
        return arrayList;
    }

    @Override // abe.a
    public final r c(c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        hce.b bVar = subscriptionContent.f150886a;
        return w.h(new a(bVar.f150883a, bVar.f150884b, bVar.f150885c));
    }

    @Override // abe.a
    public final r d(c subscriptionContent) {
        String str;
        String strO;
        String str2;
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        boolean zI = u.i(zae.c.c(subscriptionContent), ((f) this.f22785b).g());
        dj0.d dVarB = zae.c.b(subscriptionContent);
        i9e.f fVar = (i9e.f) this.f22784a;
        MoneyClause moneyClauseU = fVar.u(dVarB, zI);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        hce.b bVar = subscriptionContent.f150886a;
        String str3 = bVar.f150883a.k;
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        f5j.a aVar = bVar.f150883a.f249329r;
        if (aVar != null) {
            String str4 = aVar.e;
            if (str4 == null || (str2 = aVar.f) == null) {
                strO = aVar.d;
                if (strO == null) {
                    strO = null;
                }
            } else {
                strO = com.google.android.gms.internal.mlkit_vision_face.a.o(str4, " ", str2);
            }
            str = strO;
        } else {
            str = null;
        }
        int i = subscriptionContent.f150887b ? R$attr.uikit_colorAccent : R$attr.uikit_colorForeground;
        Clause textClause = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : str != null ? new TextClause(str, (Style) null, Integer.valueOf(i), false, (o9) null, (List) null, 122) : new TextLocalisedClause(R$string.recurring_payments_form_transfer, null, new Custom(Integer.valueOf(i), false, null, false, null, 254), 10);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.recurring_payment_details_header_subtitle_one_off, null, null, 14);
        LayeredImage layeredImageG = fVar.g(!zI);
        fVar.getClass();
        return w.h(new hce.a(moneyClauseU, textClause, textLocalisedClause, h5k.a.c(), layeredImageG, (Serializable) null, 96));
    }
}
