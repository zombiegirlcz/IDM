package com.onfido.android.sdk.capture.internal.analytics.inhouse.mappers;

import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEvent;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEventType;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsPropertyKey;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;
import zhm.q0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\n0\tJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/mappers/PublicEventMapper;", "", "()V", "mappers", "", "", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/mappers/PublicAnalyticsEventMapper;", "addMappers", "", "", "Lkotlin/Pair;", "map", "Lcom/onfido/android/sdk/capture/analytics/OnfidoAnalyticsEvent;", "event", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PublicEventMapper {

    @NotNull
    private final Map<String, PublicAnalyticsEventMapper> mappers = new LinkedHashMap();

    public final void addMappers(@NotNull List<? extends Pair<String, ? extends PublicAnalyticsEventMapper>> mappers) {
        Intrinsics.checkNotNullParameter(mappers, "mappers");
        Iterator<T> it8 = mappers.iterator();
        while (it8.hasNext()) {
            Pair pair = (Pair) it8.next();
            String str = (String) pair.f186385a;
            PublicAnalyticsEventMapper publicAnalyticsEventMapper = (PublicAnalyticsEventMapper) pair.f186386b;
            if (this.mappers.get(str) != null) {
                throw new IllegalArgumentException(a.p("An existing analytics mapper exists for ", str, " event. Overriding mappers is not allowed"));
            }
            this.mappers.put(str, publicAnalyticsEventMapper);
        }
    }

    public final OnfidoAnalyticsEvent map(@NotNull AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        OnfidoAnalyticsEventType publicType = event.getEvent().getPublicType();
        if (publicType == null) {
            return null;
        }
        PublicAnalyticsEventMapper publicAnalyticsEventMapper = this.mappers.get(event.getEvent().getName());
        if (publicAnalyticsEventMapper != null) {
            return publicAnalyticsEventMapper.map(event);
        }
        String publicName = event.getEvent().getPublicName();
        if (publicName != null) {
            return new OnfidoAnalyticsEvent(publicType, q0.c(new Pair(OnfidoAnalyticsPropertyKey.SCREEN_NAME, publicName)));
        }
        return null;
    }
}
