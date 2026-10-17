package com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow;

import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow.TaxHubSettingsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import z37.b;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final TaxHubSettingsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f74364p;

    public a(TaxHubSettingsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        yz4.b bVar = new yz4.b(this, 10);
        this.f74364p = d.a(this, TaxHubSettingsFlowContract$Step.UpdateProfile.f74363a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74364p;
    }
}
