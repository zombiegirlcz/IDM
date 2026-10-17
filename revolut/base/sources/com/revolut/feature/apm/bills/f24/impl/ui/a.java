package com.revolut.feature.apm.bills.f24.impl.ui;

import cnc.t;
import com.revolut.feature.apm.bills.f24.impl.ui.F24FlowContract$Step;
import cp5.d;
import cq1.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final yp1.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yp1.a f61470p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f61471q;

    public a(yp1.b formFlowProvider, yp1.a dialogProvider) {
        Intrinsics.checkNotNullParameter(formFlowProvider, "formFlowProvider");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = formFlowProvider;
        this.f61470p = dialogProvider;
        t tVar = new t(this, 7);
        this.f61471q = d.a(this, F24FlowContract$Step.Entry.f61467a, f0.f322471a, tVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f61471q;
    }
}
