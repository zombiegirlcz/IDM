package com.onfido.android.sdk.capture.antifraud;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/antifraud/LocalUuid;", "Lcom/onfido/android/sdk/capture/antifraud/ExtractedSignal;", "uuid", "", "(Ljava/lang/String;)V", "name", "getName", "()Ljava/lang/String;", "signal", "Lcom/onfido/android/sdk/capture/antifraud/Signal;", "getSignal", "()Lcom/onfido/android/sdk/capture/antifraud/Signal;", "value", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LocalUuid implements ExtractedSignal {

    @NotNull
    private final String uuid;

    public LocalUuid(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uuid = uuid;
    }

    @Override // com.onfido.android.sdk.capture.antifraud.ExtractedSignal
    @NotNull
    /* JADX INFO: renamed from: getName */
    public String getSignalName() {
        return "local_uuid";
    }

    @Override // com.onfido.android.sdk.capture.antifraud.ExtractedSignal
    @NotNull
    /* JADX INFO: renamed from: getSignal */
    public Signal getSourceSignal() {
        return Signal.LOCAL_UUID;
    }

    @Override // com.onfido.android.sdk.capture.antifraud.ExtractedSignal
    @NotNull
    /* JADX INFO: renamed from: value, reason: from getter */
    public String getUuid() {
        return this.uuid;
    }
}
