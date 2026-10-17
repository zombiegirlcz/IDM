package com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter;

import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.TransactionFilterFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wtj.c;
import wu5.b;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(TransactionFilterFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new TransactionFilterFlowContract$Step.Filters(inputData.f71430a, inputData.f71431b), f0.f322471a, new c(this, 3));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
