package com.revolut.analytics.tracking.v3.provider;

import com.revolut.analytics.tracking.GroupedByTypeException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/analytics/tracking/v3/provider/WrongProductTypeException;", "Lcom/revolut/analytics/tracking/GroupedByTypeException;", "analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WrongProductTypeException extends GroupedByTypeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongProductTypeException(Object screen, String message) {
        super(screen.getClass(), message);
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
