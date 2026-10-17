package com.onfido.android.sdk.capture.internal.analytics.inhouse.network;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import p.a;
import qlm.h0;
import qlm.j1;
import qlm.v1;
import rlm.k;
import yhm.d;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 W2\u00020\u0001:\u0002VWBÁ\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0001\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019B\u0083\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u001aJ\t\u0010;\u001a\u00020\u0005HÆ\u0003J\u0015\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010=\u001a\u00020\u0012HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010?\u001a\u00020\u0016HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\u009b\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\u0003HÖ\u0001J\t\u0010M\u001a\u00020\u0005HÖ\u0001J&\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020THÁ\u0001¢\u0006\u0002\bUR\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010'R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001eR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001eR(\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010.R\u001c\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001c\u001a\u0004\b0\u00101R\u001c\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001c\u001a\u0004\b3\u0010\u001eR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001c\u001a\u0004\b5\u0010\u001eR\u001c\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001c\u001a\u0004\b7\u00108R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010\u001c\u001a\u0004\b:\u0010\u001e¨\u0006X"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/AnalyticsEventNetworkModel;", "", "seen1", "", "event", "", "eventUuid", "workflowRunUuid", "eventTime", "source", "applicantUuid", "anonymousUuid", "clientUuid", "sessionUuid", "properties", "", "Lkotlinx/serialization/json/JsonElement;", "sourceMetadata", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SourceMetaData;", "eventMetadata", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/EventMetaData;", "sdkConfig", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SdkConfig;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SourceMetaData;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/EventMetaData;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SdkConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SourceMetaData;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/EventMetaData;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SdkConfig;)V", "getAnonymousUuid$annotations", "()V", "getAnonymousUuid", "()Ljava/lang/String;", "getApplicantUuid$annotations", "getApplicantUuid", "getClientUuid$annotations", "getClientUuid", "getEvent$annotations", "getEvent", "getEventMetadata$annotations", "getEventMetadata", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/EventMetaData;", "getEventTime$annotations", "getEventTime", "getEventUuid$annotations", "getEventUuid", "getProperties$annotations", "getProperties", "()Ljava/util/Map;", "getSdkConfig$annotations", "getSdkConfig", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SdkConfig;", "getSessionUuid$annotations", "getSessionUuid", "getSource$annotations", "getSource", "getSourceMetadata$annotations", "getSourceMetadata", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/SourceMetaData;", "getWorkflowRunUuid$annotations", "getWorkflowRunUuid", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class AnalyticsEventNetworkModel {

    @NotNull
    private final String anonymousUuid;

    @NotNull
    private final String applicantUuid;

    @NotNull
    private final String clientUuid;

    @NotNull
    private final String event;
    private final EventMetaData eventMetadata;

    @NotNull
    private final String eventTime;

    @NotNull
    private final String eventUuid;

    @NotNull
    private final Map<String, JsonElement> properties;

    @NotNull
    private final SdkConfig sdkConfig;

    @NotNull
    private final String sessionUuid;

    @NotNull
    private final String source;

    @NotNull
    private final SourceMetaData sourceMetadata;
    private final String workflowRunUuid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KSerializer[] $childSerializers = {null, null, null, null, null, null, null, null, null, new h0(v1.f247718a, k.f255111a, 1), null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/AnalyticsEventNetworkModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/network/AnalyticsEventNetworkModel;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return AnalyticsEventNetworkModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @d
    public /* synthetic */ AnalyticsEventNetworkModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, SourceMetaData sourceMetaData, EventMetaData eventMetaData, SdkConfig sdkConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if (5615 != (i & 5615)) {
            j1.f(AnalyticsEventNetworkModel$$serializer.INSTANCE.getDescriptor(), i, 5615);
            throw null;
        }
        this.event = str;
        this.eventUuid = str2;
        this.workflowRunUuid = str3;
        this.eventTime = str4;
        if ((i & 16) == 0) {
            this.source = "sdk";
        } else {
            this.source = str5;
        }
        this.applicantUuid = str6;
        this.anonymousUuid = str7;
        this.clientUuid = str8;
        this.sessionUuid = str9;
        if ((i & 512) == 0) {
            this.properties = r0.g();
        } else {
            this.properties = map;
        }
        this.sourceMetadata = sourceMetaData;
        if ((i & 2048) == 0) {
            this.eventMetadata = null;
        } else {
            this.eventMetadata = eventMetaData;
        }
        this.sdkConfig = sdkConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsEventNetworkModel copy$default(AnalyticsEventNetworkModel analyticsEventNetworkModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, SourceMetaData sourceMetaData, EventMetaData eventMetaData, SdkConfig sdkConfig, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = analyticsEventNetworkModel.event;
        }
        return analyticsEventNetworkModel.copy(str, (i & 2) != 0 ? analyticsEventNetworkModel.eventUuid : str2, (i & 4) != 0 ? analyticsEventNetworkModel.workflowRunUuid : str3, (i & 8) != 0 ? analyticsEventNetworkModel.eventTime : str4, (i & 16) != 0 ? analyticsEventNetworkModel.source : str5, (i & 32) != 0 ? analyticsEventNetworkModel.applicantUuid : str6, (i & 64) != 0 ? analyticsEventNetworkModel.anonymousUuid : str7, (i & 128) != 0 ? analyticsEventNetworkModel.clientUuid : str8, (i & 256) != 0 ? analyticsEventNetworkModel.sessionUuid : str9, (i & 512) != 0 ? analyticsEventNetworkModel.properties : map, (i & 1024) != 0 ? analyticsEventNetworkModel.sourceMetadata : sourceMetaData, (i & 2048) != 0 ? analyticsEventNetworkModel.eventMetadata : eventMetaData, (i & 4096) != 0 ? analyticsEventNetworkModel.sdkConfig : sdkConfig);
    }

    public static /* synthetic */ void getAnonymousUuid$annotations() {
    }

    public static /* synthetic */ void getApplicantUuid$annotations() {
    }

    public static /* synthetic */ void getClientUuid$annotations() {
    }

    public static /* synthetic */ void getEvent$annotations() {
    }

    public static /* synthetic */ void getEventMetadata$annotations() {
    }

    public static /* synthetic */ void getEventTime$annotations() {
    }

    public static /* synthetic */ void getEventUuid$annotations() {
    }

    public static /* synthetic */ void getProperties$annotations() {
    }

    public static /* synthetic */ void getSdkConfig$annotations() {
    }

    public static /* synthetic */ void getSessionUuid$annotations() {
    }

    public static /* synthetic */ void getSource$annotations() {
    }

    public static /* synthetic */ void getSourceMetadata$annotations() {
    }

    public static /* synthetic */ void getWorkflowRunUuid$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(AnalyticsEventNetworkModel self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.event);
        output.encodeStringElement(serialDesc, 1, self.eventUuid);
        output.encodeNullableSerializableElement(serialDesc, 2, v1.f247718a, self.workflowRunUuid);
        output.encodeStringElement(serialDesc, 3, self.eventTime);
        if (output.d(serialDesc) || !Intrinsics.f(self.source, "sdk")) {
            output.encodeStringElement(serialDesc, 4, self.source);
        }
        output.encodeStringElement(serialDesc, 5, self.applicantUuid);
        output.encodeStringElement(serialDesc, 6, self.anonymousUuid);
        output.encodeStringElement(serialDesc, 7, self.clientUuid);
        output.encodeStringElement(serialDesc, 8, self.sessionUuid);
        if (output.d(serialDesc) || !Intrinsics.f(self.properties, r0.g())) {
            output.encodeSerializableElement(serialDesc, 9, kSerializerArr[9], self.properties);
        }
        output.encodeSerializableElement(serialDesc, 10, SourceMetaData$$serializer.INSTANCE, self.sourceMetadata);
        if (output.d(serialDesc) || self.eventMetadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, EventMetaData$$serializer.INSTANCE, self.eventMetadata);
        }
        output.encodeSerializableElement(serialDesc, 12, SdkConfig$$serializer.INSTANCE, self.sdkConfig);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    public final Map<String, JsonElement> component10() {
        return this.properties;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final SourceMetaData getSourceMetadata() {
        return this.sourceMetadata;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final EventMetaData getEventMetadata() {
        return this.eventMetadata;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final SdkConfig getSdkConfig() {
        return this.sdkConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventUuid() {
        return this.eventUuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWorkflowRunUuid() {
        return this.workflowRunUuid;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEventTime() {
        return this.eventTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getApplicantUuid() {
        return this.applicantUuid;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAnonymousUuid() {
        return this.anonymousUuid;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getClientUuid() {
        return this.clientUuid;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSessionUuid() {
        return this.sessionUuid;
    }

    @NotNull
    public final AnalyticsEventNetworkModel copy(@NotNull String event, @NotNull String eventUuid, String workflowRunUuid, @NotNull String eventTime, @NotNull String source, @NotNull String applicantUuid, @NotNull String anonymousUuid, @NotNull String clientUuid, @NotNull String sessionUuid, @NotNull Map<String, ? extends JsonElement> properties, @NotNull SourceMetaData sourceMetadata, EventMetaData eventMetadata, @NotNull SdkConfig sdkConfig) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(eventUuid, "eventUuid");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(applicantUuid, "applicantUuid");
        Intrinsics.checkNotNullParameter(anonymousUuid, "anonymousUuid");
        Intrinsics.checkNotNullParameter(clientUuid, "clientUuid");
        Intrinsics.checkNotNullParameter(sessionUuid, "sessionUuid");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(sourceMetadata, "sourceMetadata");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        return new AnalyticsEventNetworkModel(event, eventUuid, workflowRunUuid, eventTime, source, applicantUuid, anonymousUuid, clientUuid, sessionUuid, properties, sourceMetadata, eventMetadata, sdkConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsEventNetworkModel)) {
            return false;
        }
        AnalyticsEventNetworkModel analyticsEventNetworkModel = (AnalyticsEventNetworkModel) other;
        return Intrinsics.f(this.event, analyticsEventNetworkModel.event) && Intrinsics.f(this.eventUuid, analyticsEventNetworkModel.eventUuid) && Intrinsics.f(this.workflowRunUuid, analyticsEventNetworkModel.workflowRunUuid) && Intrinsics.f(this.eventTime, analyticsEventNetworkModel.eventTime) && Intrinsics.f(this.source, analyticsEventNetworkModel.source) && Intrinsics.f(this.applicantUuid, analyticsEventNetworkModel.applicantUuid) && Intrinsics.f(this.anonymousUuid, analyticsEventNetworkModel.anonymousUuid) && Intrinsics.f(this.clientUuid, analyticsEventNetworkModel.clientUuid) && Intrinsics.f(this.sessionUuid, analyticsEventNetworkModel.sessionUuid) && Intrinsics.f(this.properties, analyticsEventNetworkModel.properties) && Intrinsics.f(this.sourceMetadata, analyticsEventNetworkModel.sourceMetadata) && Intrinsics.f(this.eventMetadata, analyticsEventNetworkModel.eventMetadata) && Intrinsics.f(this.sdkConfig, analyticsEventNetworkModel.sdkConfig);
    }

    @NotNull
    public final String getAnonymousUuid() {
        return this.anonymousUuid;
    }

    @NotNull
    public final String getApplicantUuid() {
        return this.applicantUuid;
    }

    @NotNull
    public final String getClientUuid() {
        return this.clientUuid;
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    public final EventMetaData getEventMetadata() {
        return this.eventMetadata;
    }

    @NotNull
    public final String getEventTime() {
        return this.eventTime;
    }

    @NotNull
    public final String getEventUuid() {
        return this.eventUuid;
    }

    @NotNull
    public final Map<String, JsonElement> getProperties() {
        return this.properties;
    }

    @NotNull
    public final SdkConfig getSdkConfig() {
        return this.sdkConfig;
    }

    @NotNull
    public final String getSessionUuid() {
        return this.sessionUuid;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @NotNull
    public final SourceMetaData getSourceMetadata() {
        return this.sourceMetadata;
    }

    public final String getWorkflowRunUuid() {
        return this.workflowRunUuid;
    }

    public int hashCode() {
        int iC = a.c(this.event.hashCode() * 31, 31, this.eventUuid);
        String str = this.workflowRunUuid;
        int iHashCode = (this.sourceMetadata.hashCode() + a.e(a.c(a.c(a.c(a.c(a.c(a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.eventTime), 31, this.source), 31, this.applicantUuid), 31, this.anonymousUuid), 31, this.clientUuid), 31, this.sessionUuid), 31, this.properties)) * 31;
        EventMetaData eventMetaData = this.eventMetadata;
        return this.sdkConfig.hashCode() + ((iHashCode + (eventMetaData != null ? eventMetaData.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "AnalyticsEventNetworkModel(event=" + this.event + ", eventUuid=" + this.eventUuid + ", workflowRunUuid=" + this.workflowRunUuid + ", eventTime=" + this.eventTime + ", source=" + this.source + ", applicantUuid=" + this.applicantUuid + ", anonymousUuid=" + this.anonymousUuid + ", clientUuid=" + this.clientUuid + ", sessionUuid=" + this.sessionUuid + ", properties=" + this.properties + ", sourceMetadata=" + this.sourceMetadata + ", eventMetadata=" + this.eventMetadata + ", sdkConfig=" + this.sdkConfig + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsEventNetworkModel(@NotNull String event, @NotNull String eventUuid, String str, @NotNull String eventTime, @NotNull String source, @NotNull String applicantUuid, @NotNull String anonymousUuid, @NotNull String clientUuid, @NotNull String sessionUuid, @NotNull Map<String, ? extends JsonElement> properties, @NotNull SourceMetaData sourceMetadata, EventMetaData eventMetaData, @NotNull SdkConfig sdkConfig) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(eventUuid, "eventUuid");
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(applicantUuid, "applicantUuid");
        Intrinsics.checkNotNullParameter(anonymousUuid, "anonymousUuid");
        Intrinsics.checkNotNullParameter(clientUuid, "clientUuid");
        Intrinsics.checkNotNullParameter(sessionUuid, "sessionUuid");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(sourceMetadata, "sourceMetadata");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.event = event;
        this.eventUuid = eventUuid;
        this.workflowRunUuid = str;
        this.eventTime = eventTime;
        this.source = source;
        this.applicantUuid = applicantUuid;
        this.anonymousUuid = anonymousUuid;
        this.clientUuid = clientUuid;
        this.sessionUuid = sessionUuid;
        this.properties = properties;
        this.sourceMetadata = sourceMetadata;
        this.eventMetadata = eventMetaData;
        this.sdkConfig = sdkConfig;
    }

    public /* synthetic */ AnalyticsEventNetworkModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map, SourceMetaData sourceMetaData, EventMetaData eventMetaData, SdkConfig sdkConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? "sdk" : str5, str6, str7, str8, str9, (i & 512) != 0 ? r0.g() : map, sourceMetaData, (i & 2048) != 0 ? null : eventMetaData, sdkConfig);
    }
}
