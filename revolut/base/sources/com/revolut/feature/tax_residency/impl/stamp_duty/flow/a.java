package com.revolut.feature.tax_residency.impl.stamp_duty.flow;

import com.revolut.feature.tax_residency.impl.stamp_duty.flow.StampDutyFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wde.f;
import woe.b;
import woe.c;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f90144p;

    public a(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        f fVar = new f(this, 20);
        this.f90144p = d.a(this, StampDutyFlowContract$Step.PayDialog.f90143a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90144p;
    }
}
