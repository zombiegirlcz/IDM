package com.revolut.feature.salary_switch.impl.ui.brazil.screen.status;

import aqc.j;
import bhi.c;
import bi2.n;
import brc.d;
import brc.l;
import brc.q;
import brc.s;
import brc.w;
import cli.g;
import cli.y;
import hx7.e;
import jhi.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mqc.r;
import oki.h;
import org.jetbrains.annotations.NotNull;
import w4l.i;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements q {

    @NotNull
    public static final s Companion = new s();
    public final aqc.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SalaryStatusScreenContract$InputData f85303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f85304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f85305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f85306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85307t;

    public a(aqc.a disputeInteractor, SalaryStatusScreenContract$InputData inputData, d modalsProvider, j salarySwitchInteractor, w stateMapper) {
        Intrinsics.checkNotNullParameter(disputeInteractor, "disputeInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(modalsProvider, "modalsProvider");
        Intrinsics.checkNotNullParameter(salarySwitchInteractor, "salarySwitchInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = disputeInteractor;
        this.f85303p = inputData;
        this.f85304q = modalsProvider;
        this.f85305r = salarySwitchInteractor;
        this.f85306s = mra.d.b(this, new l(0), stateMapper, null, false, 12);
        this.f85307t = e.a(this, new c(this, 19));
    }

    @Override // yji.l
    public final void I1() {
        String payrollSwitchId = this.f85303p.f85299a;
        j jVar = this.f85305r;
        jVar.getClass();
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(payrollSwitchId, "id");
        r rVar = jVar.f8318a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(payrollSwitchId, "id");
        vkm.d dVarB = rVar.f207972c.b(payrollSwitchId, loadingStrategy);
        aqc.a aVar = this.o;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(payrollSwitchId, "payrollSwitchId");
        mqc.e eVar = aVar.f8307a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(payrollSwitchId, "payrollSwitchId");
        int i = 2;
        Continuation continuation = null;
        k kVarU = nim.a.u(new a2c.c(i, 7, continuation), nim.a.y(rd0.e.n(eVar.d.b(payrollSwitchId, loadingStrategy), h0.f322473a), new aqb.s(5)));
        w4l.h loadingStrategy2 = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
        rVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
        yji.l.a1(this, nim.a.u(new a2c.c(i, 17, continuation), u0.i(dVarB, kVarU, rVar.d.b(Unit.f186387a, loadingStrategy2))), null, null, new n(this, continuation, 23), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85307t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f85306s;
    }
}
