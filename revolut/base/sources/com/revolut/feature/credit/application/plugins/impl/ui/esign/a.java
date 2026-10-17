package com.revolut.feature.credit.application.plugins.impl.ui.esign;

import c84.t;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.ESignatureFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import e84.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yz4.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements za4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ESignatureFlowContract$InputData f67650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ex3.a f67651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f67652r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ESignatureFlowContract$InputData inputData, ex3.a interactor, e pluginControllerResolver) {
        FlowStep confirmationCode;
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67650p = inputData;
        this.f67651q = interactor;
        CreditApplicationKompotFeatureConfig.ESignature.Config config = inputData.f67646b;
        if (config instanceof CreditApplicationKompotFeatureConfig.ESignature.Config.Documents) {
            confirmationCode = ESignatureFlowContract$Step.Documents.f67648a;
        } else {
            if (!(config instanceof CreditApplicationKompotFeatureConfig.ESignature.Config.Otp)) {
                throw new NoWhenBranchMatchedException();
            }
            confirmationCode = new ESignatureFlowContract$Step.ConfirmationCode((CreditApplicationKompotFeatureConfig.ESignature.Config.Otp) config);
        }
        this.f67652r = d.a(this, confirmationCode, f0.f322471a, new b(this, 22));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67652r;
    }
}
