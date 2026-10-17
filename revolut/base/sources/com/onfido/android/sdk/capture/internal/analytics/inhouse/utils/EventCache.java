package com.onfido.android.sdk.capture.internal.analytics.inhouse.utils;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/utils/EventCache;", "", "()V", "events", "", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "kotlin.jvm.PlatformType", "", "addEvent", "", "event", "getEvents", "removeEvent", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EventCache {
    private final Collection<AnalyticsEvent> events = Collections.synchronizedCollection(new ArrayList());

    public final void addEvent(@NotNull AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.events.add(event);
    }

    @NotNull
    public final Collection<AnalyticsEvent> getEvents() {
        Collection<AnalyticsEvent> events = this.events;
        Intrinsics.checkNotNullExpressionValue(events, "events");
        return events;
    }

    public final void removeEvent(@NotNull AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.events.remove(event);
    }
}
