package com.revolut.analytics.tracking.v3;

import com.revolut.analytics.tracking.v3.fail_fast.exceptions.FailFastAnalyticsException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/analytics/tracking/v3/UnsupportedMetadataType;", "Lcom/revolut/analytics/tracking/v3/fail_fast/exceptions/FailFastAnalyticsException;", "analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnsupportedMetadataType extends FailFastAnalyticsException {
    public UnsupportedMetadataType(Object obj2) {
        super(j6.a.q("Unsupported metadata type: ", obj2 != null ? obj2.getClass().getName() : null));
    }
}
