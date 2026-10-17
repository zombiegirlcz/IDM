package com.revolut.feature.cash_topup.impl.ui.flow.barcode;

import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import nd.o;
import oki.h;
import org.jetbrains.annotations.NotNull;
import y8a.g;
import yb3.b;
import yb3.e;
import yki.i;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {

    @NotNull
    public static final e Companion = new e();
    public final dj3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f65651p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t1 f65652q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CashTopUpBarcodeFlowContract$InputData f65653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f65654s;

    public a(dj3.a chooseScreenCommandFactory, o chooserIntentNavigationCommandFactory, t1 barcodeInteractor, CashTopUpBarcodeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(chooseScreenCommandFactory, "chooseScreenCommandFactory");
        Intrinsics.checkNotNullParameter(chooserIntentNavigationCommandFactory, "chooserIntentNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(barcodeInteractor, "barcodeInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = chooseScreenCommandFactory;
        this.f65651p = chooserIntentNavigationCommandFactory;
        this.f65652q = barcodeInteractor;
        this.f65653r = inputData;
        this.f65654s = d.a(this, new g(this, 6));
    }

    @Override // yki.j
    public final void M0() {
        CashTopUpBarcodeFlowContract$Step.ModalStep modalStep = this.f65653r.f65643a;
        boolean z = modalStep instanceof CashTopUpBarcodeFlowContract$Step.ModalStep.ReportIssue;
        i iVar = this.f65654s;
        if (z) {
            h.w2(iVar, new CashTopUpBarcodeFlowContract$Step.ModalStep.ReportIssue(((CashTopUpBarcodeFlowContract$Step.ModalStep.ReportIssue) modalStep).f65649a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            h.t2(this, iVar, CashTopUpBarcodeFlowContract$Step.Barcode.f65644a, false, null, false, 12);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f65654s;
    }
}
