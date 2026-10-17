package com.revolut.feature.apm.core.ui.impl.ui.qr.details;

import com.revolut.feature.apm.core.ui.api.navigation.qr.QrDetailsInputData;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.QrDetailsFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import nx2.f;
import o32.d;
import oki.h;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements d {
    public final QrDetailsInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f62369p;

    public a(QrDetailsInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        f fVar = new f(this, 16);
        this.f62369p = cp5.d.a(this, QrDetailsFlowContract$Step.Details.f62368a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f62369p;
    }
}
