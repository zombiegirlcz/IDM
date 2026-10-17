package gbe;

import a9e.b;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import k71.q;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import qua.p;
import qua.u;
import qv0.i;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f142254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final abe.b f142255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f142256c;

    public a(b commonSubscriptionMapper, abe.b paymentFromItemMapper, e dateProvider) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(paymentFromItemMapper, "paymentFromItemMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f142254a = commonSubscriptionMapper;
        this.f142255b = paymentFromItemMapper;
        this.f142256c = dateProvider;
    }

    public final aim.e a(dbe.a model, String str, boolean z, boolean z3) {
        Data data;
        Intrinsics.checkNotNullParameter(model, "model");
        boolean zI = u.i(model.f112735a, ((f) this.f142256c).g());
        aim.e eVarB = zhm.u.b();
        p pVar = model.f112735a;
        Data data2 = model.f112736b;
        q qVar = model.f112737c;
        b bVar = this.f142254a;
        i iVarR = ((i9e.f) bVar).r(pVar, false);
        ibd.e eVar = pVar.f249314a;
        i[] elements = {iVarR, (eVar.e == null || ofm.q.H(pVar)) ? null : ((i9e.f) bVar).F(eVar.e), ofm.q.y(pVar) ? ((i9e.f) bVar).v(eVar.f, pVar) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        if (z) {
            i iVarA = this.f142255b.a(pVar, qVar);
            yp0.b.l(iVarA, 0, 0, 0, 0, null, false, 63);
            eVarB.add(iVarA);
        }
        if (z3) {
            i iVarO = ((i9e.f) bVar).o(pVar);
            yp0.b.l(iVarO, 0, 0, 0, 0, null, false, 63);
            eVarB.add(iVarO);
        } else {
            CellDetailsNoteDelegate.Model modelW = ((i9e.f) bVar).w(pVar.f249325m);
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
        hce.d dVar = (hce.d) data2.getContent();
        i9e.f fVar = (i9e.f) bVar;
        List listD = fVar.d(data, qVar, dVar != null ? dVar.f150889b : null);
        if (listD != null) {
            eVarB.addAll(listD);
        }
        CellDetailsChevronDelegate.Model modelS = fVar.s();
        yp0.b.l(modelS, 0, 0, 0, 0, null, false, 63);
        eVarB.add(modelS);
        CellDetailsChevronDelegate.Model modelL = fVar.l(R.string.common_action_delete);
        yp0.b.l(modelL, 0, R$attr.uikit_dp24, 0, 0, null, false, 61);
        eVarB.add(modelL);
        aim.e eVarA = zhm.u.a(eVarB);
        aim.e eVarB2 = zhm.u.b();
        if (!zI) {
            sa saVarZ = fVar.z(str);
            yp0.b.l(saVarZ, 0, 0, 0, 0, null, false, 63);
            eVarB2.add(saVarZ);
        }
        eVarB2.addAll(eVarA);
        return zhm.u.a(eVarB2);
    }
}
