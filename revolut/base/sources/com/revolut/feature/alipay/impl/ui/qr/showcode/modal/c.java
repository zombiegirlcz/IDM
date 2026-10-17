package com.revolut.feature.alipay.impl.ui.qr.showcode.modal;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends h implements bl1.d {
    public final pk1.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f61086p;

    public c(AlipayPlusExpandedCodeScreenContract$InputData inputData, pk1.d paymentCodeInteractor, e stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paymentCodeInteractor, "paymentCodeInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = paymentCodeInteractor;
        this.f61086p = mra.d.b(this, new a((Data) paymentCodeInteractor.d.f290128a.getValue(), inputData.f61083a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.o.d, null, new b(this, null), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f61086p;
    }
}
