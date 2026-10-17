package com.revolut.feature.payments.bills_chooser.impl.ui.itemization;

import bhi.c;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.SplitItemizationControllerContract$Step;
import cp5.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yki.b;
import yki.k;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends k {
    public final SplitItemizationControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f79270p;

    public a(SplitItemizationControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        List list = inputData.d;
        this.f79270p = d.a(this, list.isEmpty() ? new SplitItemizationControllerContract$Step.AddItem(list) : new SplitItemizationControllerContract$Step.ViewItems(list), f0.f322471a, new c(this, 17));
    }

    @Override // yki.g
    public final b s() {
        return this.f79270p;
    }
}
