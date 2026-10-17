package com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub;

import a35.j;
import a82.q;
import au6.d3;
import au6.k3;
import au6.m3;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import et6.l0;
import g37.k;
import g37.o;
import g37.r;
import g37.v;
import go.g;
import hr6.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import tof.a3;
import vkm.j2;
import zh9.u0;
import zhm.h0;
import zjh.i;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements r {
    public final i37.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gr6.e f74290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f74291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r10.d f74292r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a61.a f74293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f74294t;
    public final whf.b u;
    public final ang.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f74295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f74296x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f74297y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public e(i37.c dialogFactory, gr6.e freelancerAvailabilityInteractor, l freelancerCommandFactory, r10.d taxHubCalendarEventsInteractor, a61.a taxHubConfigurationInteractor, i taxPocketsInteractor, whf.b transactionContentProvider, ang.f userInteractor, f stateMapper) {
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(taxHubCalendarEventsInteractor, "taxHubCalendarEventsInteractor");
        Intrinsics.checkNotNullParameter(taxHubConfigurationInteractor, "taxHubConfigurationInteractor");
        Intrinsics.checkNotNullParameter(taxPocketsInteractor, "taxPocketsInteractor");
        Intrinsics.checkNotNullParameter(transactionContentProvider, "transactionContentProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = dialogFactory;
        this.f74290p = freelancerAvailabilityInteractor;
        this.f74291q = freelancerCommandFactory;
        this.f74292r = taxHubCalendarEventsInteractor;
        this.f74293s = taxHubConfigurationInteractor;
        this.f74294t = taxPocketsInteractor;
        this.u = transactionContentProvider;
        this.v = userInteractor;
        this.f74295w = new vii.b();
        this.f74296x = new vii.b();
        this.f74297y = mra.d.b(this, new a(0), stateMapper, null, false, 12);
        this.z = hx7.e.a(this, new fv1.a(this, 22));
    }

    @Override // yji.l
    public final void I1() {
        vkm.y yVar = new vkm.y(new j(2, 7, null), rd0.e.e(new a35.d(((k3) ((d3) this.f74293s.f1531b)).f9561c.C0("freelancer:taxConfiguration:resolvedTaxPocketBanner", k3.f9558g), 20), h0.f322473a, new q(3, 4, null)));
        i iVar = this.f74294t;
        iVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        m3 m3Var = (m3) iVar.f322838b;
        m3Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, new a87.b(mo3.a.g(u0.m(yVar, m3Var.d.b(Unit.f186387a, loadingStrategy)), null, new g0c.h(28), 1), 29), null, null, new b(this, null), 3);
        yji.l.a1(this, vkm.q.Q(this.f74296x, new v(1, this, null)), null, null, new c(this, null), 3);
    }

    public final void I2() {
        k kVar;
        ds6.k kVar2;
        Data data = (Data) ((a) ((j2) this.f74297y.f22677a).getValue()).f74286b.f224257a;
        if (data == null || (kVar = (k) data.getContent()) == null || (kVar2 = kVar.f140218b) == null) {
            return;
        }
        C2(new o(kVar2.d));
    }

    public final void J2(Object obj2) {
        if (obj2 instanceof a3) {
            C1(u0.c(new TransactionsFeatureConfig.Details(ofm.q.P((a3) obj2), null, null, null, 126)));
        } else if (obj2 instanceof ds6.j) {
            I2();
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow gVar;
        Continuation continuation = null;
        if (((l0) this.f74290p).k()) {
            gVar = vkm.q.Q(this.f74295w, new v(0, this, continuation));
        } else {
            od0.i.Companion.getClass();
            gVar = new g(od0.i.f224256b, 2);
        }
        yji.l.b1(this, gVar, null, new d(this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f74297y;
    }
}
