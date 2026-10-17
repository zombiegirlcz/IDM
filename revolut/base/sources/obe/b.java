package obe;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import ip0.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k71.q;
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
    public final a9e.b f223930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f223931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f223932c;

    public b(a9e.b commonSubscriptionMapper, e dateProvider, d internalTransferNavBarProvider) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(internalTransferNavBarProvider, "internalTransferNavBarProvider");
        this.f223930a = commonSubscriptionMapper;
        this.f223931b = dateProvider;
        this.f223932c = internalTransferNavBarProvider;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        ActionsView.Item itemM = null;
        if (!u.i(model.f223927a, ((f) this.f223931b).g())) {
            return null;
        }
        vua.a aVar = model.f223927a.f249330s;
        String str = aVar != null ? aVar.f : null;
        a9e.b bVar = this.f223930a;
        if (str != null && str.length() != 0) {
            itemM = ((i9e.f) bVar).m();
        }
        i9e.f fVar = (i9e.f) bVar;
        ActionsView.Item[] elements = {itemM, fVar.x()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return fVar.c(kotlin.collections.d.L(elements));
    }

    @Override // abe.a
    public final List b(Object obj2) {
        ArrayList arrayList;
        Data data;
        String str;
        String str2;
        Map map;
        Data data2;
        String str3;
        String str4;
        Map map2;
        a model = (a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        p pVar = model.f223927a;
        p pVar2 = model.f223927a;
        q qVar = model.f223929c;
        Data data3 = model.f223928b;
        boolean zI = u.i(pVar, ((f) this.f223931b).g());
        String str5 = pVar.f249325m;
        sua.b bVar = pVar.J;
        ibd.e eVar = pVar.f249314a;
        vua.a aVar = pVar.f249330s;
        a9e.b bVar2 = this.f223930a;
        if (zI) {
            arrayList = new ArrayList();
            i9e.f fVar = (i9e.f) bVar2;
            i[] elements = {fVar.r(pVar, false), (eVar.e == null || ofm.q.H(pVar)) ? null : fVar.F(eVar.e), ofm.q.y(pVar) ? fVar.v(eVar.f, pVar) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            a0.x(listL, arrayList);
            if (aVar != null && (str3 = aVar.e) != null) {
                o61.a aVar2 = (bVar == null || (str4 = bVar.f265696a) == null || qVar == null || (map2 = qVar.e) == null) ? null : (o61.a) map2.get(str4);
                List listR = i2b.a.r(aVar2 != null ? ((i9e.f) bVar2).h(aVar2, pVar2, null, null) : fVar.A(pVar), fVar.J(str3));
                yp0.b.k(listR, 0, 0, 0, 0, 31);
                a0.x(listR, arrayList);
            }
            CellDetailsNoteDelegate.Model modelW = fVar.w(str5);
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
            i9e.f fVar2 = (i9e.f) bVar2;
            sa saVarZ = fVar2.z(aVar != null ? aVar.a() : null);
            yp0.b.l(saVarZ, 0, 0, 0, 0, null, false, 63);
            arrayList.add(saVarZ);
            i[] elements2 = {fVar2.r(pVar, false), (eVar.e == null || ofm.q.H(pVar)) ? null : fVar2.F(eVar.e)};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            List listL2 = kotlin.collections.d.L(elements2);
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
            a0.x(listL2, arrayList);
            if (aVar != null && (str = aVar.e) != null) {
                o61.a aVar3 = (bVar == null || (str2 = bVar.f265696a) == null || qVar == null || (map = qVar.e) == null) ? null : (o61.a) map.get(str2);
                List listR2 = i2b.a.r(aVar3 != null ? ((i9e.f) bVar2).h(aVar3, pVar2, null, null) : fVar2.A(pVar), fVar2.J(str));
                yp0.b.k(listR2, 0, 0, 0, 0, 31);
                a0.x(listR2, arrayList);
            }
            CellDetailsNoteDelegate.Model modelW2 = fVar2.w(str5);
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
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        hce.b bVar = subscriptionContent.f150886a;
        return w.h(new a(bVar.f150883a, bVar.f150884b, bVar.f150885c));
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        d dVar = this.f223932c;
        r map = cl3.a.a(dVar.d).map(new o5i.a(29, new neg.q(subscriptionContent, 24, dVar, subscriptionContent)));
        Intrinsics.checkNotNullExpressionValue(map, "with(...)");
        return map;
    }
}
