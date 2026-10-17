package com.revolut.feature.salary_switch.impl.ui.brazil.screen.salary_requests;

import aqc.j;
import cli.g;
import cli.y;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mqc.r;
import mra.d;
import oki.h;
import yji.l;
import zfd.s;
import zqc.f;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements zqc.h {
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zqc.a f85296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f85297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85298r;

    public a(zqc.j stateMapper, j interactor, zqc.a navigationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        SalaryRequestsScreenContract$InputData inputData = SalaryRequestsScreenContract$InputData.f85294a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        this.o = interactor;
        this.f85296p = navigationProvider;
        this.f85297q = d.b(this, new f(0), stateMapper, null, false, 12);
        this.f85298r = e.a(this, new zo2.h(this, 6));
    }

    @Override // yji.l
    public final void I1() {
        j jVar = this.o;
        jVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVar = jVar.f8318a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, rVar.d.b(Unit.f186387a, loadingStrategy), null, null, new s(this, (Continuation) null, 25), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85298r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f85297q;
    }
}
