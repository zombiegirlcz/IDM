package com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow;

import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import mci.e;
import mz3.r;
import oki.h;
import om4.d0;
import yki.i;
import yz9.c;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements n0a.b {
    public final TransferOnlyChatFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q0a.b f79796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f79797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f79798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f79799s;

    public b(TransferOnlyChatFlowContract$InputData inputData, q0a.b navigationProvider, d0 backgroundInteractor, c transactionForAnimationHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(backgroundInteractor, "backgroundInteractor");
        Intrinsics.checkNotNullParameter(transactionForAnimationHolder, "transactionForAnimationHolder");
        this.o = inputData;
        this.f79796p = navigationProvider;
        this.f79797q = backgroundInteractor;
        this.f79798r = transactionForAnimationHolder;
        this.f79799s = d.a(this, new r(this, 2));
    }

    @Override // yki.j
    public final void M0() {
        l2(new e(this, null, 26), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f79799s;
    }
}
