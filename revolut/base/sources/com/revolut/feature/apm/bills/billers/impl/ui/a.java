package com.revolut.feature.apm.bills.billers.impl.ui;

import com.revolut.feature.apm.bills.billers.impl.ui.BillersFlowContract$Step;
import hx7.e;
import jch.p;
import jm1.b;
import jm1.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f61161p;

    public a(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = e.b(this, new BillersFlowContract$State(inputData.f175916a));
        p pVar = new p(this, 24);
        this.f61161p = cp5.d.a(this, BillersFlowContract$Step.Chooser.f61160a, f0.f322471a, pVar);
    }

    @Override // qki.e
    public final d getState() {
        return this.o;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f61161p;
    }
}
