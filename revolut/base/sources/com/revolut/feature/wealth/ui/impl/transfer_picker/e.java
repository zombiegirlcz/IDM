package com.revolut.feature.wealth.ui.impl.transfer_picker;

import cli.g;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends h implements snh.d {
    public final mlh.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f96087p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f96088q;

    public e(f stateMapper, snh.f inputData, mlh.a cashHoldingMarginLoanInfoDialogProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cashHoldingMarginLoanInfoDialogProvider, "cashHoldingMarginLoanInfoDialogProvider");
        this.o = cashHoldingMarginLoanInfoDialogProvider;
        this.f96087p = mra.d.b(this, new snh.e(inputData.f264621a, inputData.f264622b), stateMapper, null, false, 12);
        this.f96088q = hx7.e.a(this, new scl.h(this, 21));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f96088q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f96087p;
    }
}
