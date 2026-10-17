package com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.ConveyancingAppointmentSchedulingFlowContract$Step;
import cp5.d;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import kze.h;
import l0c.v;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends t implements l74.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tw3.a f67319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ConveyancingAppointmentSchedulingFlowContract$InputData f67320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f67321r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(tw3.a interactor, ConveyancingAppointmentSchedulingFlowContract$InputData inputData, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67319p = interactor;
        this.f67320q = inputData;
        v vVar = new v(this, 14);
        this.f67321r = d.a(this, ConveyancingAppointmentSchedulingFlowContract$Step.Initial.f67314a, f0.f322471a, vVar);
    }

    @Override // yji.l
    public final void I1() {
        l2(new h(this, null, 3), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67321r;
    }
}
