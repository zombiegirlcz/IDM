package com.revolut.feature.apm.multibanco.impl.ui.registration;

import com.revolut.feature.apm.multibanco.impl.ui.registration.MultibancoRegistrationFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import l72.c;
import nx2.f;
import o82.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final MultibancoRegistrationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f62626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pre.c f62627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f62628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f62629s;

    public a(MultibancoRegistrationFlowContract$InputData inputData, c cardInteractor, pre.c termsInteractor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardInteractor, "cardInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f62626p = cardInteractor;
        this.f62627q = termsInteractor;
        this.f62628r = idempotencyKeyHolder;
        this.f62629s = d.a(this, new MultibancoRegistrationFlowContract$Step.Intro(inputData.f62622a.getTerms()), f0.f322471a, new f(this, 27));
    }

    @Override // yji.l
    public final void I1() {
        this.f62628r.a("apm_product_mbway_card_issue");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62629s;
    }
}
