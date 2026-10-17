package kl;

import b9.w2;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.workflow.internal.workflow.WorkflowHttpExceptionMapper;
import com.onfido.android.sdk.workflow.internal.workflow.WorkflowHttpExceptionMapper_Factory;
import com.onfido.javax.inject.Provider;
import com.onfido.workflow.WorkflowConfig;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes17.dex */
public final class d2 implements el.b, xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f185162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f185163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f185164c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f185165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f185166h;
    public Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f185167j;
    public Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f185168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f185169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f185170n;
    public Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f185171p;

    public d2(w2 w2Var, il.g gVar, g2e.t tVar, jx0.a aVar, hd.r rVar, jul.o oVar, a5h.g gVar2, lal.a aVar2, w2 w2Var2, jid.z zVar, kdh.b bVar, k18.c cVar, il.b bVar2, WorkflowHttpExceptionMapper_Factory workflowHttpExceptionMapper_Factory, Provider provider, f4h.a aVar3) {
        this.f185162a = w2Var;
        this.f185163b = gVar;
        this.f185164c = tVar;
        this.d = aVar;
        this.e = rVar;
        this.f = oVar;
        this.f185165g = gVar2;
        this.f185166h = aVar2;
        this.i = w2Var2;
        this.f185167j = zVar;
        this.k = bVar;
        this.f185168l = cVar;
        this.f185169m = bVar2;
        this.f185170n = workflowHttpExceptionMapper_Factory;
        this.o = provider;
        this.f185171p = aVar3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public Object mo3808a(ViewController viewController) {
        throw null;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public xki.e mo3783build() {
        vc.s.h((ViewController) this.f185163b, ViewController.class);
        vc.s.h((CashBalanceControllerContract$InputData) this.f185164c, CashBalanceControllerContract$InputData.class);
        vc.s.h((dtl.d) this.d, dtl.d.class);
        vc.s.h((fsl.o) this.e, fsl.o.class);
        vc.s.h((h1h.f) this.f, h1h.f.class);
        vc.s.h((zgh.d) this.f185165g, zgh.d.class);
        vc.s.h((y5h.d) this.f185166h, y5h.d.class);
        vc.s.h((zjh.f) this.i, zjh.f.class);
        vc.s.h((zjh.c) this.f185167j, zjh.c.class);
        vc.s.h((zjh.i) this.k, zjh.i.class);
        vc.s.h((d1h.j) this.f185168l, d1h.j.class);
        vc.s.h((u5h.d) this.f185169m, u5h.d.class);
        vc.s.h((zjh.j) this.f185170n, zjh.j.class);
        vc.s.h((w5h.d) this.o, w5h.d.class);
        vc.s.h((i7d.i) this.f185171p, i7d.i.class);
        return new mkh.a((mkh.s) this.f185162a, (ViewController) this.f185163b, (CashBalanceControllerContract$InputData) this.f185164c, (dtl.d) this.d, (fsl.o) this.e, (h1h.f) this.f, (zgh.d) this.f185165g, (y5h.d) this.f185166h, (zjh.f) this.i, (zjh.c) this.f185167j, (zjh.i) this.k, (d1h.j) this.f185168l, (u5h.d) this.f185169m, (zjh.j) this.f185170n, (w5h.d) this.o, (i7d.i) this.f185171p);
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        return new c2((sl.j) ((w2) this.f185162a).get(), (SchedulersProvider) ((il.g) this.f185163b).get(), (Navigator) ((Provider) this.f185164c).get(), (nl.e) ((Provider) this.d).get(), (nl.c0) ((Provider) this.e).get(), (nl.g0) ((Provider) this.f).get(), (ol.l) ((Provider) this.f185165g).get(), (ol.p) ((Provider) this.f185166h).get(), (nl.u) ((Provider) this.i).get(), (nl.g1) ((Provider) this.f185167j).get(), (nl.e1) ((Provider) this.k).get(), (nl.v0) ((Provider) this.f185168l).get(), (FlowTracker) ((Provider) this.f185169m).get(), (WorkflowHttpExceptionMapper) ((Provider) this.f185170n).get(), (hl.a) ((Provider) this.o).get(), (WorkflowConfig) ((f4h.a) this.f185171p).get());
    }

    public d2(mkh.s sVar) {
        this.f185162a = sVar;
    }
}
