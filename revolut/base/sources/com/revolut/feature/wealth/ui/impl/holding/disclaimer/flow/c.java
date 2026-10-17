package com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow;

import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import i69.p;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends h implements ilh.b {
    public final wzg.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CashHoldingsInfoFlowContract$InputData f96019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f96020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f96021r;

    public c(wzg.a cashHoldingsInteractor, CashHoldingsInfoFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(cashHoldingsInteractor, "cashHoldingsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = cashHoldingsInteractor;
        this.f96019p = inputData;
        this.f96021r = d.a(this, new p(this, 25));
    }

    public final void I2(CashHoldingsInfoFlowContract$ModalStep cashHoldingsInfoFlowContract$ModalStep) {
        this.f96020q = cashHoldingsInfoFlowContract$ModalStep.getClass().getName();
        h.w2(this.f96021r, cashHoldingsInfoFlowContract$ModalStep, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new ilh.c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f96021r;
    }
}
