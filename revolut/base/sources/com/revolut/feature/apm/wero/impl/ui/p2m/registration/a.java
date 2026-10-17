package com.revolut.feature.apm.wero.impl.ui.p2m.registration;

import com.revolut.feature.apm.wero.impl.ui.p2m.registration.WeroP2MRegistrationFlowContract$Step;
import cp5.d;
import fgj.g;
import fi2.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final WeroP2MRegistrationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qh2.a f63081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj0.a f63082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f63083r;

    public a(WeroP2MRegistrationFlowContract$InputData inputData, qh2.a interactor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f63081p = interactor;
        this.f63082q = idempotencyKeyHolder;
        g gVar = new g(this, 4);
        this.f63083r = d.a(this, WeroP2MRegistrationFlowContract$Step.Terms.f63080a, f0.f322471a, gVar);
    }

    @Override // yji.l
    public final void I1() {
        this.f63082q.a("payments_apm_onboarding");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f63083r;
    }
}
