package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view;

import androidx.fragment.app.Fragment;
import com.onfido.android.sdk.capture.component.active.video.capture.di.capture.MotionCaptureComponent;
import com.onfido.android.sdk.capture.component.active.video.capture.di.capture.MotionCaptureComponentHolder;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/component/active/video/capture/di/capture/MotionCaptureComponent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class MotionCaptureFragment$captureComponent$2 extends u implements Function0<MotionCaptureComponent> {
    final /* synthetic */ MotionCaptureFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionCaptureFragment$captureComponent$2(MotionCaptureFragment motionCaptureFragment) {
        super(0);
        this.this$0 = motionCaptureFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MotionCaptureComponent invoke() {
        MotionCaptureComponentHolder companion = MotionCaptureComponentHolder.INSTANCE.getInstance();
        Fragment parentFragment = this.this$0.getParentFragment();
        Intrinsics.i(parentFragment, "null cannot be cast to non-null type com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment");
        return companion.getComponent$onfido_capture_sdk_core_release(((MotionHostFragment) parentFragment).getMotionHostComponent$onfido_capture_sdk_core_release());
    }
}
