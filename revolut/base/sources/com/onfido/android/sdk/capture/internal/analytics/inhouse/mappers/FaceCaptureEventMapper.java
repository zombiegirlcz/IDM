package com.onfido.android.sdk.capture.internal.analytics.inhouse.mappers;

import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEvent;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEventType;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsPropertyKey;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import j6.a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/mappers/FaceCaptureEventMapper;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/mappers/PublicAnalyticsEventMapper;", "()V", "screenName", "", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "getScreenName", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;)Ljava/lang/String;", "map", "Lcom/onfido/android/sdk/capture/analytics/OnfidoAnalyticsEvent;", "event", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FaceCaptureEventMapper implements PublicAnalyticsEventMapper {
    private final String getScreenName(AnalyticsEvent analyticsEvent) {
        if (Intrinsics.f(analyticsEvent.getEvent().getName(), "FACE_VIDEO_CAPTURE")) {
            Object obj2 = analyticsEvent.getProperties().get("video_capture_step");
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str != null) {
                return a.q("VIDEO_FACIAL_CAPTURE_STEP_", f0.V0(1, str));
            }
        }
        return null;
    }

    @Override // com.onfido.android.sdk.capture.internal.analytics.inhouse.mappers.PublicAnalyticsEventMapper
    public OnfidoAnalyticsEvent map(@NotNull AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String[] elements = {"FACE_SELFIE_CAPTURE", "FACE_VIDEO_CAPTURE", "FACE_SELFIE_CONFIRMATION", "FACE_VIDEO_CONFIRMATION"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean zContains = d.y0(elements).contains(event.getEvent().getName());
        OnfidoAnalyticsEventType publicType = event.getEvent().getPublicType();
        String screenName = getScreenName(event);
        if (screenName == null) {
            screenName = event.getEvent().getPublicName();
        }
        if (!zContains || publicType == null || screenName == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OnfidoAnalyticsPropertyKey.SCREEN_NAME, screenName);
        linkedHashMap.put(OnfidoAnalyticsPropertyKey.SCREEN_MODE, EventMappingHelper.INSTANCE.getScreenMode(event));
        Object obj2 = event.getProperties().get("liveness_challenge_type");
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str != null) {
            linkedHashMap.put(OnfidoAnalyticsPropertyKey.VIDEO_CHALLENGE_TYPE, str);
        }
        return new OnfidoAnalyticsEvent(publicType, linkedHashMap);
    }
}
