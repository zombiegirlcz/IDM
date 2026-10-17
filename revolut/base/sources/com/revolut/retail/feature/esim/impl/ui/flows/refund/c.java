package com.revolut.retail.feature.esim.impl.ui.flows.refund;

import cu8.r0;
import dfj.z2;
import kotlin.jvm.internal.Intrinsics;
import pfk.h0;
import sfj.d;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends d implements pgj.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EsimRefundFlowContract$InputData f100874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0 f100875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f100876t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EsimRefundFlowContract$InputData inputData, r0 kycRequiredActionTransformer, z2 esimRestrictionsInteractor) {
        super(esimRestrictionsInteractor, a.f);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(esimRestrictionsInteractor, "esimRestrictionsInteractor");
        this.f100874r = inputData;
        this.f100875s = kycRequiredActionTransformer;
        this.f100876t = d8l.d.a(this, new p5f.c(this, 23));
    }

    @Override // yki.j
    public final void M0() {
        l2(new b(this, null), new h0(19));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100876t;
    }
}
