package com.onfido.android.sdk.capture.internal.analytics.inhouse.mappers;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEvent;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEventType;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsPropertyKey;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.api.client.data.DocSide;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0018\u0010\u0015\u001a\u00020\u0013*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/mappers/DocumentCaptureEventMapper;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/mappers/PublicAnalyticsEventMapper;", "()V", "docSideProperty", "Lcom/onfido/api/client/data/DocSide;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "getDocSideProperty", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;)Lcom/onfido/api/client/data/DocSide;", "docTypeProperty", "Lcom/onfido/android/sdk/capture/DocumentType;", "getDocTypeProperty", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;)Lcom/onfido/android/sdk/capture/DocumentType;", "documentCapturePublicProperties", "", "Lcom/onfido/android/sdk/capture/analytics/OnfidoAnalyticsPropertyKey;", "", "getDocumentCapturePublicProperties", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;)Ljava/util/Map;", "isFrontSideDoc", "", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;)Z", "isPassportOrVisaDocumentCapture", "getCaptureScreenName", "event", "getConfirmationScreenName", "getScreenName", "map", "Lcom/onfido/android/sdk/capture/analytics/OnfidoAnalyticsEvent;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureEventMapper implements PublicAnalyticsEventMapper {

    @Deprecated
    @NotNull
    public static final String SCREEN_DOC_CONFIRMATION_FRONT = "DOCUMENT_CAPTURE_CONFIRMATION_FRONT";

    @Deprecated
    @NotNull
    public static final String SCREEN_DOC_CAPTURE_BACK = "DOCUMENT_CAPTURE_BACK";

    @Deprecated
    @NotNull
    public static final String SCREEN_DOC_CAPTURE_FRONT = "DOCUMENT_CAPTURE_FRONT";

    @Deprecated
    @NotNull
    public static final String SCREEN_DOC_CAPTURE = "DOCUMENT_CAPTURE";

    @Deprecated
    @NotNull
    public static final String SCREEN_DOC_CONFIRMATION = "DOCUMENT_CAPTURE_CONFIRMATION";

    @Deprecated
    @NotNull
    public static final String SCREEN_DOC_CONFIRMATION_BACK = "DOCUMENT_CAPTURE_CONFIRMATION_BACK";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/mappers/DocumentCaptureEventMapper$Companion;", "", "()V", "SCREEN_DOC_CAPTURE", "", "SCREEN_DOC_CAPTURE_BACK", "SCREEN_DOC_CAPTURE_FRONT", "SCREEN_DOC_CONFIRMATION", "SCREEN_DOC_CONFIRMATION_BACK", "SCREEN_DOC_CONFIRMATION_FRONT", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final String getCaptureScreenName(AnalyticsEvent event) {
        if (Intrinsics.f(event.getEvent().getName(), "DOCUMENT_CAPTURE")) {
            return isPassportOrVisaDocumentCapture(event) ? "DOCUMENT_CAPTURE" : isFrontSideDoc(event) ? "DOCUMENT_CAPTURE_FRONT" : "DOCUMENT_CAPTURE_BACK";
        }
        return null;
    }

    private final String getConfirmationScreenName(AnalyticsEvent event) {
        if (Intrinsics.f(event.getEvent().getName(), "DOCUMENT_CONFIRMATION")) {
            return isPassportOrVisaDocumentCapture(event) ? "DOCUMENT_CAPTURE_CONFIRMATION" : isFrontSideDoc(event) ? "DOCUMENT_CAPTURE_CONFIRMATION_FRONT" : "DOCUMENT_CAPTURE_CONFIRMATION_BACK";
        }
        return null;
    }

    private final DocSide getDocSideProperty(AnalyticsEvent analyticsEvent) {
        Object obj2 = analyticsEvent.getProperties().get("document_side");
        if (obj2 instanceof DocSide) {
            return (DocSide) obj2;
        }
        return null;
    }

    private final DocumentType getDocTypeProperty(AnalyticsEvent analyticsEvent) {
        Object obj2 = analyticsEvent.getProperties().get("document_type");
        if (obj2 instanceof DocumentType) {
            return (DocumentType) obj2;
        }
        return null;
    }

    private final Map<OnfidoAnalyticsPropertyKey, String> getDocumentCapturePublicProperties(AnalyticsEvent analyticsEvent) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj2 = analyticsEvent.getProperties().get("country_code");
        CountryCode countryCode = obj2 instanceof CountryCode ? (CountryCode) obj2 : null;
        linkedHashMap.put(OnfidoAnalyticsPropertyKey.SCREEN_MODE, EventMappingHelper.INSTANCE.getScreenMode(analyticsEvent));
        DocumentType docTypeProperty = getDocTypeProperty(analyticsEvent);
        if (docTypeProperty != null) {
            linkedHashMap.put(OnfidoAnalyticsPropertyKey.DOCUMENT_TYPE, docTypeProperty.getId());
        }
        if (countryCode != null) {
            linkedHashMap.put(OnfidoAnalyticsPropertyKey.COUNTRY_CODE, countryCode.name());
        }
        return linkedHashMap;
    }

    private final String getScreenName(AnalyticsEvent event) {
        String name = event.getEvent().getName();
        if (Intrinsics.f(name, "DOCUMENT_CAPTURE")) {
            return getCaptureScreenName(event);
        }
        if (Intrinsics.f(name, "DOCUMENT_CONFIRMATION")) {
            return getConfirmationScreenName(event);
        }
        return null;
    }

    private final boolean isFrontSideDoc(AnalyticsEvent analyticsEvent) {
        return getDocSideProperty(analyticsEvent) == DocSide.FRONT;
    }

    private final boolean isPassportOrVisaDocumentCapture(AnalyticsEvent analyticsEvent) {
        DocumentType[] elements = {DocumentType.PASSPORT, DocumentType.VISA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.T(d.y0(elements), getDocTypeProperty(analyticsEvent));
    }

    @Override // com.onfido.android.sdk.capture.internal.analytics.inhouse.mappers.PublicAnalyticsEventMapper
    public OnfidoAnalyticsEvent map(@NotNull AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String[] elements = {"DOCUMENT_CAPTURE", "DOCUMENT_CONFIRMATION"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean zContains = d.y0(elements).contains(event.getEvent().getName());
        OnfidoAnalyticsEventType publicType = event.getEvent().getPublicType();
        String screenName = getScreenName(event);
        if (screenName == null) {
            screenName = event.getEvent().getPublicName();
        }
        boolean z = !isPassportOrVisaDocumentCapture(event) && getDocSideProperty(event) == null;
        if (!zContains || publicType == null || screenName == null || z) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OnfidoAnalyticsPropertyKey.SCREEN_NAME, screenName);
        linkedHashMap.putAll(getDocumentCapturePublicProperties(event));
        return new OnfidoAnalyticsEvent(publicType, linkedHashMap);
    }
}
