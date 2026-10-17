package com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow;

import av8.n;
import b2j.b;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingsDisclaimersFlowContract$ModalStep;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final SavingsDisclaimersFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f99523p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f99524q;

    public a(SavingsDisclaimersFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f99524q = d.a(this, new n(this, 11));
    }

    @Override // yki.j
    public final void M0() {
        h.w2(this.f99524q, new SavingsDisclaimersFlowContract$ModalStep.Selector(this.o.f99519a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f99524q;
    }
}
