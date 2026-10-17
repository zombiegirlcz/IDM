package com.onfido.hosted.web.module;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.EventType;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0000¨\u0006\u0006"}, d2 = {"getEventTypeFromProperties", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/EventType;", "properties", "", "", "", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HostedWebModuleViewModelKt {
    @NotNull
    public static final EventType getEventTypeFromProperties(Map<String, ? extends Object> map) {
        Object obj2 = null;
        Object obj3 = map != null ? map.get("event_type") : null;
        Iterator<E> it8 = EventType.getEntries().iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            String lowerCase = ((EventType) next).name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.f(lowerCase, obj3)) {
                obj2 = next;
                break;
            }
        }
        EventType eventType = (EventType) obj2;
        return eventType == null ? EventType.ACTION : eventType;
    }
}
