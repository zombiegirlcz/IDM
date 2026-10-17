package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2;

import android.hardware.camera2.CameraManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/hardware/camera2/CameraManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class Camera2WrapperImpl$cameraManager$2 extends u implements Function0<CameraManager> {
    final /* synthetic */ Camera2WrapperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2WrapperImpl$cameraManager$2(Camera2WrapperImpl camera2WrapperImpl) {
        super(0);
        this.this$0 = camera2WrapperImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final CameraManager invoke() {
        Object systemService = this.this$0.context.getApplicationContext().getSystemService("camera");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        return (CameraManager) systemService;
    }
}
