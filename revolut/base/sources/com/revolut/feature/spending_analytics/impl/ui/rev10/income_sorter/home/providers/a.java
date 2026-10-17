package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers;

import kotlin.jvm.internal.Intrinsics;
import ybl.k;
import ybl.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f87830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f87831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f87832c;

    public a(k tradingAccountsInteractor, l tradingConfigInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f87830a = tradingAccountsInteractor;
        this.f87831b = tradingConfigInteractor;
        this.f87832c = featureToggleInteractor;
    }
}
