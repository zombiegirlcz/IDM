package com.revolut.feature.statements.impl.ui.documents_hub;

import a0e.d;
import ang.f;
import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.statements.impl.ui.documents_hub.DocumentsHubScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.Iterator;
import jyd.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import oki.h;
import vkm.j2;
import vkm.t0;
import w4l.i;
import wli.x;
import wxd.c;
import wxd.m;
import wxd.n;
import wxd.t;
import wxd.v;
import yji.l;
import ymk.u;
import z0f.k;
import z6e.g;
import zzd.g0;
import zzd.k0;
import zzd.m0;
import zzd.q;
import zzd.s;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements s {
    public final y A;
    public final com.revolut.kompot.navigable.vc.modal.a B;
    public final DocumentsHubScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f88361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f88362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m0 f88363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f88364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f88365t;
    public final a0e.y u;
    public final vyd.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n0e.b f88366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ij0.a f88367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hk0.a f88368y;
    public final vii.b z;

    public a(DocumentsHubScreenContract$InputData inputData, k0 stateMapper, b interactor, f userInteractor, m0 tabSelectionResolver, x deeplinkHandler, d customFilterExtension, a0e.y generatePayloadBuilder, vyd.a statementGenerationDialogModelConfigurationFactory, n0e.b statementsNaviCommandFactory, ij0.a coreNetworkConfiguration, hk0.a networkFileRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(tabSelectionResolver, "tabSelectionResolver");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(customFilterExtension, "customFilterExtension");
        Intrinsics.checkNotNullParameter(generatePayloadBuilder, "generatePayloadBuilder");
        Intrinsics.checkNotNullParameter(statementGenerationDialogModelConfigurationFactory, "statementGenerationDialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(statementsNaviCommandFactory, "statementsNaviCommandFactory");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        this.o = inputData;
        this.f88361p = interactor;
        this.f88362q = userInteractor;
        this.f88363r = tabSelectionResolver;
        this.f88364s = deeplinkHandler;
        this.f88365t = customFilterExtension;
        this.u = generatePayloadBuilder;
        this.v = statementGenerationDialogModelConfigurationFactory;
        this.f88366w = statementsNaviCommandFactory;
        this.f88367x = coreNetworkConfiguration;
        this.f88368y = networkFileRepository;
        this.z = new vii.b(i.f294643c);
        this.A = mra.d.b(this, new q(new Data(null, null, true, 3, null), null, null, null, null, null), stateMapper, null, false, 12);
        this.B = e.a(this, new zo2.h(this, 24));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        int i = 26;
        l.a1(this, vkm.q.Q(vkm.q.J(new zfd.e(this.z, 11), new k(new u(new t0(this.A.B(new h0() { // from class: zzd.h0
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                String str = ((q) obj2).f326690c;
                if (str != null) {
                    return new DocumentsHubProduct(str);
                }
                return null;
            }
        }), 1), this, 20), 5)), new g(continuation, this, i)), null, null, new g0(this, continuation, 0), 3);
        l.a1(this, ((a0e.q) this.f88365t).f361w, null, null, new g0(this, continuation, 1), 3);
        l2(new zp5.g(this, continuation, 9), new yi5.b(i));
    }

    public final void I2(wxd.e eVar) {
        Continuation continuation = null;
        if (eVar instanceof wxd.b) {
            l2(new zr5.k(this, ((wxd.b) eVar).f300855a, continuation, 22), new yi5.b(26));
            return;
        }
        if (eVar instanceof c) {
            m mVar = new m(((c) eVar).f300856a);
            l2(new zr5.k(this, mVar, continuation, 23), new zrd.q(this, 29));
        } else {
            if (!(eVar instanceof wxd.d)) {
                throw new NoWhenBranchMatchedException();
            }
            n nVar = new n(this.o.f88356a, ((wxd.d) eVar).f300857a);
            l2(new zr5.k(this, nVar, continuation, 23), new zrd.q(this, 29));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J2(a0e.i r33) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.statements.impl.ui.documents_hub.a.J2(a0e.i):void");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.B;
    }

    public final void K2(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        if (!(obj2 instanceof DocumentsHubProduct)) {
            if (obj2 instanceof wxd.e) {
                I2((wxd.e) obj2);
            }
        } else {
            h.v2(this.B, new DocumentsHubScreenContract$ModalStep.ProductSelector(this.o.f88356a, ((DocumentsHubProduct) obj2).f88259a), ModalDestination.Style.POPUP.f98311a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c1, code lost:
    
        if (r9 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0109, code lost:
    
        if (G1(r9, r0) == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.statements.impl.ui.documents_hub.a.L2(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void M2() {
        a0e.b bVar;
        Object next;
        q qVar = (q) ((j2) this.A.f22677a).getValue();
        t tVar = (t) qVar.f326688a.getContent();
        if (tVar == null) {
            return;
        }
        Iterator it8 = tVar.f300887c.iterator();
        while (true) {
            bVar = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((wxd.u) next).f300888a.equals(qVar.d)) {
                    break;
                }
            }
        }
        wxd.u uVar = (wxd.u) next;
        wxd.x xVar = uVar != null ? uVar.f300890c : null;
        v vVar = xVar instanceof v ? (v) xVar : null;
        String str = qVar.f326690c;
        wxd.f fVar = vVar != null ? vVar.f300891a : null;
        a0e.q qVar2 = (a0e.q) this.f88365t;
        qVar2.getClass();
        if (str != null && fVar != null) {
            bVar = new a0e.b(str, fVar);
        }
        qVar2.f360t.setValue(bVar);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.A;
    }
}
