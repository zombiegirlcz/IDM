package com.revolut.feature.external_accounts.impl.ui.us.plaid.flow;

import com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.UsPlaidFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import kp0.m;
import mo6.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(UsPlaidFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        m mVar = new m(inputData, this, 10);
        this.o = d.a(this, UsPlaidFlowContract$Step.WebView.f73083a, f0.f322471a, mVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
