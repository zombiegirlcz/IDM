package com.onfido.android.sdk.capture.component.active.video.capture.presentation.host;

import android.content.Context;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent;
import com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponentHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/component/active/video/capture/di/host/MotionHostComponent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class MotionHostFragment$motionHostComponent$2 extends u implements Function0<MotionHostComponent> {
    final /* synthetic */ MotionHostFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionHostFragment$motionHostComponent$2(MotionHostFragment motionHostFragment) {
        super(0);
        this.this$0 = motionHostFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MotionHostComponent invoke() {
        MotionHostComponentHolder companion = MotionHostComponentHolder.INSTANCE.getInstance();
        SdkController companion2 = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return companion.getComponent$onfido_capture_sdk_core_release(SdkController.getSdkComponent$default(companion2, contextRequireContext, null, 2, null), this.this$0.getMotionOptions());
    }
}
