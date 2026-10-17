package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp;

import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.TransferOutFlowContract$Step;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import zaf.b;
import zaf.c;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f91636p;

    public a(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = e.b(this, new TransferOutFlowContract$State(0));
        zaf.d dVar = new zaf.d(this, inputData, 0);
        this.f91636p = cp5.d.a(this, TransferOutFlowContract$Step.Disclaimer.f91632a, f0.f322471a, dVar);
    }

    @Override // qki.e
    public final d getState() {
        return this.o;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91636p;
    }
}
