package no;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h1 {
    public h1(com.revolut.analytics.tracking.v3.d diagnosticEventsTracker, com.revolut.retail.analytics.tracking.impl.a appAnalyticsToggles) {
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        Intrinsics.checkNotNullParameter(appAnalyticsToggles, "appAnalyticsToggles");
    }

    public final void a(String rawKey, String type) {
        Intrinsics.checkNotNullParameter(rawKey, "rawKey");
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
