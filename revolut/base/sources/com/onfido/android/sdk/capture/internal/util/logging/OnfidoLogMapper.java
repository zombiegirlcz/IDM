package com.onfido.android.sdk.capture.internal.util.logging;

import android.os.Build;
import cl.d;
import cl.e;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.internal.util.SessionIdProvider;
import com.onfido.android.sdk.capture.internal.util.logging.network.EventMetadata;
import com.onfido.android.sdk.capture.internal.util.logging.network.LogBody;
import com.onfido.android.sdk.capture.internal.util.logging.network.LoggerRequest;
import com.onfido.android.sdk.capture.internal.util.logging.network.SdkConfig;
import com.onfido.android.sdk.capture.internal.util.logging.network.SourceMetadata;
import com.onfido.android.sdk.capture.utils.DeviceMetadataProvider;
import com.onfido.android.sdk.capture.utils.UuidProvider;
import com.onfido.api.client.data.DeviceMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.a;
import org.jetbrains.annotations.NotNull;
import rlm.j;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/OnfidoLogMapper;", "", "uuidProvider", "Lcom/onfido/android/sdk/capture/utils/UuidProvider;", "onfidoConfig", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "sessionIdProvider", "Lcom/onfido/android/sdk/capture/internal/util/SessionIdProvider;", "deviceMetadataProvider", "Lcom/onfido/android/sdk/capture/utils/DeviceMetadataProvider;", "(Lcom/onfido/android/sdk/capture/utils/UuidProvider;Lcom/onfido/android/sdk/capture/OnfidoConfig;Lcom/onfido/android/sdk/capture/internal/util/SessionIdProvider;Lcom/onfido/android/sdk/capture/utils/DeviceMetadataProvider;)V", "eventMetadata", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/EventMetadata;", "getSdkConfig", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/SdkConfig;", "sdkToken", "", "mapLogToRequest", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/LoggerRequest;", "logs", "", "Lcom/onfido/android/sdk/capture/internal/util/logging/OnfidoRemoteLog;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnfidoLogMapper {

    @NotNull
    private static final String OS_VERSION;

    @NotNull
    private final EventMetadata eventMetadata;

    @NotNull
    private final OnfidoConfig onfidoConfig;

    @NotNull
    private final SessionIdProvider sessionIdProvider;

    @NotNull
    private final UuidProvider uuidProvider;

    @Deprecated
    @NotNull
    public static final String KEY_LOG_LEVEL = "log_level";

    @Deprecated
    @NotNull
    public static final String KEY_LOG_LABELS = "log_labels";

    @Deprecated
    @NotNull
    public static final String LOG_SOURCE = "sdk";

    @Deprecated
    @NotNull
    public static final String OS = "Android";

    @Deprecated
    @NotNull
    public static final String LOG_EVENT_TYPE = "log";

    @Deprecated
    @NotNull
    public static final String KEY_EVENT_TYPE = "event_type";

    @Deprecated
    @NotNull
    public static final String KEY_LOG_METADATA = "log_metadata";

    @NotNull
    private static final Companion Companion = new Companion(0 == true ? 1 : 0);

    @NotNull
    private static final SourceMetadata SOURCE_METADATA = new SourceMetadata("onfido-android-sdk", "23.11.0", "release");

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0012\u001a\u00020\u0013*\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/OnfidoLogMapper$Companion;", "", "()V", "KEY_EVENT_TYPE", "", "KEY_LOG_LABELS", "KEY_LOG_LEVEL", "KEY_LOG_METADATA", "LOG_EVENT_TYPE", "LOG_SOURCE", "OS", "OS_VERSION", "getOS_VERSION", "()Ljava/lang/String;", "SOURCE_METADATA", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/SourceMetadata;", "getSOURCE_METADATA", "()Lcom/onfido/android/sdk/capture/internal/util/logging/network/SourceMetadata;", "toEventMetadata", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/EventMetadata;", "Lcom/onfido/api/client/data/DeviceMetadata;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final String getOS_VERSION() {
            return OnfidoLogMapper.OS_VERSION;
        }

        @NotNull
        public final SourceMetadata getSOURCE_METADATA() {
            return OnfidoLogMapper.SOURCE_METADATA;
        }

        @NotNull
        public final EventMetadata toEventMetadata(@NotNull DeviceMetadata deviceMetadata) {
            Intrinsics.checkNotNullParameter(deviceMetadata, "<this>");
            return new EventMetadata("Android", getOS_VERSION(), deviceMetadata.getFingerprint(), deviceMetadata.getModel(), deviceMetadata.getManufacturer(), deviceMetadata.getBrand(), deviceMetadata.getProduct(), deviceMetadata.getHardware(), deviceMetadata.getAndroidApiLevel());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str = Build.VERSION.RELEASE;
        String str2 = str != null ? str : null;
        if (str2 == null) {
            str2 = "";
        }
        OS_VERSION = str2;
    }

    public OnfidoLogMapper(@NotNull UuidProvider uuidProvider, @NotNull OnfidoConfig onfidoConfig, @NotNull SessionIdProvider sessionIdProvider, @NotNull DeviceMetadataProvider deviceMetadataProvider) {
        Intrinsics.checkNotNullParameter(uuidProvider, "uuidProvider");
        Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
        Intrinsics.checkNotNullParameter(sessionIdProvider, "sessionIdProvider");
        Intrinsics.checkNotNullParameter(deviceMetadataProvider, "deviceMetadataProvider");
        this.uuidProvider = uuidProvider;
        this.onfidoConfig = onfidoConfig;
        this.sessionIdProvider = sessionIdProvider;
        this.eventMetadata = Companion.toEventMetadata(deviceMetadataProvider.provideDeviceMetadata());
    }

    private final SdkConfig getSdkConfig(String sdkToken) {
        return new SdkConfig(d0.k0(this.onfidoConfig.getFlowSteps(), ",", null, null, 0, OnfidoLogMapper$getSdkConfig$expectedFlowSteps$1.INSTANCE, 30), sdkToken, f0.f322471a);
    }

    @NotNull
    public final LoggerRequest mapLogToRequest(@NotNull List<OnfidoRemoteLog> logs) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(logs, "logs");
        String str3 = this.onfidoConfig.getToken().f50152a;
        e.Companion.getClass();
        e eVarA = d.a(str3);
        SdkConfig sdkConfig = getSdkConfig(str3);
        int i = 10;
        ArrayList arrayList = new ArrayList(w.t(logs, 10));
        for (OnfidoRemoteLog onfidoRemoteLog : logs) {
            Pair pair = new Pair("event_type", j.c("log"));
            Pair pair2 = new Pair("log_level", j.c(onfidoRemoteLog.getLevel()));
            List<String> labels = onfidoRemoteLog.getLabels();
            ArrayList arrayList2 = new ArrayList(w.t(labels, i));
            Iterator<T> it8 = labels.iterator();
            while (it8.hasNext()) {
                arrayList2.add(j.c((String) it8.next()));
            }
            Pair pair3 = new Pair("log_labels", new a(arrayList2));
            Map<String, String> metadata = onfidoRemoteLog.getMetadata();
            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(metadata.size()));
            Iterator<T> it9 = metadata.entrySet().iterator();
            while (it9.hasNext()) {
                Map.Entry entry = (Map.Entry) it9.next();
                linkedHashMap.put(entry.getKey(), j.c((String) entry.getValue()));
            }
            Map mapK = r0.k(pair, pair2, pair3, new Pair("log_metadata", new JsonObject(linkedHashMap)));
            arrayList.add(new LogBody("log", this.uuidProvider.getRandomUuid(), onfidoRemoteLog.getTime(), "sdk", (eVarA == null || (str2 = eVarA.f24913c.f24916a) == null) ? "unknown" : str2, this.uuidProvider.getPersistedUuid(), (eVarA == null || (str = eVarA.f24913c.f24917b) == null) ? "unknown" : str, this.sessionIdProvider.getSessionId(), mapK, SOURCE_METADATA, this.eventMetadata, sdkConfig));
            i = i;
        }
        return new LoggerRequest(arrayList);
    }
}
