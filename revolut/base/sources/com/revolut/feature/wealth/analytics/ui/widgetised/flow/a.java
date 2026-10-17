package com.revolut.feature.wealth.analytics.ui.widgetised.flow;

import com.revolut.feature.wealth.analytics.ui.widgetised.flow.WidgetisedAnalyticsFlowContract$Step;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsInputData;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ryg.b;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(WidgetisedAnalyticsInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new WidgetisedAnalyticsFlowContract$Step.WidgetisedAnalyticsDashboardStep(inputData.f95139a, inputData.d, null, null), f0.f322471a, new rl8.d(this, 24));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
