package com.revolut.feature.apm.blik.impl.ui.terms_acceptance;

import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.BlikTermsAcceptanceFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends h implements su1.b {
    public final BlikTermsAcceptanceFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final eu1.a f61692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj0.a f61693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f61694r;

    public c(BlikTermsAcceptanceFlowContract$InputData inputData, eu1.a interactor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f61692p = interactor;
        this.f61693q = idempotencyKeyHolder;
        scl.h hVar = new scl.h(this, 27);
        this.f61694r = d.a(this, BlikTermsAcceptanceFlowContract$Step.Intro.f61688a, f0.f322471a, hVar);
    }

    @Override // yji.l
    public final void I1() {
        this.f61693q.a("payments_apm_onboarding");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f61694r;
    }
}
