package com.revolut.feature.apm.bills.boleto.impl.finder.flow;

import com.revolut.feature.apm.bills.boleto.impl.finder.flow.BoletoFinderFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import d8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pm1.e;
import vm1.b;
import vm1.c;
import yki.i;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f61171p;

    public a(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f61171p = d.a(this, new vh9.b(this, 8));
    }

    @Override // yki.j
    public final void M0() {
        FlowStep flowStep;
        e eVar = this.o.f290519a;
        if (Intrinsics.f(eVar, pm1.c.f237444a)) {
            flowStep = BoletoFinderFlowContract$Step.BoletosInfo.f61168a;
        } else {
            if (!Intrinsics.f(eVar, pm1.d.f237445a)) {
                throw new NoWhenBranchMatchedException();
            }
            flowStep = BoletoFinderFlowContract$Step.DeactivateBoletoFinder.f61169a;
        }
        h.w2(this.f61171p, flowStep, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f61171p;
    }
}
