package com.revolut.feature.apm.breb.impl.ui.qr_request;

import com.revolut.feature.apm.breb.impl.ui.qr_request.BrebQrRequestFlowContract$Step;
import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreenContract$InputData;
import hx7.e;
import jw1.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import vkm.j2;
import vkm.q;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final BrebQrRequestFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f61756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f61757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f61758r;

    public a(BrebQrRequestFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        d dVarB = e.b(this, new BrebQrRequestFlowContract$State(inputData.f61749b, inputData.f61748a));
        this.f61756p = dVarB;
        j2 j2Var = (j2) dVarB.f22677a;
        this.f61757q = q.c(new BrebQrRequestScreenContract$InputData(((BrebQrRequestFlowContract$State) j2Var.getValue()).f61751a, ((BrebQrRequestFlowContract$State) j2Var.getValue()).f61752b));
        jnf.d dVar = new jnf.d(this, 17);
        this.f61758r = cp5.d.a(this, BrebQrRequestFlowContract$Step.Request.f61755a, f0.f322471a, dVar);
    }

    @Override // qki.e
    public final d getState() {
        return this.f61756p;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f61758r;
    }
}
