package com.revolut.feature.payments.transfers.personalisation.impl.ui.flow;

import cli.g;
import cli.y;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.flow.TransfersPersonalisationFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qce.b;
import t2a.d;
import t2a.f;
import t2a.j;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements d {
    public final y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f79965p;

    public a(TransfersPersonalisationFlowContract$InputData inputData, t2a.h mapper) {
        FlowStep flowStep;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = mra.d.b(this, new f(inputData.f79961a.getId()), mapper, null, false, 12);
        int i = j.f267525a[inputData.f79961a.ordinal()];
        if (i == 1) {
            flowStep = TransfersPersonalisationFlowContract$Step.Gif.f79963a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            flowStep = TransfersPersonalisationFlowContract$Step.Style.f79964a;
        }
        this.f79965p = cp5.d.a(this, flowStep, f0.f322471a, new b(inputData, this, 20));
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f79965p;
    }
}
