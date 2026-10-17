package com.revolut.feature.checkout.impl.resume.flow;

import k7c.l0;
import kd8.f;
import ke7.v;
import ki3.c;
import ki3.g;
import kotlin.jvm.internal.Intrinsics;
import mt8.d;
import oki.h;
import yki.b;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements c {
    public final ResumeCheckoutFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sh3.a f65838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f65839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ki3.a f65840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f65841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f65842t;

    public a(ResumeCheckoutFlowContract$InputData inputData, sh3.a checkoutInteractor, d kycInteractor, ki3.a dialogProvider, g navigationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        this.o = inputData;
        this.f65838p = checkoutInteractor;
        this.f65839q = kycInteractor;
        this.f65840r = dialogProvider;
        this.f65841s = navigationProvider;
        this.f65842t = d8l.d.a(this, new f(21));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.checkout.impl.resume.flow.a r26, com.revolut.feature.checkout.models.CheckoutOrder r27, gim.c r28) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.checkout.impl.resume.flow.a.I2(com.revolut.feature.checkout.impl.resume.flow.a, com.revolut.feature.checkout.models.CheckoutOrder, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new l0(this, null, 14), new v(this, 8));
    }

    @Override // yki.g
    public final b s() {
        return this.f65842t;
    }
}
