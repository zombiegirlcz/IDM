package com.revolut.feature.user_declarations.shared.flows.income;

import com.revolut.feature.user_declarations.shared.flows.income.IncomeFlowContract$Step;
import com.revolut.shared.feature.user_declarations.api.flows.income.IncomeFlowInputData;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vng.b;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {
    public final IncomeFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f94624p;

    public a(IncomeFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        vh9.b bVar = new vh9.b(this, 11);
        this.f94624p = d.a(this, IncomeFlowContract$Step.Income.f94623a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f94624p;
    }
}
