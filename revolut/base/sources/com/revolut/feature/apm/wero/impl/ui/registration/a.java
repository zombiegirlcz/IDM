package com.revolut.feature.apm.wero.impl.ui.registration;

import com.revolut.feature.apm.wero.impl.ui.registration.WeroRegistrationFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oa4.c;
import oi2.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final WeroRegistrationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qh2.a f63106p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj0.a f63107q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f63108r;

    public a(WeroRegistrationFlowContract$InputData inputData, qh2.a interactor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f63106p = interactor;
        this.f63107q = idempotencyKeyHolder;
        c cVar = new c(this, 17);
        this.f63108r = d.a(this, WeroRegistrationFlowContract$Step.Intro.f63104a, f0.f322471a, cVar);
    }

    @Override // yji.l
    public final void I1() {
        this.f63107q.a("payments_apm_onboarding");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f63108r;
    }
}
