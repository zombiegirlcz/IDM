package com.revolut.feature.payees.impl.ui.flow;

import com.revolut.feature.payees.impl.ui.flow.PayeesFlowContract$Step;
import cp5.d;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import lm9.c;
import oki.h;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements c {
    public final lm9.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t1 f79000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f79001q;

    public a(lm9.a payeesDialogFactory, t1 payeesOverviewControllerProvider) {
        Intrinsics.checkNotNullParameter(payeesDialogFactory, "payeesDialogFactory");
        Intrinsics.checkNotNullParameter(payeesOverviewControllerProvider, "payeesOverviewControllerProvider");
        this.o = payeesDialogFactory;
        this.f79000p = payeesOverviewControllerProvider;
        lcc.c cVar = new lcc.c(this, 24);
        this.f79001q = d.a(this, PayeesFlowContract$Step.Overview.f78997a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f79001q;
    }
}
