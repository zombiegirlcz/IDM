package com.onfido.android.sdk.capture.internal.analytics.inhouse;

import com.onfido.android.sdk.FlowConfig;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.ApplicantInfo;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.UiAlerts;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.network.AnalyticsEventNetworkModel;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.network.AnalyticsRequest;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.network.EventMetaData;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.network.SdkConfig;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.network.SourceMetaData;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.network.UiAlertsNetwork;
import com.onfido.android.sdk.capture.internal.util.SessionIdProvider;
import com.onfido.android.sdk.capture.internal.util.environment.EnvironmentIntegrityChecker;
import com.onfido.android.sdk.capture.utils.DeviceMetadataProvider;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.android.sdk.capture.utils.UuidProvider;
import com.onfido.api.client.data.DeviceMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jh.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import rlm.j;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J*\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"H\u0002J \u0010&\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"H\u0002J\f\u0010'\u001a\u00020$*\u00020\u0001H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalyticsMapper;", "", "timeProvider", "Lcom/onfido/android/sdk/capture/utils/TimeProvider;", "uuidProvider", "Lcom/onfido/android/sdk/capture/utils/UuidProvider;", "metadataProvider", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/AnalyticsMetadataProvider;", "onfidoConfig", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "sessionIdProvider", "Lcom/onfido/android/sdk/capture/internal/util/SessionIdProvider;", "sdkTokenParser", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/SdkTokenParser;", "deviceMetadataProvider", "Lcom/onfido/android/sdk/capture/utils/DeviceMetadataProvider;", "jsonParser", "Lkotlinx/serialization/json/Json;", "environmentIntegrityChecker", "Lcom/onfido/android/sdk/capture/internal/util/environment/EnvironmentIntegrityChecker;", "identityInteractor", "Lcom/onfido/android/sdk/capture/analytics/IdentityInteractor;", "(Lcom/onfido/android/sdk/capture/utils/TimeProvider;Lcom/onfido/android/sdk/capture/utils/UuidProvider;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/AnalyticsMetadataProvider;Lcom/onfido/android/sdk/capture/OnfidoConfig;Lcom/onfido/android/sdk/capture/internal/util/SessionIdProvider;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/SdkTokenParser;Lcom/onfido/android/sdk/capture/utils/DeviceMetadataProvider;Lkotlinx/serialization/json/Json;Lcom/onfido/android/sdk/capture/internal/util/environment/EnvironmentIntegrityChecker;Lcom/onfido/android/sdk/capture/analytics/IdentityInteractor;)V", "getEventMetadata", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/EventMetaData;", "getSdkConfig", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SdkConfig;", "getSourceMetaData", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SourceMetaData;", "mapEventToRequest", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/AnalyticsRequest;", "event", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "mapProperties", "", "", "Lkotlinx/serialization/json/JsonElement;", "properties", "mapValuesToJsonElement", "toJsonElement", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnfidoAnalyticsMapper {

    @NotNull
    private final DeviceMetadataProvider deviceMetadataProvider;

    @NotNull
    private final EnvironmentIntegrityChecker environmentIntegrityChecker;

    @NotNull
    private final IdentityInteractor identityInteractor;

    @NotNull
    private final Json jsonParser;

    @NotNull
    private final AnalyticsMetadataProvider metadataProvider;

    @NotNull
    private final OnfidoConfig onfidoConfig;

    @NotNull
    private final SdkTokenParser sdkTokenParser;

    @NotNull
    private final SessionIdProvider sessionIdProvider;

    @NotNull
    private final TimeProvider timeProvider;

    @NotNull
    private final UuidProvider uuidProvider;

    public OnfidoAnalyticsMapper(@NotNull TimeProvider timeProvider, @NotNull UuidProvider uuidProvider, @NotNull AnalyticsMetadataProvider metadataProvider, @NotNull OnfidoConfig onfidoConfig, @NotNull SessionIdProvider sessionIdProvider, @NotNull SdkTokenParser sdkTokenParser, @NotNull DeviceMetadataProvider deviceMetadataProvider, @NotNull Json jsonParser, @NotNull EnvironmentIntegrityChecker environmentIntegrityChecker, @NotNull IdentityInteractor identityInteractor) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(uuidProvider, "uuidProvider");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
        Intrinsics.checkNotNullParameter(sessionIdProvider, "sessionIdProvider");
        Intrinsics.checkNotNullParameter(sdkTokenParser, "sdkTokenParser");
        Intrinsics.checkNotNullParameter(deviceMetadataProvider, "deviceMetadataProvider");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        Intrinsics.checkNotNullParameter(environmentIntegrityChecker, "environmentIntegrityChecker");
        Intrinsics.checkNotNullParameter(identityInteractor, "identityInteractor");
        this.timeProvider = timeProvider;
        this.uuidProvider = uuidProvider;
        this.metadataProvider = metadataProvider;
        this.onfidoConfig = onfidoConfig;
        this.sessionIdProvider = sessionIdProvider;
        this.sdkTokenParser = sdkTokenParser;
        this.deviceMetadataProvider = deviceMetadataProvider;
        this.jsonParser = jsonParser;
        this.environmentIntegrityChecker = environmentIntegrityChecker;
        this.identityInteractor = identityInteractor;
    }

    private final EventMetaData getEventMetadata() {
        DeviceMetadata deviceMetadataProvideDeviceMetadata = this.deviceMetadataProvider.provideDeviceMetadata();
        String os4 = this.metadataProvider.getOs();
        String oSVersion = this.metadataProvider.getOSVersion();
        String fingerprint = deviceMetadataProvideDeviceMetadata.getFingerprint();
        String model = deviceMetadataProvideDeviceMetadata.getModel();
        String manufacturer = deviceMetadataProvideDeviceMetadata.getManufacturer();
        String brand = deviceMetadataProvideDeviceMetadata.getBrand();
        String product = deviceMetadataProvideDeviceMetadata.getProduct();
        String hardware = deviceMetadataProvideDeviceMetadata.getHardware();
        String androidApiLevel = deviceMetadataProvideDeviceMetadata.getAndroidApiLevel();
        String minOsVersion$onfido_capture_sdk_core_release = this.identityInteractor.getMinOsVersion$onfido_capture_sdk_core_release();
        String applicationId$onfido_capture_sdk_core_release = this.identityInteractor.getApplicationId$onfido_capture_sdk_core_release();
        String applicationVersion$onfido_capture_sdk_core_release = this.identityInteractor.getApplicationVersion$onfido_capture_sdk_core_release();
        Intrinsics.h(applicationId$onfido_capture_sdk_core_release);
        return new EventMetaData(os4, oSVersion, minOsVersion$onfido_capture_sdk_core_release, fingerprint, model, manufacturer, brand, product, hardware, androidApiLevel, applicationVersion$onfido_capture_sdk_core_release, applicationId$onfido_capture_sdk_core_release);
    }

    private final SdkConfig getSdkConfig() {
        return new SdkConfig(d0.k0(this.onfidoConfig.getFlowSteps(), ",", null, null, 0, OnfidoAnalyticsMapper$getSdkConfig$expectedFlowSteps$1.INSTANCE, 30), f0.f322471a);
    }

    private final SourceMetaData getSourceMetaData() {
        return new SourceMetaData(this.metadataProvider.getSdkName(), this.metadataProvider.getSdkVersion(), "release", Boolean.valueOf(this.environmentIntegrityChecker.hasEnvironmentIntegrity()));
    }

    private final Map<String, JsonElement> mapProperties(Map<String, ? extends Object> properties) {
        return mapValuesToJsonElement(properties);
    }

    private final Map<String, JsonElement> mapValuesToJsonElement(Map<?, ?> map) {
        Set<Map.Entry<?, ?>> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Pair pair = (!(key instanceof String) || value == null) ? null : new Pair(key, toJsonElement(value));
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return r0.t(arrayList);
    }

    private final JsonElement toJsonElement(Object obj2) {
        String string;
        if (obj2 instanceof UiAlerts) {
            Json json = this.jsonParser;
            string = json.c(d.v(json.f187949b, o0.b(UiAlertsNetwork.class)), UiAlertsNetwork.INSTANCE.fromUiAlerts((UiAlerts) obj2));
        } else if (obj2 instanceof Enum) {
            String strName = ((Enum) obj2).name();
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            string = strName.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
        } else {
            if (obj2 instanceof Map) {
                return new JsonObject(mapValuesToJsonElement((Map) obj2));
            }
            string = obj2.toString();
        }
        return j.c(string);
    }

    @NotNull
    public final AnalyticsRequest mapEventToRequest(@NotNull AnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String strName = event.getEvent().getInHouseType().name();
        Locale locale = Locale.US;
        Map<String, JsonElement> mapMapProperties = mapProperties(r0.p(event.getProperties(), q0.c(new Pair("event_type", p.a.r(locale, "US", strName, locale, "toLowerCase(...)")))));
        ApplicantInfo applicantInfo = this.sdkTokenParser.getApplicantInfo(this.onfidoConfig.getToken().f50152a);
        FlowConfig workflowConfig = this.onfidoConfig.getWorkflowConfig();
        String workflowRunId = workflowConfig != null ? workflowConfig.getWorkflowRunId() : null;
        String name = event.getEvent().getName();
        String currentTimeIsoFormat = this.timeProvider.getCurrentTimeIsoFormat();
        String randomUuid = this.uuidProvider.getRandomUuid();
        String applicantUuid = applicantInfo != null ? applicantInfo.getApplicantUuid() : null;
        if (applicantUuid == null) {
            applicantUuid = "";
        }
        String persistedUuid = this.uuidProvider.getPersistedUuid();
        String clientUuid = applicantInfo != null ? applicantInfo.getClientUuid() : null;
        return new AnalyticsRequest(u.c(new AnalyticsEventNetworkModel(name, randomUuid, workflowRunId, currentTimeIsoFormat, "sdk", applicantUuid, persistedUuid, clientUuid == null ? "" : clientUuid, this.sessionIdProvider.getSessionId(), mapMapProperties, getSourceMetaData(), getEventMetadata(), getSdkConfig())));
    }
}
