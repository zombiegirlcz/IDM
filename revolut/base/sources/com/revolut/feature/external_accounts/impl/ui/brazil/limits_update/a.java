package com.revolut.feature.external_accounts.impl.ui.brazil.limits_update;

import cli.g;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import wj6.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements e {
    public final y o;

    public a(BrPaymentLimitsUpdateScreenContract$InputData inputData, wj6.h stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = d.b(this, new wj6.d(inputData.f72618a.getF72633a(), inputData.f72618a, inputData.f72619b, inputData.f72620c, null), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
