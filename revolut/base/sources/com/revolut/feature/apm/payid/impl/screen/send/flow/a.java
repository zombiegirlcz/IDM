package com.revolut.feature.apm.payid.impl.screen.send.flow;

import com.revolut.feature.apm.payid.impl.screen.send.flow.SendFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vvc.s;
import wa2.b;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(SendFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, inputData.f62727a ? new SendFlowContract$Step.Input(null) : SendFlowContract$Step.Contacts.f62728a, f0.f322471a, new s(this, 21));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
