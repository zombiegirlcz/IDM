package com.onfido.android.sdk.capture.internal.camera.camerax;

import com.onfido.android.sdk.capture.internal.camera.OnfidoCamera;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CameraX$start$1$1 extends u implements Function0<Unit> {
    final /* synthetic */ Function1<OnfidoCamera.CameraStatus, Unit> $callback;
    final /* synthetic */ CameraX this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CameraX$start$1$1(Function1<? super OnfidoCamera.CameraStatus, Unit> function1, CameraX cameraX) {
        super(0);
        this.$callback = function1;
        this.this$0 = cameraX;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m3691invoke();
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3691invoke() {
        this.$callback.invoke(OnfidoCamera.CameraStatus.Started.INSTANCE);
        if (!this.this$0.remoteConfig.isCameraxStreamSharingEnabled()) {
            this.this$0.frameSampler.mo3668onPreviewAvailableHG0u8IE(this.this$0.previewView, this.this$0.previewConfig.m3699getFrameSamplingPeriodUwyO8pc());
        }
        this.this$0.adjustPreviewViewCenter();
    }
}
