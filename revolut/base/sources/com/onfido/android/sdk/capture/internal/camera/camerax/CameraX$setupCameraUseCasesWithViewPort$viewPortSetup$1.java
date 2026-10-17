package com.onfido.android.sdk.capture.internal.camera.camerax;

import androidx.camera.core.ViewPort;
import com.onfido.android.sdk.capture.internal.camera.OnfidoCamera;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "viewPort", "Landroidx/camera/core/ViewPort;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CameraX$setupCameraUseCasesWithViewPort$viewPortSetup$1 extends u implements Function1<ViewPort, Unit> {
    final /* synthetic */ Function1<OnfidoCamera.CameraStatus, Unit> $callback;
    final /* synthetic */ CameraX this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CameraX$setupCameraUseCasesWithViewPort$viewPortSetup$1(CameraX cameraX, Function1<? super OnfidoCamera.CameraStatus, Unit> function1) {
        super(1);
        this.this$0 = cameraX;
        this.$callback = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((ViewPort) obj2);
        return Unit.f186387a;
    }

    public final void invoke(ViewPort viewPort) {
        if (viewPort == null && this.this$0.getCameraXConfiguration().isViewPortRequired()) {
            this.$callback.invoke(new OnfidoCamera.CameraStatus.Failed(new Throwable("ViewPort is not ready")));
        } else {
            this.this$0.setupCameraUseCases(viewPort, this.$callback);
        }
    }
}
