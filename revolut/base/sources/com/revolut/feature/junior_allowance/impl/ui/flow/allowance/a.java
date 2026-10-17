package com.revolut.feature.junior_allowance.impl.ui.flow.allowance;

import a7b.r;
import ac8.b;
import ac8.f;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import te8.z;
import wsg.n;
import yki.i;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final JuniorAllowanceFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f76829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hj8.a f76830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xua.a f76831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cc8.a f76832s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sb8.a f76833t;
    public final yb8.a u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final bc8.b f76834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z f76835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f76836y;
    public final d z;

    public a(JuniorAllowanceFlowContract$InputData inputData, n walletInteractor, hj8.a juniorProfileInteractor, xua.a recurringPaymentInteractor, cc8.a juniorAllowanceDescriptorProvider, sb8.a juniorAllowanceShotDialogDispatcher, yb8.a juniorAllowanceShotDialogProvider, gte.a featureToggleInteractor, bc8.b juniorAllowancePocketCreationStatusDialogFactory, z juniorProductsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(juniorAllowanceDescriptorProvider, "juniorAllowanceDescriptorProvider");
        Intrinsics.checkNotNullParameter(juniorAllowanceShotDialogDispatcher, "juniorAllowanceShotDialogDispatcher");
        Intrinsics.checkNotNullParameter(juniorAllowanceShotDialogProvider, "juniorAllowanceShotDialogProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(juniorAllowancePocketCreationStatusDialogFactory, "juniorAllowancePocketCreationStatusDialogFactory");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        this.o = inputData;
        this.f76829p = walletInteractor;
        this.f76830q = juniorProfileInteractor;
        this.f76831r = recurringPaymentInteractor;
        this.f76832s = juniorAllowanceDescriptorProvider;
        this.f76833t = juniorAllowanceShotDialogDispatcher;
        this.u = juniorAllowanceShotDialogProvider;
        this.v = featureToggleInteractor;
        this.f76834w = juniorAllowancePocketCreationStatusDialogFactory;
        this.f76835x = juniorProductsInteractor;
        this.f76836y = d8l.d.a(this, new a09.b(this, 28));
        this.z = e.b(this, new JuniorAllowanceFlowContract$State(f0.f322471a));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a.I2(com.revolut.feature.junior_allowance.impl.ui.flow.allowance.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        if (((jte.d) this.v).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c)) {
            l2(new f(this, null, 1), new yi5.b(26));
        }
    }

    @Override // yki.j
    public final void M0() {
        l2(new f(this, null, 0), new r(this, 16));
    }

    @Override // qki.e
    public final d getState() {
        return this.z;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f76836y;
    }
}
