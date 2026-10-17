package com.revolut.feature.second_device_login.impl.ui.flow;

import com.revolut.feature.second_device_login.impl.ui.flow.SecondDeviceLoginFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import h30.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nk4.o;
import ntc.b;
import ntc.c;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final SecondDeviceLoginFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f85364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f85365q;

    public a(SecondDeviceLoginFlowContract$InputData inputData, q secondDeviceLoginInteractor) {
        FlowStep flowStep;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(secondDeviceLoginInteractor, "secondDeviceLoginInteractor");
        this.o = inputData;
        this.f85364p = secondDeviceLoginInteractor;
        int i = c.f219015a[inputData.f85359b.ordinal()];
        if (i == 1) {
            flowStep = SecondDeviceLoginFlowContract$Step.ConfirmLogin.f85361a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            flowStep = SecondDeviceLoginFlowContract$Step.Details.f85362a;
        }
        this.f85365q = d.a(this, flowStep, f0.f322471a, new o(this, 18));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f85365q;
    }
}
