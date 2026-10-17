package com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary;

import a41.j1;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.repositories.impl.plugins.financial_evidence.FinancialEvidenceRepositoryImpl$getDocumentsType$1;
import exe.j;
import ft3.h1;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import kxk.o;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import tb4.i;
import tb4.l;
import tb4.n;
import tb4.q;
import vkm.j2;
import wim.z;
import xu3.p0;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends oki.h implements n {

    @NotNull
    private static final q Companion = new q();
    public final SummaryScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sb4.c f67748p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jz3.c f67749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f67750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f67751s;

    public h(SummaryScreenContract$InputData inputData, sb4.c financialEvidenceFlowInteractor, jz3.c documentPreviewNavigationProvider, o stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(financialEvidenceFlowInteractor, "financialEvidenceFlowInteractor");
        Intrinsics.checkNotNullParameter(documentPreviewNavigationProvider, "documentPreviewNavigationProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f67748p = financialEvidenceFlowInteractor;
        this.f67749q = documentPreviewNavigationProvider;
        this.f67750r = mra.d.b(this, new i(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f67751s = hx7.e.a(this, new ta8.a(this, 2));
    }

    public final void I2() {
        List list = ((ry3.b) zi0.c.I(((i) ((j2) this.f67750r.f22677a).getValue()).f269443a)).f258209b;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                } else if (((av3.a) it8.next()) instanceof av3.i) {
                    z = true;
                    break;
                }
            }
        }
        C2(new l(z));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f67751s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow gVar;
        Flow gVar2;
        Flow gVar3;
        List types = this.o.f67734a.W4();
        sb4.c cVar = this.f67748p;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(types, "types");
        hx3.a aVar = cVar.f261499a;
        h1 productPayload = cVar.c();
        hx3.g gVar4 = (hx3.g) aVar;
        j34.g gVar5 = gVar4.f156379a;
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        Intrinsics.checkNotNullParameter(types, "types");
        Continuation continuation = null;
        if (types.contains(p0.DOCUMENTS)) {
            gVar5.getClass();
            Intrinsics.checkNotNullParameter(productPayload, "productPayload");
            ve0.c cVar2 = gVar5.e;
            String strC = j34.g.c(productPayload);
            Type type = new FinancialEvidenceRepositoryImpl$getDocumentsType$1().getType();
            Intrinsics.checkNotNullExpressionValue(type, "getDocumentsType(...)");
            gVar = new j(new a44.c(ue0.e.R(cVar2, strC, type), 5), 18);
        } else {
            gVar = null;
        }
        if (gVar == null) {
            gVar = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        if (types.contains(p0.LINKED_ACCOUNTS)) {
            xg6.j jVar = (xg6.j) gVar4.f156381c;
            w4l.i iVar = w4l.i.f294643c;
            vkm.d dVarB = rd0.e.b(jVar.i(iVar, oe6.b.f224551a));
            vkm.d dVarB2 = rd0.e.b(osg.b.g(gVar4.f156380b, iVar, null, null, io3.i.EXTERNAL, null, null, null, LDSFile.EF_DG4_TAG));
            gVar5.getClass();
            Intrinsics.checkNotNullParameter(productPayload, "productPayload");
            gVar2 = nim.a.u(new j1(gVar4, (Continuation) null, 12), u0.i(dVarB, dVarB2, new j(new a44.c(ue0.e.R(gVar5.e, j34.g.d(productPayload), z.d(o0.b(Boolean.TYPE))), 6), 17)));
        } else {
            gVar2 = null;
        }
        if (gVar2 == null) {
            gVar2 = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        if (types.contains(p0.REVOLUT_TRANSACTIONS)) {
            gVar3 = xam.a.h(new hp2.d(gVar4, continuation, 19), gVar4.b(productPayload));
        } else {
            gVar3 = null;
        }
        if (gVar3 == null) {
            od0.i.Companion.getClass();
            gVar3 = new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
        }
        yji.l.b1(this, pyd.c.m(nim.a.v(u0.i(gVar, gVar2, gVar3), new hwf.b(19))), null, new t9h.b(this, continuation, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f67750r;
    }
}
