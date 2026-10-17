package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signed.MortgageSignatureSignedFlowContract$Step;
import cp5.d;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import u7k.w;
import u83.f;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements ue4.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MortgageSignatureSignedFlowContract$InputData f68048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final px3.a f68049q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f68050r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MortgageSignatureSignedFlowContract$InputData inputData, px3.a mortgageSignatureInteractor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mortgageSignatureInteractor, "mortgageSignatureInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68048p = inputData;
        this.f68049q = mortgageSignatureInteractor;
        w wVar = new w(this, 13);
        this.f68050r = d.a(this, MortgageSignatureSignedFlowContract$Step.Initial.f68044a, f0.f322471a, wVar);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.f68050r.d() instanceof MortgageSignatureSignedFlowContract$Step.Initial) {
            n2(new f(this, null, 6), new whi.b(6));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68050r;
    }
}
