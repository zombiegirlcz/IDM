package com.revolut.feature.apm.multibanco.impl.ui.pending;

import com.revolut.feature.apm.multibanco.impl.ui.pending.MultibancoPendingPaymentFlowContract$Step;
import cp5.d;
import i69.p;
import i82.b;
import j3c.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final j72.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f62620p;

    public a(MultibancoPendingPaymentFlowContract$InputData inputData, j72.a errorHandlerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        this.o = errorHandlerExtension;
        this.f62620p = d.a(this, new MultibancoPendingPaymentFlowContract$Step.Confirmation(inputData.f62617a), f0.f322471a, new p(this, 2));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (((j72.b) this.o).b3(throwable, new y(12))) {
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62620p;
    }
}
