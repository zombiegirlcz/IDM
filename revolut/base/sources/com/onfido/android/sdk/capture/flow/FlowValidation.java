package com.onfido.android.sdk.capture.flow;

import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.options.FlowAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/flow/FlowValidation;", "", "()V", "containsDifferentFaceCaptureVariants", "", "flowActions", "", "Lcom/onfido/android/sdk/capture/ui/options/FlowAction;", "onfido-public-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FlowValidation {

    @NotNull
    public static final FlowValidation INSTANCE = new FlowValidation();

    private FlowValidation() {
    }

    @InternalOnfidoApi
    public final boolean containsDifferentFaceCaptureVariants(@NotNull List<? extends FlowAction> flowActions) {
        Intrinsics.checkNotNullParameter(flowActions, "flowActions");
        return d0.h0(flowActions, v.k(FlowAction.CAPTURE_FACE, FlowAction.CAPTURE_LIVENESS, FlowAction.ACTIVE_VIDEO_CAPTURE)).size() > 1;
    }
}
