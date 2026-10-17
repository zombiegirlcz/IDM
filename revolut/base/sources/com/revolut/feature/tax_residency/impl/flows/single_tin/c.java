package com.revolut.feature.tax_residency.impl.flows.single_tin;

import com.revolut.feature.tax_residency.impl.flows.single_tin.SingleTinCollectionFlowContract$Step;
import com.revolut.feature.tax_residency.impl.flows.single_tin.a;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import cp5.d;
import dcf.v0;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import oki.h;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends h implements doe.b {
    public final SingleTinCollectionFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f90060p;

    public c(SingleTinCollectionFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        dgj.h hVar = new dgj.h(this, 17);
        this.f90060p = d.a(this, SingleTinCollectionFlowContract$Step.PrefetchData.f90051a, f0.f322471a, hVar);
    }

    public final void I2() {
        if (!this.o.f90050c) {
            C1(new BridgeDestination(new FinishCommand(-1, null, null, 6)));
        } else {
            C2(a.C0557a.f90058a);
            h.D2(this.f90060p);
        }
    }

    public final void J2() {
        if (this.o.f90050c) {
            h.D2(this.f90060p);
        } else {
            C1(new BridgeDestination(new FinishCommand(0, null, null, 6)));
        }
    }

    public final void K2() {
        l.a1(this, X1(new y0(null, pw5.a.e(), false, 5)), null, null, new v0(this, null, 11), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90060p;
    }
}
