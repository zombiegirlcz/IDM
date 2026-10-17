package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker;

import ajk.b;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import phk.g;
import phk.n;
import rgk.p;
import wli.x;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements phk.h {
    public final PlanBillingPickerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f103118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f103119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b f103120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.a f103121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final hkd.b f103122t;
    public final p u;
    public final g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yki.a f103123w;

    public a(PlanBillingPickerContract$InputData inputData, x deeplinkHandler, b outOfAppNavigationProvider, com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b actionHandler, com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.a actionControllerFactory, hkd.b promptActionReporter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(actionControllerFactory, "actionControllerFactory");
        Intrinsics.checkNotNullParameter(promptActionReporter, "promptActionReporter");
        this.o = inputData;
        this.f103118p = deeplinkHandler;
        this.f103119q = outOfAppNavigationProvider;
        this.f103120r = actionHandler;
        this.f103121s = actionControllerFactory;
        this.f103122t = promptActionReporter;
        this.u = new p(inputData.d, inputData.f103108c, rgk.b.NoNavigation, rgk.a.CloseAfterResult);
        this.v = new g(inputData.f);
        n nVar = new n(this, 0);
        this.f103123w = d.a(this, PlanBillingPickerContract$Step.BillingPicker.f103115a, f0.f322471a, nVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103123w;
    }
}
