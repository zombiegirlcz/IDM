package com.revolut.feature.apm.core.ui.impl.ui.topup_request;

import com.revolut.feature.apm.core.ui.api.navigation.ApmTopupRequestNavigation$InputData;
import com.revolut.feature.apm.core.ui.impl.ui.topup_request.TopupRequestFlowContract$Step;
import cp5.d;
import k1f.n;
import k42.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(ApmTopupRequestNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new TopupRequestFlowContract$Step.Details(inputData), f0.f322471a, new n(11));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
