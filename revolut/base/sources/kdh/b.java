package kdh;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import ch.qos.logback.core.CoreConstants;
import com.google.common.collect.ImmutableMap;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.flow.NfcArguments;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.api.client.data.DocSide;
import com.onfido.javax.inject.Provider;
import com.onfido.workflow.WorkflowConfig;
import com.revolut.chat.data.db.ChatDatabase;
import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeDetectorSettings;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.models.error.CreditApplicationException;
import com.revolut.feature.payments.air.widget.impl.data.network.PaymentWidgetService;
import com.revolut.feature.tab.invest.impl.ui.home.settings.InvestSettingsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$InputData;
import dam.q;
import f23.g0;
import igm.o;
import io.reactivex.rxjava3.core.Observable;
import ip0.cc;
import java.io.IOException;
import java.lang.reflect.Type;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import k86.f;
import kl.b0;
import kmm.h;
import kmm.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kx7.o0;
import m1i.j0;
import mmm.k0;
import mmm.l0;
import mmm.q0;
import mmm.s0;
import nl.e1;
import okhttp3.Response;
import om4.r0;
import pfm.t;
import q97.b1;
import qfm.j1;
import r10.g;
import rc.k;
import retrofit2.Call;
import retrofit2.CallAdapter;
import sx4.c;
import te0.w;
import ue0.e;
import ulm.p;
import ulm.u0;
import w4l.i;
import xki.d;
import y20.r;
import y20.s;
import y20.z;
import zc.m;
import zc.n;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements p, h2b.b, d, o, el.b, ww1.a, g, n, CallAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f182899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f182900c;

    public /* synthetic */ b(Object obj2, int i) {
        this.f182898a = i;
        this.f182899b = obj2;
    }

    public static akg.n b0(b bVar, String ref2, int i) {
        boolean z = (i & 2) == 0;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(ref2, "ref");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(bVar.a0(u.c(ref2), z, loadingStrategy), new k7c.n(ref2, 8));
    }

    public Future B(mam.a operation) {
        LinkedList linkedList = (LinkedList) this.f182900c;
        Intrinsics.checkNotNullParameter(operation, "operation");
        Future future = ((ExecutorService) this.f182899b).submit(new h4d.d(operation, 22));
        if (operation.f204050a) {
            linkedList.add(future);
        }
        a0.E(linkedList, new q(this));
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof lo9.c
            if (r0 == 0) goto L13
            r0 = r6
            lo9.c r0 = (lo9.c) r0
            int r1 = r0.f197424x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f197424x = r1
            goto L18
        L13:
            lo9.c r0 = new lo9.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f197424x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f182899b
            com.revolut.feature.payments.air.widget.impl.data.network.PaymentWidgetService r6 = (com.revolut.feature.payments.air.widget.impl.data.network.PaymentWidgetService) r6
            r0.u = r5
            r0.f197424x = r3
            java.lang.Object r6 = r6.getPaymentWidget(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            com.revolut.feature.payments.air.widget.impl.model.PaymentWidget r6 = (com.revolut.feature.payments.air.widget.impl.model.PaymentWidget) r6
            java.lang.Object r0 = r4.f182900c
            lo9.b r0 = (lo9.b) r0
            com.revolut.feature.payments.air.widget.impl.model.PaymentWidget r5 = r0.a(r5)
            if (r5 == 0) goto L58
            long r0 = r6.f79075g
            long r2 = r5.f79075g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L58
            return r5
        L58:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kdh.b.E(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object J(gim.c r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kdh.b.J(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.revolut.core.ui_kit.models.CompositeClause M(java.lang.String r18, tof.a3 r19) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kdh.b.M(java.lang.String, tof.a3):com.revolut.core.ui_kit.models.CompositeClause");
    }

    public t O(String id10) {
        Intrinsics.checkNotNullParameter(id10, "deviceId");
        f fVar = (f) ((k86.a) this.f182899b);
        fVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        t tVarL = fVar.f182093a.signOutDevice(id10).l(new hc7.a(fVar, id10, 16));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return e.r(w.g0(tVarL), h0.f322473a);
    }

    public cc S(EsimCoverage selectedPlanCoverage, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(selectedPlanCoverage, "selectedPlanCoverage");
        return new cc(listId, new bv0.b(ynj.e.g((ynj.e) this.f182899b, selectedPlanCoverage), ynj.e.b(selectedPlanCoverage, null), pw5.a.k((EsimGetPlanScreenContract$InputData) this.f182900c), bv0.a.ACTIVE_SYSTEM_THEME), R$attr.uikit_dp0);
    }

    public Object V(y20.t params, z zVar) {
        u10.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Object objPerformSuspending = DBUtil.performSuspending((RoomDatabase) this.f182899b, false, true, new r10.b(this, new u10.g(params instanceof y20.q ? ((y20.q) params).f310535a : null, params instanceof s ? ((s) params).f310545b : null, params instanceof r ? ((r) params).f310540b : null, 1), 4), zVar);
        return objPerformSuspending == fim.a.COROUTINE_SUSPENDED ? objPerformSuspending : Unit.f186387a;
    }

    public t38.e W() {
        Object bVar;
        int i = 3;
        Continuation continuation = null;
        t38.e eVar = new t38.e(new go.g(Boolean.FALSE, 2), 24, new go.g(Boolean.TRUE, 2), new g0(3, 4, null));
        akg.b bVar2 = ((ekg.g) this.f182899b).f127161b;
        w4l.f fVar = ((akg.o) bVar2).f5954h;
        Unit unit = Unit.f186387a;
        v0b.b bVarH = ta6.a.h(eVar, new b1(rd0.e.b(fVar.f(unit, false)), 16), new b1(rd0.e.b(((akg.o) bVar2).i.f(unit, false)), 17), new ate.b(this, continuation, 12));
        List list = (List) this.f182900c;
        if (list.isEmpty()) {
            bVar = new go.g(f0.f322471a, 2);
        } else {
            List<ftb.b> list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (ftb.b bVar3 : list2) {
                arrayList.add(vkm.q.Q(rd0.e.e(bVar3.a(), h0.f322473a, new qtb.o(i, 0, continuation)), new r0(continuation, this, bVar3, 14)));
            }
            bVar = new j23.b((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), 16);
        }
        return new t38.e(bVarH, 24, bVar, new p24.q(i, 18, continuation));
    }

    @Override // zc.o
    public /* bridge */ /* synthetic */ Object a() {
        m mVar = (m) this.f182900c;
        return new k((rc.q) ((m) this.f182899b).a(), (rc.u) mVar.a());
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public Object mo3808a(ViewController viewController) {
        throw null;
    }

    public Flow a0(List refs, boolean z, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        a aVar = (a) this.f182899b;
        Intrinsics.checkNotNullParameter(refs, "refs");
        return boh.f.e(vkm.q.q(nim.a.v(rd0.e.b(ybl.b.c(aVar.f182897a)), new hg0.e(refs, z, 2))), new k79.b(this, loadingStrategy, 11));
    }

    @Override // retrofit2.CallAdapter
    public Object adapt(Call call) {
        Object j1Var;
        Intrinsics.checkNotNullParameter(call, "call");
        Object objAdapt = ((CallAdapter) this.f182899b).adapt(call);
        if (objAdapt instanceof efm.r) {
            objAdapt = ((efm.r) objAdapt).onErrorResumeNext(new m3l.d(22, new sz3.d(this, 0)));
        } else {
            if (objAdapt instanceof efm.d0) {
                j1Var = new ufm.i((efm.d0) objAdapt, new m3l.d(22, new sz3.d(this, 1)), 2);
            } else if (objAdapt instanceof efm.b) {
                j1Var = new pfm.a((efm.b) objAdapt, new c(new sz3.d(this, 2), 5), 2);
            } else if (objAdapt instanceof efm.k) {
                j1Var = new rfm.m((efm.k) objAdapt, new m3l.d(22, new sz3.d(this, 3)), 2);
            } else if (objAdapt instanceof efm.i) {
                j1Var = new j1((efm.i) objAdapt, new m3l.d(22, new sz3.d(this, 4)), 1);
            }
            objAdapt = j1Var;
        }
        Intrinsics.h(objAdapt);
        return objAdapt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // igm.o
    public Object apply(Object obj2) {
        CaptureStepDataBundle captureDataBundle = (CaptureStepDataBundle) obj2;
        Intrinsics.checkNotNullParameter(captureDataBundle, "captureDataBundle");
        nl.u uVar = (nl.u) this.f182899b;
        sl.n nVar = (sl.n) this.f182900c;
        if (uVar.f.isRefactoredCaptureEnabled()) {
            Observable observableK = new ogm.e(new nl.f(2, captureDataBundle, uVar, nVar), 2).k();
            Intrinsics.checkNotNullExpressionValue(observableK, "toObservable(...)");
            return observableK;
        }
        DocumentType documentType = captureDataBundle.getDocumentType();
        if (documentType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        DocSide docSide = captureDataBundle.getDocSide();
        if (docSide == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Observable observableJust = Observable.just(new nl.s(captureDataBundle.getDocumentFormat(), documentType, new NfcArguments(nVar.f264052c, null, 2, 0 == true ? 1 : 0), captureDataBundle.getCountryCode(), docSide));
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    @Override // ww1.a
    public String b(KeyPair key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String upperCase = ((com.revolut.feature.apm.core.impl.crypto.o) this.f182900c).b(key).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public xki.e mo3783build() {
        vc.s.h((ViewController) this.f182900c, ViewController.class);
        return new n86.c((n86.d) this.f182899b);
    }

    @Override // h2b.b
    public RowDelegate c() {
        return (RowDelegate) this.f182900c;
    }

    @Override // h2b.b
    public CellDetailsDelegate d() {
        return (CellDetailsDelegate) this.f182899b;
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        switch (this.f182898a) {
            case 13:
                return new e1((Navigator) ((Provider) this.f182899b).get(), (sl.f) ((Provider) this.f182900c).get());
            default:
                return new k7i.i((Context) ((il.a) this.f182899b).get(), (WorkflowConfig) ((f4h.a) this.f182900c).get());
        }
    }

    @Override // ww1.a
    public Object i(gim.c cVar) {
        return ((com.revolut.feature.apm.core.impl.crypto.o) this.f182899b).i(cVar);
    }

    public efm.r j0(boolean z, boolean z3) {
        return ((f) ((k86.a) this.f182899b)).d.f(new k86.e(z3), z);
    }

    public efm.r k(List groups, xi0.b bVar) {
        Object objX;
        Intrinsics.checkNotNullParameter(groups, "groups");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = groups.iterator();
        while (it8.hasNext()) {
            a0.x(((k1j.b) it8.next()).f180284c, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((BalanceWrapper) it9.next()).getF99406c());
        }
        if (bVar != null) {
            objX = efm.d0.m(bVar);
            Intrinsics.checkNotNullExpressionValue(objX, "just(...)");
        } else {
            objX = ((wsg.n) this.f182899b).x(AccountId.Personal.f51414a);
        }
        sfm.b bVar2 = new sfm.b(objX, new j0(new lul.d(arrayList2, this, 16), 20), 2);
        Intrinsics.checkNotNullExpressionValue(bVar2, "flatMapObservable(...)");
        efm.r map = e.H(zi0.c.q(bVar2, f0.f322471a), h0.f322473a, new m2g.c(16)).map(new j0(new c9h.a(bVar, groups, 5), 19));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k0(boolean r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ql1.b
            if (r0 == 0) goto L13
            r0 = r7
            ql1.b r0 = (ql1.b) r0
            int r1 = r0.f247036x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f247036x = r1
            goto L18
        L13:
            ql1.b r0 = new ql1.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f247036x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r6 = r0.u
            yhm.o.b(r7)
            goto L51
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f247036x = r4
            mt8.b r7 = new mt8.b
            r2 = 0
            r4 = 6
            r7.<init>(r5, r6, r2, r4)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r2, r7, r0)
            if (r7 != r1) goto L51
            goto L65
        L51:
            rl1.c r7 = (rl1.c) r7
            java.lang.Object r2 = r5.f182899b
            fx1.a r2 = (fx1.a) r2
            com.revolut.feature.apm.core.api.product.ApmAani r4 = com.revolut.feature.apm.core.api.product.ApmAani.f61807c
            r0.u = r6
            r0.f247036x = r3
            iz1.h r2 = (iz1.h) r2
            java.lang.Object r6 = r2.d(r4, r7, r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kdh.b.k0(boolean, gim.c):java.lang.Object");
    }

    public lyd.i m0(String str, lyd.k requirement) {
        lyd.i iVar;
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-statements-api-navigation-DocumentsHubProduct$-product$0");
        Intrinsics.checkNotNullParameter(requirement, "requirement");
        phm.a aVar = (phm.a) ((Map) this.f182899b).get(str);
        if (aVar != null && (iVar = (lyd.i) aVar.get()) != null) {
            return iVar;
        }
        if (requirement != lyd.k.PERIOD_RANGE) {
            requirement = null;
        }
        if (requirement != null) {
            return (lyd.s) this.f182900c;
        }
        return null;
    }

    @Override // ulm.p
    public void onFailure(okhttp3.Call call, IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        h.d((h) this.f182899b, e, null, 6);
    }

    @Override // ulm.p
    public void onResponse(okhttp3.Call call, Response response) {
        s0 source;
        q0 q0VarG;
        int iIntValue;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            mmm.r0 r0VarA = ((h) this.f182899b).a(response);
            kmm.i iVar = j.Companion;
            u0 responseHeaders = response.f;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z6 = false;
            Integer numM = null;
            Integer numM2 = null;
            while (i2 < size) {
                boolean z11 = true;
                if (ue8.c.l(responseHeaders, i2).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                    String strQ = ue8.c.q(responseHeaders, i2);
                    int i3 = i;
                    while (i3 < strQ.length()) {
                        int i5 = size;
                        int iL = vlm.h.l(strQ, CoreConstants.COMMA_CHAR, i3, i, 4);
                        int iK = vlm.h.k(strQ, ';', i3, iL);
                        String strA = vlm.h.A(i3, iK, strQ);
                        int i6 = iK + 1;
                        u0 u0Var = responseHeaders;
                        if (kotlin.text.a0.z(strA, "permessage-deflate", z11)) {
                            if (z) {
                                z6 = true;
                            }
                            i3 = i6;
                            while (i3 < iL) {
                                int iK2 = vlm.h.k(strQ, ';', i3, iL);
                                int iK3 = vlm.h.k(strQ, '=', i3, iK2);
                                String strA2 = vlm.h.A(i3, iK3, strQ);
                                String strH0 = iK3 < iK2 ? kotlin.text.d0.h0(vlm.h.A(iK3 + 1, iK2, strQ)) : null;
                                int i21 = iK2 + 1;
                                if (kotlin.text.a0.z(strA2, "client_max_window_bits", true)) {
                                    if (numM != null) {
                                        z6 = true;
                                    }
                                    numM = strH0 != null ? kotlin.text.z.m(strH0) : null;
                                    if (numM == null) {
                                        i3 = i21;
                                        z6 = true;
                                    } else {
                                        i3 = i21;
                                    }
                                } else if (kotlin.text.a0.z(strA2, "client_no_context_takeover", true)) {
                                    z6 = strH0 != null ? true : z3 ? true : z6;
                                    i3 = i21;
                                    z3 = true;
                                } else if (kotlin.text.a0.z(strA2, "server_max_window_bits", true)) {
                                    if (numM2 != null) {
                                        z6 = true;
                                    }
                                    numM2 = strH0 != null ? kotlin.text.z.m(strH0) : null;
                                    if (numM2 == null) {
                                        i3 = i21;
                                        z6 = true;
                                    } else {
                                        i3 = i21;
                                    }
                                } else if (kotlin.text.a0.z(strA2, "server_no_context_takeover", true)) {
                                    if (z4) {
                                        z6 = true;
                                    }
                                    if (strH0 != null) {
                                        z6 = true;
                                    }
                                    i3 = i21;
                                    z4 = true;
                                } else {
                                    i3 = i21;
                                    z6 = true;
                                }
                            }
                            z = true;
                            z11 = true;
                        } else {
                            z11 = true;
                            i3 = i6;
                            z6 = true;
                        }
                        size = i5;
                        responseHeaders = u0Var;
                        i = 0;
                    }
                }
                i2++;
                size = size;
                responseHeaders = responseHeaders;
                i = 0;
            }
            int i22 = 1;
            ((h) this.f182899b).e = new j(z, numM, z3, numM2, z4, z6);
            if (z6 || numM != null || (numM2 != null && (8 > (iIntValue = numM2.intValue()) || iIntValue >= 16))) {
                h hVar = (h) this.f182899b;
                synchronized (hVar) {
                    hVar.f185930q.clear();
                    hVar.b(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            String name = vlm.j.f290513b + " WebSocket " + ((ulm.j1) this.f182900c).f281095a.i();
            h hVar2 = (h) this.f182899b;
            Intrinsics.checkNotNullParameter(r0VarA, "<this>");
            v60.g socket = new v60.g(r0VarA);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(socket, "socket");
            j jVar = hVar2.e;
            Intrinsics.h(jVar);
            synchronized (hVar2) {
                try {
                    hVar2.f185928n = name;
                    hVar2.o = socket;
                    hVar2.f185926l = new kmm.n((k0) socket.d, hVar2.f185922c, jVar.f185936a, jVar.f185938c, hVar2.f);
                    hVar2.f185925j = new kmm.g(hVar2);
                    long j2 = hVar2.d;
                    if (j2 != 0) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
                        xlm.b bVar = hVar2.f185927m;
                        String name2 = name + " ping";
                        b3.b block = new b3.b(hVar2, nanos, i22);
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(name2, "name");
                        Intrinsics.checkNotNullParameter(block, "block");
                        bVar.d(new kmm.g(name2, block), nanos);
                    }
                    if (!hVar2.f185930q.isEmpty()) {
                        hVar2.f();
                    }
                    Unit unit = Unit.f186387a;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            hVar2.k = new kmm.m((l0) socket.f286252c, hVar2, jVar.f185936a, jVar.e);
            h hVar3 = (h) this.f182899b;
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                hVar3.f185921b.e(hVar3, response);
                while (hVar3.f185933t == -1) {
                    kmm.m mVar = hVar3.k;
                    Intrinsics.h(mVar);
                    mVar.d();
                }
            } catch (Exception e) {
                h.d(hVar3, e, null, 6);
            } finally {
                hVar3.e();
            }
        } catch (IOException e2) {
            h.d((h) this.f182899b, e2, response, 4);
            vlm.h.f(response);
            mmm.r0 r0Var = response.f226091h;
            if (r0Var != null && (q0VarG = r0Var.g()) != null) {
                vlm.h.f(q0VarG);
            }
            mmm.r0 r0Var2 = response.f226091h;
            if (r0Var2 == null || (source = r0Var2.getSource()) == null) {
                return;
            }
            vlm.h.f(source);
        }
    }

    public xv.h q(Set validators, xv.d framesProvider, LifecycleOwner lifecycleOwner, MsBarcodeDetectorSettings msBarcodeDetectorSettings) {
        Intrinsics.checkNotNullParameter(validators, "validators");
        Intrinsics.checkNotNullParameter(framesProvider, "framesProvider");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(msBarcodeDetectorSettings, "msBarcodeDetectorSettings");
        od0.a aVar = od0.a.f224253a;
        return od0.a.i() ? new nx.b(new b0(framesProvider), new eki.e(1, 5, LifecycleOwnerKt.class, lifecycleOwner, "lifecycleScope", "getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;")) : new mx.b(validators, new b0(framesProvider), LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), (ex.b) this.f182899b, (bi0.f) this.f182900c, msBarcodeDetectorSettings);
    }

    public Throwable r0(Throwable th10) {
        return ((py3.b) this.f182900c).a(th10) ? new CreditApplicationException(th10) : th10;
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        Type typeResponseType = ((CallAdapter) this.f182899b).responseType();
        Intrinsics.checkNotNullExpressionValue(typeResponseType, "responseType(...)");
        return typeResponseType;
    }

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f182898a = i;
        this.f182899b = obj2;
        this.f182900c = obj3;
    }

    public b(ImmutableMap providers, lyd.s staticContentProvider) {
        this.f182898a = 5;
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(staticContentProvider, "staticContentProvider");
        this.f182899b = providers;
        this.f182900c = staticContentProvider;
    }

    public b(c90.c uiResources) {
        this.f182898a = 16;
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f182899b = uiResources;
        this.f182900c = w.y0(new os2.a(this, 4));
    }

    public b(ru9.b commonBubbleElementsMapper, ru9.h0 transactionBubbleTextStyleMapper, ru9.f0 transactionBubbleSubtitleAccountMapper, ru9.k0 transferTransactionAmountExtractor) {
        this.f182898a = 25;
        Intrinsics.checkNotNullParameter(commonBubbleElementsMapper, "commonBubbleElementsMapper");
        Intrinsics.checkNotNullParameter(transactionBubbleTextStyleMapper, "transactionBubbleTextStyleMapper");
        Intrinsics.checkNotNullParameter(transactionBubbleSubtitleAccountMapper, "transactionBubbleSubtitleAccountMapper");
        Intrinsics.checkNotNullParameter(transferTransactionAmountExtractor, "transferTransactionAmountExtractor");
        this.f182899b = transactionBubbleSubtitleAccountMapper;
        this.f182900c = transferTransactionAmountExtractor;
    }

    public b(PaymentWidgetService service, lo9.b paymentWidgetCache) {
        this.f182898a = 4;
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(paymentWidgetCache, "paymentWidgetCache");
        this.f182899b = service;
        this.f182900c = paymentWidgetCache;
    }

    public b(i4b.f legalEntityContextProvider, by5.a mapper) {
        this.f182898a = 2;
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f182899b = legalEntityContextProvider;
        this.f182900c = mapper;
    }

    public b(nv9.b repository, ang.f userInteractor, iv9.k chatMessageMapper) {
        this.f182898a = 14;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(chatMessageMapper, "chatMessageMapper");
        this.f182899b = repository;
        this.f182900c = userInteractor;
    }

    public b(fx1.a apmOnboardingRepository, pl1.a aaniKeyProvider) {
        this.f182898a = 21;
        Intrinsics.checkNotNullParameter(apmOnboardingRepository, "apmOnboardingRepository");
        Intrinsics.checkNotNullParameter(aaniKeyProvider, "aaniKeyProvider");
        this.f182899b = apmOnboardingRepository;
        this.f182900c = aaniKeyProvider;
    }

    public b(k86.a repository, mli.e userLogoutInteractor) {
        this.f182898a = 15;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        this.f182899b = repository;
        this.f182900c = userLogoutInteractor;
    }

    public b(ynj.e commonUiBuilder, EsimGetPlanScreenContract$InputData inputData) {
        this.f182898a = 11;
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f182899b = commonUiBuilder;
        this.f182900c = inputData;
    }

    public b(int i) {
        this.f182898a = i;
        switch (i) {
            case 27:
                break;
            default:
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Intrinsics.checkNotNullExpressionValue(executor, "newSingleThreadExecutor()");
                Intrinsics.checkNotNullParameter(executor, "executor");
                this.f182899b = executor;
                this.f182900c = new LinkedList();
                break;
        }
    }

    public b(yof.d transferAmountMapper, c8k.a amountHintMapperV2) {
        this.f182898a = 20;
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(amountHintMapperV2, "amountHintMapperV2");
        this.f182899b = transferAmountMapper;
        this.f182900c = amountHintMapperV2;
    }

    public b(ex.b imageFormatConverter, bi0.f msBarcodeDetectorFactory) {
        this.f182898a = 9;
        Intrinsics.checkNotNullParameter(imageFormatConverter, "imageFormatConverter");
        Intrinsics.checkNotNullParameter(msBarcodeDetectorFactory, "msBarcodeDetectorFactory");
        this.f182899b = imageFormatConverter;
        this.f182900c = msBarcodeDetectorFactory;
    }

    public b(ekg.g uiPersonalisationInteractor, o0 bottomBarHideableFunctionalityEnabledProvider, hwl.c uiTogglesProvider, List customisableTabProviders) {
        this.f182898a = 22;
        ftb.e playTabPreferencesInteractorWrapper = ftb.e.f138011a;
        Intrinsics.checkNotNullParameter(playTabPreferencesInteractorWrapper, "playTabPreferencesInteractorWrapper");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(bottomBarHideableFunctionalityEnabledProvider, "bottomBarHideableFunctionalityEnabledProvider");
        Intrinsics.checkNotNullParameter(uiTogglesProvider, "uiTogglesProvider");
        Intrinsics.checkNotNullParameter(customisableTabProviders, "customisableTabProviders");
        this.f182899b = uiPersonalisationInteractor;
        this.f182900c = customisableTabProviders;
    }

    public b(wo1.b billsInteractor, xua.a recurringPaymentsInteractor) {
        this.f182898a = 18;
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentsInteractor, "recurringPaymentsInteractor");
        this.f182899b = billsInteractor;
        this.f182900c = recurringPaymentsInteractor;
    }

    public b(ppk.f ratesInteractor, wsg.n walletInteractor) {
        this.f182898a = 6;
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f182899b = walletInteractor;
        this.f182900c = ratesInteractor;
    }

    public b(com.revolut.feature.apm.core.impl.crypto.o oVar) {
        this.f182898a = 19;
        this.f182900c = oVar;
        this.f182899b = oVar;
    }

    public b(a accountTypeFetcher, ybl.q wealthInstrumentStateDetailsInteractor) {
        this.f182898a = 0;
        Intrinsics.checkNotNullParameter(accountTypeFetcher, "accountTypeFetcher");
        Intrinsics.checkNotNullParameter(wealthInstrumentStateDetailsInteractor, "wealthInstrumentStateDetailsInteractor");
        this.f182899b = accountTypeFetcher;
        this.f182900c = wealthInstrumentStateDetailsInteractor;
    }

    public b(ChatDatabase chatDatabase) {
        this.f182898a = 23;
        this.f182899b = chatDatabase;
        this.f182900c = new ofg.i(this, 16);
    }

    public b(CallAdapter delegate, py3.b creditApplicationErrorHandlerChecker) {
        this.f182898a = 29;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(creditApplicationErrorHandlerChecker, "creditApplicationErrorHandlerChecker");
        this.f182899b = delegate;
        this.f182900c = creditApplicationErrorHandlerChecker;
    }

    public b(he2.b bVar, hsh.h hVar, ks0.n nVar) {
        this.f182898a = 17;
        this.f182899b = bVar;
        this.f182900c = nVar;
    }

    public b(InvestSettingsScreen investSettingsScreen) {
        this.f182898a = 8;
        this.f182899b = investSettingsScreen.f89893b0;
        this.f182900c = investSettingsScreen.Z;
    }

    public b(ryc.b bVar, ryc.c cVar) {
        this.f182898a = 26;
        this.f182899b = cVar;
        this.f182900c = e4m.b.b(new r6e.m(bVar, this, 14));
    }
}
