package com.revolut.feature.pay_later.impl.ui.paymentoptions.flow;

import com.revolut.feature.pay_later.impl.ui.paymentoptions.flow.PaymentOptionsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yj9.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(PaymentOptionsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new PaymentOptionsFlowContract$Step.PaymentOptions(inputData.f78884a), f0.f322471a, new yd8.a(18));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
