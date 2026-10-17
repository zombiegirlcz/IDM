package com.revolut.feature.payments.bills_chooser.impl.ui.itemization;

import bq9.c;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.flow.SimpleFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import yki.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/itemization/SplitItemizationController;", "Lcom/revolut/kompot/navigable/vc/flow/SimpleFlow;", "Lcom/revolut/feature/payments/bills_chooser/impl/ui/itemization/SplitItemizationControllerContract$Step;", "Lbq9/c;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SplitItemizationController extends SimpleFlow<SplitItemizationControllerContract$Step, c> {
    public final int M;
    public final a N;

    public SplitItemizationController(SplitItemizationControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = R$layout.base_flow_container;
        this.N = new a(inputData);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.flow.SimpleFlow
    public final k d3() {
        return this.N;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }
}
