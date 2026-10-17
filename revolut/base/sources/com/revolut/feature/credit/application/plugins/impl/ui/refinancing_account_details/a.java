package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details;

import c84.t;
import ch4.b;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.RefinancingAccountDetailsFlowContract$Step;
import cp5.d;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements zg4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RefinancingAccountDetailsFlowContract$InputData f68247p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f68248q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f68249r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RefinancingAccountDetailsFlowContract$InputData inputData, b bankAccountDetailsNotFoundErrorHandler, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bankAccountDetailsNotFoundErrorHandler, "bankAccountDetailsNotFoundErrorHandler");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68247p = inputData;
        this.f68248q = bankAccountDetailsNotFoundErrorHandler;
        zba.a aVar = new zba.a(this, 11);
        this.f68249r = d.a(this, RefinancingAccountDetailsFlowContract$Step.ProductsList.f68246a, f0.f322471a, aVar);
    }

    @Override // c84.t, yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        b bVar = this.f68248q;
        if (!bVar.a(throwable)) {
            return super.o1(throwable);
        }
        y0 y0VarB = bVar.b(throwable);
        if (y0VarB == null) {
            return true;
        }
        X1(y0VarB);
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68249r;
    }
}
