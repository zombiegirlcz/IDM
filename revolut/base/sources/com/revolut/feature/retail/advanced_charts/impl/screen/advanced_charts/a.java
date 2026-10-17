package com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts;

import cli.y;
import hx7.e;
import i0b.c;
import i0b.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;
import y07.m;
import y0b.f;
import y0b.g;
import y0b.p;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements y0b.h {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f82078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0b.d f82079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j0b.a f82080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f82081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f82082t;

    public a(c controllerProvider, d interactor, g0b.d advancedChartControllerModelExtension, j0b.a tradeControllerModelExtension, p mapper, g inputData) {
        Intrinsics.checkNotNullParameter(controllerProvider, "controllerProvider");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(advancedChartControllerModelExtension, "advancedChartControllerModelExtension");
        Intrinsics.checkNotNullParameter(tradeControllerModelExtension, "tradeControllerModelExtension");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = controllerProvider;
        this.f82078p = interactor;
        this.f82079q = advancedChartControllerModelExtension;
        this.f82080r = tradeControllerModelExtension;
        this.f82081s = mra.d.b(this, new f(interactor.b(inputData.f310179c), inputData.f310177a, null, (g0b.c) ((j2) ((x0b.g) advancedChartControllerModelExtension).f301555s.f22677a).getValue(), false), mapper, null, false, 12);
        this.f82082t = e.a(this, new xwd.a(this, 9));
    }

    @Override // yji.l
    public final void I1() {
        g0b.d dVar = this.f82079q;
        Continuation continuation = null;
        l.a1(this, ((x0b.g) dVar).f301555s.B(new m(2)), null, null, new y0b.m(this, continuation, 1), 3);
        m mVar = new m(5);
        y yVar = this.f82081s;
        l.a1(this, yVar.B(mVar), null, null, new y0b.m(this, continuation, 4), 3);
        j0b.a aVar = this.f82080r;
        l.a1(this, aVar.b3(), null, null, new y0b.m(this, continuation, 2), 3);
        int i = 3;
        l.a1(this, yVar.B(new m(i)), null, null, new y0b.m(this, continuation, i), 3);
        l.a1(this, aVar.Z2(), null, null, new y0b.m(this, continuation, 0), 3);
        l.a1(this, dVar.Z2(), null, null, new xni.h(this, continuation, 21), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f82082t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f82081s;
    }
}
