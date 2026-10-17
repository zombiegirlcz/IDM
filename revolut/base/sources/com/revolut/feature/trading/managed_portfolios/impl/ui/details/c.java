package com.revolut.feature.trading.managed_portfolios.impl.ui.details;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import h7f.f;
import hwi.l0;
import i6f.a0;
import i6f.f0;
import i6f.g0;
import i6f.i0;
import i6f.p0;
import i6f.q0;
import i6f.s;
import i6f.t;
import i6j.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o6f.m;
import oki.h;
import r40.y0;
import r6f.d;
import t6f.g;
import t6f.o;
import vkm.q;
import w4l.i;
import x5f.e;
import x5f.k;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends h implements s {
    public final ManagedPortfolioDetailsControllerContract$InputData A;
    public final e B;
    public final k C;
    public final x5f.c D;
    public final f E;
    public final qmc.h F;
    public final zjh.f G;
    public final emc.e H;
    public final y I;
    public final com.revolut.kompot.navigable.vc.modal.a J;
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f91299p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v6f.d f91300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o6f.b f91301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j6f.b f91302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g7f.h f91303t;
    public final b7f.h u;
    public final e7f.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i7f.a f91304w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a7f.k f91305x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final mkd.d f91306y;
    public final d1h.e z;

    public c(g infoExtensionApi, d feesExtensionApi, v6f.d investmentsExtensionApi, o6f.b chartModelExtension, j6f.b portfolioAllocationExtension, g7f.h referenceExtension, b7f.h performanceExtension, e7f.k performanceSummaryExtension, i7f.a transactionsExtension, a7f.k ordersExtension, mkd.d slotManagerFeedExtension, d1h.e disclaimersModelExtension, ManagedPortfolioDetailsControllerContract$InputData inputData, e managedPortfolioHeaderInteractor, k referenceInteractor, x5f.c statusInteractor, f statusDialogProvider, qmc.h portfolioInfoProvider, zjh.f portfolioInteractor, emc.e templatesInteractor, q0 stateMapper) {
        Intrinsics.checkNotNullParameter(infoExtensionApi, "infoExtensionApi");
        Intrinsics.checkNotNullParameter(feesExtensionApi, "feesExtensionApi");
        Intrinsics.checkNotNullParameter(investmentsExtensionApi, "investmentsExtensionApi");
        Intrinsics.checkNotNullParameter(chartModelExtension, "chartModelExtension");
        Intrinsics.checkNotNullParameter(portfolioAllocationExtension, "portfolioAllocationExtension");
        Intrinsics.checkNotNullParameter(referenceExtension, "referenceExtension");
        Intrinsics.checkNotNullParameter(performanceExtension, "performanceExtension");
        Intrinsics.checkNotNullParameter(performanceSummaryExtension, "performanceSummaryExtension");
        Intrinsics.checkNotNullParameter(transactionsExtension, "transactionsExtension");
        Intrinsics.checkNotNullParameter(ordersExtension, "ordersExtension");
        Intrinsics.checkNotNullParameter(slotManagerFeedExtension, "slotManagerFeedExtension");
        Intrinsics.checkNotNullParameter(disclaimersModelExtension, "disclaimersModelExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(managedPortfolioHeaderInteractor, "managedPortfolioHeaderInteractor");
        Intrinsics.checkNotNullParameter(referenceInteractor, "referenceInteractor");
        Intrinsics.checkNotNullParameter(statusInteractor, "statusInteractor");
        Intrinsics.checkNotNullParameter(statusDialogProvider, "statusDialogProvider");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = infoExtensionApi;
        this.f91299p = feesExtensionApi;
        this.f91300q = investmentsExtensionApi;
        this.f91301r = chartModelExtension;
        this.f91302s = portfolioAllocationExtension;
        this.f91303t = referenceExtension;
        this.u = performanceExtension;
        this.v = performanceSummaryExtension;
        this.f91304w = transactionsExtension;
        this.f91305x = ordersExtension;
        this.f91306y = slotManagerFeedExtension;
        this.z = disclaimersModelExtension;
        this.A = inputData;
        this.B = managedPortfolioHeaderInteractor;
        this.C = referenceInteractor;
        this.D = statusInteractor;
        this.E = statusDialogProvider;
        this.F = portfolioInfoProvider;
        this.G = portfolioInteractor;
        this.H = templatesInteractor;
        this.I = mra.d.b(this, new t(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new t6f.h((Data) null, 3), new r6f.e(0), new v6f.e(0), new o6f.a(null, null, false, 63), new j6f.a(0), new g7f.c(0), new b7f.c(0), new e7f.e(null, null, null, null), new Data(null, null, false, 7, null), new i7f.b(null), new a7f.c(null, null), null, y6f.c.PERFORMANCE, a0.f158910a, new d1h.g(new Data(null, null, false, 7, null)), null), stateMapper, null, false, 12);
        this.J = hx7.e.a(this, new f0(this, 0));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.J;
    }

    @Override // yji.l
    public final void T1(long j2) {
        ManagedPortfolioDetailsControllerContract$InputData managedPortfolioDetailsControllerContract$InputData = this.A;
        String str = managedPortfolioDetailsControllerContract$InputData.f91277a;
        i iVar = i.f294643c;
        qmc.h hVar = this.F;
        Continuation continuation = null;
        l.b1(this, hVar.e(str, iVar), null, new i0(this, continuation, 7), 3);
        String templateId = managedPortfolioDetailsControllerContract$InputData.f91277a;
        e eVar = this.B;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        qmc.h hVar2 = eVar.f302954a;
        w4l.h hVar3 = w4l.h.f294642c;
        l.b1(this, q.q(xam.a.h(new wo2.l(eVar, templateId, continuation, 2), hVar2.e(templateId, hVar3))), null, new i0(this, continuation, 9), 3);
        l.b1(this, ((o) this.o).f268342r.B(new t3b.g(27)), null, new i0(this, continuation, 10), 3);
        l.b1(this, ((r6f.l) this.f91299p).f251837p.B(new y0(23)), null, new i0(this, continuation, 11), 3);
        l.b1(this, ((m) this.f91301r).f222593q.B(new o69.b(6)), null, new i0(this, continuation, 12), 3);
        j6f.t tVar = (j6f.t) this.f91302s;
        l.b1(this, tVar.f171764t.B(new j3f.d(22)), null, new i0(this, continuation, 13), 3);
        l.b1(this, tVar.f171762r, null, new p0(this, null), 3);
        l.b1(this, tVar.f171763s, null, new l0(this, continuation, 19), 3);
        l.b1(this, ((v6f.l) this.f91300q).f286384p.B(new v6e.d(3)), null, new i0(this, continuation, 14), 3);
        l.b1(this, this.f91303t.o.B(new g64.c(11)), null, new i0(this, continuation, 1), 3);
        l.b1(this, this.u.o.B(new b73.h(9)), null, new i0(this, continuation, 2), 3);
        l.b1(this, this.v.f123332s.B(new e4k.f(22)), null, new i0(this, continuation, 3), 3);
        x5f.c cVar = this.D;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        l.b1(this, q.q(q.Q(cVar.f302949a.e(templateId, hVar3), new x18.e(continuation, cVar, 2))), null, new i0(this, continuation, 4), 3);
        l.b1(this, ((i7f.g) this.f91304w).f159288q.B(new p(6)), null, new i0(this, continuation, 5), 3);
        l.b1(this, this.f91305x.f1872r.B(new a5g.h(17)), null, new i0(this, continuation, 6), 3);
        l.b1(this, q.q(new t38.e(this.I.B(new i4h.q(23)), 24, mo3.a.g(nim.a.v(this.H.a(templateId), new i4h.q(24)), null, null, 3), new hwi.b(3, 9, continuation))), null, new hp4.e(2, this.C, k.class, "setActiveReferenceType", "setActiveReferenceType(Lcom/revolut/feature/trading/managed_portfolios/impl/domain/interactors/ManagedPortfolioReferenceInteractor$ReferenceType;)V", 4, 9), 3);
        l.b1(this, ((gah.e) this.z).Z2(u.c(rdh.b.STRATEGIES_RISK_WARNING)), null, new i0(this, continuation, 8), 3);
        mkd.a aVar = new mkd.a(new SlotContext(akd.s.INVEST_ROBO_DETAILS));
        gld.f0 f0Var = (gld.f0) this.f91306y;
        f0Var.c3(aVar);
        l.b1(this, f0Var.f144638l.h(), null, new i0(this, continuation, 15), 3);
        int i = 0;
        l.b1(this, boh.f.e(hVar.e(templateId, hVar3), new g0(this, i)), null, new i0(this, continuation, i), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.I;
    }
}
