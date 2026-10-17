package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder;

import android.media.MediaCodec;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/Surface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class MarshmallowRecorderWrapper$outputPersistentSurface$2 extends u implements Function0<Surface> {
    public static final MarshmallowRecorderWrapper$outputPersistentSurface$2 INSTANCE = new MarshmallowRecorderWrapper$outputPersistentSurface$2();

    public MarshmallowRecorderWrapper$outputPersistentSurface$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Surface invoke() {
        Surface surfaceCreatePersistentInputSurface = MediaCodec.createPersistentInputSurface();
        Intrinsics.checkNotNullExpressionValue(surfaceCreatePersistentInputSurface, "createPersistentInputSurface(...)");
        return surfaceCreatePersistentInputSurface;
    }
}
