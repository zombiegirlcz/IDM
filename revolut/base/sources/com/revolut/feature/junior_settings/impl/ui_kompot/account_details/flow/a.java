package com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow;

import cli.y;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_details.flow.JuniorAccountDetailsFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import w72.g;
import zhm.f0;
import zn8.b;
import zn8.c;
import zn8.d;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements c {

    @NotNull
    private static final d Companion = new d();
    public final JuniorAccountDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xi8.c f77274p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f77275q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f77276r;

    public a(JuniorAccountDetailsFlowContract$InputData inputData, xi8.c juniorPaymentLinkShotDialogConfirmationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorPaymentLinkShotDialogConfirmationProvider, "juniorPaymentLinkShotDialogConfirmationProvider");
        this.o = inputData;
        this.f77274p = juniorPaymentLinkShotDialogConfirmationProvider;
        this.f77275q = mra.d.b(this, new b(null), new g(7), null, false, 12);
        zba.a aVar = new zba.a(this, 28);
        this.f77276r = cp5.d.a(this, JuniorAccountDetailsFlowContract$Step.AccountDetails.f77268a, f0.f322471a, aVar);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f77275q;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77276r;
    }
}
