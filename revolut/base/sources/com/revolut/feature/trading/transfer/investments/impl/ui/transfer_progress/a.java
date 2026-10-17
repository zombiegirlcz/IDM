package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress;

import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_progress.TransferProgressFlowContract$Step;
import cp5.d;
import g75.i;
import gbf.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final TransferProgressFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f91652p;

    public a(TransferProgressFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        i iVar = new i(this, 12);
        this.f91652p = d.a(this, TransferProgressFlowContract$Step.TransferProgress.f91651a, f0.f322471a, iVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91652p;
    }
}
