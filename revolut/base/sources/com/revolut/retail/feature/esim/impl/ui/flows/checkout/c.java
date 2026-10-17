package com.revolut.retail.feature.esim.impl.ui.flows.checkout;

import cu8.r0;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements tfj.b {
    public final wj0.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EsimCheckoutFlowContract$InputData f100604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r0 f100605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f100606r;

    public c(wj0.a idempotencyKeyHolder, EsimCheckoutFlowContract$InputData inputData, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.o = idempotencyKeyHolder;
        this.f100604p = inputData;
        this.f100605q = kycRequiredActionTransformer;
        this.f100606r = d.a(this, new ta8.a(this, 12));
    }

    @Override // yji.l
    public final void I1() {
        this.o.a("new_subscription_idempotency_tag");
    }

    @Override // yki.j
    public final void M0() {
        l2(new b(this, null), new tfj.d(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100606r;
    }
}
