package com.onfido.android.sdk.capture.component.active.video.capture.presentation.host;

import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class MotionHostFragment$motionOptions$2 extends u implements Function0<MotionCaptureVariantOptions> {
    final /* synthetic */ MotionHostFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionHostFragment$motionOptions$2(MotionHostFragment motionHostFragment) {
        super(0);
        this.this$0 = motionHostFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MotionCaptureVariantOptions invoke() {
        Serializable serializable = this.this$0.requireArguments().getSerializable("key_options");
        Intrinsics.i(serializable, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions");
        return (MotionCaptureVariantOptions) serializable;
    }
}
