package com.revolut.feature.paynow.impl.flow;

import com.revolut.feature.paynow.impl.flow.PayNowQrFlowContract$Step;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;
import z6a.b;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final PayNowQrFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f80298p;

    public a(PayNowQrFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f80298p = d.a(this, new yz4.b(this, 15));
    }

    @Override // yki.j
    public final void M0() {
        h.t2(this, this.f80298p, PayNowQrFlowContract$Step.Qr.f80297a, false, null, false, 12);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80298p;
    }
}
