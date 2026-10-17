package com.revolut.feature.salary_switch.impl.ui.mexico.flow;

import com.revolut.feature.salary_switch.impl.ui.mexico.flow.SalarySwitchMxFlowContract$Step;
import cp5.d;
import fgj.g;
import frc.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(SalarySwitchMxFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        String str = inputData.f85319a;
        this.o = d.a(this, (str == null || d0.W(str)) ? SalarySwitchMxFlowContract$Step.EnterAccountDetails.f85320a : new SalarySwitchMxFlowContract$Step.ShowSalaryStatus(inputData.f85319a), f0.f322471a, new g(this, 23));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
