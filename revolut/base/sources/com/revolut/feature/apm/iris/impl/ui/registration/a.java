package com.revolut.feature.apm.iris.impl.ui.registration;

import com.revolut.feature.apm.iris.impl.ui.registration.IrisRegistrationFlowContract$Step;
import cp5.d;
import f62.i;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import l62.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final IrisRegistrationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj0.a f62528p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f62529q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f62530r;

    public a(IrisRegistrationFlowContract$InputData inputData, wj0.a idempotencyKeyHolder, i pendingExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(pendingExtension, "pendingExtension");
        this.o = inputData;
        this.f62528p = idempotencyKeyHolder;
        this.f62529q = pendingExtension;
        v vVar = new v(this, 11);
        this.f62530r = d.a(this, IrisRegistrationFlowContract$Step.Intro.f62525a, f0.f322471a, vVar);
    }

    @Override // yji.l
    public final void I1() {
        this.f62528p.a("payments_apm_onboarding");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62530r;
    }
}
