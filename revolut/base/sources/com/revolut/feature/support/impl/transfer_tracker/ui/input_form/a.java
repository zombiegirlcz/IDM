package com.revolut.feature.support.impl.transfer_tracker.ui.input_form;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements hee.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2j.a f89416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td0.b f89417b;

    public a(l2j.a currencyChooserFlowFactory, td0.b currencySetsProvider) {
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(currencySetsProvider, "currencySetsProvider");
        this.f89416a = currencyChooserFlowFactory;
        this.f89417b = currencySetsProvider;
    }
}
