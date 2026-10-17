package com.onfido.android.sdk.capture.internal.util.logging.network;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 S2\u00020\u0001:\u0002RSBµ\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0001\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018By\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0019J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0011HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010;\u001a\u00020\u0015HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\u0015\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u008f\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\t\u0010I\u001a\u00020\u0005HÖ\u0001J&\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PHÁ\u0001¢\u0006\u0002\bQR\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\u001dR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001dR(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010-R\u001c\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001b\u001a\u0004\b/\u00100R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010\u001dR\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001b\u001a\u0004\b4\u0010\u001dR\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u001b\u001a\u0004\b6\u00107¨\u0006T"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/network/LogBody;", "", "seen1", "", "event", "", "eventUuid", "eventTime", "source", "applicantUuid", "anonymousUuid", "clientUuid", "sessionUuid", "properties", "", "Lkotlinx/serialization/json/JsonElement;", "sourceMetadata", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/SourceMetadata;", "eventMetadata", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/EventMetadata;", "sdkConfig", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/SdkConfig;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/onfido/android/sdk/capture/internal/util/logging/network/SourceMetadata;Lcom/onfido/android/sdk/capture/internal/util/logging/network/EventMetadata;Lcom/onfido/android/sdk/capture/internal/util/logging/network/SdkConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/onfido/android/sdk/capture/internal/util/logging/network/SourceMetadata;Lcom/onfido/android/sdk/capture/internal/util/logging/network/EventMetadata;Lcom/onfido/android/sdk/capture/internal/util/logging/network/SdkConfig;)V", "getAnonymousUuid$annotations", "()V", "getAnonymousUuid", "()Ljava/lang/String;", "getApplicantUuid$annotations", "getApplicantUuid", "getClientUuid$annotations", "getClientUuid", "getEvent$annotations", "getEvent", "getEventMetadata$annotations", "getEventMetadata", "()Lcom/onfido/android/sdk/capture/internal/util/logging/network/EventMetadata;", "getEventTime$annotations", "getEventTime", "getEventUuid$annotations", "getEventUuid", "getProperties$annotations", "getProperties", "()Ljava/util/Map;", "getSdkConfig$annotations", "getSdkConfig", "()Lcom/onfido/android/sdk/capture/internal/util/logging/network/SdkConfig;", "getSessionUuid$annotations", "getSessionUuid", "getSource$annotations", "getSource", "getSourceMetadata$annotations", "getSourceMetadata", "()Lcom/onfido/android/sdk/capture/internal/util/logging/network/SourceMetadata;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class LogBody {

    @NotNull
    private final String anonymousUuid;

    @NotNull
    private final String applicantUuid;

    @NotNull
    private final String clientUuid;

    @NotNull
    private final String event;
    private final EventMetadata eventMetadata;

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
    private final SourceMetadata sourceMetadata;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KSerializer[] $childSerializers = {null, null, null, null, null, null, null, null, new h0(v1.f247718a, k.f255111a, 1), null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/network/LogBody$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/LogBody;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return LogBody$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @d
    public /* synthetic */ LogBody(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, SourceMetadata sourceMetadata, EventMetadata eventMetadata, SdkConfig sdkConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if (2807 != (i & NearbyMessagesStatusCodes.MISSING_PERMISSIONS)) {
            j1.f(LogBody$$serializer.INSTANCE.getDescriptor(), i, NearbyMessagesStatusCodes.MISSING_PERMISSIONS);
            throw null;
        }
        this.event = str;
        this.eventUuid = str2;
        this.eventTime = str3;
        if ((i & 8) == 0) {
            this.source = "sdk";
        } else {
            this.source = str4;
        }
        this.applicantUuid = str5;
        this.anonymousUuid = str6;
        this.clientUuid = str7;
        this.sessionUuid = str8;
        if ((i & 256) == 0) {
            this.properties = r0.g();
        } else {
            this.properties = map;
        }
        this.sourceMetadata = sourceMetadata;
        if ((i & 1024) == 0) {
            this.eventMetadata = null;
        } else {
            this.eventMetadata = eventMetadata;
        }
        this.sdkConfig = sdkConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogBody copy$default(LogBody logBody, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, SourceMetadata sourceMetadata, EventMetadata eventMetadata, SdkConfig sdkConfig, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = logBody.event;
        }
        if ((i & 2) != 0) {
            str2 = logBody.eventUuid;
        }
        if ((i & 4) != 0) {
            str3 = logBody.eventTime;
        }
        if ((i & 8) != 0) {
            str4 = logBody.source;
        }
        if ((i & 16) != 0) {
            str5 = logBody.applicantUuid;
        }
        if ((i & 32) != 0) {
            str6 = logBody.anonymousUuid;
        }
        if ((i & 64) != 0) {
            str7 = logBody.clientUuid;
        }
        if ((i & 128) != 0) {
            str8 = logBody.sessionUuid;
        }
        if ((i & 256) != 0) {
            map = logBody.properties;
        }
        if ((i & 512) != 0) {
            sourceMetadata = logBody.sourceMetadata;
        }
        if ((i & 1024) != 0) {
            eventMetadata = logBody.eventMetadata;
        }
        if ((i & 2048) != 0) {
            sdkConfig = logBody.sdkConfig;
        }
        EventMetadata eventMetadata2 = eventMetadata;
        SdkConfig sdkConfig2 = sdkConfig;
        Map map2 = map;
        SourceMetadata sourceMetadata2 = sourceMetadata;
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return logBody.copy(str, str2, str3, str4, str11, str12, str9, str10, map2, sourceMetadata2, eventMetadata2, sdkConfig2);
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

    public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(LogBody self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.event);
        output.encodeStringElement(serialDesc, 1, self.eventUuid);
        output.encodeStringElement(serialDesc, 2, self.eventTime);
        if (output.d(serialDesc) || !Intrinsics.f(self.source, "sdk")) {
            output.encodeStringElement(serialDesc, 3, self.source);
        }
        output.encodeStringElement(serialDesc, 4, self.applicantUuid);
        output.encodeStringElement(serialDesc, 5, self.anonymousUuid);
        output.encodeStringElement(serialDesc, 6, self.clientUuid);
        output.encodeStringElement(serialDesc, 7, self.sessionUuid);
        if (output.d(serialDesc) || !Intrinsics.f(self.properties, r0.g())) {
            output.encodeSerializableElement(serialDesc, 8, kSerializerArr[8], self.properties);
        }
        output.encodeSerializableElement(serialDesc, 9, SourceMetadata$$serializer.INSTANCE, self.sourceMetadata);
        if (output.d(serialDesc) || self.eventMetadata != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, EventMetadata$$serializer.INSTANCE, self.eventMetadata);
        }
        output.encodeSerializableElement(serialDesc, 11, SdkConfig$$serializer.INSTANCE, self.sdkConfig);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final SourceMetadata getSourceMetadata() {
        return this.sourceMetadata;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final EventMetadata getEventMetadata() {
        return this.eventMetadata;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final SdkConfig getSdkConfig() {
        return this.sdkConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventUuid() {
        return this.eventUuid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEventTime() {
        return this.eventTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getApplicantUuid() {
        return this.applicantUuid;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAnonymousUuid() {
        return this.anonymousUuid;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getClientUuid() {
        return this.clientUuid;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSessionUuid() {
        return this.sessionUuid;
    }

    @NotNull
    public final Map<String, JsonElement> component9() {
        return this.properties;
    }

    @NotNull
    public final LogBody copy(@NotNull String event, @NotNull String eventUuid, @NotNull String eventTime, @NotNull String source, @NotNull String applicantUuid, @NotNull String anonymousUuid, @NotNull String clientUuid, @NotNull String sessionUuid, @NotNull Map<String, ? extends JsonElement> properties, @NotNull SourceMetadata sourceMetadata, EventMetadata eventMetadata, @NotNull SdkConfig sdkConfig) {
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
        return new LogBody(event, eventUuid, eventTime, source, applicantUuid, anonymousUuid, clientUuid, sessionUuid, properties, sourceMetadata, eventMetadata, sdkConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogBody)) {
            return false;
        }
        LogBody logBody = (LogBody) other;
        return Intrinsics.f(this.event, logBody.event) && Intrinsics.f(this.eventUuid, logBody.eventUuid) && Intrinsics.f(this.eventTime, logBody.eventTime) && Intrinsics.f(this.source, logBody.source) && Intrinsics.f(this.applicantUuid, logBody.applicantUuid) && Intrinsics.f(this.anonymousUuid, logBody.anonymousUuid) && Intrinsics.f(this.clientUuid, logBody.clientUuid) && Intrinsics.f(this.sessionUuid, logBody.sessionUuid) && Intrinsics.f(this.properties, logBody.properties) && Intrinsics.f(this.sourceMetadata, logBody.sourceMetadata) && Intrinsics.f(this.eventMetadata, logBody.eventMetadata) && Intrinsics.f(this.sdkConfig, logBody.sdkConfig);
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

    public final EventMetadata getEventMetadata() {
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
    public final SourceMetadata getSourceMetadata() {
        return this.sourceMetadata;
    }

    public int hashCode() {
        int iHashCode = (this.sourceMetadata.hashCode() + a.e(a.c(a.c(a.c(a.c(a.c(a.c(a.c(this.event.hashCode() * 31, 31, this.eventUuid), 31, this.eventTime), 31, this.source), 31, this.applicantUuid), 31, this.anonymousUuid), 31, this.clientUuid), 31, this.sessionUuid), 31, this.properties)) * 31;
        EventMetadata eventMetadata = this.eventMetadata;
        return this.sdkConfig.hashCode() + ((iHashCode + (eventMetadata == null ? 0 : eventMetadata.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "LogBody(event=" + this.event + ", eventUuid=" + this.eventUuid + ", eventTime=" + this.eventTime + ", source=" + this.source + ", applicantUuid=" + this.applicantUuid + ", anonymousUuid=" + this.anonymousUuid + ", clientUuid=" + this.clientUuid + ", sessionUuid=" + this.sessionUuid + ", properties=" + this.properties + ", sourceMetadata=" + this.sourceMetadata + ", eventMetadata=" + this.eventMetadata + ", sdkConfig=" + this.sdkConfig + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LogBody(@NotNull String event, @NotNull String eventUuid, @NotNull String eventTime, @NotNull String source, @NotNull String applicantUuid, @NotNull String anonymousUuid, @NotNull String clientUuid, @NotNull String sessionUuid, @NotNull Map<String, ? extends JsonElement> properties, @NotNull SourceMetadata sourceMetadata, EventMetadata eventMetadata, @NotNull SdkConfig sdkConfig) {
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
        this.eventTime = eventTime;
        this.source = source;
        this.applicantUuid = applicantUuid;
        this.anonymousUuid = anonymousUuid;
        this.clientUuid = clientUuid;
        this.sessionUuid = sessionUuid;
        this.properties = properties;
        this.sourceMetadata = sourceMetadata;
        this.eventMetadata = eventMetadata;
        this.sdkConfig = sdkConfig;
    }

    public /* synthetic */ LogBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, SourceMetadata sourceMetadata, EventMetadata eventMetadata, SdkConfig sdkConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "sdk" : str4, str5, str6, str7, str8, (i & 256) != 0 ? r0.g() : map, sourceMetadata, (i & 1024) != 0 ? null : eventMetadata, sdkConfig);
    }
}
