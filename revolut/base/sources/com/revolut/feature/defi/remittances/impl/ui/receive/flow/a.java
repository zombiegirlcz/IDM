package com.revolut.feature.defi.remittances.impl.ui.receive.flow;

import com.revolut.feature.defi.remittances.impl.ui.receive.flow.DeFiReceiveFlowContract$Step;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import nx2.f;
import o56.b;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final DeFiReceiveFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f71812p;

    public a(DeFiReceiveFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f71812p = d.a(this, new f(this, 19));
    }

    @Override // yki.j
    public final void M0() {
        String str = this.o.f71809b;
        h.u2(this, this.f71812p, str == null ? DeFiReceiveFlowContract$Step.SelectAsset.f71811a : new DeFiReceiveFlowContract$Step.Deposit(str), null, 6);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f71812p;
    }
}
