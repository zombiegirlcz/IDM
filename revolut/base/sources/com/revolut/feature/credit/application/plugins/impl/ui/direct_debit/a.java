package com.revolut.feature.credit.application.plugins.impl.ui.direct_debit;

import c84.t;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.DirectDebitContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.DirectDebitContract$Step;
import com.revolut.feature.credit.direct.debit.account_selection.models.AccountSelectionSelectedData;
import d8l.d;
import e84.e;
import hw3.c;
import ip0.v7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import xy4.b;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements r94.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DirectDebitContract$InputData f67534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f67535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f67536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w0 f67537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f67538t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DirectDebitContract$InputData inputData, c directDebitInteractor, b directDebitStatusDialogFactory, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(directDebitInteractor, "directDebitInteractor");
        Intrinsics.checkNotNullParameter(directDebitStatusDialogFactory, "directDebitStatusDialogFactory");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67534p = inputData;
        this.f67535q = directDebitInteractor;
        this.f67536r = directDebitStatusDialogFactory;
        this.f67537s = v7.m(inputData.f67526b, AnalyticsContext.INSTANCE);
        this.f67538t = d.a(this, new r6f.i(this, 7));
    }

    @Override // yki.j
    public final void M0() {
        DirectDebitContract$InputData.Config config = this.f67534p.f67525a;
        boolean z = config instanceof DirectDebitContract$InputData.Config.Started;
        i iVar = this.f67538t;
        if (z) {
            h.t2(this, iVar, DirectDebitContract$Step.AccountSelection.f67531a, false, null, false, 12);
        } else {
            if (!(config instanceof DirectDebitContract$InputData.Config.Passed)) {
                throw new NoWhenBranchMatchedException();
            }
            bk4.e eVar = ((DirectDebitContract$InputData.Config.Passed) config).f67527a;
            h.t2(this, iVar, new DirectDebitContract$Step.AccountConfirmation(new AccountSelectionSelectedData(eVar.f16256b, eVar.f16255a, null, null)), false, null, false, 12);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67538t;
    }
}
