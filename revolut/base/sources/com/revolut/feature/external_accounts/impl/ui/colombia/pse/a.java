package com.revolut.feature.external_accounts.impl.ui.colombia.pse;

import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sk6.b;
import tak.d;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f72721p;

    public a(PseFlowContract$InputData inputData, d pendingPaymentExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pendingPaymentExtension, "pendingPaymentExtension");
        this.o = pendingPaymentExtension;
        this.f72721p = cp5.d.a(this, inputData.f72718a, f0.f322471a, new scl.h(this, 13));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72721p;
    }
}
