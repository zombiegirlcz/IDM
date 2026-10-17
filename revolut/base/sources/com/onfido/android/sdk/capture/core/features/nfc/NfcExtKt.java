package com.onfido.android.sdk.capture.core.features.nfc;

import com.onfido.android.sdk.capture.core.features.document.DocumentCaptureFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"enableNfc", "Lcom/onfido/android/sdk/capture/core/features/document/DocumentCaptureFlow;", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class NfcExtKt {
    @NotNull
    public static final DocumentCaptureFlow enableNfc(@NotNull DocumentCaptureFlow documentCaptureFlow) {
        Intrinsics.checkNotNullParameter(documentCaptureFlow, "<this>");
        documentCaptureFlow.addFollowUpFlow(new NfcFlow());
        return documentCaptureFlow;
    }
}
