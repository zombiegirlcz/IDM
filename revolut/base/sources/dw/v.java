package dw;

import androidx.camera.core.CameraEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class v extends CameraEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f118225a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u surfaceProcessor) {
        super(2, surfaceProcessor.f118224b.d, surfaceProcessor, new a70.a(surfaceProcessor, 2));
        Intrinsics.checkNotNullParameter(surfaceProcessor, "surfaceProcessor");
        this.f118225a = surfaceProcessor;
    }
}
