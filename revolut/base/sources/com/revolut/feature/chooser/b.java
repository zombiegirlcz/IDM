package com.revolut.feature.chooser;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.chooser.ChooserConfiguration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f65914a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExplicitActivityDestination f65915b = new ExplicitActivityDestination(ChooserActivity.class);

    private b() {
    }

    public static ActivityNavigateCommand a(b bVar, f0 items, String flowName, String str, String str2, ChooserConfiguration.ConfigurationType configurationType, int i) {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.o;
        companion.getClass();
        AnalyticsProduct.Companion.a(k9Var);
        AnalyticsProduct.Retail automaticEventProduct = new AnalyticsProduct.Retail(k9Var);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(configurationType, "configurationType");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        return new ActivityNavigateCommand(f65915b, new ChooserConfiguration(items, configurationType, flowName, true, str, str2, true, i, automaticEventProduct, false, 8736), null, 201, 0, null, null, null, null, false, 1012);
    }
}
