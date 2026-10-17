package com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.flow.FamilyCreditCardSettingsFlowContract$Step;
import cp5.d;
import e84.e;
import g75.i;
import kotlin.jvm.internal.Intrinsics;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements gb4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FamilyCreditCardSettingsFlowContract$InputData f67673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f67674q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FamilyCreditCardSettingsFlowContract$InputData inputData, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67673p = inputData;
        i iVar = new i(this, 9);
        this.f67674q = d.a(this, FamilyCreditCardSettingsFlowContract$Step.Initial.f67672a, f0.f322471a, iVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f67674q;
    }
}
